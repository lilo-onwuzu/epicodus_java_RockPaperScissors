public class RockPaperScissors {

  public Integer checkWinner (String playerOneMove, String playerTwoMove) {

    if ( (playerOneMove.toLowerCase().equals("rock") && playerTwoMove.toLowerCase().equals("scissors")) || (playerOneMove.toLowerCase().equals("scissors") && playerTwoMove.toLowerCase().equals("paper")) )  {
      return 1;
    } else {
      return 0;
    }

  }

}
