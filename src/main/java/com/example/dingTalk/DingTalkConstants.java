package com.example.dingTalk;

/**
 * @ Author     ：wanglh.
 * @ Date       ：Created in 16:44 2020/9/25 0025 2020
 * @ Description：常量类
 */
public class DingTalkConstants {
    // 测试应用1 的应用标识
    public final static String TEST1_APPKEY = "dinggez70yxxszi3p4mo";
    // 测试应用1 的应用App密钥
    public final static String TEST1_APPSECRET = "zkovXdxJyaZvt8cSACxY_K6Ecru3L-4IgMCDSwoCC8bA7ioPw4Aldse4XzNIQSxa";
    // 获取tocken地址
    public final static String GET_TOCKEN_URL = "https://oapi.dingtalk.com/gettoken?appkey="+TEST1_APPKEY+"&appsecret="+TEST1_APPSECRET;
    // 创建会话地址
    public final static String CREATE_MSG_URL = "https://oapi.dingtalk.com/chat/create?access_token=";
    
}
