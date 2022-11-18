public class Library {
    private String name;
    private boolean open;
    private Departments departments;

    private Library(String name , boolean open , Departments departments){
        this.name = name;
        this.open = true;
        this.departments = departments;
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

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
