public class A5_Square extends World {

    public int x;
    public int y;

    public void go() {
        x = plane.random(0,500);
        y = plane.random(0,500);
        plane.trailWidth = 1;
        plane.hasTrail =  true;
        plane.pausetime = 1;
        plane.setTrailColor(100, 10, 200);
        plane.teleport(0,0);
        plane.setAngle(90);
        bluetooth(1);
        plane.teleport(x, y);
        plane.hasTrail = true;
        plane.setAngle(0);
        platypus();
        square(100);
        square(500);

    } //end of go

    //datatype is type of info stored inside of a variable
    //ex. true, 10, 500. Integers, Boolean = true/false
    //parameter type of variable that live in the parenthesis of methods
    //can only be used in the method

   public void square(int size) {
       plane.setAngle(90);
       plane.hasTrail = true;
       plane.trailWidth = 10;
       plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);

       // notice the direction your plane is facing at this point

    } //end of square

    public void bluetooth(int width){
        plane.hasTrail = true;
        x = plane.random(0,700);
        y = plane.random(0,500);

//mid line
        plane.teleport(x, y);
        plane.setAngle(90);
        plane.move(320);

//1st triangle
        plane.teleport(x, y);
        plane.setAngle(45);
        plane.move(115);
        plane.setAngle(135);
        plane.move(230);
//2nd triangle
        plane.teleport(x-80, y+80);
        plane.setAngle(45);
        plane.move(230);
        plane.setAngle(135);
        plane.move(113);
        plane.teleport(x,y+175);
//circle and get rid of plane
        plane.circle(300);
        plane.teleport(0,0);

}//end of bluetooth

public int platypus() {

    plane.move(100);
    plane.hasTrail = false;
    plane.move(100);

    plane.hasTrail = true;
    plane.move(200);

    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(100);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(100);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(20);
    plane.setAngle(180);
    plane.setTrailColor(0, 200, 0);
    plane.move(120);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(60);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(20);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(30);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(60);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(60);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(50);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(20);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(40);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(70);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(220);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(50);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(20);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(35);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(50);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(50);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(50);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(20);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(35);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(100);
    plane.turnLeft(100);
    plane.setTrailColor(0, 200, 0);
    plane.move(120);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(80);
    plane.turnLeft(260);
    plane.setTrailColor(0, 200, 0);
    plane.move(120);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(55);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(360);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(30);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(10);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(50);
    System.out.println("Turn the plane.");
    plane.setAngle(90);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(270);
    plane.setTrailColor(0, 200, 0);
    plane.move(10);
    System.out.println("Turn the plane.");
    plane.setAngle(270);
    plane.hasTrail = true;
    plane.trailWidth = 3;
    plane.setTrailColor(200, 0, 0);
    plane.move(10);
    plane.turnLeft(90);
    plane.setTrailColor(0, 200, 0);
    plane.move(10);

    return 0;
}




} //end of file


