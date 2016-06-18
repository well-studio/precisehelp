package cn.wellstudio.precisehelp.Interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/** 
 * 判断用户是否具有管理员权限
 * @author xxmodd 
 */
public class IsAdminInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		if(session.get("loginuser").getClass().equals("Admins")){
			String result = invocation.invoke();
			return result;
		}else{
			return "error";
		}
	}
	
}
