package com.shsun.vo.core.ad;

import java.util.HashMap;

import com.shsun.vo.core.Creative;

public abstract class AbstractAd implements IAd {

	protected enum AdType {
		VIDEO, FLASH_AS2, FLASH_AS3, IMAGE, HTML, JAVA_SCRIPT, UNKNOW
	}

	public String id;

	public Boolean isDriving = true;
	public Boolean isCompanion = true;

	public AdType adType = AdType.UNKNOW;

	public HashMap<String, Creative> creatives = new HashMap<String, Creative>();

	public Boolean isFlashAd() {
		return (this.adType == AdType.FLASH_AS2 || this.adType == AdType.FLASH_AS3);
	}
}
