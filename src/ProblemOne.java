import java.util.ArrayList;
import java.util.List;

public class ProblemOne {

    public static void main(String[] args) {
        List<Integer> multiplesOf3And5 = new ArrayList<Integer>();
        int i = 0;

        while(i < 1000)
        {
            if (i % 3 == 0 || i % 5 == 0){
                multiplesOf3And5.add(i);
            }
            i++;
        }

        int sum = multiplesOf3And5.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
