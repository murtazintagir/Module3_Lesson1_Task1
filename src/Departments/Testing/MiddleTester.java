package Departments.Testing;

import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class MiddleTester extends JuniorTester implements Hierarchy, Trainee {
    String department;

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = super.department;
    }

    @Override
    public void getSalary() {
        System.out.println(1.5);
    }

    @Override
    public String toString() {
        return "MiddleTester{" +
                "department='" + department + '\'' +
                '}';
    }
}
