public class Permission {

    //COMPLETE THIS CLASS BEFORE TEST CLASS


     /*
     HERE!
     Create a method checkAge
     The method will be public static void
     The method will take an int as an argument and check if it's more than 20
     In case the age is less than or equal to 20, then method will throw a RuntimeException with message "{age} is not allowed!"
     If the age is more than 20, then it will do nothing
     */


    public static void ageCheck (int ageCheck) {
        if (ageCheck <= 20) throw new RuntimeException("You must be at least 21 years old!");
    }


    /*
    HERE!
    Create a method checkClassName
    The method will be public static void
    The method will take a String as an argument and check if it is Math or Science (case-insensitive)
    In case the className is not Math or Science, then method will throw an RuntimeException with message "{className} is not allowed!"
    If the className is Math or Science, then it will do nothing
    */

    public static void  checkClassName (String checkClassName) {
        if (!checkClassName.toLowerCase().equals("math") || !checkClassName.toLowerCase().equals("science")) {
            throw new RuntimeException(checkClassName + " is not an option!");
        }
    }
}
