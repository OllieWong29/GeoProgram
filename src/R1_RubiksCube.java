public class R1_RubiksCube extends World{

    public int x;
    public int w;

    public void go(){
//background
        plane.hasTrail = true;
        plane.trailWidth = 100;
        plane.pausetime = 0;
        //initial loop for squares
        for(int y = 0;y < 10; y++) {
            //loop for repeating rows
            for (int x = 0; x < 20; x = x + 1) {
                plane.teleport(50 * x, y * 90);
                plane.setTrailColor(x * (255 / 20), y * (255 / 10), plane.random(0,255));
                square();
            }//end of loop
        }//end of initial loop

        //end of background
        plane.setTrailColor(0,0,0);
        x = plane.random(100,500);
        plane.teleport(plane.random(0,800),plane.random(0,500));

        plane.hasTrail = true;
        plane.pausetime = 0;
        plane.setAngle(30);


        w = plane.random(1,2);
        if (w==1) {
            plane.trailWidth = 3;
        }//end of w==1

        if (w==2) {
            plane.trailWidth = 30;
        }//end of w==2


        //FACES
        face1();
        face1();
        face2();
        face3();

        //LINES

        //lines faceleft
        plane.turnLeft(-60);
        plane.move(x/3);
        plane.turnLeft(-60);
        plane.move(x);
        plane.turnLeft(60);
        plane.move(x/3);
        plane.turnLeft(120);
        plane.move(x);
        plane.turnLeft(-120);
        plane.move(x/3);
        plane.turnLeft(-60);
        plane.move(x/3);
        plane.turnLeft(-120);
        plane.move(x);
        plane.turnLeft(120);
        plane.move(x/3);
        plane.turnLeft(60);
        plane.move(x);

        //lines facetop & faceright
        for(int h=0;h<2;h++) {

            plane.turnLeft(-60);
            plane.move(x / 3);
            plane.turnLeft(-60);
            plane.move(x / 3);
            plane.turnLeft(-60);
            plane.move(x);
            plane.turnLeft(60);
            plane.move(x / 3);
            plane.turnLeft(120);
            plane.move(x);
            plane.turnLeft(-120);
            plane.move(x / 3);
            plane.turnLeft(-60);
            plane.move(x / 3);
            plane.turnLeft(-120);
            plane.move(x);
            plane.turnLeft(120);
            plane.move(x / 3);
            plane.turnLeft(60);
            plane.move(x);
        }//end of loop

    }//end of go

    public void face1(){

        plane.move(x);
        plane.turnLeft(60);
        plane.move(x);
        plane.turnLeft(120);
    }

    public void face2(){

        plane.turnLeft(-30);
        plane.turnLeft(-30);
        plane.move(x);
        plane.turnLeft(60);
        plane.move(x);
        plane.turnLeft(120);
        plane.move(x);
    }

    public void face3(){

        plane.turnLeft(-60);
        plane.move(x);
        plane.turnLeft(-120);
        plane.move(x);
        plane.turnLeft(-60);
        plane.move(x);

    }

    public void square(){
        for(int s=0;s<4;s++){
        plane.move(100);
        plane.turnLeft(90);

        }//end of loop

    }//end of square

}//end of file
