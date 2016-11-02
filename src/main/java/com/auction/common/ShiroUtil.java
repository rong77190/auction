package com.auction.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * Created by dell on 2016/7/30.
 */
public class ShiroUtil {
    public static Subject login(String configFile,String userName,String password){
        //读取配置文件，初始化securityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory(configFile);
        //获取securityManager实例
        SecurityManager securityManager = factory.getInstance();
        //将securityManager绑定到securityUtil
        SecurityUtils.setSecurityManager(securityManager);
        //得到当前执行的用户
        Subject currentUser = SecurityUtils.getSubject();
        //创建一个token
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        try {
            //身份认证
            currentUser.login(token);
            System.out.println("身份验证成功");
        }catch (AuthenticationException e){
            e.printStackTrace();
            System.out.println("身份验证失败");
        }finally {
            System.out.println("执行完毕");
        }
        return currentUser;
    }
}
