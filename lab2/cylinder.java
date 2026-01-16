package lab2;

class cylinder extends figure {
    private float radius;
    private float height;

    // Конструктор с параметрами
    public cylinder(float height, float radius) {
        this.height = height;
        this.radius = radius;
    }

    // Конструктор по умолчанию
    public cylinder() {
        this(0, 0);  // Вызов конструктора с params
    }

    @Override
    public float GetV() {
        return (float) Math.PI * radius * radius * height;  // Объём цилиндра: π r² h
    }

    @Override
    public float GetS() {
        return 2 * (float) Math.PI * radius * (radius + height);  // Площадь: 2πr(r + h)
    }

    // Геттеры и сеттеры
    public void setHeight(float newHeight) {
        this.height = newHeight;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float newRadius) {
        this.radius = newRadius;
    }

    public float getRadius() {
        return radius;
    }
}