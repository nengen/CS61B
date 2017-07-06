import static org.junit.Assert.*;

import edu.princeton.cs.algs4.*;
import org.junit.Test;

public class TestArrayDeque1B{
    private StudentArrayDeque<Integer> student = new StudentArrayDeque<>();
    private ArrayDequeSolution<Integer>  solution = new ArrayDequeSolution<Integer>();

    @Test(timeout = 1000)
    public void test(){

        OperationSequence m1 = new OperationSequence();
        OperationSequence m2 = new OperationSequence();
        OperationSequence m3 = new OperationSequence();

        //Test addFirst and addLast
        for(int i = 0; i < 5; i++){
            double randomNumberBetweenOneAndZero = StdRandom.uniform();
            //addFirst
            if(randomNumberBetweenOneAndZero > 0.5){
                student.addFirst(i);
                solution.addFirst(i);
                DequeOperation deque1 = new DequeOperation("addFirst", i);
                m1.addOperation(deque1);
            }else{
                student.addLast(i);
                solution.addLast(i);
                DequeOperation deque1 = new DequeOperation("addLast", i);
                m1.addOperation(deque1);
            }
            assertEquals(m1.toString(),solution.get(i), student.get(i));

        }


        //Test removeLast
        for(int i = 0; i < 5; i++){
            Integer act = student.removeLast();
            Integer exp = solution.removeLast();
            DequeOperation deque2 = new DequeOperation("removeLast", i);
            m2.addOperation(deque2);
            assertEquals(m2.toString(),exp, act);
        }

        //Test removeFirst
        for(int i = 0; i < 5; i++) {
            Integer act = student.removeFirst();
            Integer exp = solution.removeFirst();
            DequeOperation deque3 = new DequeOperation("removeFirst", i);
            m3.addOperation(deque3);
            assertEquals(m3.toString(), exp, act);
        }
    }

    public static void main(String... args) {
        jh61b.junit.textui.runClasses(TestArrayDeque1B.class);
    }
}