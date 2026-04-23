public class Tabular{
    public static void main(String[] args) {

    System.out.printf("%-5s%-5s%-5s%-5s%n", "N", "N^2", "N^3", "N^4");

    for (int n = 1; n <= 5; n++) {
        System.out.printf("%-5d%-5d%-5d%-5d%n",
        n, n*n, n*n*n, n*n*n*n);
}


}
}
