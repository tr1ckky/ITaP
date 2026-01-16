package lab2;

class square extends figure {
    private float height;
    private float length;
    private float width;  // Исправлено с weidth

    static int squareCounter = 0;  // Статический счётчик

    // Конструктор с параметрами
    public square(float height, float length, float width) {
        this.height = height;
        this.length = length;
        this.width = width;
        squareCounter++;  // Инкремент счётчика
    }

    // Конструктор по умолчанию
    public square() {
        this(0, 0, 0);
    }

    @Override
    public float GetV() {
        return height * length * width;
    }

    @Override
    public float GetS() {
        return 2 * (height * width + height * length + length * width);  // Площадь поверхности параллелепипеда
    }

    // Геттеры и сеттеры
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}