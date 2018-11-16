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
    public void behaviour(World world, Block[] w) {
        int robotIndex = world.coordsToIndex(this.x,this.y);

        if (this.fuelLevel <= world.world[robotIndex].getDisToLight()) {
            move(1,1);
        } else {

        }

    }
    private void move(int moveX, int moveY) {
        this.x = getX() + moveX;
        this.y = getY() + moveY;
    }
    private int getX() {
        return this.x;
    }

    private int getY() {
        return this.y;
    }

    private int getFuelLevel() {
        return fuelLevel;
    }

    private void setFuelLevel(int newFuelLevel) {
        this.fuelLevel = newFuelLevel;
    }

    private boolean getLightLover() {
        return this.lightLover;
    }
}
