package one.digitalinnovation.builder;

public class Builder {
    public static void run() {
		System.out.println("\n------------------------------ BUILDER\n");

        var cheapHouse = HouseBuilder.builder()
            .numRooms(2)
            .garageSize(1)
            .poolArea(20)
            .gardenType(GardenType.CLASSIC)
            .build();

        var expensiveHouse = HouseBuilder.builder()
            .numRooms(32)
            .garageSize(50)
            .poolArea(100)
            .gardenType(GardenType.BRITISH)
            .build();
        
        System.out.println(cheapHouse);
        System.out.println(expensiveHouse);
    }
}
