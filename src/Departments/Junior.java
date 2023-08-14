package Departments;

public class Junior extends Trainees {
    private String depart;

    @Override
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
