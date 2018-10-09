package com.jason.control;
 
 
import java.util.ArrayList;
import java.util.List;


import com.jason.pojo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	private static List<User> userList;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public User login(){
	    User user=new User("jason","asdfa","jasn1234");
        return user;
	}
}
