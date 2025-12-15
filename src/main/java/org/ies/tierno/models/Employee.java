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

    protected abstract double area ();

    public final void showInfo () {
        System.out.print("\nColor: " + nif + ", Area: " + area());
    }

}
