package com.woowa.racingcar;

import java.util.Arrays;

public class ValidationUtils {
	private static String CAR_NAME_SEPARATOR = ",";
	private static int MAX_CAR_NAME_LENGTH = 5;
	private static int MIN_CAR_NAME_LENGTH = 1;
	
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
