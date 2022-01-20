import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int ball_width = 10;
    public static final int ball_height = 10;
    public static int ball1_x = 0;
    public static int ball2_x = 0;
    public static int ball3_x = 0;
    public static int ball4_x = 0;

    public static void main(String args[]){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(800,500);
    }

    @Override
    public void draw() {
        ellipse(ball1_x, 100, ball_width, ball_height);
        ball1_x += 1;
        ellipse(ball2_x, 200, ball_width,ball_height);
        ball2_x += 2;
        ellipse(ball3_x, 300, ball_width, ball_height);
        ball3_x += 3;
        ellipse(ball4_x, 400, ball_width, ball_height);
        ball4_x += 4;
    }

}
