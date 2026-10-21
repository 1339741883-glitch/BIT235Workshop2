public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40;
        double normalFuelPer100km = 8;
        double roughFuelPer100km = normalFuelPer100km * 1.15;

        double normalDistance = (tankCapacity / normalFuelPer100km) * 100;
        double roughDistance = (tankCapacity / roughFuelPer100km) * 100;

        System.out.println("Tank capacity: " + tankCapacity + "L");
        System.out.println("Range on normal roads: " + normalDistance + " km");
        System.out.println("Range on rough roads: " + String.format("%.2f", roughDistance) + " km");
    }
}
