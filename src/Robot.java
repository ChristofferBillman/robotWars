public class Robot {
    private boolean lightLover;
    private int fuelLevel = 0;
    private int x;
    private int y;

    // Constructor
    public Robot(boolean setLightLover, int setFuelLevel, int setX, int setY) {
        // Setting up necessary variables.

        lightLover = setLightLover;
        setFuelLevel(setFuelLevel);
        this.x = setX;
        this.y = setY;
    }
    // The behaviour of the robot is here. Is intended to run every tick.
    public void behaviour(World world) {
        int robotIndex = world.coordsToIndex(this.x,this.y);

        if (this.fuelLevel <= world.world[robotIndex].getDisToLight()) {

        } else {

        }

    }
    private void move(int moveX, int moveY) {
        this.x = getX() + moveX;
        this.y = getY() + moveY;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int newFuelLevel) {
        this.fuelLevel = newFuelLevel;
    }

    public boolean getLightLover() {
        return this.lightLover;
    }
}
