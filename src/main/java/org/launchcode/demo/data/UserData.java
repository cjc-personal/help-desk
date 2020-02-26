package org.launchcode.demo.data;

import org.launchcode.demo.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> users = new HashMap<>();

    //returns all users
    public static Collection<User> getAll () {
        return users.values();
    }

    //get single user
    public static User getById(int id) {
        return users.get(id);
    }

    public static Boolean checkUserNameAndPassword(String username, String password) {
        for(User user : users.values()) {
            if(user.getUsername().equals(username)) {
                return user.getPassword().equals(password);
            }
        }
        return false;
    }

    //add user
    public static void add(User user){
        users.put(user.getUserId(), user);
    }

    //remove event
    public static void remove(int id) {
        users.remove(id);
    }

}
