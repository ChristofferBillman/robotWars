import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        World world = new World(160,8);
        System.out.println(world);
        System.out.println(Arrays.toString(indexLightorFuelStations(world,true)));
    }
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
