// Employee Class
abstract class Employee {
    protected int employeeID;
    protected String name;
    protected String role;
    protected double salary;
    protected Schedule shiftSchedule;

    public void updateShiftSchedule(Schedule newSchedule) {
        System.out.println("Updating shift schedule for employee: " + name);
    }

    public void calculateSalary() {
        System.out.println("Calculating salary for employee: " + name);
    }

    public void assignTask(String task) {
        System.out.println("Assigning task: " + task + " to employee: " + name);
    }
}