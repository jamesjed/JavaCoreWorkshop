public class Parent implements Photographer{
    public void prepareScene(){

        System.out.println("Parent photographer");
    }

    public String takePhotograph(){

        return "Cheesy pictures were taken";
    }
}