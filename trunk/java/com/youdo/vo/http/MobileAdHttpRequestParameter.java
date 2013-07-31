package com.youdo.vo.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author shsun
 * 
 */
public class MobileAdHttpRequestParameter extends AbstractAdHttpRequestParameter implements IAdHttpRequestParameter {
	/**
	 * 
	 * @param request
	 * @param response
	 */
	public MobileAdHttpRequestParameter(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
	}

}
