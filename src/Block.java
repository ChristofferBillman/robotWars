public class Block {

    //Block types
    boolean isFuel;
    boolean isLamp;

    //Distance values
    int disToFuel;
    int disToLight;

    //Constructor
    public Block() {
        isFuel = false;
        isLamp = false;
    }

    public Block(boolean setIsFuel, boolean setIsLamp) {
        isFuel = setIsFuel;
        isLamp = setIsLamp;
    }
}