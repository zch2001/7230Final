public class CleaningStaff extends Employee {
    private String shift;

    public CleaningStaff(int employeeID, String name, String shift) {
        super(employeeID, name, "Cleaning Staff");
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shift: " + shift);
    }
}