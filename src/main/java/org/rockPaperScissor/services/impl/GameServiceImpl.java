package org.rockPaperScissor.services.impl;

import org.rockPaperScissor.enums.ActionEnum;
import org.rockPaperScissor.enums.UserEnum;
import org.rockPaperScissor.services.DecisionService;
import org.rockPaperScissor.services.GameService;
import org.rockPaperScissor.services.ActionService;

import java.util.Scanner;

public class GameServiceImpl implements GameService {
    @Override
    public void startGame() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ROCK-PAPER-SCISSOR-GAME \nPRESS OK TO PLAY: ");

        String str = sc.nextLine();

        if(str.equalsIgnoreCase("ok")) {
            do {
                ActionService actionService = new ActionServiceImpl();
                ActionEnum playerAction = actionService.playerAction();
                if(playerAction!=null) {
                    ActionEnum computerAction = actionService.computerAction();
                    DecisionService decisionService = new DecisionServiceImpl();
                    UserEnum winner = decisionService.winner(playerAction, computerAction);

                    if (winner != null) {
                        System.out.println(winner + " WINS");
                    }
                }

                System.out.print("PRESS OK TO PLAY AGAIN OR PRESS ANY KEY TO EXIT: ");
                str = sc.nextLine();
            } while (str.equalsIgnoreCase("ok"));
        }
        else{
            System.out.println("GAME OVER");
            return;
        }
        System.out.println("GAME OVER");
    }
}
