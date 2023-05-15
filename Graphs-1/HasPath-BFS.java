package Graphs-1;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static boolean BFS(int edges[][], int sv, int ev, boolean visited[]) {
         // Check for invalid input of sv or ev 
         if (sv > (edges.length - 1) || ev > (edges.length - 1) ){
             return false;
             } 
             if(edges[sv][ev] == 1) { 
                return true;
             }
              Queue<Integer> queue = new LinkedList<>();
               visited[sv] = true;
                queue.add(sv);
                 while(!queue.isEmpty()) {
                     int front = queue.remove();
                      for(int i = 0; i < edges.length; i++) {
                         if(edges[front][i] == 1 && !visited[i]) {
                             if(i == ev) 
                             return true;
                              else { visited[i] = true;
                                 queue.add(i); 
                                } 
                            }
                         } 
                        }
                         return false; 
                        }
                         private static boolean hasPath(int[][] edges, int sv, int ev) {
                             boolean visited[] = new boolean[edges.length]; 
                             return BFS(edges, sv, ev, visited); 
                            }
                                 
     }
