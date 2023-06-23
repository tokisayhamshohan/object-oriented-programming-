import java.io.IOException;
import java.util.Scanner;
public class SignUp {
    String userName,passWord,user_Name="Shohan",pass_Word="1234aa",aUser_Name="Toki Sayham Shohan",aPass_word="1234";
    public SignUp(String userN,String pass)
    {
        this.userName=userN;
        this.passWord=pass;


    }
    public void method()throws IOException {
        throw new IOException("Input wrong Password");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
    public String getUser_Name() {
        return user_Name;
    }

    public String getPass_Word() {
        return pass_Word;
    }

    public String getAUser_Name() {
        return aUser_Name;
    }

    public String getAPass_Word() {
        return aPass_word;
    }

    @Override
    public String toString() {
        return "User Name: "+userName+"\n"+"Password: "+passWord;
    }
}