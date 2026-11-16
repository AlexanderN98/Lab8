/**
 * RoomSize creates a rectangular room with a name, length, and width.
 * It can calculate floor area and build a string describing the room.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class RoomSize
{
   private String name;    // room name
   private double length;  // room length (ft)
   private double width;   // room width (ft)

   /**
    * Constructor that creates a RoomSize from name, length, and width.
    *
    * @param inName  the name of the room
    * @param inLen   the length of the room in feet
    * @param inWidth the width of the room in feet
    */
   public RoomSize(String inName, double inLen, double inWidth)
   {
      name = inName;
      length = inLen;
      width = inWidth;
   }

   /**
    * Constructor that creates a new RoomSize holding the same data as an
    * existing RoomSize. The new object is independent from the existing one
    *
    * @param object2 the RoomSize object to copy
    */
   public RoomSize(RoomSize object2)
   {
      name = object2.name;
      length = object2.length;
      width = object2.width;
   }

   /**
    * Calculates floor area of the room (length x width)
    *
    * @return the area of the room in sq feet
    */
   public double getArea()
   {
      return length * width;
   }

   /**
    * Builds a String describing the room's name, length, width, and area.
    * The area is rounded to two decimal places.
    *
    * @return a multi line String with room name, length, width, and area
    */
   public String toString()
   {
      String output = String.format("Room Name: %s%n" +
                                    "Length: %s%n" +
                                    "Width: %s%n" +
                                    "Area: %.2f",
                                    name, length, width, getArea());
      return output;
   }
}
