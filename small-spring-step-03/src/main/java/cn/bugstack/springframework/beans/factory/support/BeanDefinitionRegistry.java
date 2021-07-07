package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.factory.factory.BeanDefinition;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 23:28
 */
public interface BeanDefinitionRegistry {
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
