package one.digitalinnovation.builder;

public class HouseBuilder {
    private int numRooms;
    private Garage garage;
    private SwimmingPool pool;
    private Garden garden;

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public House build() {
        return new House(numRooms, garage, pool, garden);
    }

    public HouseBuilder numRooms(int numRooms) {
        this.numRooms = numRooms;
        return this;
    }

    public HouseBuilder garageSize(int numCars) {
        this.garage = new Garage(numCars);
        return this;
    }

    public HouseBuilder poolArea(float area) {
        this.pool = new SwimmingPool(area);
        return this;
    }

    public HouseBuilder gardenType(GardenType type) {
        this.garden = new Garden(type);
        return this;
    }
}
