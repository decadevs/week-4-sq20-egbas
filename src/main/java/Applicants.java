public class Applicants extends MySchool {
    String applicantName;
    int applicantScore;
    String applicantGender;
    int applicantAge;

    public Applicants() {
    }

    public Applicants(String applicantName, int applicantScore, String applicationGender, int age) {
        this.applicantName = applicantName;
        this.applicantScore = applicantScore;
        this.applicantGender = applicationGender;
        this.applicantAge = age;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setApplicantScore(int applicantScore) {
        this.applicantScore = applicantScore;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public int getApplicantScore() {
        return applicantScore;
    }

    public void applicationStatus(){
        if (this.applicantScore > 60 && this.applicantAge >= 9){
            System.out.println("You are Admitted");
        } else if (this.applicantScore < 60 && this.applicantScore >= 50){
            System.out.println("Under review, waiting list");
        } else {
            System.out.println("Try again! Application not successful!");
        }
    }
    public void takeAssessment(){
        System.out.println("Your assessment will commence in 30minutes");
    }
    public void payRegistrationFee(){
        System.out.println("Pay registration fee to complete registration");
    }
}
