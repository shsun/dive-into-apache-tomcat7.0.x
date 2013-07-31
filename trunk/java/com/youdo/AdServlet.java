package com.youdo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.youdo.vo.http.IAdHttpRequestParameter;
import com.youdo.vo.http.PCAdHttpRequestParameter;

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
		IAdHttpRequestParameter parameter = new PCAdHttpRequestParameter(request, response);
		
		
		
		
	}

}
