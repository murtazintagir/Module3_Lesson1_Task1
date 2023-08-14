import Departments.Development.JuniorDeveloper;
import Departments.Testing.JuniorTester;
import Departments.Testing.MiddleTester;
import Departments.Testing.SeniorTester;
import Departments.Trainees;
import Hierarchy.Trainee;

public class Main {

    public static Trainee changeDepartment(Trainee test, boolean b) {
        if (b) {
            test = new JuniorTester();
        } else {
            test = new JuniorDeveloper();
        }
        return test;
    }

    public static JuniorTester changeState(JuniorTester empl, boolean a, boolean b) {
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
        Trainee test = new Trainees();
//        int st = changeState(true, true);
//        int a = 3;
//        test = getTrainee(test, st);
//        test.getSalary();
        test = changeDepartment(test, true);
        System.out.println(test.getClass());
        test = changeState((JuniorTester) test, true, true);
        test.getSalary();
    }

    private static Trainee getTrainee(Trainee test, int st) {
        switch (st) {
            case 1:
                test = new JuniorTester();
                break;
            case 2:
                test = new MiddleTester();
                break;
            case 3:
                test = new SeniorTester();
                break;
        }
        return test;
    }
}