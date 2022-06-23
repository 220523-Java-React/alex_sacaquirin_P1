package Model;

import java.io.Serializable;
import java.util.Objects;

public class User  implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Role role = Role.USER;

    public User (){
    }
    public User(String firstName,String lastName, String username,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    public int getId(){
       return id;
    }
    public User setId(int id){
        this.id = id;
        return this;
    }
    public String getFirstname() {
        return firstName;
    }
    public  User setFirstName(String firstname){
        this.firstName = firstname;
        return this;
    }
    public String getLastname(){
        return lastName;
    }
    public User getLastName(String lastname) {
        this.lastName = lastName;
        return this;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Role getRole(){
        return role;
    }
    public void setRole(Role role){
        this.role = role;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o==null|| getClass()!= o.getClass())return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.firstName)&& Objects.equals(lastName, user.lastName)&& Objects.equals(username,user.username) &&Objects.equals(password, user.password)&& role== user.role;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,firstName,lastName,username,password,role);
    }
    @Override
    public String toString(){
        return "User{"+
                "id=" + id +
                ", firstName="+ firstName +
                ", lastName="+ lastName +
                ", username="+ username +
                ",password="+ password+
                 ",role="  + role +
                 '}';

    }




}
enum Role{
    USER, ADMIN
}






