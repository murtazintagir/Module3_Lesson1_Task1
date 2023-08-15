package Departments;

public class Junior extends Trainees {
    private String department;

    public Junior(String depart) {
        this.department = depart;
    }

    public Junior() {
    }

    public void setDepart(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
