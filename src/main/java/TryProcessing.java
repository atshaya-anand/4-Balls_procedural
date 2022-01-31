import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    public static final int ballWidth = 10;
    public static final int ballHeight = 10;

    public static int ball1xPos = 0;
    public static final int ball1yPos = HEIGHT / 5;

    public static int ball2xPos = 0;
    public static final int ball2yPos = 2 * (HEIGHT / 5);

    public static int ball3xPos = 0;
    public static final int ball3yPos = 3 * (HEIGHT / 5);

    public static int ball4xPos = 0;
    public static final int ball4yPos = 4 * (HEIGHT / 5);


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
        ellipse(ball1xPos, ball1yPos, ballWidth, ballHeight);
        ball1xPos += 1;
        ellipse(ball2xPos, ball2yPos, ballWidth,ballHeight);
        ball2xPos += 2;
        ellipse(ball3xPos, ball3yPos, ballWidth, ballHeight);
        ball3xPos += 3;
        ellipse(ball4xPos, ball4yPos, ballWidth, ballHeight);
        ball4xPos += 4;
    }

}
