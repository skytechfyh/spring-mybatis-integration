package net.xdclass.mapper;

import net.xdclass.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fyh
 * @date 2020/7/14
 */
@Repository("userMapper")
public interface UserMapper {

	/**
	 * 查询用户列表
	 * @return	用户列表
	 */
	List<User> listUser();
}
