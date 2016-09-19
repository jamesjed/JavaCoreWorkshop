import java.awt.*;

/**
 * Created by janatana on 9/19/2016.
 */
public class Fabric implements Colored {

    private Color color;

    public Fabric(Color color){
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
