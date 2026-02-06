import java.util.Arrays;
import java.util.Comparator;

class Tuple1
{
    public int a,b;
    public Tuple1(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString()
    {
        return "a=" + a + ",b=" + b;
    }
}


public class ArraysTupleComparator {

    public static void main(String[] args) {

        Tuple1[] arr = new Tuple1[4];
        arr[0] = new Tuple1(10, 11);
        arr[1] = new Tuple1(20, 11);
        arr[2] = new Tuple1(100, 5);
        arr[3] = new Tuple1(5, 100);

       /* Arrays.sort(arr, new Comparator<Tuple1>() {
            @Override
            public int compare(Tuple1 o1, Tuple1 o2) {
                if (o1.b != o2.b) {
                    return o1.b - o2.b;
                } else {
                    return o1.a - o2.a;
                }
            }
        });*/

        Arrays.sort(arr, (o1,o2)-> {
                if (o1.b != o2.b) {
                    return o1.b - o2.b;
                } else {
                    return o1.a - o2.a;
                }

        });



        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}
