/**
 *
* Description of the program goes here  // provide a brief description
* Climb Every Mountain (Lab02 in Unit1, fcps.karel)
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
* @author Will Fox
* @version 3/11/2014
 */
 
 import edu.fcps.karel2.Display;

 public class Lab03 {
 
      public static void main(String[] args) {
          // TODO Your code goes here
            
            Display.openWorld("maps/mountain.map");
            Display.setSize(16, 16);
            Display.setSpeed(5);
            Climber edmund = new Climber();
            Climber tenzing = new Climber();
            
            edmund.turnRight();
            tenzing.turnRight();
            edmund.move();
            tenzing.move();
            edmund.turnLeft();
            tenzing.turnLeft();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.climbUpRight();
            tenzing.climbUpRight();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbDownRight();
            tenzing.climbDownRight();
            edmund.climbDownRight();
            tenzing.climbDownRight();
            edmund.pickBeeper();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbUpLeft();
            tenzing.climbUpLeft();
            edmund.climbUpLeft();
            tenzing.climbUpLeft();
            edmund.turnAround();
            tenzing.turnAround();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.climbDownLeft();
            tenzing.climbDownLeft();
            edmund.turnRight();
            tenzing.turnRight();
            edmund.move();
            tenzing.move();
            edmund.turnRight();
            tenzing.turnRight();
     }
     
 }