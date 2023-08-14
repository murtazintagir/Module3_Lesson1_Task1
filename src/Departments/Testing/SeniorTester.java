package Departments.Testing;

public class SeniorTester extends MiddleTester {
    String department;

    public SeniorTester(String department, String department1) {
        super(department);
        this.department = department1;
    }

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
}
