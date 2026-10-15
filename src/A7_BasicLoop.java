public class A7_BasicLoop extends World {

    public void go() {
        plane.hasTrail = true;
        plane.trailWidth = 40;
        plane.pausetime = 1;
        for(int y = 0;y < 10; y++) {

            for (int x = 0; x < 20; x = x + 1) {
                plane.teleport(50*x, y*90);
                plane.setTrailColor(x*(255/20), y*(255/10), 0);
                square();

            }//end of inner loop
        }//end of outer loop

//        for(int x=0;x<8;x=x+1) {
//
//            plane.setTrailColor(30*x,0,30*x);
//            plane.teleport(100*x, 200);
//            square();
//
//
//        }//end of loop
//
//        for(int x=0;x<8;x=x+1) {
//
//            plane.setTrailColor(0,0,30*x);
//            plane.teleport(100*x, 300);
//            square();
//
//
//        }//end of loop
//
//        for(int x=0;x<8;x=x+1) {
//
//            plane.setTrailColor(0,30*x,0);
//            plane.teleport(100*x, 400);
//            square();
//
//
//        }//end of loop

    }//end of go

    public void square(){

        for(int y=0;y<4;y++) {

        plane.move(50);
        plane.turnLeft(90);

        }//end of loop
    }//end of square

}//end of file