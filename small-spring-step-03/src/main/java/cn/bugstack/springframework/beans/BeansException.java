package cn.bugstack.springframework.beans;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:58
 */
public class BeansException extends RuntimeException {
    public BeansException(String message, Throwable e) {
        super(message,e);
    }

    public BeansException(String message) {
        super(message);
    }
}
