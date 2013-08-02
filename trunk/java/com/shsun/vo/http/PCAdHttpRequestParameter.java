package com.shsun.vo.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author shsun
 * 
 */
public class PCAdHttpRequestParameter extends AbstractAdHttpRequestParameter implements IAdHttpRequestParameter {
	/**
	 * 
	 * @param request
	 * @param response
	 */
	public PCAdHttpRequestParameter(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
	}

}
