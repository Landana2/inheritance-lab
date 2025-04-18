public class Administrator extends Teacher {
    private String department;  


    public Administrator(String name, int age, String gender, String subject, double salary, String department) {
        super(name, age, gender, subject, salary);  // Call to Teacher constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", department: " + department;
    }
}
