package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:59
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    Object getBean(String beanName, Object ... args) throws BeansException;
}
