

/**

 */
public class Car
{
   /** fuel efficiency of the car in mpg    **/
   private double fuelEfficiency;
   
   /** amount of fuel left in the car's tank in gallons  */
   private double fuelInTank;
    
    
  
    public Car(double fuelEfficiency)
    {
        fuelEfficiency = fuelEfficiency;
         fuelInTank = 0;
        }

    public void drive( double distance)
    {
        fuelInTank -= distance/fuelEfficiency;
        
    }

   
    public double getGasInTank()
    {
         return fuelInTank;
    }

  
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;

    }

}