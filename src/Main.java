import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        World world = new World(160,8);
        System.out.println(world);
        System.out.println(Arrays.toString(indexLightorFuelStations(world,true)));

        // Tick
        boolean running = true;
        while(running) {
            try {
                // Insert code to run every tick.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method returns an array with all of the fuelStations/lamps coordinates (index) in the world.
    public static int[] indexLightorFuelStations(World world, boolean fuel) {
        int[] fuelStations = new int[world.fuelStationAmount];
        int[] lamps = new int[world.lampAmount];
        int insertions = 0;
        if (fuel) {
            for(int i = 0;i < world.world.length; i++) {
                if (world.world[i].isFuel()) {
                    fuelStations[insertions] = i;
                    insertions++;
                }
            }
            return fuelStations;
        } else {
            for(int i = 0;i < world.world.length; i++) {
                if (world.world[i].isLamp()) {
                    lamps[insertions] = i;
                    insertions++;
                }
            }
            return lamps;
        }
    }
}

