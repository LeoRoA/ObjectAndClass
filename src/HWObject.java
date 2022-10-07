public class HWObject {
    public static void main(String[] args) {
        Author georgeOrwell = new Author("George", "Orwell");
        Author anthonyBurgess = new Author("Anthony", " Burgess");
        Book book1 = new Book("1984", georgeOrwell, 1948);
        Book book2 = new Book("A Clockwork Orange", anthonyBurgess, 1962);
        System.out.println("Автор 1 книги = " + book1.getAuthor().getFullName());
        System.out.println("Заголовок 2 книги = " + book2.getTitle() +
                "\nГод публикации 2 книги = " + book2.getPublicationYear());
        book2.setPublicationYear(1961);
        System.out.println("Год публикации 2 книги " + book2.getPublicationYear());
    }


}