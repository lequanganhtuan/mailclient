package MyUtil;


import com.javafinal.WebMail.Entity.RegisterRequest;

public class InputValidate {
    public static String validateRegisterInput(RegisterRequest rr){
        if(rr.getName().equals("")){
            return "Your name is empty";
        }
        else if(rr.getPhone().equals("")){
            return "Your phone is empty";
        }
        else if(!rr.getPhone().matches("[0-9]+")){
            return "Your phone is not number";
        }
        else if(rr.getEmail().equals("")){
            return "Your email is empty";
        }
<<<<<<< HEAD
        else if(!rr.getEmail().split("@")[1].contains("vku.udn.vn")){
            return "Domain Email must be vku.udn.vn";
=======
        else if(!rr.getEmail().split("@")[1].contains("vku.vn")){
            return "Domain Email must be vku.vn";
>>>>>>> c102dfb55f2a396ca0e9a32bdf80a7470c553b93
        }
        else if(rr.getPassword().equals("")){
            return "Your password is empty";
        }
        else if(rr.getPassword().length()<6){
            return "Password must more than 6 characters";
        }
        else if(!rr.getPassword().equalsIgnoreCase(rr.getPassword_confirm())){
            return "Confirm is not same with password";
        }
        return null;
    }
}
