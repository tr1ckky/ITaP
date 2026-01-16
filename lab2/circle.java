package lab2;

class circle extends figure {
    private String color;
    private float radius;

    // Конструктор с параметрами
    public circle(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    // Конструктор по умолчанию
    public circle() {
        this("белый", 0);
    }

    @Override
    public void GetInfo() {  // Переопределение (динамический полиморфизм)
        System.out.println(name + " окрашен в " + color);
    }

    @Override
    public void GetInfo(String message) {  // Переопределение перегруженной версии
        System.out.println(name + " окрашен в " + color + " (" + message + ")");
    }

    @Override
    public float GetV() {
        return (float) (4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public float GetS() {
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

    // Геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}