package com.example.demo.controller;

import com.example.demo.persist.entity.user.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:wangkai
 * date:2018-03-23 09:34
 * desc:com.example.demo.controller
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/infoById", method = RequestMethod.GET)
    public UserEntity getUserInfoById(Integer  userId) {
        UserEntity user = userService.getUserInfoById(userId);
        return user;
    }


//	static Map<Long, UserEntity> users = Collections.synchronizedMap(new HashMap<Long, UserEntity>());

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public List<UserEntity> getUserList() {
//        List<UserEntity> r = new ArrayList<UserEntity>(users.values());
//		return r;
//	}

//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String postUser(@ModelAttribute UserEntity user) {
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
}
