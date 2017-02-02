import java.util.Arrays;

public class PartTwo { 

  public static void main(String[] args) {
    
    String[] example = {"running", "coding", "gaming", "art", "laughing"};
    
    System.out.println(PartTwo.faveThings(example));
    
  }
  
  public static String faveThings(String[] faves) {
       
    String faveString = Arrays.toString(faves)
                        .replace("[", "")
                        .replace("]", "");
    
    String text = "My favorite things to do are: "
                  + faveString
                  + ". There are a total of "
                  + faves.length
                  + " items in my list.";
    
    return text;
    
  }
 
}