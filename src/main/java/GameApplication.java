import com.woowa.domain.RacingGameApplication;

public class GameApplication {

	public static void main(String[] args) {
		try {
			RacingGameApplication racingCarGame = new RacingGameApplication();
			racingCarGame.startGame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
