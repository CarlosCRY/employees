package org.ies.tierno.models;

public class Programmer extends Employee {
    private final String project;
    private final String[] pLanguages;

    public Programmer (String nif, String name, String surname, int workHours,  String project, String[] pLanguages){
        super (nif, name, surname, workHours);
        this.project = project;
        this.pLanguages = pLanguages;
    }

    public void showInfo()
    {
        showEmployeeInfo();
        System.out.print(", Proyecto: " + project + ", Lenguajes conocidos: ");
        for (String pLanguage: pLanguages) {
            System.out.print(pLanguage + " ");
        }
    }

    public boolean knowsLanguage (String language) {
        for (String pLanguage: pLanguages) {
            if (pLanguage.equals(language)) {
                return true;
            }
        }
        return false;
    }
}
