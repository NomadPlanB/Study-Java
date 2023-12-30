public class BookTest {
    public static void main(String[] args) {

        String title = "Java";
        int price = 30000;
        String company = "FastCampus";
        String author = "James";
        int page = 700;
        String isbn = "ISPN-111990011";

        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn);

        Book b = new Book();
    }
}
