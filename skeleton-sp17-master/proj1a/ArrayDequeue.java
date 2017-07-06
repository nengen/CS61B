public class ArrayDequeue<type>{
    private type[] arrayList;
    private int nextLast;
    private int nextFirst;
    private int size = 0;


    public ArrayDequeue(){
        arrayList = (type[] new Object[8]);
        size = 0;
        nextLast = 0:
        nextFirst = 7;
    }

    private void resize(int capacity){
        type[] a = (type[] new Object[capacity]);
        System.arraycopy(arrayList,0, a, 0, size);
        arrayList = a;
        nextFirst = capacity-1;
        nextLast = size;
    }

    /**decrease the index backward , remember it's a loop*/
    private int minusOne(int index){
        if(index!=0){
            index-=1;
        }
        else{
            index=arrayList.length-1;
        }
        return index;
    }
    /**increase the index forward , remember it's a loop*/
    private int plusOne(int index){
        if(index!=arrayList.length-1){
            index+=1;
        }
        else{
            index=0;
        }
        return index;
    }

    public void addFirst(arrayList x){
        if(size == arrayList.length){
            resize(size*2);
        }
        arrayList[nextFirst] = x;
        nextFirst = minusOne(nextFirst);
        size += 1;
    }

    public void addLast(arrayList x){
        if(size == arrayList.length){
            resize(2 * size);
        }
        arrayList[nextLast] = x;
        nextLast = plusOne(nextLast);
        size += 1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public void printDequeue(){

    }

    public type get(int index){
        int temp = 0;
        for(int i = 0; i < index; i++){
            temp = i;
        }
        return arrayList[temp];
    }

    public type removeFirst(){
        if(arrayList.length > 16 && arrayList.length >= 4 * size){
            resize(arrayList.length / 2);
        }
        type i = arrayList[nextFirst + 1];
        arrayList[nextFirst + 1] = null;
        nextFirst = plusOne(nextFirst);
        size -= 1;
        return i;
    }

    public type removeLast() {
        if (arrayList.length > 16 && arrayList.length >= 4 * size) {
            resize(arrayList.length / 2);
        }
        type i = arrayList[nextLast - 1];
        arrayList[nextLast - 1] = null;
        size -= 1;
        nextLast = minusOne(nextLast);
        return i;
    }





    }