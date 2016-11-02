package com.auction.dao;

import com.auction.common.BaseDao;
import com.auction.entity.User;

import java.util.List;
import java.util.Set;

public interface UserMapper extends BaseDao<User>{



	public List<User> getUserList();

	public User selectByPrimaryKey(Integer id);
	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);

	/**
	 * 通过用户名查询角色信息
	 * @param userName
	 * @return
	 */
	public Set<String> getRoles(String userName);

	/**
	 * 通过用户名查询权限信息
	 * @param userName
	 * @return
	 */
	public Set<String> getPermissions(String userName);
}
