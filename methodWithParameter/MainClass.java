import java.util.Scanner;
class MainClass
{
    
    public static void main(String args[])
    {     
         // Scanner --- class and input is our object of class Scanner and Scannery(System.in) is method
         Scanner input = new Scanner(System.in);
         print printObject = new print();   // print() is a class name with empty parameters
        
        System.out.println("Enter your name: ");
        String inputName = input.nextLine();
        
        
        
        printObject.printing(inputName);            // printing() in our method
    }
}