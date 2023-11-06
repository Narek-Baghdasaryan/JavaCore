package homework.onlineShop;

import homework.onlineShop.model.User;
public class CheckUtil {

    public static boolean checkPassword(User user,String password) {
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    public static boolean checkEmail(User user,String email) {
        if (user == null) {
            return false;
        }
        return user.getEmail().equals(email);
    }
}
