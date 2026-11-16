/**
 * CarpetCost calculates the cost of carpeting a rectangular room.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class CarpetCost
{
   private RoomSize size;       // the room being carpeted (aggregated object)
   private double costPerSqFt;  // carpet cost per sq ft

   /**
    * Constructor that creates a CarpetCost from a room and a carpet price.
    *
    * @param area the RoomSize object describing the room
    * @param cost the cost of the carpet per square foot
    */
   public CarpetCost(RoomSize area, double cost)
   {
      size = new RoomSize(area);
      costPerSqFt = cost;
   }

   /**
    * Calculates the total cost of the carpet for the room. 
    * (room's area x cost per sq ft)
    *
    * @return the total cost of the carpet in dollars
    */
   public double getCost()
   {
      return size.getArea() * costPerSqFt;
   }

   /**
    * Builds a String describing the room and its carpet cost.
    *
    * @return a multiline String with the room details, cost per square
    *         foot, and total cost
    */
   public String toString()
   {
      String output = size + String.format("%nThe cost per sq ft is: $%,.2f%n" +
                                           "The total cost is: $%,.2f",
                                           costPerSqFt, getCost());
      return output;
   }
}
