import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Антон", 0, 18 );
        User user2 = new User("Кирилл",1, 15);
        User user3 = new User("Лера",2 , 20);
        User user4 = new User("Денис", 3, 25);
        User user5 = new User("Максим", 4, 14);

        HashMap<Integer, String> hashMap = new HashMap();
        user1.cheakPassport(hashMap);
        user2.cheakPassport(hashMap);
        user3.cheakPassport(hashMap);
        user4.cheakPassport(hashMap);
        user5.cheakPassport(hashMap);
        mapPassport(hashMap);

    }

    public static void mapPassport(HashMap<Integer, String> hashMap) {
        for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
            System.out.println("Имя - " + map.getValue() + " ID - " + map.getKey());
        }
    }
}
