package one.digitalinnovation.builder;

public class Garage {
    int numCars;

    public Garage(int numCars) {
        this.numCars = numCars;
    }

    @Override
    public String toString() {
        return "Garage [numCars=" + numCars + "]";
    }
}
