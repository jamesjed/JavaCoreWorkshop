import java.awt.*;

/**
 * Created by janatana on 9/19/2016.
 */
public class Main {
    public static void main(String[] args){
        Color col1 = new Color(120, 120, 120);
        Color col2 = new Color(120, 120, 120);
        Glove gl1 = new Glove(col1, 4);
        Glove gl2 = new Glove(col2, 4);
        Sock s1 = new Sock(col1, 5);
        Sock s2 = new Sock(col2,6);


        ClothingPair<Glove> glovePair = new ClothingPair<Glove>(gl1, gl2);
        ClothingPair<Sock> sockPair = new ClothingPair<Sock>(s1, s2);

        //Uncomment line below to see that mixed pairs are not allowed
        //ClothingPair<Glove> mixedPair = new ClothingPair<Glove>(gl1, s2);

        //Uncomment line below to see that classes must im[;ement both Sized and Colored
        //to be accepted by the compiler
        //ClothingPair<GlassVase> vasePair = new ClothingPair<GlassVase>(s1, s2);
        //ClothingPair<Fabric> fabricPair = new ClothingPair<Fabric>(s1, s2);
    }
}
