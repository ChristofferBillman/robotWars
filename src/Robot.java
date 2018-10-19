public class Robot {
    boolean lightLover;
    int fuelLevel = 0;
    int x;
    int y;

    // Konstruktor
    public Robot(boolean setLightLover, int setFuelLevel, int setX, int setY) {
        // Setting up necessary variables.

        lightLover = setLightLover;
        setFuelLevel(setFuelLevel);
        this.x = setX;
        this.y = setY;
    }

    private void behaviour() {

    }

    private void move(int moveX, int moveY) {
        x = getX() + moveX;
        y = getY() + moveY;
    }
    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    private int getFuelLevel() {
        return fuelLevel;
    }

    private void setFuelLevel(int newFuelLevel) {
        this.fuelLevel = newFuelLevel;
    }

    private boolean getLightLover() {
        return lightLover;
    }
}
