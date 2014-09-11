package pac.pattern.facade;

/**
 * Provide a unified interface to set of interfaces of sub-system.
 * Facade defines higher level interface that makes sub-system easier to use.
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();
    private Checker checker = new Checker();

    public void startProcess(){
        checker.check();
        classC.methodC();
        checker.check();
        classB.methodB();
        checker.check();
        classA.methodA();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startProcess();
    }
}
