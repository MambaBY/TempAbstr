public class CelsiusToKelvin extends Converter{
    @Override
    public void temperatureConverter(double temperature) {
        double temperatereK = temperature+ 273.15;
        System.out.println("Temperatere K is equal: " + temperatereK);
    }
}
