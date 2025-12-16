package org.ies.tierno.models;

public class TechDirector extends Employee {


    public TechDirector (String nif, String name, String surname, int workHours){
        super (nif, name, surname, workHours);
    }

    public void showInfo()
    {
        showEmployeeInfo();
    }
}
