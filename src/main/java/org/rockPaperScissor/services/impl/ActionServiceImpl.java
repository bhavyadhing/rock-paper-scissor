package org.rockPaperScissor.services.impl;

import org.rockPaperScissor.enums.ActionEnum;
import org.rockPaperScissor.services.ActionService;

import java.util.Random;
import java.util.Scanner;

public class ActionServiceImpl implements ActionService {
    @Override
    public ActionEnum playerAction() {
        System.out.println("PRESS 0 for ROCK, 1 for PAPER, 2 for SCISSOR");
        Scanner sc = new Scanner(System.in);
        try {
            int player = sc.nextInt();
            return ActionEnum.getByCode(player);
        }
        catch(Exception e){
            System.out.println("INCORRECT ACTION");
        }
        return null;
    }

    @Override
    public ActionEnum computerAction() {
        Random random = new Random();
        int computer = Math.abs(random.nextInt()%3);
        ActionEnum computerAction = ActionEnum.getByCode(computer);
        System.out.println("COMPUTER CHOSE " + computerAction);
        return computerAction;
    }
}
