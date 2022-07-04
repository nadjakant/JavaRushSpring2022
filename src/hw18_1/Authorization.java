package hw18_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Authorization {
    String userName;
    String password;
    static HashMap<String, String> userLogins =  new HashMap<String, String>();

    public static boolean checkLogin(String userName)
    {
        for (String userLogin: userLogins.keySet()) {
            String userNameToCheck = userLogins.get(userName);
            if(userLogin.equals(userNameToCheck));
            System.out.println("Such user exists");
            return true;
        }
        System.out.println("No such user in the system");
        return false;
    }

    public static boolean checkPassword(String password)
    {
        for (String passwordToCheck: userLogins.values()) {
            if(password.equals(userLogins.get(password)));
            System.out.println("password match");
            return true;
        }
        System.out.println("password mismatch");
        return false;
    }

    static void printUserLogins()
    {
        for (String userLogin: userLogins.keySet()) {
            Set<Map.Entry<String, String>>  userSet = userLogins.entrySet();
            System.out.println(userSet);
        }
    }




}
