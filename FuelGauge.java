/**
 * FuelGauge reports the current amount of fuel in gallons, 
 * can burn one gallon at a time, and can be filled to the
 * max capacity of 15 gallons.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class FuelGauge
{
   public static final int MAX_FUEL = 15; // the maximum amount of fuel the tank can hold (in gallons)

   private int fuelAmount;  // current fuel in the tank (in gallons)

   /**
    * Constructor that creates a FuelGauge with a starting amount of fuel.
    * An amount below 0 is stored as 0. 
    * An amount above MAX_FUEL is stored as MAX_FUEL.
    *
    * @param startFuel the starting amount of fuel (in gallons)
    */
   public FuelGauge(int startFuel)
   {
      if (startFuel < 0)
         fuelAmount = 0;
      else if (startFuel > MAX_FUEL)
         fuelAmount = MAX_FUEL;
      else
         fuelAmount = startFuel;
   }

   /**
    * Constructor that copies an existing FuelGauge. It creates a new FuelGauge 
    * holding the same amount of fuel. They are independent afterward.
    *
    * @param object2 the FuelGauge object to copy
    */
   public FuelGauge(FuelGauge object2)
   {
      fuelAmount = object2.fuelAmount;
   }

   /**
    * Gets the current amount of fuel in the tank.
    *
    * @return the current fuel amount (in gallons)
    */
   public int getFuelAmount()
   {
      return fuelAmount;
   }

   /**
    * Adds one gallon of fuel to the tank. If tank is full, nothing happens
    */
   public void incrementFuel()
   {
      if (fuelAmount < MAX_FUEL)
         fuelAmount++;
   }

   /**
    * Burns one gallon of fuel. If tank is empty, nothing happens
    */
   public void decrementFuel()
   {
      if (fuelAmount > 0)
         fuelAmount--;
   }

   /**
    * Fills tank to max capacity.
    */
   public void fillUp()
   {
      fuelAmount = MAX_FUEL;
   }

   /**
    * Builds string describing the current fuel level.
    *
    * @return String showing the gallons of fuel remaining
    */
   public String toString()
   {
      return "Fuel(Gal Left): " + fuelAmount;
   }
}
