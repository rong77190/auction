package com.auction.service;

import com.auction.common.BaseService;
import com.auction.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService extends BaseService<User>{



	/*
	*获取所有的用户
	*
	*
	*
	* */
	public List<User> selectUserList();

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
