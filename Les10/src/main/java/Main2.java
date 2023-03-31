import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {


    public static void main(String[] args) {
        String str = "Строка с буквами a,b,c";
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(str);
        String[] strings = str.split(" ");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        findCout();
    }

    public static void findCout() {
        //String str = "Строка с числами 1.2 4";
        String str = "+12 (345) 678-90-12";
       // Pattern pattern = Pattern.compile("\\d+(\\.\\d)?");
        Pattern pattern = Pattern.compile("^\\+(?:[0-9]?){6,14}[0-9]$");
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches()) {
            System.out.println("Номер корректный");
        }
        else System.out.println("Номер не корректный");
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }
}
