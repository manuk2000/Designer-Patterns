package chainOfResponsibility;

public class Responsibly {
    private int age;
    private String username;
    private String password;

    public Responsibly(int age, String username, String password) {
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public boolean isUserName(){
        return username.equals("Gago");
    }
    public boolean isPassword(){
        return password.equals("1234");
    }
    public boolean isAge(){
        return age>=18;
    }


    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
