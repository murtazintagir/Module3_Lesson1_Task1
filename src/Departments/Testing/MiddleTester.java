package Departments.Testing;

import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class MiddleTester extends JuniorTester implements Hierarchy, Trainee {
    String department;


    public MiddleTester(String department) {
        super.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getSalary() {
        System.out.println(1.5);
    }
}
