public class Author {
    // 1. Приватные поля (переменные) класса
    // Они private, значит, к ним нельзя обратиться напрямую из другого класса
    private String name;
    private String email;
    private char gender; // 'M', 'F' или 'U'

    // 2. Конструктор класса
    // Он вызывается, когда мы создаем новый объект Author
    // Он принимает три значения и записывает их в поля нашего объекта
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // 3. Публичные методы (геттеры и сеттеры)

    // Геттер для имени (только получение, сеттера нет, т.к. имя не меняется)
    public String getName() {
        return name;
    }

    // Геттер для email
    public String getEmail() {
        return email;
    }

    // Сеттер для email (позволяет изменить email уже после создания объекта)
    public void setEmail(String email) {
        this.email = email;
    }

    // Геттер для пола (только получение, сеттера нет)
    public char getGender() {
        return gender;
    }

    // 4. Метод toString()
    // Он должен возвращать строку в определенном формате, как в задании
    // Например: "Andrey (m) at andrey@example.com"
    @Override
    public String toString() {
        // Мы "склеиваем" (конкатенируем) строку из полей нашего объекта
        return name + " (" + gender + ") at " + email;
    }
}