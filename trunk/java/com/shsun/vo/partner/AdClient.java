package com.shsun.vo.partner;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author shsun
 * 
 */
public class AdClient {
	private String partnerId;
	private String pageId;

	private String channelId;
	private String subchannelId;

	private String videoId;

	/**
	 * 
	 * @param request
	 */
	public AdClient(HttpServletRequest request) {
		this.partnerId = request.getParameter("partnerId");
		this.pageId = request.getParameter("partnerId");
		this.channelId = request.getParameter("channelId");
		this.subchannelId = request.getParameter("subchannelId");
		this.videoId = request.getParameter("videoId");
	}

	public String getPartnerId() {
		return partnerId;
	}

	public String getPageId() {
		return pageId;
	}

	public String getChannelId() {
		return channelId;
	}

	public String getSubchannelId() {
		return subchannelId;
	}

	public String getVideoId() {
		return videoId;
	}
}
