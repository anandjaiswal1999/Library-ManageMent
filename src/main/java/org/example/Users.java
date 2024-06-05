package org.example;

import java.util.HashMap;

public class Users {
    public HashMap<String, User> map1;
    public Users (){
        this.map1=new HashMap<>();
    }

    public void addUser(User user) {
        map1.put(user.getUserId(), user);
    }
}
