public class Teacher extends Person{
  private String mySubject; // Teacher Subject 
  private double mySalary; // Teacher Salary

  // constructor
  public Teacher(String name, int age, String gender,
            String subject, double salary){
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Teacher
    mySubject = subject;
    mySalary = salary;
  }

  public String getSubject(){
    return mySubject;
  }

  public double getSalary(){
    return mySalary;
  }

  public void setSubject(String subject){
    mySubject = subject;
  }

  public void setSalary(double salary){
    mySalary = salary;
  }

  // overrides the toString method in the parent class
  public String toString(){
    return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
  }
}