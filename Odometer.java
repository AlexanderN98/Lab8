/**
 * Odometer tracks the current mileage of a car.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class Odometer
{
   public static final int MAX_MILEAGE = 999999;  // highest mileage the odometer can show before rolling over to 0
   public static final int MILES_PER_GALLON = 24; // the number of miles driven per gallon of fuel burned

   private FuelGauge gauge;          // the car's fuel gauge
   private int mileage;              // current mileage shown on the odometer
   private int milesSinceAddingFuel; // miles driven since fuel was last burned/added

   /**
    * Constructor that creates an Odometer with a starting mileage and a
    * FuelGauge.
    *
    * @param startMileage the starting mileage (0 to 999,999)
    * @param inGauge the FuelGauge to use for this odometer
    */
   public Odometer(int startMileage, FuelGauge inGauge)
   {
      if (startMileage < 0)
         mileage = 0;
      else if (startMileage > MAX_MILEAGE)
         mileage = MAX_MILEAGE;
      else
         mileage = startMileage;

      gauge = new FuelGauge(inGauge);
      milesSinceAddingFuel = 0;
   }

   /**
    * Gets the current mileage.
    *
    * @return the current mileage shown on the odometer
    */
   public int getMileage()
   {
      return mileage;
   }

   /**
    * Gets the amount of fuel currently left in the tank
    *
    * @return the fuel left in gallons
    */
   public int getFuelAmount()
   {
      return gauge.getFuelAmount();
   }

   /**
    * Drives the car one mile. 
    * The mileage goes up by 1 (rolling over to 0 after 999,999). 
    * After every 24 miles one gallon of fuel is burned. 
    * The car will not move if the tank is empty.
    */
   public void incrementMileage()
   {
      if (gauge.getFuelAmount() == 0)
         return;

      if (mileage == MAX_MILEAGE)
         mileage = 0;
      else
         mileage++;

      milesSinceAddingFuel++;
      if (milesSinceAddingFuel % MILES_PER_GALLON == 0)
         gauge.decrementFuel();
   }

   /**
    * Builds a string showing current mileage and fuel left.
    *
    * @return String with the mileage and gallons of fuel remaining
    */
   public String toString()
   {
      return String.format("Mileage: %6d, Fuel(Gal Left): %2d",
                           mileage, gauge.getFuelAmount());
   }
}
