import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {

  //User Interface Logic and Execution Module
  public static void main(String[] args){
    RockPaperScissors newRockPaperScissors = new RockPaperScissors();

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put ("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      HashMap model = new HashMap();
      model.put ("template", "templates/result.vtl");
      String playerOneMove = request.queryParams("playerOne");
      String playerTwoMove = request.queryParams("playerTwo");
      String computerActive = request.queryParams("computer");
      String output;
      if (computerActive.equals("true")) {
        Integer winner = newRockPaperScissors.checkWinner(playerOneMove, newRockPaperScissors.computerMove());
        if (winner == 1){
          output = "Player One";
        } else if (winner == 2){
          output = "Computer";
        }
        else {
          output = "Nobody";
        }
      } else {
        Integer winner = newRockPaperScissors.checkWinner(playerOneMove, playerTwoMove);
        if (winner == 1){
          output = "Player One";
        } else if (winner == 2){
          output = "Player Two";
        }
        else {
          output = "Nobody";
        }
      }
      model.put("output", output);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  //Business Logic (Functions, Objects...)
  public String computerMove(){
    Integer randomComputerMove;
    Random myComputerMove = new Random(3);
    randomComputerMove = myComputerMove.nextInt();
    if (randomComputerMove == 0) {
      return "rock";
    } else if (randomComputerMove == 1) {
      return "paper";
    } else {
      return "scissors";
    }
  }

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


// String test = new RockPaperScissors;
