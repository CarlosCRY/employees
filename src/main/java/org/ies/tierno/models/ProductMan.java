package org.ies.tierno.models;


public class ProductMan extends Employee {
    private final String project;

    public ProductMan (String nif, String name, String surname, int workHours,  String project){
        super (nif, name, surname, workHours);
        this.project = project;
    }

    public void showInfo()
    {
        showEmployeeInfo();
        System.out.print(", Proyecto: " + project);
    }
}
