class Book{
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return  String.format("Title: %s, Author: %s, Price: %.2f", title, author, price);
    }
}

public class Bai2{
    public static void main(String[] args){
        Book b = new Book("Cloud Computing", "Sandman", 133.3);
        System.out.println(b);
    }
}
