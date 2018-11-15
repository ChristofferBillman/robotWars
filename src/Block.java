public class Block {

    //Block types
    private boolean isFuel;
    private boolean isLamp;

    //Distance values
    private int disToFuel;
    private int disToLight;

    //Constructor
    public Block() {
        isFuel = false;
        isLamp = false;
    }

    public Block(boolean setIsFuel, boolean setIsLamp) {
        isFuel = setIsFuel;
        isLamp = setIsLamp;
    }

    public boolean isFuel() {
        return isFuel;
    }

    public void setFuel(boolean fuel) {
        isFuel = fuel;
    }

    public boolean isLamp() {
        return isLamp;
    }

    public void setLamp(boolean lamp) {
        isLamp = lamp;
    }

    public int getDisToFuel() {
        return disToFuel;
    }

    public void setDisToFuel(int disToFuel) {
        this.disToFuel = disToFuel;
    }

    public int getDisToLight() {
        return disToLight;
    }

    public void setDisToLight(int disToLight) {
        this.disToLight = disToLight;
    }
}