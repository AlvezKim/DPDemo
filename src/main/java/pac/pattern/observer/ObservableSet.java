package pac.pattern.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObservableSet<E> extends ForwardinSet<E> {
    private final List<IObserver<E>> observers = new ArrayList<IObserver<E>>();

    public ObservableSet(Set<E> set) {
        super(set);
    }

    public void addObserver(IObserver<E> observer){
        synchronized (observers){
            observers.add(observer);
        }
    }

    public void removeObserver(IObserver observer){
        synchronized (observers){
            observers.remove(observer);
        }
    }

    public void notifyObserver(E addedElement){
        synchronized (observers){
            for (IObserver<E> observer : observers) {
                observer.update(addedElement);
            }
        }
    }

    @Override
    public boolean add(E o) {
        if(o == null) throw new IllegalArgumentException();

        boolean result = super.add(o);
        if(result)notifyObserver(o);
        return result;
    }

    public static void main(String[] args) {
        final ObservableSet<Integer> observableSet = new ObservableSet<Integer>(new HashSet<Integer>());
        IObserver<Integer> observer = new IObserver<Integer>() {
            @Override
            public void update(Integer s) {
                if(s==36)
                    observableSet.removeObserver(this);
                System.out.println(this.toString().concat("just added::").concat(s.toString()));
            }
        };

        observableSet.addObserver(observer);
        observableSet.addObserver(observer);
        observableSet.addObserver(observer);

        for (int i = 0; i <100 ; i++) {
            observableSet.add(i);
        }

    }
}
