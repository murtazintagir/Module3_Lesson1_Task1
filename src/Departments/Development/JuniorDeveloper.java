package Departments.Development;

import Departments.Junior;
import Hierarchy.Hierarchy;
import Hierarchy.Trainee;

public class JuniorDeveloper extends Junior implements Hierarchy, Trainee {
    String department;

    public JuniorDeveloper(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void getSalary() {
        System.out.println(1.0);
    }
}
