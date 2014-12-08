package pac.pattern.agent.dynamic;



import pac.pattern.agent.dynamic.impl.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PlayerProxy implements InvocationHandler{
    private IGamePlayer gamePlayer;
    public PlayerProxy(IGamePlayer gamePlayer){this.gamePlayer=gamePlayer;}

    public Object getInstance(){
        return Proxy.newProxyInstance(this.gamePlayer.getClass().getClassLoader(),this.gamePlayer.getClass().getInterfaces(),this);
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
        PlayerProxy proxy = new PlayerProxy(new GamePlayer());
        IGamePlayer player = (IGamePlayer) proxy.getInstance();
        player.play();
    }

}
