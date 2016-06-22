package com.boot.spring.shrio.validatecode;  
  
import org.apache.shiro.authc.UsernamePasswordToken;  
  
public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {  
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 3664198573055977375L;
	//验证码字符串  
    private String captcha;  
  
    public CaptchaUsernamePasswordToken(String username, char[] password,  
            boolean rememberMe, String host, String captcha) {  
        super(username, password, rememberMe, host);  
        this.captcha = captcha;  
    }  
  
    public String getCaptcha() {  
        return captcha;  
    }  
  
    public void setCaptcha(String captcha) {  
        this.captcha = captcha;  
    }  
      
}  