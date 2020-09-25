package com.example.dingTalk;

import com.datech.jce.util.encoder.Base64;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * @ Author     ：wanglh.
 * @ Date       ：Created in 15:39 2020/9/25 0025 2020
 * @ Description：test
 */
public class RobotTest {
    public static void main(String[] args) throws Exception{
        Long timestamp = System.currentTimeMillis();
        String secret = "SEC9a3020aa471666cb6e3a9bf9b37df8ff33f05662910a92c975419eb7afca706e";

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        // String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
        String sign = URLEncoder.encode(new String(Base64.encode(signData)),"UTF-8");
        System.out.println(sign);
    
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/robot/send?access_token=4768c6433c066d8893f6cbf4842f0c729883b51c041c677cc529c0f460e62797&timestamp="+timestamp+ "&sign=" + sign);
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("text");
        OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
        text.setContent("那我也没打");
        request.setText(text);
        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
        // at.setAtMobiles(Arrays.asList("18710321151"));
        // isAtAll类型如果不为Boolean，请升级至最新SDK
        at.setIsAtAll(Boolean.FALSE);
        request.setAt(at);
        OapiRobotSendResponse response = client.execute(request);
        System.out.println(response);
    }
}
