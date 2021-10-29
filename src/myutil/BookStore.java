package myutil;

public class BookStore {


    private static int booksSold;
    private Book book;


    public class Book {
        private int id;
        private String category;
        private String author;
        private String title;
        private String publisher;
        private double bookPrice;
        private int quantity;

        public Book(int id, String category, String author, String title, String publisher, double bookPrice, int quantity) {
            this.id = id;
            this.category = category;
            this.author = author;
            this.title = title;
            this.publisher = publisher;
            this.bookPrice = bookPrice;
            this.quantity = quantity;
        }

        public void displayQuantity() {
            System.out.println(this.getQuantity());
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {

    }

}






