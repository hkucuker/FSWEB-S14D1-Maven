package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id,name,salary);

        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }
    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 1000);
    }
    public void addEmployee(JuniorDeveloper developer, int index) {

        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("This index is already full!");
            return;
        }

        juniorDevelopers[index] = developer;
        System.out.println("Junior Developer added.");
    }
    public void addEmployee(MidDeveloper developer, int index) {

        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (midDevelopers[index] != null) {
            System.out.println("This index is already full!");
            return;
        }

        midDevelopers[index] = developer;
        System.out.println("Mid Developer added.");
    }
    public void addEmployee(SeniorDeveloper developer, int index) {

        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("This index is already full!");
            return;
        }

        seniorDevelopers[index] = developer;
        System.out.println("Senior Developer added.");
    }
}
