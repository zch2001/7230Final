public class ITSupport extends Employee {
    private String expertiseArea;

    public ITSupport(int employeeID, String name, String expertiseArea) {
        super(employeeID, name, "IT Support");
        this.expertiseArea = expertiseArea;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expertise Area: " + expertiseArea);
    }
}