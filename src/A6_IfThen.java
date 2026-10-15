public class A6_IfThen extends World {

    public int randNum;
    public int red;
    public int green;
    public int blue;
    public int x;
    public int y;
    public int size;

    public void go() {
        x = plane.random(0,500);
        y = plane.random(0,500);
        red = plane.random(0,255);
        green = plane.random(0,255);
        blue = plane.random(0,255);
        size = plane.random(100, 500);
        plane.setTrailColor(red, green, blue);
        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(x, y);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if(randNum == 3){
            circle();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void circle(){

        plane.circle(100);

    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }//end of rectangle
}//end of file
//todo: add a method to the file

