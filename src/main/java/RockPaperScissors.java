public class RockPaperScissors {

  public Integer checkWinner (String playerOneMove, String playerTwoMove) {

    if ( (playerOneMove.toLowerCase().equals("rock") && playerTwoMove.toLowerCase().equals("scissors")) || (playerOneMove.toLowerCase().equals("scissors") && playerTwoMove.toLowerCase().equals("paper")) || (playerOneMove.toLowerCase().equals("paper") && playerTwoMove.toLowerCase().equals("rock")) )  {
      return 1;
    } else if (playerOneMove.toLowerCase().equals(playerTwoMove.toLowerCase())) {
      return 0;
    } else {
      return 2;
    }
  }
}
