package org.rockPaperScissor.services.impl;

import org.rockPaperScissor.enums.ActionEnum;
import org.rockPaperScissor.enums.UserEnum;
import org.rockPaperScissor.services.DecisionService;

public class DecisionServiceImpl implements DecisionService {
    @Override
    public UserEnum winner(ActionEnum playerMove, ActionEnum computerMove) {
        if(playerMove==null || computerMove==null){
            System.out.println("INCORRECT ACTION");
            return null;
        }
        if(playerMove == computerMove){
            System.out.println("MATCH DRAWN");
            return null;
        }
        if(playerMove==ActionEnum.ROCK){
            if(computerMove!=ActionEnum.PAPER){
                return UserEnum.PLAYER;
            }
            else{
                return UserEnum.COMPUTER;
            }
        }
        if(playerMove==ActionEnum.PAPER){
            if(computerMove!=ActionEnum.SCISSOR){
                return UserEnum.PLAYER;
            }
            else{
                return UserEnum.COMPUTER;
            }
        }
        if(playerMove==ActionEnum.SCISSOR){
            if(computerMove!=ActionEnum.ROCK){
                return UserEnum.PLAYER;
            }
            else{
                return UserEnum.COMPUTER;
            }
        }
        return null;
    }
}
