package com.woowa.view;

public class OutputView {

	public void printWinner(String winner) {
		System.out.println(winner + "가 최종 우승했습니다.");
	}
	
	public void printRacingPoint(String carName, String racePoint) {
		System.out.println(carName + " : " + racePoint);
	}
	
	public void printRoundEndLine() {
		System.out.println();
	}
}
