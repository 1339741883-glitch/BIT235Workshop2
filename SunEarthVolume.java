public class SunEarthVolume {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;

        double sunRadius = sunDiameter / 2.0;
        double earthRadius = earthDiameter / 2.0;

        // 球体体积公式 V = (4/3) * π * r³
        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);
        double volumeRatio = sunVolume / earthVolume;

        System.out.println("a) Volume of the Earth: " + earthVolume + " cubic miles");
        System.out.println("b) Volume of the Sun: " + sunVolume + " cubic miles");
        System.out.println("c) Sun / Earth volume ratio: " + volumeRatio);
    }
}
