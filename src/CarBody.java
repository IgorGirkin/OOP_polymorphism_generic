public enum CarBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyTypeRU;

    CarBody(String bodyTypeRU) {
        this.bodyTypeRU = bodyTypeRU;
    }

    public String getBodyTypeRU() {
        return bodyTypeRU;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyTypeRU;
    }
}
