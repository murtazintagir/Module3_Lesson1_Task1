package Hierarchy;

public abstract class Accounting implements Hierarchy {
    private String depart;

    public void getSalary() {
        System.out.println(0.5);
    }

    @Override
    public String getDepartment() {
        return depart;
    }
}
