public class Main {
  public static void main(String[] args) {
      // Create a Person object
      Person bob = new Person("Coach Bob", 27, "M");
      System.out.println(bob);  // Should print: Coach Bob, age: 27, gender: M

      // Create a Student object
      Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
      System.out.println(lynne);  // Should print: Lynne Brooke, age: 16, gender: F, student id: HS95129, gpa: 3.5

      // Create a Teacher object
      Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
      System.out.println(mrJava);  // Should print: Duke Java, age: 34, gender: M, subject: Computer Science, salary: 50000.0

      // Create a CollegeStudent object
      CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
      System.out.println(ima);  // Should print: Ima Frosh, age: 18, gender: F, student id: UCB123, gpa: 4.0, year: 1, major: English

      // Create a GraduateStudent object
      GraduateStudent Abhinav = new GraduateStudent("Abhinav Garg ", 24, "M", "GS456", 2.2, 2, "Law", "The art of the Law", "Dr. Ayush");
      System.out.println(Abhinav);  // Should print: John Doe, age: 24, gender: M, student id: GS456, gpa: 3.8, year: 2, major: Electrical Engineering, thesis title: AI Research, advisor: Dr. Smith

      // Create an Administrator object
      Administrator adminSusan = new Administrator("Burt Dixon", 45, "M", "Mathematics", 75000, "Math Department");
      System.out.println(adminSusan);  // Should print: Susan King, age: 45, gender: F, subject: Mathematics, salary: 75000.0, department: Math Department
  }
}
