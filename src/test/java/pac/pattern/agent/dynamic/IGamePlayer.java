package pac.pattern.agent.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface IGamePlayer {
    void login();
    void play();

}
