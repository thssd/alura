public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return fahrenheit;
    }

    public void setFarenheit(double farenheit) {
        this.fahrenheit = farenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParacelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}
