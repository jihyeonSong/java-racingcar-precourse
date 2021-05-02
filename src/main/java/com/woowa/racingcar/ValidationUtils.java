package com.woowa.racingcar;

public class ValidationUtils {
	private static int MAX_CAR_NAME_LENGTH = 5;
	private static int MIN_CAR_NAME_LENGTH = 1;

	public static boolean validCarNameLength(String carName) {
		return carName.length() >= MIN_CAR_NAME_LENGTH
				&& carName.length() <= MAX_CAR_NAME_LENGTH;
	}

}
