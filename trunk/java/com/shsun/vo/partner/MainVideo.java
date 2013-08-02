package com.shsun.vo.partner;

public class MainVideo {

	private enum DurationType {
		S_1, S_3, S_5, S_10, S_15, S_30, S_45, S_60, S_90, S_120, S_150, S_180, LIVE, UNKNOWN
	}

	private enum CopyRight {
		WHITE, BLACK, GRAY, UNKNOWN
	}

	final public String id;
	final public int duration;

	final public DurationType durationType;
	final public CopyRight copyRight;

	public MainVideo(String id, int duration, int copyRight) {
		this.id = id;
		this.duration = duration;
		if (this.duration < 60) {
			this.durationType = DurationType.S_1;
		} else if (this.duration < 180) {
			this.durationType = DurationType.S_3;
		} else if (this.duration < 300) {
			this.durationType = DurationType.S_5;
		} else if (this.duration < 600) {
			this.durationType = DurationType.S_10;
			// TODO
		} else {
			this.durationType = DurationType.UNKNOWN;
		}
		switch (copyRight) {
		case 0:
			this.copyRight = CopyRight.BLACK;
			break;
		case 1:
			this.copyRight = CopyRight.WHITE;
			break;
		case 2:
			this.copyRight = CopyRight.GRAY;
			break;
		default:
			this.copyRight = CopyRight.UNKNOWN;
			break;
		}
	}

}
