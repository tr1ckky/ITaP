package lab2;

abstract class figure {
    protected String name;

    // Абстрактные методы (абстракция)
    abstract float GetV();
    abstract float GetS();

    // Перегруженные методы для демонстрации статического полиморфизма
    public void GetInfo() {
        System.out.println("Фигура: " + name);
    }

    public void GetInfo(String message) {  // Перегрузка (static polymorphism)
        System.out.println("Фигура: " + name + " (" + message + ")");
    }

    // Геттер и сеттер для name (инкапсуляция)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
