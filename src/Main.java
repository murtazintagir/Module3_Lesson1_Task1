import Departments.Development.JuniorDeveloper;
import Departments.Testing.JuniorTester;
import Departments.Testing.MiddleTester;
import Departments.Testing.SeniorTester;
import Hierarchy.Trainee;

public class Main {

    public static Trainee changeDepartment(boolean b) {
        Trainee test;
        if (b) {
            test = new JuniorTester();
        } else {
            test = new JuniorDeveloper();
        }
        return test;
    }

    public static JuniorTester changeState(boolean a, boolean b) {
        JuniorTester empl;
        if (a && b) {
            empl = new SeniorTester();
        } else if (a || b) {
            empl = new MiddleTester();
        } else {
            empl = new JuniorTester();
        }
        return empl;
    }

    public static void main(String[] args) {
        Trainee test;
        test = changeDepartment(true);
        test = changeState(true, false);
        test.getSalary();
        test = changeState(true, true);
        test.getSalary();
    }
}