package pac.pattern.agent.rmi.service;

import java.io.Serializable;
import java.rmi.Remote;

public interface MyRMIService extends Remote,Serializable{
    String sendMsg();
}
