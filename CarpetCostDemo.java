import java.util.Scanner;

/**
 * CarpetCostDemo is a driver that asks the user for room info and the 
 * carpet price. It then displays the carpet cost for two rooms.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/15/2026
 */
public class CarpetCostDemo
{
   /**
    * Gets room and carpet data from the user for two rooms, 
    * then prints the resulting CarpetCost objects.
    */
   public static void main(String[] args)
   {
      String name;    // room name
      String clear;
      double length;  // room length in ft
      double width;   // room width in ft
      double cost;    // carpet cost per sq ft

      Scanner keyboard = new Scanner(System.in);

      // room 1 (master room)
      System.out.print("Enter Room Name: ");
      name = keyboard.nextLine();
      System.out.print("Enter room length: ");
      length = keyboard.nextDouble();
      System.out.print("Enter room width: ");
      width = keyboard.nextDouble();
      System.out.print("Enter cost per square foot: ");
      cost = keyboard.nextDouble();
      System.out.println();

      RoomSize temp = new RoomSize(name, length, width);
      CarpetCost masterRoom = new CarpetCost(temp, cost);
      System.out.println(masterRoom);
      System.out.println();
      clear = keyboard.nextLine();

      // room 2 (living room)
      System.out.print("Enter Room Name: ");
      name = keyboard.nextLine();
      System.out.print("Enter room length: ");
      length = keyboard.nextDouble();
      System.out.print("Enter room width: ");
      width = keyboard.nextDouble();
      System.out.print("Enter cost per square foot: ");
      cost = keyboard.nextDouble();
      System.out.println();

      CarpetCost livingRoom = new CarpetCost(new RoomSize(name, length, width), cost);
      System.out.println(livingRoom);

      keyboard.close();
   }
}
