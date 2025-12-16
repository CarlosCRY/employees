package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Employee {
    protected String nif;
    protected String name;
    protected String surname;
    protected int workHours;


    public abstract void showInfo ();


    protected final void area (int hours) {
        workHours += hours;
    }

    protected final void showEmployeeInfo () {
        System.out.print("\nNIF: " + nif + ", Apellidos: " + surname + ", Nombre: " + name +
                ", Horas trabajadas: " + workHours);
    }

}
