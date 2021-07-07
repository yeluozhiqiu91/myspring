package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.factory.factory.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 23:04
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singleObjects = new HashMap<String, Object>();

    @Override
    public Object getSingleton(String beanName) {
        return singleObjects.get(beanName);
    }
    protected void addSingleton(String beanName,Object singletonObject){
        singleObjects.put(beanName,singletonObject);
    }
}
