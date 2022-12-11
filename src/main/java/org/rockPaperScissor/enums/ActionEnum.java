package org.rockPaperScissor.enums;

import java.util.List;

public enum ActionEnum {
    ROCK(0, "ROCK"),
    PAPER(1, "PAPER"),
    SCISSOR(2, "SCISSOR"),
    ;
    private final int code;
    private final String action;

    public int getCode() {
        return code;
    }

    public String getAction() {
        return action;
    }

    ActionEnum(int code, String action) {
        this.code = code;
        this.action = action;
    }

    public static ActionEnum getByCode(int code){
        ActionEnum[] actionEnums = ActionEnum.values();
        for(ActionEnum actionEnum: actionEnums){
            if(actionEnum.getCode() == code){
                return actionEnum;
            }
        }
        return null;
    }

}
