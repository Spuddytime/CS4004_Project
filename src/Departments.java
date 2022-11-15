//Name:Stephen Walsh ID:21334234 done in IntelliJ with Java 18
//Integrated into Jira for ease of access: KEY for integration is PROJECT-9

//Not Finished
import java.util.ArrayList;

public class Departments {
    private String name;
    private String type;
    private double budget;
    public String relevant; //is the book relevant to the respective department
    private boolean subscriptionStatus;
    private ArrayList<Book> departmentBooks = new ArrayList<>();
    private ArrayList<Book> unavailableBooks = new ArrayList<>(); // When a book is rented it goes in here

    //No arg constructor
    public Departments(){

    }
    public Departments(String name, String type, double budget){
        this.name = name;
        this.type = type;
        this.budget = budget;
    }

    public ArrayList<Book> getDepartmentBooks() {
        return departmentBooks;
    }

    public ArrayList<Book> getUnavailableBooks() {
        return unavailableBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBudget() {
        return budget;
    }

    public boolean isSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setDepartmentBooks(ArrayList<Book> departmentBooks) {
        this.departmentBooks = departmentBooks;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setSubscriptionStatus(boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public void setUnavailableBooks(ArrayList<Book> unavailableBooks) {
        this.unavailableBooks = unavailableBooks;
    }


    public void rentBook(Book i){
        if (i.isAvailable()) {
            i.setAvailable(false);
            unavailableBooks.add(i);
        }else {
            System.out.println("Book is unavailable as it is currently not in stock");
        }
    }

}
