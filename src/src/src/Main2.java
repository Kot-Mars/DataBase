public class Main2 {
    public static void main(String[] args) {
        String str = "Я1 java3 знаю2";
        String[] subStr = str.split(" ");

        for (int i = 0; i < subStr.length; i++) {
            if(i == Integer.parseInt(subStr[i])) {
                System.out.println(subStr[i].replaceAll(Integer.toString(i)," "));
            }
        }
    }
}
