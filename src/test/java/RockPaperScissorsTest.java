import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissors_1(){
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Integer expected = 1;
    assertEquals(expected, testRockPaperScissors.checkWinner("rock", "scissors"));
  }

  @Test
  public void checkWinner_scissorsBeatPaper_1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Integer expected = 1;
    assertEquals(expected, testRockPaperScissors.checkWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_paperBeatsRock_1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Integer expected = 1;
    assertEquals(expected, testRockPaperScissors.checkWinner("paper", "rock"));
  }

  @Test
  public void checkWinner_tie_0() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Integer expected = 0;
    assertEquals(expected, testRockPaperScissors.checkWinner("paper", "paper"));
  }

}
