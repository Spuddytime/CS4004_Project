//Name:Stephen Walsh ID:21334234
//Integrated into Jira for ease of access: KEY for integration is PROJECT-9
public class Book {
    private String name; //Name of the book
    private String genre; //Genre of the book eg science, fiction etc...
    private boolean available = true; //is the book valid to be taken, ie is it stocked.
    private String department; //Spec mentions departments
    private int lengthOfRent; // In days
    private double lateFee; // Fee for late returns to deter tardiness, May go up the more late it is


    public Book(String name, String genre, String department){
        this.name = name;
        this.genre = genre;
        this.department = department; //What department does the book belong to
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    // A bunch of getter methods with some setter methods where I see them being viable

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
