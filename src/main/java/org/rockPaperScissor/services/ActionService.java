package org.rockPaperScissor.services;

import org.rockPaperScissor.enums.ActionEnum;

public interface ActionService {
    ActionEnum playerAction();
    ActionEnum computerAction();
}
