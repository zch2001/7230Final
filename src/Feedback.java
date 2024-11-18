import java.util.Date;
class Feedback {
    private int feedbackID;
    private int rating;
    private String comments;
    private Date date;

    public void submitFeedback() {
        System.out.println("Submitting feedback with feedbackID: " + feedbackID);
    }

    public String getFeedbackDetails() {
        return "Feedback details: ID=" + feedbackID + ", Rating=" + rating;
    }
}
