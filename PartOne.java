
public class PartOne {
  
   public static void main(String[] args) {  
     System.out.println(PartOne.thisIsMe("Brian", "Storey", 34, 68.0));  
   }      
     
   public static String thisIsMe(String firstName, String lastName, int age, double temp) {
     String text = "Hello, my name is: "
                    + firstName 
                    + " " 
                    + lastName 
                    + ", I am " 
                    + age 
                    + " years old. It is currently " 
                    + temp 
                    + " degrees outside.";
     
    return text;
  }
}