package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купэ"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),
    PICKUP("Пикап");

    private final String Bodytype;

    BodyType(String Bodytype) {
        if (Bodytype == null || Bodytype.isBlank()) {
            this.Bodytype = "Нет информации";
        } else {
            this.Bodytype = Bodytype;
        }
    }

    public String getBodytype() {

        return Bodytype;
    }
}