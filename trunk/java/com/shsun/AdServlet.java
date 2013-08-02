package com.shsun;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shsun.vo.http.IAdHttpRequestParameter;
import com.shsun.vo.http.MobileAdHttpRequestParameter;
import com.shsun.vo.http.PCAdHttpRequestParameter;
import com.youdo.util.io.AjaxOut;

/**
 * 
 * @author shsun
 * 
 */
public class AdServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1170528619323481101L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) {
		IAdHttpRequestParameter parameter = ("1".equals(request.getParameter("m"))) ? new MobileAdHttpRequestParameter(request, response) : new PCAdHttpRequestParameter(request, response);
		
		
		AjaxOut.responseText(parameter.getHttpServletResponse(), "");
		
	}

}
