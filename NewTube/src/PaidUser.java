public class PaidUser extends User{
    public String membership;

    public PaidUser(String email, String password, String nickname, int age, String membership){
        super(email, password, nickname, age);
        this.membership = membership;
    }

    public void login(){
        System.out.println("Hello" +this.nickname +"!");
        System.out.println("Enter the" + this.membership +"Membership Page!");
    }

    public void setUserInfo(){
        email = "membership@.kr";
        password = "1234";
        nickname = "membership paid -";
    }
}
