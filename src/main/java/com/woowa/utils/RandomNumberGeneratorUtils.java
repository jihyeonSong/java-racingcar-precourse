package com.woowa.utils;

import java.util.Random;

public class RandomNumberGeneratorUtils {
	private final int MAX_RANDOM_NUMBER = 10;

	public int getRandomNumber() {
		Random random = new Random();

		return random.nextInt(MAX_RANDOM_NUMBER);
	}
}
