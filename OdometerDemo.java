/**
 * OdometerDemo is a driver that simulates two cars.
 * Each car starts with some fuel and mileage. 
 * Then it fills its tank to maximum. 
 * It then drives one mile at a time until tank is empty.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class OdometerDemo
{
   /**
    * Runs the two car simulations.
    */
   public static void main(String[] args)
   {
      // car 1 - 6 gallons, 1,000 miles
      runCar("Car1", 6, 1000);
      // car 2 - 8 gallons, 999,850 miles (the odometer rolls over to 0)
      runCar("Car2", 8, 999850);
   }

   /**
    * Simulates one car. Shows its starting fuel, fills the tank, creates an
    * Odometer from the gauge and mileage, and drives until it's out of gas.
    *
    * @param carName the car's name
    * @param startFuel the starting fuel level (in gallons)
    * @param startMileage the starting mileage (in miles)
    */
   public static void runCar(String carName, int startFuel, int startMileage)
   {
      FuelGauge gauge = new FuelGauge(startFuel);
      System.out.println(carName + " gas level: " + gauge.getFuelAmount());

      System.out.println(carName + " is filling up");
      gauge.fillUp();
      System.out.println(carName + " gas level: " + gauge.getFuelAmount());

      Odometer odometer = new Odometer(startMileage, gauge);
      System.out.println(carName + " is off");
      System.out.println("------------------");

      while (odometer.getFuelAmount() > 0)
      {
         odometer.incrementMileage();
         System.out.println(odometer);
      }
      System.out.println("Out of gas!");
   }
}
