public class Administrator extends User{
    private String adminLevel;

    public Administrator(String email, String password, String nickname, int age, String adminLevel){
        super(email, password, nickname, age);
        this.adminLevel = adminLevel;
    }

    public void login(){
        System.out.println("Hello" + this.nickname +"!");
        System.out.println("Please verify your permission : " + this.adminLevel);

    }
}
