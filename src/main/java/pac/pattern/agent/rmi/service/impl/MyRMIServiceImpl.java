package pac.pattern.agent.rmi.service.impl;

import pac.pattern.agent.rmi.service.MyRMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyRMIServiceImpl implements MyRMIService {
    @Override
    public String sendMsg() {
        return "msg from alvez";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        LocateRegistry.createRegistry(6060);
        MyRMIService service = new MyRMIServiceImpl();
        Naming.rebind("rmi://127.0.0.1:6060/myRMIService",service);

        MyRMIService service1 = (MyRMIService) Naming.lookup("rmi://127.0.0.1:6060/myRMIService");
        String content = service1.sendMsg();
        System.out.println(content);
    }
}