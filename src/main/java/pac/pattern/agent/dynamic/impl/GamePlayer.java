package pac.pattern.agent.dynamic.impl;

import pac.pattern.agent.dynamic.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    @Override
    public void login() {
        System.out.println("alvez login!!"+System.currentTimeMillis());
    }

    @Override
    public void play() {
        System.out.println("alvez playin..."+System.currentTimeMillis());
    }
}
