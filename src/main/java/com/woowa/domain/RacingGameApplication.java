package com.woowa.domain;

import java.util.List;

import com.woowa.view.InputView;
import com.woowa.view.OutputView;

public class RacingGameApplication {
	private RacingGameService racingGameService;
	private OutputView outputView;
	private InputView inputView;
	private RacingGame racingGame;

	public RacingGameApplication() {
		racingGameService = new RacingGameService();
		outputView = new OutputView();
		inputView = new InputView();
	}

	public void startGame() {
		List<String> carNames = getCarNameList();
		racingGame = new RacingGame(racingGameService.createRacingGameCars(carNames));

		startGameRound(getGameRound());
		endGame(racingGame.getRacingGameResult());
	}

	private void endGame(String winner) {
		outputView.printWinner(winner);
	}

	private List<String> getCarNameList() {
		inputView.printInputCarNames();
		return racingGameService.getCarNameList();
	}

	private int getGameRound() {
		inputView.printInputGameRounds();
		return racingGameService.getRound();
	}

	private void startGameRound(int roundNumber) {
		for (int round = 0; round < roundNumber; round++) {
			racingGame.startRound();
			outputView.printRoundEndLine();
		}
	}
}
