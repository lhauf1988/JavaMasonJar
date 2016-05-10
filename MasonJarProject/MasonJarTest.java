// ClassName.........: MasonJarTest
// Developed By......: Lucas Hauf
// Week..............: Week 4
// Date Created......: 08/10/2015
// Purpose...........: A class to test the program
import java.util.Scanner;

public class MasonJarTest {
    public static void main(String[]args) throws NumberFormatException
    {
        
        String Jar;
        MasonJarVolume Volume = new MasonJarVolume();
        
        Scanner userInput = new Scanner(System.in);
      while(true){
        try{
        System.out.println("Please enter a height between 5 inches and 10 inches for your Mason Jar");
        Jar = userInput.next();
        int Size = Integer.parseInt(Jar);
        Volume.setHeight(Size);
        System.out.println("Please enter the diameter of the jar between 3 inches and 5 inches");         
        Jar = userInput.next();
        double Opening = Double.parseDouble(Jar);
        Volume.setDiameter(Opening);
        System.out.println("Please select a color between blue, green, and clear");
        Jar = userInput.next();
        Volume.setColor(Jar);
        Volume.calcVolume(Opening, Size);
        System.out.println("\nYour Mason Jar color is: "+Volume.getColor()+"\nYour jar height is: "+Volume.getHeight()+"in\nThe diameter of your jar is: "+Volume.getDiameter()+"in\nYour jar will hold: "+Volume.getVolume()+"oz");
        
        MasonJarSpecialColor Special = new MasonJarSpecialColor();
        
        System.out.println("Please enter the second height between 5 inches and 10 inches for your Mason Jar");
        Jar = userInput.next();
        int Size2 = Integer.parseInt(Jar);
        Special.setHeight(Size2);
        System.out.println("Please enter the diameter of the second Mason Jar between 3 inches and 5 inches");         
        Jar = userInput.next();
        double Opening2 = Double.parseDouble(Jar);
        Special.setDiameter(Opening2);
       System.out.println("Please select orange, purple, or yellow for your second Mason Jar");
        Jar = userInput.next(); 
       Special.setColor(Jar);
       
        Volume.calcVolume(Opening2, Size2);
        System.out.println("\nYour Mason Jar color is: "+Special.getColor()+"\nYour jar height is: "+Special.getHeight()+"in\nThe diameter of your jar is: "+Special.getDiameter()+"in\nYour jar will hold: "+Volume.getVolume()+"oz");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter a number.");
        }
      
      }  
    }
}
