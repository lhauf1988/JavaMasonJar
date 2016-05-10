// ClassName.........: MasonJarSpecialColor
// Developed By......: Lucas Hauf
// Week..............: Week 4
// Date Created......: 08/10/2015
// Purpose...........: A class to hold a second color
public class MasonJarSpecialColor extends MasonJar {

  
    
    
       private String Special;
        
       public MasonJarSpecialColor ()
    {
        
    }
    
    public MasonJarSpecialColor (String cColor, double cDiameter, int cHeight, String cSpecial)
    {
        super(cColor,cDiameter, cHeight);
        this.Special = cSpecial;
    }
       @Override
    public void setColor(String cSpecial)
    {
     
        super.setColor(cSpecial);
     this.Special = cSpecial;
    }
       @Override
    public String getColor()
    {
        super.getColor();
        return this.Special;
    }
    
    }
