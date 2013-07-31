package com.youdo.vo.core;

import java.util.HashMap;

import com.youdo.vo.core.ad.IAd;

public class AdSlot {

	public enum AdSlotType {
		PREROLL, MIDROLL, OVERLAY, POSTROLL, INTERNAL_VIDEO_DISPLAY, EXTERNAL_HTML_DISPLAY, UNKNOW
	}

	public boolean isDriving = true;

	public boolean acceptCompanion = true;

	public String id;

	public HashMap<String, IAd> ads = new HashMap<String, IAd>();

	public AdSlot() {
	}

}
