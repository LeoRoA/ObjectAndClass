public class HWObject {
    public static void main(String[] args) {
        Author georgeOrwell = new Author("George", "Orwell");
        Author georgeOrwell2 = new Author("George", "Orwell");
        System.out.println("georgeOrwell.equals(georgeOrwell2) = " + georgeOrwell.equals(georgeOrwell2));
        boolean isHashCodeAuthorEquals = georgeOrwell2.hashCode() == georgeOrwell.hashCode();
        System.out.println("Хэш-коды равны? = " + isHashCodeAuthorEquals);
        Author anthonyBurgess = new Author("Anthony", " Burgess");

        Book book1 = new Book("1984", georgeOrwell, 1948);
        Book book2 = new Book("A Clockwork Orange", anthonyBurgess, 1962);

        System.out.println("Автор 1 книги = " + book1.getAuthor().toString());
        System.out.println("Заголовок 2 книги = " + book2.getTitle() +
                "\nГод публикации 2 книги = " + book2.getPublicationYear());
        book2.setPublicationYear(1961);
        System.out.println("Год публикации 2 книги " + book2.getPublicationYear());

        System.out.println("book2.equals(book1) = " + book2.equals(book1));
        boolean isHashCodeBookEquals = book1.hashCode() == book2.hashCode();
        System.out.println("isHashCodeBookEquals = " + isHashCodeBookEquals);

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
    }


}