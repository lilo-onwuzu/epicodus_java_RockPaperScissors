public class RockPaperScissors {

  public Integer checkWinner (String playerOneMove, String playerTwoMove) {

    if (playerOneMove.toLowerCase().equals("rock") && playerTwoMove.toLowerCase().equals("scissors")) {
      return 1;
    } else {
      return 0;
    }

  }

}
