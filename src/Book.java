//Name:Stephen Walsh ID:21334234
public class Book {
    private String name; //Name of the book
    private String genre; //Genre of the book eg science, fiction etc...
    private boolean available = true; //is the book valid to be taken ie is it stocked.
    private String department; //Spec mentions departments

    public Book(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
    


}
