import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
       // int sum = numbers.stream().mapToInt(Integer::intValue).sum();
     //   System.out.println(sum);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min);

        //Поиск первого элемента
        Optional<Integer> fisrt = numbers.stream().findFirst();

        //Пропустить первые два элемента
        List<Integer> result = numbers.stream().skip(2).filter(n->n>3).collect(Collectors.toList());

        List<Integer>  numbersDouble = Arrays.asList(1,2,2,3,3,4,4,5,5,6,6,6,7,7,8,9);
        List<Integer> result2 = numbersDouble.stream().distinct().collect(Collectors.toList());

        List<Integer> integerList = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        //Проверить содержаьбся ли число 5
        boolean containFive = numbers.stream().allMatch(n->n==5);

        List<Integer> num  = Arrays.asList(2,3,4,5,6,7,8,9,10,12,11,23,25);
       // int sumEven = num.stream().filter(n->n%2==0).sum();
        //System.out.println(num);
    }
}
