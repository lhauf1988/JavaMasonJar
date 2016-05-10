// ClassName.........: MasonJar
// Developed By......: Lucas Hauf
// Week..............: Week 4
// Date Created......: 08/10/2015
// Purpose...........: A class to hold all the variables
public class MasonJar 
{
   
    
    
    private String Color;
    private Double Diameter;
    private int Height;
    
    public MasonJar()
            {
            
            }

   
   
    public MasonJar (String cColor, double cDiameter, int cHeight)
    {
       
        this.Height = cHeight;
        this.Diameter = cDiameter;
        this.Color = cColor;
        
    }
    
    public String getColor()
    { 
        return this.Color;
    }      

    public void setColor(String cColor)
    {
        this.Color = cColor;   
        
    }
    
    public double getDiameter()
    {
        return this.Diameter;   
    }
    
    public void setDiameter(double cDiameter)
    {
        this.Diameter = cDiameter;
    }
    
    public int getHeight()
    {
        return this.Height;
    }
    
    /**
     *
     * @param cHeight
     */
    public void setHeight(int cHeight)
    {
        this.Height = cHeight;
    }
    
    
            
   
}

