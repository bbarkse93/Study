package programmers;

public class Gasoilne {

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = calcEffiency(gasoline, distance);
        System.out.printf("연비: %.2f km/L", efficiency);
        // Gasoilne.calcEffiency(gasoline, distance);
    }

    public static double calcEffiency(double fuel, double distance) {
        return distance / fuel;

    }

}
