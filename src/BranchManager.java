public class BranchManager {
    private int managerID;
    private String name;

    public BranchManager(int managerID, String name) {
        this.managerID = managerID;
        this.name = name;
    }

    public void updateShiftSchedule(Employee employee, String newSchedule, Notification notification) {
        employee.updateShiftSchedule(newSchedule);
        notification.triggerShiftUpdateNotification(employee);
    }

    public int getManagerID() {
        return managerID;
    }

    public String getName() {
        return name;
    }
}
