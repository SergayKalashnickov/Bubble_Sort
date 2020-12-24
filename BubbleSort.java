import java.sql.Array;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        Sort first = new Sort();
    }

    public static class Sort {

        public Sort() {
            List<Integer> Data = inputData();
            System.out.println(Data);
            Integer[] ArrData = new Integer[Data.size()];
            for (int i = 0; i < Data.size(); i++) {
                ArrData[i] = Data.get(i);
            }
            Integer[] result = Sorted(ArrData);
            System.out.println(Arrays.toString(result));
        }


        public List inputData() {
            boolean stop = true;
            List<Integer> data = new ArrayList<Integer>();
            while (stop == true) {
                Scanner nc = new Scanner(System.in);
                try {
                    int a = nc.nextInt();
                    data.add(a);
                } catch (NumberFormatException e) {
                    stop = false;
                } catch (InputMismatchException e) {
                    stop = false;
                }
            }
            return data;
        }

        public Integer[] Sorted(Integer[] data1) {
            Integer[] data = data1;
            int n = data.length;
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < n; i++) {
                    if (data[i] < data[i - 1]) {
                        int tmp = data[i];
                        data[i] = data[i - 1];
                        data[i - 1] = tmp;
                        isSorted = false;
                    }
                }
            }
            return data;
        }
    }

    //напишите тут ваш код
}
