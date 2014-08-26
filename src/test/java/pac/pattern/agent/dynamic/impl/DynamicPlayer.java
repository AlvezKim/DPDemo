package pac.pattern.agent.dynamic.impl;

import pac.pattern.agent.dynamic.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Alvez on 14-8-26.
 */
public class DynamicPlayer implements InvocationHandler{
    private IGamePlayer gamePlayer;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.gamePlayer,args);
    }

    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }

    public static void main(String[] args) {
        IGamePlayer gamePlayer = (IGamePlayer) new DynamicPlayer();
        InvocationHandler handler = new DynamicPlayer();
        Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),new Class[]{IGamePlayer.class}, handler);
    }
}
