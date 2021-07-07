package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author: wangliujie
 * @Date: 2021/7/1 21:59
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor,Object[] args) throws BeansException;
}
