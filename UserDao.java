package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.model.User;

@Repository
public class UserDao {
	
   List<User> list = null;
   public List<User> getAllUsers(){
	   list = new ArrayList<User>();
	   list.add(new User(11, "yash", 23));
	   list.add(new User(12, "Babu", 22));
	   list.add(new User(13, "sreerag", 23));
	   
	   return list;
   }
}