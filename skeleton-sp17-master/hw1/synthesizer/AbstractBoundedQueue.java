package synthesizer;

/**
 * Created by Nengen on 03.07.2017.
 */
public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {

    protected int fillCount;
    protected int capacity;
    @Override
    public int capacity(){
        return capacity;
    };
    @Override
    public int fillCount(){
        return fillCount;
    };

}
