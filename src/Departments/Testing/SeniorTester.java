package Departments.Testing;

public class SeniorTester extends MiddleTester {
    String department;

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = super.department;
    }

    @Override
    public void getSalary() {
        System.out.println(2.5);
    }

    @Override
    public String toString() {
        return "SeniorTester{" +
                "department='" + department + '\'' +
                '}';
    }
}
