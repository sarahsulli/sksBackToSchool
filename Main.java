public class Main {
    public static void main (String [] args){
        Person [] persons = new Person[4];
        persons[0] = new Person("Coach Bob", 27, "M");
        persons[1] = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        persons[2] = new Teacher("Duke Java",34, "M", "Computer Science", 50000);
        persons[3] = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",  4.0,  1, "English");

        for (Person person: persons){
            System.out.println(person);
        }
    }
}