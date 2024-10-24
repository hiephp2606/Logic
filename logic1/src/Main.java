import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> lSum = new ArrayList<>();
//        int size = l1.size();


//        l1
        l1.add(1);
        l1.add(1);
        l1.add(1);

//        l2
        l2.add(1);
        l2.add(1);
        l2.add(1);

//
//        if (l1.size() < l2.size()) {
//            size = l2.size();
//        }
//        else {
//            size = l1.size();
//        }

        for (int i = 0; i < l1.size(); i++) {
            int sum = l1.get(i) + l2.get(i);
            lSum.add(sum);
        }

        System.out.println(lSum);

    }
}