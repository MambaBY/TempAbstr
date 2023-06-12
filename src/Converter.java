public abstract class Converter {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public abstract void temperatureConverter(double temperature);
}
