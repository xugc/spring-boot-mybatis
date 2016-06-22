package com.boot.spring.exception;  
  
import org.apache.shiro.authc.AuthenticationException;
  
public class IncorrectCaptchaException extends AuthenticationException {  
  
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = -1877464328871628809L;

	public IncorrectCaptchaException() {  
        super();  
    }  
  
    public IncorrectCaptchaException(String message, Throwable cause) {  
        super(message, cause);  
    }  
  
    public IncorrectCaptchaException(String message) {  
        super(message);  
    }  
  
    public IncorrectCaptchaException(Throwable cause) {  
        super(cause);  
    }  
}  