package net.xdclass.service.impl;

import net.xdclass.mapper.UserMapper;
import net.xdclass.model.User;
import net.xdclass.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fyh
 * @date 2020/7/14
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> listUser() {
		return userMapper.listUser();
	}
}
