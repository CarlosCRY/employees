package org.ies.tierno.models;

public class ProyectChief extends Employee {
    private final String[] projects;

    public ProyectChief(String nif, String name, String surname, int workHours, String[] projects){
        super (nif, name, surname, workHours);
        this.projects = projects;
    }

    public void showInfo()
    {
        showEmployeeInfo();
        System.out.print(", Proyectos: ");
        for (String project: projects) {
            System.out.print(project + " ");
        }
    }

    public boolean overseenProject (String overseen) {
        for (String project: projects) {
            if (project.equals(overseen)) {
                return true;
            }
        }
        return false;
    }
}
