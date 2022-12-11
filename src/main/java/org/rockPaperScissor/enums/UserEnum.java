package org.rockPaperScissor.enums;

public enum UserEnum {
    PLAYER(0, "PLAYER"),
    COMPUTER(1, "COMPUTER"),
    ;

    private final int code;
    private final String user;

    public int getCode() {
        return code;
    }

    public String getUser() {
        return user;
    }

    UserEnum(int code, String user) {
        this.code = code;
        this.user = user;
    }

    public static UserEnum getByCode(int code){
        UserEnum[] userEnums = UserEnum.values();
        for(UserEnum userEnum: userEnums){
            if(userEnum.getCode() == code){
                return userEnum;
            }
        }
        return null;
    }
}
