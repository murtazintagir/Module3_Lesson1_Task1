package Departments.Testing;

import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class MiddleTester extends JuniorTester implements Hierarchy, Trainee {
    @Override
    public void getSalary() {
        System.out.println(1.5);
    }
}
