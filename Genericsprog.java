import java.util.ArrayList;
import java.util.StringTokenizer;

class Mygeneric<T1,T2>{
    int val ;
    private T1 t1;
    private T2 t2;

    public Mygeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }
}

public class Genericsprog {
    public static void main(String[] args) {
       /*
        ArrayList L1 = new ArrayList();
        L1.add("shraboni");
        L1.add("sinha");
        L1.add(26);
        L1.add(2023);
        System.out.println(L1.size());
        int a = (int) L1.get(2);
        String b = (String) L1.get(1);
        System.out.println(a);
        System.out.println(b);

        ArrayList<String> L2 = new ArrayList<>();   // Generics is the datatype, which type of element we are creating.
        L2.add("tanmoy");
        L2.add("debdatta");
        L2.add("satarupa");
        L2.add("sreeparna");
        String c = L2.get(2);
        System.out.println(c);
        */


//        ArrayList<Integer> L3 = new ArrayList<Integer>();


        Mygeneric<String,String> g = new Mygeneric(26,"shraboni","sinha");
//        System.out.println(g.getT1());
//        System.out.println(g.getVal());

        String x = g.getT1();
        System.out.println(x);
        int y = g.getVal();
        System.out.println(y);

    }
}
