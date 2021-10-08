package one.digitalinnovation.builder;

public class House {
    int numRooms;
    Garage garage;
    SwimmingPool pool;
    Garden garden;

    public House(int numRooms, Garage garage, SwimmingPool pool, Garden garden) {
        this.numRooms = numRooms;
        this.garage = garage;
        this.pool = pool;
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House [garage=" + garage + ", garden=" + garden + ", numRooms=" + numRooms + ", pool=" + pool + "]";
    }
}
