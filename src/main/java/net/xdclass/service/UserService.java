package net.xdclass.service;

import net.xdclass.model.User;

import java.util.List;

/**
 * @author fyh
 * @date 2020/7/14
 */
public interface UserService {

	/**
	 * 查询用户列表
	 * @return	用户列表
	 */
	List<User> listUser();
}
