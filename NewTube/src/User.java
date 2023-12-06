/*
    Basic User 
        - parent object for all 

*/

public class User {
    protected String name;
    protected String id;
    protected int age;
    protected String password;
    protected String nickname;
    protected String email;
    protected int temporaryValue;

    // initializer
    public User(){
        System.out.println("Init USer");

        this.email ="default@naver.com";
        this.password = "1234";
        this.nickname = "default";
        this.age = 20;
    }

    public User(String email, String password, String nickname, int age){
        System.out.println("Init USer with 4 paramters");
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }

    // setter
    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        if(age < 0){
            age = 0;
        } else if(age > 120){
            age = 120;
        }
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // getter
    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    // method
    public void printInfo(){
        System.out.println(
                "User Info" + "\nemail: " +email +
                        "\nnickname: " +nickname +
                        "\nage: " +age
        );
    }

    public boolean isOver20(){
        return age >= 20;
    }

    public boolean isAdult(){
        return age>=20;
    }

    public boolean isAdult(int age){
        return this.age >=age;
    }

    public void signUp(){

    }

    public void login(){
        System.out.println("Hello" + this.nickname +"!");
        System.out.println("Login Succeed");
    }

    public void learn(){

    }

    public void purchase(){

    }
}
