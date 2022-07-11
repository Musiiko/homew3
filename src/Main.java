public class Main {
    public static void main(String[] args) {
        int k = 8;
        int n = 1;
        int num = 1;
        while (n * n < k) {
            n++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num <= k) {
                    System.out.print(num + "\t");
                    num++;
                }
            }
            System.out.println();
        }
    }
}





