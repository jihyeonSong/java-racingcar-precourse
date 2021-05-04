package com.woowa.domain;

import com.woowa.view.OutputView;

public class Car {
	private String carName;
	private int racingPoint = 0;
	private int MOVE_LIMIT = 4;
	private static String POINT = "-";

	public Car(String carName) {
		this.carName = carName;
	}

	public String getName() {
		return carName;
	}

	public int getRacingPoint() {
		return this.racingPoint;
	}

	public void addRacingPoint(int value) {
		if (value >= MOVE_LIMIT) {
			racingPoint++;
		}
	}

	public void sumRacingPoint() {
		StringBuilder builder = new StringBuilder();
		OutputView outputView = new OutputView();

		for (int i = 0; i < racingPoint; i++) {
			builder.append(POINT);
		}

		outputView.printRacingPoint(carName, builder.toString());
	}

}
