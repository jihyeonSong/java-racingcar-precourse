package com.woowa.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RacingGameService {
	private static Scanner scanner = new Scanner(System.in);
	private static String CAR_NAME_SEPARATOR = ",";

	public List<String> getCarNameList() {
		return Arrays.asList(getCarNames().split(CAR_NAME_SEPARATOR));
	}

	private String getCarNames() {
		scanner = new Scanner(System.in);

		return scanner.nextLine();
	}

	public int getRound() throws InputMismatchException {
		scanner = new Scanner(System.in);
		int roundNumber = scanner.nextInt();

		return roundNumber;
	}

	public List<Car> createRacingGameCars(List<String> carNames) {
		List<Car> cars = new ArrayList<>();
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		return cars;
	}
}
