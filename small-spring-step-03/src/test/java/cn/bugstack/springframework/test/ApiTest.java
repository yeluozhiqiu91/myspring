package cn.bugstack.springframework.test;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.factory.BeanDefinition;
import cn.bugstack.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.bugstack.springframework.test.beans.UserService;
import org.junit.jupiter.api.Test;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:57
 */
public class ApiTest {
    @Test
    public void test() throws BeansException {
        //初始化bean工厂
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService",beanDefinition);
        //第一次获取bean
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService","小王");
        userService.getUserInfo();

        //第二次获取bean from singleton
        UserService userServiceSingleton = (UserService)defaultListableBeanFactory.getBean("userService","小王");
        userServiceSingleton.getUserInfo();
        System.out.println(userService==userServiceSingleton);
    }
}
