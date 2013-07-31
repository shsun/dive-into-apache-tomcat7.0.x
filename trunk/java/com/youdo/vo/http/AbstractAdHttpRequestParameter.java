package com.youdo.vo.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.youdo.vo.partner.AdClient;
import com.youdo.vo.partner.AdCookie;
import com.youdo.vo.partner.Visitor;
import com.youku.ad.cast.entity.CampCookie;
import com.youku.ad.objects.MIdea;
import com.youku.ad.userTrack.UserTrack;
import com.youku.ad.util.CookieManager;

/**
 * 
 * @author shsun
 * 
 */
public abstract class AbstractAdHttpRequestParameter implements IAdHttpRequestParameter {
	/**
	 * 
	 * @author shsun
	 * 
	 */
	public enum ClientType {
		FLASH_AS2, FLASH_AS3, HTML5, IPHONE, ANDROIDPHONE, IPAD, ANDROIDPAD, UNKNOWN
	}

	/**
	 * 
	 * @author shsun
	 * 
	 */
	public enum ClientDimension {
		CD_1366_768, CD_1024_768, CD_800_600, UNKNOWN
	}

	private HttpServletRequest httpServletRequest;
	private HttpServletResponse httpServletResponse;

	private AdCookie cookie;
	private AdClient client;
	//

	//
	private Visitor visitor;

	//

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public AbstractAdHttpRequestParameter(HttpServletRequest request, HttpServletResponse response) {
		this.httpServletRequest = request;
		this.httpServletResponse = response;
		//
		this.cookie = new AdCookie(request.getParameter("cookie"));
		//
		int uid, gender;
		try {
			uid = Integer.parseInt(request.getParameter("uid"));
		} catch (Exception e) {
			uid = -1;
		}
		try {
			gender = Integer.parseInt(request.getParameter("gender"));
		} catch (Exception e) {
			gender = Visitor.Gender.UNKNOWN.getValue();
		}
		this.visitor = new Visitor(uid, gender);
		//
	}

	@Override
	public HttpServletRequest getHttpServletRequest() {
		return this.httpServletRequest;
	}

	@Override
	public HttpServletResponse getHttpServletResponse() {
		return this.httpServletResponse;
	}

}
