package cn.bugstack.springframework;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:26
 * Bean定义
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
