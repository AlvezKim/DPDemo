package pac.pattern.agent.general.impl;

import pac.pattern.agent.general.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    @Override
    public void gamePlay() {
        System.out.println("playing game::"+System.currentTimeMillis());
    }

    @Override
    public void stopPlay() {
        System.out.println("stop playing::"+System.currentTimeMillis());
    }
}
