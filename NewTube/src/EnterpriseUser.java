public class EnterpriseUser extends User{
    public String company;
    private int temporaryValue;

    public EnterpriseUser(){
        System.out.println("init Enterprise User");
    }
    public EnterpriseUser(String email, String password, String nickname, int age, String company){
        // super(extends한 User의 생성자 가리킴). 이미 구현된 User 의 생성자를 재활용해 할 수 있는 paramter를 초기화하고, 남은건(company) 따로 초기화
        super(email, password, nickname, age);
        this.company = company;
    }

    public void login(){
        System.out.println("Hello" + this.nickname +"!");
        System.out.println("Enter the " + this.company +"Enterprise Page!");
    }

    public EnterpriseUser(int parentTemp, int myTemp){
        // User 클래스의 temporary value 사용
        super.temporaryValue = parentTemp;
        // EnterpriseUser 클래스의 temporary value 사용
        this.temporaryValue = myTemp;
    }

    public void printTemporaryValues(){
        System.out.println("Parent's temp value is " + super.temporaryValue);
        System.out.println("My temp value is " + this.temporaryValue);

    }

    public void printEnterpriseUserInfo(){
        // extends 받은 User 의 pringInfo() 메소드 재활용
        super.printInfo();
        System.out.println("- company : " + this.company);

    }
}
