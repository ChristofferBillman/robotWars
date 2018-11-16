import com.sun.xml.internal.bind.v2.TODO;
import java.awt.*;

public class World {
    int width;
    int height;
    Block[] world;
    int lampAmount = 5;
    int fuelStationAmount = 3;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.world = generate(width, height, this.lampAmount, this.fuelStationAmount);
        this.calculateDistances();
    }

    public Block[] generate(int width, int height, int lampAmount, int fuelStationAmount) {
        if (lampAmount + fuelStationAmount > width * height) {

        }
        Block[] w = new Block[width * height];
        for (int i = 0; i < w.length; i++) {
            w[i] = new Block();
        }
        for (int i = 0; i < lampAmount + fuelStationAmount; i++) {
            if (i < lampAmount) {
                w[i].setLamp(true);
            } else {
                w[i].setFuel(true);
            }
        }
        shuffleArray(w);
        return w;
    }
    // TODO: Make populateWorld method. Creates said instances of the robot class.

    private void shuffleArray(Block[] arr) {
        int m = arr.length;
        Block t;
        int i;
        while(m > 0) {
            i = (int)Math.floor(Math.random() * m--);
            t = arr[m];
            arr[m] = arr[i];
            arr[i] = t;

        }
    }

    public void calculateDistances() {
        int[][] lamps = new int[this.lampAmount][2];
        int[][] fuelStations = new int[this.fuelStationAmount][2];
        int a = 0;
        int b = 0;
        for (int i = 0; i < this.world.length; i++) {
            if (this.world[i].isLamp()) {
                lamps[a++] = indexToCoords(i);
            }
            if (this.world[i].isFuel()) {
                fuelStations[b++] = indexToCoords(i);
            }
        }
        for (int[] p :
                lamps) {
            for (int i = 0; i < this.world.length; i++) {
                int distanceX = Math.abs(indexToCoords(i)[0] - p[0]);
                int distanceY = Math.abs(indexToCoords(i)[1] - p[1]);
                if (this.world[i].getDisToLight() > distanceX + distanceY || this.world[i].getDisToLight() == 0) {
                    this.world[i].setDisToLight(distanceX + distanceY);
                }
            }
        }
        for (int[] p:
                fuelStations) {
            for (int i = 0; i < this.world.length; i++) {
                int distanceX = Math.abs(indexToCoords(i)[0] - p[0]);
                int distanceY = Math.abs(indexToCoords(i)[1] - p[1]);
                if (this.world[i].getDisToFuel() > distanceX + distanceY) {
                    this.world[i].setDisToFuel(distanceX + distanceY);
                }
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                if (this.world[i * this.width + j].isLamp()) {
                    s += "L";
                } else if (this.world[i * this.width + j].isFuel()) {
                    s += "F";
                } else {
                    s += ".";
                }
            }
            s += "\n";
        }
        return s;
    }

    public int coordsToIndex(int x, int y) {
        return y * this.width + x;
    }

    public int[] indexToCoords(int i) {
        int[] coords = new int[2];
        coords[0] = i % this.width;
        coords[1] = i / this.width;
        return coords;
    }

}