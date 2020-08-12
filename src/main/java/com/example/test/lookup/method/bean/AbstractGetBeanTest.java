package com.example.test.lookup.method.bean;

/**
 * @author WLH
 */
public abstract class AbstractGetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }
    public abstract User getBean();
}
