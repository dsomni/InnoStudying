package Ex3;

public class Author {
    private String name;
    private String email;
    private String gender;
    private Book book;
;
    public Author(String name, String email,String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }
    public Book getBook() { return book; }

    public void newBook(){
        book = new Book(this, "NewBook", 10.5);
    }

    public void newBook(int quality){
        book = new Book(this, "NewBook", 10.5, quality);
    }

}
