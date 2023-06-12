public class CelsiusToFahrenheit extends Converter {
    @Override
    public void temperatureConverter(double temperature) {
        double temperatereF = temperature*1.8+32;
        System.out.println("Temperatere F is equal: " + temperatereF);
    }
}
