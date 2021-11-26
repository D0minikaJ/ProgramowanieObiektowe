package pl.imiajd.jablonska;
import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
        setLocation(x, y);
        setSize(width, height);
    }

    public int getPerimeter(int width, int height){
        return width*2 + height*2;
    }

    public int GetArea(int width, int height){
        return width*height;
    }

}
