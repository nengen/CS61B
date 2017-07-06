package Map61B;

import org.junit.util.List;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMap<K, V> implements Map61B<K, V>{
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key){
        for(int i = 0; i < size; i++){
            if(keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key){
        index = keyIndex(key);
        return index > -1;
    }

    public void put(K key, V value){
        int index = keyIndex(key);
        if(index  == -1){
            keys[size] = key;
            values[size] = value;
            return
        }
        values[index] = value;
    }

    public V get(K key){
        index = keyIndex(key);
        return values[index];
    }

    public int size(){
        return size;
    }

    @Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        int expected = 5;
        assertEquals((Integer) expected, am.get(2));
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }

}