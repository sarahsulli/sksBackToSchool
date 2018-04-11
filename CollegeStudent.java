public class CollegeStudent extends Student{
  private String myMajor; // Student Id Number
  private double myYear; // grade point average

  // constructor
  public CollegeStudent(String name, int age, String gender,String idNum, double gpa,
           int year, String major){
    // use the super class' constructor
    super(name, age, gender,idNum, gpa);

    // initialize what's new to Student
    myMajor = major;
    myYear = year;
  }

  public String getMajor(){
    return myMajor;
  }

  public double getYear(){
    return myYear;
  }

  public void setMajor(String major){
    myMajor = major;
  }

  public void setYear(int year){
    myYear = year;
  }

  // overrides the toString method in the parent class
  public String toString(){
    return super.toString() + ", Student ID #: " + myMajor + ", Year: " + myYear;
  }
}