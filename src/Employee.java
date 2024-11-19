public class Employee {
    private int employeeID;
    private String name;
    private String role;
    private String shiftSchedule;

    public Employee(int employeeID, String name, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
    }

    public void updateShiftSchedule(String newSchedule) {
        this.shiftSchedule = newSchedule;
        System.out.println("Shift schedule updated for Employee ID " + employeeID + ": " + newSchedule);
    }

    public String getShiftSchedule() {
        return shiftSchedule;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + name + ", Role: " + role + ", Shift Schedule: " + shiftSchedule);
    }
}
