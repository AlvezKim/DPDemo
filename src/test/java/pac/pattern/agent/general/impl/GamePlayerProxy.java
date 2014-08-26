package pac.pattern.agent.general.impl;

import pac.pattern.agent.general.IGamePlayer;


public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer;

    @Override
    public void gamePlay() {
        System.out.println("proxy start::");
        gamePlayer.gamePlay();
    }

    @Override
    public void stopPlay() {
        System.out.println("proxy stop::");
        gamePlayer.stopPlay();
    }

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public static void main(String[] args) {
        IGamePlayer proxyPlayer = new GamePlayerProxy(new GamePlayer());
        proxyPlayer.gamePlay();
        proxyPlayer.stopPlay();
    }
}
