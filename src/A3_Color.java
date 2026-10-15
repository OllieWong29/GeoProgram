public class A3_Color extends World {

    //variables
    public int randomblue;
    public int randomred;
    public int randomgreen;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(0);
        plane.hasTrail = true;
        plane.trailWidth = 40;

        //add value to the variable

        //r = red, g = green, b = blue
        //values have to be between 0-255

        square();

    }//end of go

    public void square(){

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);

        randomblue = plane.random(0, 255);
        randomred = plane.random(0, 255);
        randomgreen = plane.random(0, 255);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(50);





    }//end of square

}//end of file
