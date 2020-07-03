package com.other;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Map;
 
public class AuthInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext actionContext = actionInvocation.getInvocationContext();
    	//ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> session = actionContext.getSession();
        Object currentUser = session.get("currentUser");
       // String url = session.getServletPath();
        //System.out.print("ÊÇ"+url);
        String result = null;
        System.out.print(currentUser);
        if (currentUser!= null /*|| url.equalsIgnoreCase("/register")*/) {
        	result = actionInvocation.invoke();
        } else {
        	HttpServletRequest request = (HttpServletRequest) actionInvocation.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
            request.setAttribute("error", "»¹Î´µÇÂ¼,ÇëÏÈµÇÂ¼");
            result = "error";
            
        }
        return result;
    }
}
