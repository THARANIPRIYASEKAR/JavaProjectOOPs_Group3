package org.example.javaProjectOOPs;

public class Registration {

    private String userEmail;
    private String username;
    private String password;

    void registerEmail(String userEmail){
        this.userEmail = userEmail;
        //Check Email address
        String domainName = userEmail.substring(userEmail.lastIndexOf("@")+1);
        if(domainName.equals("yahoo.com")){
           userEmail = userEmail;
            System.out.println(userEmail);
        }  else{
            System.out.println("You must use a yahoo.com email account");
        }
        }

    void registerUsername(String username){
        this.username = username;
        //Check username
        if(username.length() < 6) {
            System.out.println("Your username must be larger than 6 characters");
        } else{
           username = username;
            System.out.println(username);
        }
    }
    void registerPassword(String password){
        this.password = password;
        //Check password
        if (password.contains(username)){
            System.out.println("Your password cannot contain your username");
        } else if(password.length() < 6){
            System.out.println("Your password must be greater than 6 characters");
        } else{
            password = password;
            System.out.println(password);
        }
        }
    void printInfo(){
        System.out.println(username);
        System.out.println(userEmail);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.registerEmail("jimm@yahoo.com");
        reg.registerUsername("jimmyt");
        reg.registerPassword("Sdkjfksdjfjsjimmytfdsdf");
        reg.printInfo();

    }
}
