public class Student {

    //COMPLETE THIS CLASS BEFORE MathStudent and ScienceStudent classes as they will be subclasses of Student class


    //HERE! Create a 5 args constructor

    public Student (String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;

    }

    // Count number of Students in survey - max 3
    public static int numberOfStudents;
    public static void  studentNumber() {  numberOfStudents++;  }

    /*
    HERE!
    Create private instance variables as below
    firstName
    lastName
    age
    gender
    className
    NOTE: only age will be int and others are String
    */

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String className;

    /*
    HERE!
    Provide public getter method for className only
    */

    public String getClassName() {
        return className;
    }

    /*
    HERE!
    Override toString() method that returns Student object information
    It should be dynamic considering child classes that inherits
    */

    @Override
    public java.lang.String toString() {
        return "Student {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                "} \n";
    }
}
