package Ex3;

public class Book {

    private int qty = 0;
    private Author author;
    private String name;
    private double price;

    public Book(Author author, String name, double price, int qty){
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Book(Author author, String name, double price){
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public Double getPrice() { return price; }
    public int getQuality() { return qty; }

    public void setQty(int quality){ qty = quality;}
    public void setPrice(double price){ this.price = price;}

    @Override
    public String toString() {
        return "Book{" +
                "qty=" + qty +
                ", author=" + author +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
