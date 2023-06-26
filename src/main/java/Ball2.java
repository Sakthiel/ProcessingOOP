public class Ball2 extends Ball{

    public Ball2(int xpos, int ypos, int DIAMETER) {
        super(xpos,ypos,DIAMETER);
    }

    public void move(){
        xpos+=2;
    }
}
