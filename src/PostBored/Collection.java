package PostBored;

import java.util.List;

/**
 * Created by T00171832 on 15/12/2015.
 */
abstract class Collection<T> {

    List<T> collection;

    public T get(int index) {
        if (size() > index) {
            return collection.get(index);
        }
        return null;
    }

    public void add(T object) {
        collection.add(object);
    }

    private int size() {
        return collection.size();
    }

    public abstract T getById(int id);

}
