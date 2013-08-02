package com.shsun.vo.partner;

public class Visitor {

	public enum Gender {
		FEMALE(0), MALE(1), UNKNOWN(2);

		private final int value;

		Gender(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public Gender gender;
	public long uid;

	public int todayVisitTimes = 0;

	public Visitor(long uid, int gender, int todayVisitTimes) {
		this.uid = uid;
		if (gender == 0) {
			this.gender = Gender.FEMALE;
		} else if (gender == 1) {
			this.gender = Gender.MALE;
		} else if (gender == 2) {
			this.gender = Gender.UNKNOWN;
		}
		this.todayVisitTimes = todayVisitTimes;
	}

	public Visitor(long uid, int gender) {
		this(uid, gender, 1);
	}

	public boolean is1stVisitOfToday() {
		return (this.todayVisitTimes == 1);
	}
}
