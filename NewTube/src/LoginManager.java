public class LoginManager {
    // PaidUser, EnterpriseUser, UniversityUser 등 어느타입에도 호환되기 위해 공통 부모 classdls User 타입으로 paramter 받음
    public void processLogin(User user){
        System.out.println("\nprocess something before login");
        user.login();
        System.out.println("process something after login\n");
    }
}
