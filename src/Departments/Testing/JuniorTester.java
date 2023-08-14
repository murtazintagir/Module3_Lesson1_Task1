package Departments.Testing;

import Departments.Junior;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class JuniorTester extends Junior implements Hierarchy, Trainee {
    String department;

    public JuniorTester(String department) {
        this.department = department;
    }

    public JuniorTester() {
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "JuniorDeveloper{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public void getSalary() {
        System.out.println(1.0);
    }
}
