package com.boot.spring.exception;  
  
import org.apache.shiro.authc.AuthenticationException;
  
public class FailLoginException extends AuthenticationException {  
  
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = -1877464328871628809L;

	public FailLoginException() {  
        super();  
    }  
  
    public FailLoginException(String message, Throwable cause) {  
        super(message, cause);  
    }  
  
    public FailLoginException(String message) {  
        super(message);  
    }  
  
    public FailLoginException(Throwable cause) {  
        super(cause);  
    }  
}  