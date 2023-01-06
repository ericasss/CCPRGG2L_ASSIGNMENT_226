import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {

       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter school email: ");
        String schoolemail = scan.nextLine();

       
        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(schoolemail);

        boolean match = matcher.matches();


        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }
            
           // Scanner scann = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = scan.nextLine();

       
         pattern = Pattern.compile("\\+63\\d{10}");
         matcher = pattern.matcher(number);

         match = matcher.matches();


        if (match) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid numberr");

        }
    
         // Scanner scannn = new Scanner(System.in);
           System.out.print("Enter date: ");
           String date = scan.nextLine();
   
          
            pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
            matcher = pattern.matcher(date);
   
            match = matcher.matches();
   
   
           if (match) {
               System.out.println("valid date");
           } else {
               System.out.println("invalid date");
   

        }
    }

}



