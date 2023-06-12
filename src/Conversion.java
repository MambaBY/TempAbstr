import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in degrees Celsius: ");
        convert();


    }
    public static void convert(){
        Scanner sc = new Scanner(System.in);
        try {
            double temperatureCelsius = sc.nextDouble();
            CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
            CelsiusToKelvin ck = new CelsiusToKelvin();
            cf.temperatureConverter(temperatureCelsius);
            ck.temperatureConverter(temperatureCelsius);
        }catch (Exception e){
            System.out.println("Invalid temperature value. Enter a number.");
            convert();
        }
        sc.close();
    }
}