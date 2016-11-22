// Holds a sequence of Objects.
//
// @Author: FluegLau
// static methods must imported as static???
import static com.liu.flueg.util.Print.*;

// interface is automatic public accessibility.

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {items = new Object[size];}
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() {return items[i];}
        public void next() {if (i < items.length) i++;}
    }

    // The inner-class technic allows another selecotr implementation more easily.
    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() { return i < 0; }
        public Object current() {return items[i];}
        public void next() {if (i >= 0) i--;}
    }

    public Selector selector() { 
        return new SequenceSelector();
    }

    public Selector reverseSelector() { 
        return new ReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i=0;i<10;i++) 
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();
        while (!selector.end()) {
            printnb(selector.current() + " ");
            selector.next();
        }
        print();
     
        print("Reverse selector:");
        selector = sequence.reverseSelector();
        while (!selector.end()) {
            printnb(selector.current() + " ");
            selector.next();
        }
        print();
   }
}
