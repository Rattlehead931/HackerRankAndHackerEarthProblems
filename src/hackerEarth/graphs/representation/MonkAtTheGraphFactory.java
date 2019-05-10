package hackerEarth.graphs.representation;


import java.util.Scanner;

//problem url : https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/monk-at-the-graph-factory/
public class MonkAtTheGraphFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum+=sc.nextInt();
        }
        System.out.println(sum == 2*( n-1) ? "Yes" : "No");
    }
}
