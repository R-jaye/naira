h6666
package alphabethornotassignmnt;
import java.util.Scanner;
public class AlphabethOrNotAssignmnt {

   
    public static void main(String[] args) {
       char ch;
       Scanner jah = new Scanner(System.in);
       System.out.print("ENTER A CHARACTER : ");
      ch = jah.next().charAt(0);
      
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
      
          System.out.print(ch + " IS AN ALPHABETH");
      }
          else{
          
           System.out.println(ch + " IS  NOT AN ALPHABETH");
               }   
          }
}   

