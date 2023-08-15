package Departments.Testing;

import Departments.Junior;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class SeniorTester extends Junior implements Hierarchy, Trainee {
    private String department;

    public SeniorTester(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getSalary() {
        System.out.println(2.5);
    }

    @Override
    public String toString() {
        return "SeniorTester{" +
                "department='" + department + '\'' +
                '}';
    }
}
