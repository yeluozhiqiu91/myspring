package cn.bugstack.springframework.beans.factory.factory;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 23:01
 */
public interface SingletonBeanRegistry {
    public Object getSingleton(String beanName);
}
