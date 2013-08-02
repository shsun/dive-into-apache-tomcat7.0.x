package com.shsun.vo.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author shsun
 * 
 */
public interface IAdHttpRequestParameter {
	/**
	 * 
	 * @return
	 */
	public HttpServletRequest getHttpServletRequest();

	/**
	 * 
	 * @return
	 */
	public HttpServletResponse getHttpServletResponse();
}
