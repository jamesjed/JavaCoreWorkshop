/**
 * Created by janatana on 9/19/2016.
 */
public class GlassVase implements Sized {

    private int size;

    public GlassVase(int size){
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
