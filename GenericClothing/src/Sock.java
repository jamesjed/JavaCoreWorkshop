import java.awt.*;

/**
 * Created by janatana on 9/19/2016.
 */
public class Sock implements Sized, Colored {

    private Color color;
    private int size;

    public Sock(Color color, int size){
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
