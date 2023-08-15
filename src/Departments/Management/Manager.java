package Departments.Management;

import Hierarchy.Hierarchy;
import Hierarchy.Management;

public class Manager extends Management implements Hierarchy {
    private String department;

    public Manager(String department) {
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
