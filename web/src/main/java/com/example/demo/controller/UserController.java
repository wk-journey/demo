//package com.example.demo.controller;
//
//import com.example.demo.entity.User;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
///**
// * author:wangkai
// * date:2018-03-23 09:34
// * desc:com.example.demo.controller
// */
//@RestController
//@RequestMapping(value = "/users")
//public class UserController {
//	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public List<User> getUserList() {
//		List<User> r = new ArrayList<User>(users.values());
//		return r;
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String postUser(@ModelAttribute User user) {
//		users.put(user.getId(), user);
//		return "success";
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public String putUser(@PathVariable Long id, @ModelAttribute User user) {
//		User u = users.get(id);
//		u.setName(user.getName());
//		u.setAge(user.getAge());
//		users.put(id, u);
//		return "success";
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	public String deleteUser(@PathVariable Long id) {
//		users.remove(id);
//		return "success";
//	}
//}
