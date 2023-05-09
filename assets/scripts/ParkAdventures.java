/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkadventures;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mdc
 */
public class ParkAdventures {
    
    //make a data repository to keep all route and waypoints
    public static ArrayList<Route> routes = new ArrayList<>(); 
    public static ArrayList<Waypoint> waypoints = new ArrayList<>();
    
    public static WaypointsPanel waypointsPanel; //this can be accessed after main() has died
    public static RoutesPanel routesPanel; //this can be accessed after main() has died

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first hardcode some routes and waypoints
        Route sh, lo;
        Waypoint w;
        
        sh = new Route(); //created a new route ... it is empty now
        sh.setName("Quick Route");
        sh.setBestTime("11:45 AM");
        
        w = new Waypoint(); //make and customize a new waypoint
        w.setName("Penguin Pointe");
        w.setAvoid("Do not pet snakes");
        w.setActivities("Spray water");
        w.setEastDistance(0.4);
        w.setNorthDistance(4.9);
        
        sh.addWaypointAtEnd(w); //add this waypoint to the route
        
        //save the waypoint in the repository
        waypoints.add(w);
        
        w = new Waypoint(); //make and customize a new waypoint
        w.setName("Stony Rock");
        w.setAvoid("Do not throw rocks");
        w.setActivities("Swim");
        w.setEastDistance(0.6);
        w.setNorthDistance(5.9);
        
        //save the waypoint in the repository
        waypoints.add(w);
        
        sh.addWaypointAtEnd(w); //add this waypoint to the route
        
        routes.add(sh); //save the route in the repository
        
        lo = new Route();
        lo.setName("Long Route");
        lo.setBestTime("8:00 AM");
        
        w = new Waypoint(); //make and customize a new waypoint
        w.setName("Mouse Den");
        w.setAvoid("Do not pet mice");
        w.setActivities("Jumprope");
        w.setEastDistance(4.2);
        w.setNorthDistance(3.5);
        
        lo.addWaypointAtEnd(w); //add this waypoint to the route
        
        //save the waypoint in the repository
        waypoints.add(w);
        
        routes.add(lo); //also add lo to the repository
        
        //At this point there should be 2 routes and 3 waypoints hardcoded
//-------------------------------------------------------------------------------

        //create the user interface
        waypointsPanel = new WaypointsPanel();
        routesPanel = new RoutesPanel();
        MainFrame main = new MainFrame();
        
        JFrame f = new JFrame("Phase 6");
        //f.setLocation(1500, 190); //comment this out if using a single screen
        f.setSize(600, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.add(main); //add panel to this frame
        
        f.setVisible(true);

        
        
//        //for now add panels inside Jframes
//        JFrame f = new JFrame("Test Frame for Waypoints Panel");
//        f.setLocation(1500, 190); //comment this out if using a single screen
//        f.setSize(500, 400);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        f.add(waypointsPanel); //add panel to this frame
//        
//        f.setVisible(true);
//        
//        JFrame f2 = new JFrame("Test Frame for Routes Panel");
//        f2.setLocation(1600, 390); //comment this out if using a single screen
//        f2.setSize(500, 400);
//        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        f2.add(routesPanel); //add panel to this frame
//        
//        f2.setVisible(true);
//        
//        System.out.println("Main is dying...");
//       
//        
//        //go into print mode
//        System.out.println("Route " + sh.getName() + ": best time to start at " + sh.getBestTime() + 
//                " of length " + sh.computeTotalLength());
//        for(int i = 0; i < sh.getSizeSequence(); i++){
//                Waypoint x = sh.getWaypoint(i);
//                System.out.println("\t" + x.getName() + ": at (" + x.getEastDistance() + ", " +
//                        x.getNorthDistance() + ")");
//                System.out.println("\t\tThings to do: " + x.getActivities());
//                System.out.println("\t\tThings to avoid: " + x.getAvoid());
//        }
//        
//        w.setEastDistance(0.4);
//        System.out.println("\n\n------------------------After moving Stony Rock---------");
//        
//                System.out.println("Route " + sh.getName() + ": best time to start at " + sh.getBestTime() + 
//                " of length " + sh.computeTotalLength());
//        for(int i = 0; i < sh.getSizeSequence(); i++){
//                Waypoint x = sh.getWaypoint(i);
//                System.out.println("\t" + x.getName() + ": at (" + x.getEastDistance() + ", " +
//                        x.getNorthDistance() + ")");
//                System.out.println("\t\tThings to do: " + x.getActivities());
//                System.out.println("\t\tThings to avoid: " + x.getAvoid());
//        }

    }
    
}
