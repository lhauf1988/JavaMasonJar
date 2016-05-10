// ClassName.........: MasonJarVolume
// Developed By......: Lucas Hauf
// Week..............: Week 4
// Date Created......: 08/10/2015
// Purpose...........: A class to hold the calculation of the volume
public class MasonJarVolume extends MasonJar {
    
    private double Volume;
    
    public MasonJarVolume ()
    {
        
    }
    
    public MasonJarVolume (String cColor, double cDiameter, int cHeight, double cVolume)
    {
        super(cColor,cDiameter, cHeight);
        this.Volume = cVolume; 
    }
    public double getVolume ()
    {
        return this.Volume;
    }
    public void setVolume(double cVolume)
    {
        this.Volume = cVolume;
        
    }
    public void calcVolume(double cDiameter,int  cHeight )
    {
        double Radius;
        Radius = cDiameter/2;
        double Area;
        Area = (Radius * Radius) * 3.14;
        this.Volume = (cHeight*Area)*.554;
    }
}
