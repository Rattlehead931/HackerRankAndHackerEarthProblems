package hackerEarth.graphs.representation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonkInTheRealEstate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            Set<Integer> roads = new HashSet<>();
            for (int j = 0; j < n; j++) {
                roads.add(sc.nextInt());
                roads.add(sc.nextInt());
            }
            System.out.println(roads.size());
        }
    }
}
