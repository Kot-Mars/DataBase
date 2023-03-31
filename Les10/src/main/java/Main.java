import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    final static Random rand = new Random();
    public static void main(String[] args) {
        List<List<Progucer>> progucerList = new ArrayList<>();
        List<Progucer> even = new ArrayList<>();
        List<Progucer> odd = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Progucer progucer = new Progucer(i, i+rand.nextInt(100));
            if (progucer.getId() %2 == 0) {
                even.add(progucer);
                progucerList.add(even);
            } else {
                odd.add(progucer);
                progucerList.add(odd);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < progucerList.get(i).size(); j++) {
                System.out.println(progucerList.get(i).get(j).getId());
            }
        }


    }
}
