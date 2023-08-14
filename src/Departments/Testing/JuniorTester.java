package Departments.Testing;

import Departments.Trainees;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class JuniorTester extends Trainees implements Hierarchy, Trainee {
    String department = "Тестирование";

    @Override
    public String toString() {
        return "JuniorTester{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public void getSalary() {
        System.out.println(1.0);
    }
}
