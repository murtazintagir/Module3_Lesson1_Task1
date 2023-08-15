package Departments.Development;

import Departments.Junior;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class MiddleDeveloper extends Junior implements Hierarchy, Trainee {
    private String department;

    public MiddleDeveloper(String department) {
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
        System.out.println(1.5);
    }

    @Override
    public String toString() {
        return "MiddleDeveloper{" +
                "department='" + department + '\'' +
                '}';
    }
}
