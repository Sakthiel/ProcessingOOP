public class Ball3 extends Ball{


    public Ball3(int xpos, int ypos, int DIAMETER) {
        super(xpos,ypos,DIAMETER);
    }

    public void move(){
        xpos+=3;
    }
}
