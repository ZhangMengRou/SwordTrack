import java.util.ArrayList;
import java.util.List;

public class GetMedian_63 {
    /*

     */
    public List<Integer> sortList = new ArrayList<>();

    public void Insert(Integer num) {
        if (sortList.size() == 0) {
            sortList.add(num);
            return;
        }
        if (sortList.size() == 1) {

            sortList.add(num);
            if (sortList.get(0) > num) {

                sortList.set(1, sortList.get(0));
                sortList.set(0, num);
            }
            return;
        }
        sortList.add(0);

        for (int i = sortList.size() - 1; i >= 0; i--) {
            System.out.println(sortList);

            if (i == 0) {

                sortList.set(0, num);
                break;
            }
            if (sortList.get(i - 1) <= num) {
                sortList.set(i, num);
                break;
            }

            sortList.set(i, sortList.get(i - 1));
        }


    }

    public Double GetMedian() {
        System.out.println(sortList);

        if (sortList.size() == 0) {

            return (double) 0;
        }
        if (sortList.size() % 2 == 1) {
            return Double.valueOf(sortList.get(sortList.size() / 2));
        } else {
            double i = Double.valueOf(sortList.get(sortList.size() / 2));
            double j = Double.valueOf(sortList.get(sortList.size() / 2 - 1));
            return (i + j) / 2;
        }
    }

    public static void main(String[] args) {
        GetMedian_63 g = new GetMedian_63();
        g.Insert(5);
        g.Insert(2);
        g.Insert(3);
        g.Insert(4);
//        5,2,3,4,1,6,7,0,8
        System.out.println(g.GetMedian());
    }

}
