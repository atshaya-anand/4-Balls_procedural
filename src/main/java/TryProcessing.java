import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    public static final int ball_width = 10;
    public static final int ball_height = 10;

    public static int ball1_xPos = 0;
    public static final int ball1_yPos = HEIGHT / 5;

    public static int ball2_xPos = 0;
    public static final int ball2_yPos = 2 * (HEIGHT / 5);

    public static int ball3_xPos = 0;
    public static final int ball3_yPos = 3 * (HEIGHT / 5);

    public static int ball4_xPos = 0;
    public static final int ball4_yPos = 4 * (HEIGHT / 5);


    public static void main(String args[]){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ball1_xPos, ball1_yPos, ball_width, ball_height);
        ball1_xPos += 1;
        ellipse(ball2_xPos, ball2_yPos, ball_width,ball_height);
        ball2_xPos += 2;
        ellipse(ball3_xPos, ball3_yPos, ball_width, ball_height);
        ball3_xPos += 3;
        ellipse(ball4_xPos, ball4_yPos, ball_width, ball_height);
        ball4_xPos += 4;
    }

}
