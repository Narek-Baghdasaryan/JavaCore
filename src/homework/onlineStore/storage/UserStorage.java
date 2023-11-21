package homework.onlineStore.storage;

import homework.onlineStore.model.User;
import homework.onlineStore.model.enums.UserType;
import homework.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserStorage implements Serializable {

    private List <User> users = new ArrayList<>();

    public void add(User user) {
        for (User user1 : users) {
            users.add(user);
            StorageSerializeUtil.serializeUserStorage(this);
        }
    }
    public void print() {
            for (User user1 : users) {
                System.out.println(user1);
            }
    }


    public User getByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public void printByType(UserType userType) {
        for (User user : users) {
            if (user.getUserType().equals(userType)){
                System.out.println(user);
            }
        }
    }
}