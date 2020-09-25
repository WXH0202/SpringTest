package com.example.dingTalk;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiChatCreateRequest;
import com.dingtalk.api.request.OapiChatGetRequest;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiChatCreateResponse;
import com.dingtalk.api.response.OapiChatGetResponse;
import com.dingtalk.api.response.OapiGettokenResponse;

import java.util.Arrays;

/**
 * @ Author     ：wanglh.
 * @ Date       ：Created in 16:34 2020/9/25 0025 2020
 * @ Description：test
 */
public class GetMessage {
    public static void main(String[] args) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/get");
        OapiChatGetRequest request = new OapiChatGetRequest();
        request.setHttpMethod("GET");
        request.setChatid("chatid");
        OapiChatGetResponse response = client.execute(request, getTocken(DingTalkConstants.GET_TOCKEN_URL));
        
    }
    
    public static void createMsg(){
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/create");
        OapiChatCreateRequest request = new OapiChatCreateRequest();
        request.setName("测试群名称1");
        request.setOwner("userid1");
        request.setUseridlist(Arrays.asList("userid1"));
        request.setShowHistoryType(1L);
        // OapiChatCreateResponse response = client.execute(request, accessToken);
    }
    
    public static String getTocken(String url) throws Exception{
        DefaultDingTalkClient client = new DefaultDingTalkClient(url);
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("appkey");
        request.setAppsecret("appsecret");
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);
        return response.getAccessToken();
    }
    
}
