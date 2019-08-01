package five;

public class Add_48 {

    public int Add(int num1, int num2) {

        int a = num1 ^ num2;
        int b = (num1 & num2) << 1;
        while (b != 0) {
            int a1 = a ^ b;
            int b1 = a & b;
            a = a1;
            b = b1 << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Add_48().Add(111, 899));
    }
}
