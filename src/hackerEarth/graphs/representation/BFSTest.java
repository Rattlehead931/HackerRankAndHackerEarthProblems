package hackerEarth.graphs.representation;

import java.util.*;

public class BFSTest {
    public static void main(String[] args) {
        List<Integer>[] adjacencyList = new List[8];
        int[] level = new int[8];
        int[] visited = new int[8];
        adjacencyList[0] = new ArrayList<>(Arrays.asList(1,2));
        adjacencyList[1] = new ArrayList<>(Arrays.asList(3,4,5));
        adjacencyList[2] = new ArrayList<>(Arrays.asList(6));
        adjacencyList[6] = new ArrayList<>(Arrays.asList(7));
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = 1;
        while (!queue.isEmpty()){
            Integer v = queue.poll();
            List<Integer> neighboursOfV = adjacencyList[v];
            System.out.println("Visiting: " +v + " Level: " + level[v]);
            if(neighboursOfV != null){
                for(Integer neighbour : neighboursOfV ){
                    if(visited[neighbour]==0){
                        queue.add(neighbour);
                        visited[neighbour] = 1;
                        level[neighbour] = level[v]+1;
                    }
                }
            }
        }
        System.out.println("Done ");
    }
}
