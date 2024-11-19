// Event Class
class Event {
    private int eventID;
    private String title;
    private String description;
    private ShiftSchedule schedule;
    private int capacity;

    public void registerMember(int memberID) {
        System.out.println("Registering member for event with eventID: " + eventID);
    }

    public void cancelEvent() {
        System.out.println("Cancelling event with eventID: " + eventID);
    }

    public void collectFeedback() {
        System.out.println("Collecting feedback for event with eventID: " + eventID);
    }

    public int checkCapacity() {
        return capacity;
    }
}