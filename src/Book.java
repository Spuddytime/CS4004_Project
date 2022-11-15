//Name:Stephen Walsh ID:21334234 done in IntelliJ with Java 18
//Integrated into Jira for ease of access: KEY for integration is PROJECT-9

//Finished as far as I can see unless we add more methods
public class Book {
    private String name; //Name of the book
    private String genre; //Genre of the book eg science, fiction etc...
    private boolean available; //is the book valid to be taken, ie is it stocked.
    private String department; //Spec mentions departments
    private int lengthOfRent; // In days
    private double lateFee; // Fee for late returns to deter tardiness, May go up the more late it is

    public Book() {

    }


    //Basic book constructor
    public Book(String name, String genre, String department, boolean available){
        this.name = name;
        this.genre = genre;
        this.department = department; //What department does the book belong to
        this.available = available;
    }

    //Constructor for all possible variables associated with it
    public Book(String name, String genre, String department, boolean available, double lateFee , int lengthOfRent){
        this.name = name;
        this.genre = genre;
        this.department = department; //What department does the book belong to
        this.available = available;
        this.lateFee = lateFee;
        this.lengthOfRent = lengthOfRent;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    // A bunch of getter and setter methods
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public void setLengthOfRent(int lengthOfRent) {
        this.lengthOfRent = lengthOfRent;
    }

    public String getName() {
        return name;
    }

    public double getLateFee() {
        return lateFee;
    }

    public int getLengthOfRent() {
        return lengthOfRent;
    }

    public String getDepartment() {
        return department;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }
}
