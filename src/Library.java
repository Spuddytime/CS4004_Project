public class Library {
    private String name;
    String membership; // Member of a department or library overall
    public int staff; // how many staff members are working

    private boolean open;
    private Departments departments;

    //No arg constructor
    public Library(){

    }

    public Library(String name , boolean open){
        this.name = name;
        this.open = true;
    }

    public Library(String name , boolean open , String membership , int staff){
        this.name = name;
        this.open = true;
        this.membership = membership;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
