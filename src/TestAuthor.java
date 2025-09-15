public class TestAuthor {
    public static void main(String[] args) {
        // 1. Создаем экземпляр (объект) класса Author, используя наш конструктор
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');

        // 2. Выводим информацию об авторе на экран.
        // Когда мы передаем объект в System.out.println(), Java автоматически вызывает у него метод toString()
        System.out.println(author1); // Должно вывести: Tan Ah Teck (m) at ahTeck@somewhere.com

        // 3. Изменяем email автора с помощью сеттера
        author1.setEmail("new.email@somewhere.com");

        // 4. Проверяем, что email изменился, используя геттеры
        System.out.println("Проверка после смены email:");
        System.out.println("Имя автора: " + author1.getName());
        System.out.println("Новый email: " + author1.getEmail());
        System.out.println("Пол: " + author1.getGender());
    }
}