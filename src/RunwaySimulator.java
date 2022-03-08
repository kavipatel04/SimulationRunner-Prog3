/* 
 * @Author Kavi Patel
 * 03/08/22
 * This simulator simulates planes that come in and out of a regional airport through prioritizing lands and takeoffs.
 * The user is able to add and remove planes, while also being able to perform the next action.
 */
import java.util.Queue;
import java.util.LinkedList;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
    private Queue<String> takingOff;
    private Queue<String> landing;

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
     takingOff = new LinkedList<String>();
     landing = new LinkedList<String>();
     

   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takingOff.add(flightSymbol);
      System.out.println("Adding " + flightSymbol + " to the landing queue");

   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
       landing.add(flightSymbol);
       System.out.println("Adding " + flightSymbol + " to the takeoff queue");

   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
        //if the landing queue is empty and there is something in the takeoff queue, we need to takeoff a plane
        if (landing.isEmpty() && !takingOff.isEmpty()){
            System.out.println("Taking off " + takingOff.remove()); 
            
        } 
        //if there is something in the landing queue, land the plane
        else if (!landing.isEmpty()) {
            System.out.println("Landing " + landing.remove());
        } 
        //if there is nothing else in the landing queue, let them know that there is nothing to perform
        else {
            System.out.println("There are no more actions to perform");
        }
   }
}