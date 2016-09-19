/**
 * Created by janatana on 9/19/2016.
 */
public class ClothingPair<T extends Colored & Sized> {

    private T firstClothingArticle;
    private T secondClothingArticle;

    public ClothingPair(T first, T second){
        this.firstClothingArticle = first;
        this.secondClothingArticle = second;
    }

    public boolean isMatched(){
        if(firstClothingArticle.getSize() == secondClothingArticle.getSize() && firstClothingArticle.getColor() == secondClothingArticle.getColor())
            return true;
        else
            return false;
    }

}
