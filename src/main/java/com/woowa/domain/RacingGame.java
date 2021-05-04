package com.woowa.domain;

import java.util.List;
import java.util.StringJoiner;

import com.woowa.utils.RandomNumberGeneratorUtils;

public class RacingGame {
	private List<Car> carList;

	public RacingGame(List<Car> carNameArray) {
		this.carList = carNameArray;
	}

	public void startRound() {
		RandomNumberGeneratorUtils randomNumberGeneratorUtils = new RandomNumberGeneratorUtils();

		for (Car car : carList) {
			car.addRacingPoint(randomNumberGeneratorUtils.getRandomNumber());
			car.sumRacingPoint();
		}
	}

	public String getRacingGameResult() {
		return getRacingGameWinners(getTopMovingCarPointCar());
	}

	private int getTopMovingCarPointCar() {
		int topMovingCarPoint = 0;
		for (Car car : carList) {
			topMovingCarPoint = getMovingPoint(topMovingCarPoint, car);
		}
		return topMovingCarPoint;
	}

	private int getMovingPoint(int topMovingCarPoint, Car car) {
		if (topMovingCarPoint < car.getRacingPoint()) {
			return car.getRacingPoint();
		}
		return topMovingCarPoint;
	}

	private String getRacingGameWinners(int topMovingCar) {
		StringJoiner stringJoiner = new StringJoiner(",");

		for (Car car : carList) {
			addRacingGameWinner(topMovingCar, stringJoiner, car);
		}

		return stringJoiner.toString();
	}

	private void addRacingGameWinner(int topMovingCar, StringJoiner stringJoiner, Car car) {
		if (topMovingCar == car.getRacingPoint()) {
			stringJoiner.add(car.getName());
		}
	}
}
