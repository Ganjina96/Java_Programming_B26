package day06_arithmetic_operators;

public class RecapHouse {
    public static void main(String[] args) {
        String houseType = "single family home";
        byte numberOfBedrooms = 3;
        double numberOfBathrooms = 2.5;
        byte numberOfKitchens = 1;
        boolean isThereABasement = false;
        boolean isThereAnAttic = false;
        boolean isThereAPool = true;
        boolean isTheHouseForSale = false;
        int costOfTheHouse = 400_000;
        String addressOfTheHouse = "1530 Cold Creek Pl, Huntersville, NC";
        int zipcode = 28078;
        boolean hasParkNearby = true;
        double schoolDistrictRating = 3.8;

        String houseInfo = "I bought a " + houseType + " at " + addressOfTheHouse + ", " + zipcode + " for $" + costOfTheHouse + ". It has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, and " + numberOfKitchens + " kitchen. " + "\nIt includes a basement: " + isThereABasement + ", has an attic: " + isThereAnAttic + ", has a pool: " + isThereAPool + ", is on sale: " + isTheHouseForSale + ", has a park nearby: " + hasParkNearby + ", has a good school rating of: " + schoolDistrictRating;
        System.out.println(houseInfo);



    }
}
