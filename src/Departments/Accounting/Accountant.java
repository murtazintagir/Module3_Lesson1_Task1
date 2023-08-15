package Departments.Accounting;

import Hierarchy.Accounting;
import Hierarchy.Hierarchy;

public class Accountant extends Accounting implements Hierarchy {
    private String department;

    public Accountant(String department) {
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
