package cn.bugstack.springframework.test.beans;

/**
 * @Author: wangliujie
 * @Date: 2021/6/30 22:58
 */
public class UserService {
    private String name;
    public void getUserInfo(){
        System.out.println("获取用户信息被调用,name:"+name);
    }

    public UserService(String name) {
        this.name = name;
    }
}
