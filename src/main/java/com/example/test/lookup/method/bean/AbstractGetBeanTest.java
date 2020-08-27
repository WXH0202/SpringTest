package com.example.test.lookup.method.bean;

/**
 * @author WLH
 */
public abstract class AbstractGetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }
    public User user;
    public String userNo;
    public int age;

    public AbstractGetBeanTest(User user) {
        this.user = user;
    }

    public AbstractGetBeanTest(User user, int age) {
        this.user = user;
        this.age = age;
    }

    public AbstractGetBeanTest(User user, String userName) {
        this.user = user;
        this.userNo = userName;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public abstract User getBean();
}
