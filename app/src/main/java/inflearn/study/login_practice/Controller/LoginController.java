package inflearn.study.login_practice.Controller;

import inflearn.study.login_practice.Model.User;
import inflearn.study.login_practice.View.ILoginView;

public class LoginController implements ILoginController{

    ILoginView loginView;

    public LoginController(ILoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void OnLogin(String email, String password) {
        User user = new User(email,password);
        int logincode = user.isValid();

        if(logincode == 0){
            loginView.OnLoginError("Please Enter Email");
        }else if(logincode == 1){
            loginView.OnLoginError("Please enter a valid email");
        }else if (logincode == 2){
            loginView.OnLoginError("Please enter a password");
        }else if (logincode == 3){
            loginView.OnLoginError("password should be more the 6 characters");
        }else{
            loginView.OnLoginSuccess("success");
        }
    }
}
