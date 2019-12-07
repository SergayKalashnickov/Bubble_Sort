import java.sql.Array;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        Sort first = new Sort();
    }

    public static class Sort{

        public Sort(){
            List<Integer> Data =inputData();
            System.out.println(Data);
            Integer[] ArrData = new Integer[Data.size()];
            for (int i=0;i<Data.size();i++){
                ArrData[i]=Data.get(i);
            }
            Integer[] result =Sorted(ArrData);
            System.out.println(Arrays.toString(result));
        }


        public List inputData(){
            boolean stop = true;
            List<Integer>  data = new ArrayList<Integer>();
            while (stop == true){
                Scanner nc = new Scanner(System.in);
                try{
                int a = nc.nextInt();
                data.add(a);
                }
                catch (NumberFormatException e){
                    stop=false;
            }
                catch (InputMismatchException e){
                    stop=false;
                }
            }
            return data;
        }

        public Integer[] Sorted(Integer[] data1){
            Integer[] data = data1;
            int n = data.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(data[j+1]>data[j]) {
                        int tmp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = tmp;
                    }
                }
            }
            return data;
        }
    }

    //напишите тут ваш код
}
