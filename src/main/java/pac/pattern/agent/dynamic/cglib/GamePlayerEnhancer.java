package pac.pattern.agent.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Alvez on 14-12-8.
 */
public class GamePlayerEnhancer implements MethodInterceptor {

    public GamePlayer gamePlayer;

    public GamePlayerEnhancer(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(gamePlayer.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().contains("login"))
            System.out.println("proxy login...");
        else
            System.out.println("proxy playin..");
        return methodProxy.invokeSuper(o, objects);
    }

    public static void main(String[] args) {
        GamePlayerEnhancer enhancer = new GamePlayerEnhancer(new GamePlayer());
        GamePlayer proxy = (GamePlayer) enhancer.getProxy();
        proxy.play();
    }
}
