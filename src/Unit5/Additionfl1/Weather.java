package Unit5.Additionfl1;

public class Weather {

    public static void showWeather(City city) {
        int temp = city.getTemperature();
        System.out.println("В городе "+ city.getName()+" сегодня температура воздуха" +" "+ temp);
    }

    public static void main(String[] args) {
        City city = new City("сити17", 13);
        showWeather(city);

    }
}
