public class Space {
    private String spaceName;
    private boolean isAvailable;

    public Space(String spaceName, boolean isAvailable) {
        this.spaceName = spaceName;
        this.isAvailable = isAvailable;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getSpaceName() {
        return spaceName;
    }
}
