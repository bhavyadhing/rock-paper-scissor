package org.rockPaperScissor;

import org.rockPaperScissor.services.GameService;
import org.rockPaperScissor.services.impl.GameServiceImpl;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();
        gameService.startGame();
    }
}