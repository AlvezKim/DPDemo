package pac.pattern.agent.rmi.service;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by Alvez on 14-8-26.
 */
public interface MyRMIService extends Remote,Serializable{
    String sendMsg();
}
