import Departments.Development.JuniorDeveloper;
import Departments.Junior;
import Departments.Testing.JuniorTester;
import Departments.Testing.MiddleTester;
import Departments.Testing.SeniorTester;
import Hierarchy.Trainee;

public class Main {

    public static Junior addEmpl(String department) {
        Junior empl;
        empl = new JuniorTester("Тестирование");
        return empl;
    }

    public static Junior changeDepartment(boolean b) {
        Junior empl;
        if (b) {
            empl = new JuniorTester("Тестирование");
        } else {
            empl = new JuniorDeveloper("Разработка");
        }
        return empl;
    }

    public static Junior changeState(boolean a, boolean b) {
        Junior empl;
        if (a && b) {
            empl = new SeniorTester("Тестирование");
        } else if (a || b) {
            empl = new MiddleTester("Тестирование");
        } else {
            empl = new JuniorTester("Тестирование");
        }
        return empl;
    }

    public static void main(String[] args) {
        Trainee test1;
        test1 = new JuniorTester("Тестирование");


    }
}

