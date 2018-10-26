public class World {
    int width;
    int height;
    Block[] world;

    public World() {
        generate();
    }

    private Block[] generate(int lampAmount, int fuelStationAmount, int width, int height) {

    }

    public void startSim(int ticks) {

    }
    public void stopSim() {

    }
    public int coordinateToIndex(int x, int y) {
        return y * this.width + x;
    }
    public int[] indexToCoordinate(int index) {
        int[] coordinates = new int[2];
        coordinates[0] = index / width;
        coordinates[1] = index % width;
        return coordinates;
    }
}
