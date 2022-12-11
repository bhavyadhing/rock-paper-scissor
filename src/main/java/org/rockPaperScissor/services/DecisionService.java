package org.rockPaperScissor.services;

import org.rockPaperScissor.enums.ActionEnum;
import org.rockPaperScissor.enums.UserEnum;

public interface DecisionService {
    UserEnum winner(ActionEnum playerMove, ActionEnum computerMove);
}
