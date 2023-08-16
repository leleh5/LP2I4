public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String text_authors = "";
        for (Author author : authors) {
            text_authors += author.toString();
        }
        return "Book[name=" + name + ",authors=" + text_authors + ",price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        String text_authors_name = "";
        for (Author author : authors) {
            text_authors_name += author.getName() + ", ";
        }
        return text_authors_name;
    }
}