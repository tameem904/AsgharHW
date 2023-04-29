package class12;

public class E10Task {
    public static void main(String[] args) {
         String userName="Admin";
         String password="Admin123";
         if(userName.isEmpty() & password.isEmpty()){
             System.out.println("Username and password cannot be empty");

         } else if(password.length()<=8){
             System.out.println("password is too short");
         } else if(password.contains(userName)){
             System.out.println("password cannot contain username");
         }else if (!password.equals(password)){
             System.out.println("Password do not match");
         }else{
             System.out.println("Your username and password has been created");
         }
    }
}
