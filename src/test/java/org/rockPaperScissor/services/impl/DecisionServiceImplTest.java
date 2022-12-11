package org.rockPaperScissor.services.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.rockPaperScissor.enums.ActionEnum;
import org.rockPaperScissor.enums.UserEnum;
import org.rockPaperScissor.services.DecisionService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class DecisionServiceImplTest {
    @ParameterizedTest
    @EnumSource(ActionEnum.class)
    void matchDrawn(ActionEnum action){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(action, action);
        assertNull(winner);
    }

    @Test
    void playerWinsWithRock(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.ROCK, ActionEnum.SCISSOR);
        assertEquals(UserEnum.PLAYER, winner);
    }

    @Test
    void playerWinsWithPaper(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.PAPER, ActionEnum.ROCK);
        assertEquals(UserEnum.PLAYER, winner);
    }

    @Test
    void playerWinsWithScissor(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.SCISSOR, ActionEnum.PAPER);
        assertEquals(UserEnum.PLAYER, winner);
    }

    @Test
    void playerLoseWithRock(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.ROCK, ActionEnum.PAPER);
        assertEquals(UserEnum.COMPUTER, winner);
    }

    @Test
    void playerLoseWithPaper(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.PAPER, ActionEnum.SCISSOR);
        assertEquals(UserEnum.COMPUTER, winner);
    }

    @Test
    void playerLoseWithScissor(){
        DecisionService decisionService = new DecisionServiceImpl();
        UserEnum winner = decisionService.winner(ActionEnum.SCISSOR, ActionEnum.ROCK);
        assertEquals(UserEnum.COMPUTER, winner);
    }
}