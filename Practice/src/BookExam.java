public class BookExam {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java";
        book.price = 30000;
        book.company = "FastCampus";
        book.author = "James";
        book.page = 700;
        book.isbn = "1199110";
        System.out.println(book.title + "\t" + book.price + "\t" + book.company + "\t" + book.author + "\t" + book.page + "\t" + book.isbn);
    }
}
