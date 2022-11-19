public class Membership {
    private String status;
    private boolean staff;
    private boolean manager;
    private boolean student;
    private boolean publicUser;

    public Membership(String status, boolean staff, boolean manager, boolean student, boolean publicUser){
        this.status = status;
        this.staff = staff;
        this.manager = manager;
        this.publicUser = publicUser;
        this.student = student;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setStaff(boolean staff){
        this.staff = staff;
    }

    public boolean getStaff(){
        return staff;
    }

    public void setStudent(boolean student){
        this.student = student;
    }

    public boolean getStudent(){
        return student;
    }

    public void setManager(boolean manager){
        this.manager = manager;
    }

    public boolean getManager(){
        return manager;
    }

    public void setPublicUser(boolean publicUser){
        this.publicUser = publicUser;
    }

    public boolean getPublicUser(){
        return publicUser;
    }


}
