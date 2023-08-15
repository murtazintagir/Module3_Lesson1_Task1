package Departments.Management;

import Hierarchy.Hierarchy;
import Hierarchy.Management;

public class Head extends Management implements Hierarchy {
    private String department;

    public Head(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
