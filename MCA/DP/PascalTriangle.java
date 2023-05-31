import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {

    static List<List<Integer>> generate(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int rowNum = 1; rowNum < n; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            // first col
            row.add(1);
            for(int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            // last col
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> output = generate(5);
        System.out.println(output);
    }
}
