//Author Rodger Shaw
public class User {
    private String name;
    private int id;
    private int password;
    public User(String name, int id, int password){
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return password;
    }

}


