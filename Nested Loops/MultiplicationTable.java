public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i ++){
            for (int n = 1; n <= 10; n ++){
                System.out.printf("%d * %d = %d\n",i,n,i*n);
            }
        }
    }
}
