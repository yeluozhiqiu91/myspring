package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:59
 */
public interface BeanFactory {
    public Object getBean(String beanName) throws BeansException;
}
