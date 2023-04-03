import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        String str = "This is a test This is only a test";
        String[] world = str.split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        printDoubleWorld(world, treeMap);
    }

    public static TreeMap<String, Integer> checkWorld(String[] world, TreeMap<String, Integer> treeMap) {
        for (int i = 0; i < 8; i++) {
            if (treeMap.containsKey(world[i]))
                treeMap.put(world[i], treeMap.get(world[i]) + 1 );
            else treeMap.put(world[i], i);
        }
        return treeMap;
    }

    public static   void  printDoubleWorld (String[] world, TreeMap<String, Integer> treeMap) {
        checkWorld(world, treeMap);
        for (int i = 0; i < treeMap.size(); i++) {
            if(treeMap.get(world[i]) > 0)
                System.out.println(world[i] + " повторяется " + treeMap.get(world[i]) + " раз");
        }
    }
}
