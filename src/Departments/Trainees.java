package Departments;

import Hierarchy.Trainee;

public class Trainees implements Trainee {

    private String depart;

    public void getSalary() {
        System.out.println(0.5);
    }

    @Override
    public String getDepart() {
        return depart;
    }
}
