package com.restful.webservices.restful.services;

import com.restful.webservices.restful.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserServices {
    private static List<User> users = new ArrayList<>();
    int userCount = 5;
    static {
        users.add(new User(1,"syam",new Date()));
        users.add(new User(2,"pooji",new Date()));
        users.add(new User(3,"jaggu",new Date()));
        users.add(new User(4,"aparna",new Date()));
        users.add(new User(5,"xyz",new Date()));
    }

    public List<User> findAllUsers(){
        return users;
    }

    public User save(User user){
        if(user.getId() == 0){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOneUser(int  id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteUser(int id){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user =  iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
