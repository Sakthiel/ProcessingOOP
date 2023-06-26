public abstract class Ball {
    public int xpos ;
    public int ypos ;
    public final int DIAMETER ;
    public Ball(int xpos,int ypos, int DIAMETER) {
        this.xpos = xpos;
        this.DIAMETER = DIAMETER;
        this.ypos = ypos;
    }
    public void display() {

        ProcessingOOP.processing.ellipse(xpos ,this.ypos ,DIAMETER,DIAMETER);
    }
    public abstract void move();

}
