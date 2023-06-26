import processing.core.PApplet;

public class ProcessingOOP extends PApplet {
    public static final int DIAMETER = 50;
    public static  PApplet processing;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String args[]){
        PApplet.main("ProcessingOOP",args);

    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
        processing = this;
        ball1 = new Ball1(0 , HEIGHT*1/5 , DIAMETER );
        ball2 = new Ball2(0 , HEIGHT*2/5 , DIAMETER );
        ball3 = new Ball3(0 , HEIGHT*3/5 , DIAMETER );
        ball4 = new Ball4(0 , HEIGHT*4/5 , DIAMETER );
    }

    @Override
    public void draw() {
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();

    }
}
