import java.util.ArrayList;
import java.util.Collections;


public class RanMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<10; i++) {
            System.out.print(list.get(i) + "\t");
        }
    }

}
