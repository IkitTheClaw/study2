public class SkyscraperTwo {
    private final int floorsCount;
    private final String developer;

    private SkyscraperTwo() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    private SkyscraperTwo(int floorsCount, String developer) {
        this.developer = developer;
        this.floorsCount = floorsCount;
    }

    public static void main(String[] args) {
        SkyscraperTwo skyscraper = new SkyscraperTwo();
        SkyscraperTwo skyscraperUnknown = new SkyscraperTwo(50, "Неизвестно");
    }
}


