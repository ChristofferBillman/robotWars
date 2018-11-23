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
            // go toward light

            int[] lightLevelAt = new int[4];
            if (this.x < world.width) {
                lightLevelAt[0] = world.world[world.coordsToIndex(this.x + 1,this.y)].getDisToLight(); //right
            } else if (this.x > 0) {
                lightLevelAt[1] = world.world[world.coordsToIndex(this.x - 1, this.y)].getDisToLight(); // left
            } else if (this.y > 0) {
                lightLevelAt[2] = world.world[world.coordsToIndex(this.x,this.y + 1)].getDisToLight(); //up
            } else {
                lightLevelAt[3] = world.world[world.coordsToIndex(this.x,this.y - 1)].getDisToLight(); //down
            }

            int light;
            if(lightLover) {
                light = Math.max(lightLevelAt[0], Math.max(lightLevelAt[1], Math.max(lightLevelAt[2], lightLevelAt[3])));
            } else {
                light = Math.min(lightLevelAt[0], Math.min(lightLevelAt[1], Math.min(lightLevelAt[2], lightLevelAt[3])));
            }

            for(int i = 0; i <= 3; i++) {
                if(light == lightLevelAt[i]) {
                    switch(lightLevelAt[i + 1]) {
                        case 1: move(1,0);
                        case 2: move(-1, 0);
                        case 3: move(0,1);
                        case 4: move(0,-1);
                    }
                }
            }
        } else {
            int[] fuelLevelAt = new int[4];

            if (this.x < world.width) {
                fuelLevelAt[0] = world.world[world.coordsToIndex(this.x + 1,this.y)].getDisToFuel();//right
            } else if (this.x > 0) {
                fuelLevelAt[1] = world.world[world.coordsToIndex(this.x - 1, this.y)].getDisToFuel(); // left
            } else if (this.y > 0) {
                fuelLevelAt[2] = world.world[world.coordsToIndex(this.x,this.y + 1)].getDisToFuel(); //up
            } else {
                fuelLevelAt[3] = world.world[world.coordsToIndex(this.x,this.y - 1)].getDisToFuel(); //down
            }

                int maxFuel = Math.max(fuelLevelAt[0], Math.max(fuelLevelAt[1], Math.max(fuelLevelAt[2], fuelLevelAt[3])));

            for(int i = 0; i <= 4; i++) {
                if(maxFuel == fuelLevelAt[i]) {
                    switch(fuelLevelAt[i + 1]) {
                        case 1: move(1,0);
                        case 2: move(-1, 0);
                        case 3: move(0,1);
                        case 4: move(0,-1);
                    }
                }
            }
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
