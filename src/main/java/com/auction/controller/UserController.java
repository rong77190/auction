
package com.auction.controller;

import com.auction.common.BaseController;
import com.auction.common.BaseService;
import com.auction.entity.User;
import com.auction.service.UserService;
import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 用户Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController<User>{
	private static final transient Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	/**
	 * 用户登录
	 * @param user
	 * @param request
	 * @return
	 */
	@Autowired
	private UserService userService;
	public BaseService<com.auction.entity.User> getService() {
		return userService;
	}

	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		Subject subject=SecurityUtils.getSubject();
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(), user.getPassword());
		try{
			subject.login(token);
			Session session=subject.getSession();
			log.info("sessionId:"+session.getId());
			log.info("sessionHost:"+session.getHost());
			log.info("sessionTimeout:"+session.getTimeout());
			session.setAttribute("info", "session的数据");
			return "redirect:/success.jsp";
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "index";
		}
	}

	@RequestMapping("list")
	@RequiresPermissions("a")
	@ResponseBody
	public java.lang.Object userList(){
//		Map<String,Object> map= new HashMap<String, Object>();
		List<User> userList = userService.selectUserList();
		return  userList;
	}


	@Override
	public User getE() {
		return e;
	}
}
