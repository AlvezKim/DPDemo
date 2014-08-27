package pac.pattern.agent.dynamic;

import pac.pattern.agent.dynamic.impl.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PlayerProxy implements InvocationHandler{
    private IGamePlayer gamePlayer;

    public PlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().contains("login"))
            System.out.println("proxy login...");
        else
            System.out.println("proxy playin..");
        return method.invoke(this.gamePlayer,args);
    }

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer();
        PlayerProxy proxy = new PlayerProxy(player);
        IGamePlayer player1 = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, proxy);
        player1.login();
        player1.play();
        System.out.println();
    }

}
