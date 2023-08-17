package Departments.Practice;

public class Trainee implements Hierarchy.Trainee {

    private String depart;

    public void getSalary() {
        System.out.println(0.5);
    }

    @Override
    public String getDepartment() {
        return depart;
    }
}
