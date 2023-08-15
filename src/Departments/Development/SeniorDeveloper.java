package Departments.Development;

import Departments.Junior;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class SeniorDeveloper extends Junior implements Hierarchy, Trainee {
    private String department;

    public SeniorDeveloper(String department) {
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
        return "SeniorDeveloper{" +
                "department='" + department + '\'' +
                '}';
    }

}
