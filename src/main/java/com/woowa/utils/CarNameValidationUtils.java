package com.woowa.utils;

import java.util.Arrays;

public class CarNameValidationUtils {
	private static final String CAR_NAME_SEPARATOR = ",";
	private static final int MAX_CAR_NAME_LENGTH = 5;
	private static final int MIN_CAR_NAME_LENGTH = 1;

	public static int validCarNameSeparator(String carNames) {
		if (carNames.length() == 0) {
			return 0;
		}
		return Arrays.asList(carNames.split(CAR_NAME_SEPARATOR)).size();
	}

	public static boolean validCarNameLength(String carName) {
		int carNameLength = carName.trim().length();

		return (carNameLength >= MIN_CAR_NAME_LENGTH && carNameLength <= MAX_CAR_NAME_LENGTH);
	}
}
