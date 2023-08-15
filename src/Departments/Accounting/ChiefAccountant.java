package Departments.Accounting;

import Hierarchy.Accounting;
import Hierarchy.Hierarchy;

public class ChiefAccountant extends Accounting implements Hierarchy {
    private String department;

    public ChiefAccountant(String department) {
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
