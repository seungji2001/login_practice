package inflearn.study.login_practice.Model;

public interface IUser {

    String getEmail();
    String getPassword();
    int isValid();
}
