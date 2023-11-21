public class NewTubeSystem {
    public static void main(String[] args){
        LoginManager loginManager = new LoginManager();
        User user = new PaidUser("paid@naver.com","1234","luke",20,"pro");
        //user.login();
        loginManager.processLogin(user);


        user = new EnterpriseUser("enterprise@naver.com","1234","jin",20,"Codepresso");
        //user.login();
        loginManager.processLogin(user);


        user = new Administrator("administrator@naver.com","1234","amy",20,"LV2");
        //user.login();
        loginManager.processLogin(user);

        /*
        User steve = new User("steve.kr","1234","steve",19);
        User amy = new User();
        PaidUser luke = new PaidUser();
        UniversityUser ys = new UniversityUser();

        EnterpriseUser steve = new EnterpriseUser("steve.kr","1234","membership-steve",30,"Codepresso");
        steve.printEnterpriseUserInfo();
        EnterpriseUser grace = new EnterpriseUser(100,200);
        grace.printTemporaryValues();

        luke.setEmail("luke@naver.com");
        luke.setNickname("luke");
        luke.setPassword("1234");
        luke.membership = "PRO";

        luke.login();
        luke.printInfo();

        System.out.println(steve.isAdult());
        System.out.println(steve.isAdult(18));

        if(steve.isOver20()){
            System.out.println("you can pay");
        } else{
            System.out.println("cannot pay");
        }

        steve.printInfo();
        steve.isOver20();

        amy.printInfo();
        amy.isOver20();*/
    }
}
