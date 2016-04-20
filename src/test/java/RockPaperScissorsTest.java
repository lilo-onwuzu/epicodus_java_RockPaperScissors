import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void function_condition_result(){
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Integer expected = 1;
    assertEquals(expected, testRockPaperScissors.checkWinner("rock", "scissors"));
  }

}
