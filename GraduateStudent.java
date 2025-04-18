public class GraduateStudent extends CollegeStudent {
    private String thesisTitle;  
    private String advisor;      

    public GraduateStudent(String name, int age, String gender, String idNum, double gpa, int year, String major, String thesisTitle, String advisor) {
        super(name, age, gender, idNum, gpa, year, major);  // Call to CollegeStudent constructor
        this.thesisTitle = thesisTitle;
        this.advisor = advisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    @Override
    public String toString() {
        return super.toString() + ", thesis title: " + thesisTitle + ", advisor: " + advisor;
    }
}
