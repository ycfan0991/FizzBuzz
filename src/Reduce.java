public class Reduce {
    public static void main(String[] args) {

        int num = 100;
        int count = 0;

        while (num != 0) {

            if (num % 2 == 0) {

                num = num / 2;
                count++;
            }

            else {

                num = num - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
