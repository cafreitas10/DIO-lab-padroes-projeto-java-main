package one.digitalinnovation.builder;

public class Garden {
    GardenType type;

    public Garden(GardenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Garden [type=" + type + "]";
    }
}
