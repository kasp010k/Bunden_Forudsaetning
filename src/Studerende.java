//Klassen "Studerende"
public class Studerende {


    //Variabler til klassen der bruges til at fortælle om elevens navn, kursus på skolen, addresse og tlf nr.
    String name = "";
    String course = "";
    String address = "";
    int phoneNo = 0;


    //Constructor med argumenter så man kan lave objekter af studerende og give info fra variablerne.
    Studerende(String studentName, String studentCourse, String studentAddress, int studentPhoneNo){
        name = studentName;
        course = studentCourse;
        address = studentAddress;
        phoneNo = studentPhoneNo;
        System.out.println("Info på den studerende: "+name+". "+course+". "+address+". "+phoneNo+".");
    }





}





