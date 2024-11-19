public class Receptionist extends Employee {
    private String languageSkills;

    public Receptionist(int employeeID, String name, String languageSkills) {
        super(employeeID, name, "Receptionist");
        this.languageSkills = languageSkills;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language Skills: " + languageSkills);
    }
}