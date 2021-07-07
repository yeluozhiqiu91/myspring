package cn.bugstack.springframework.beans.factory.factory;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 23:00
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
