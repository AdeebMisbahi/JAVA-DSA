package Graphs-1;

import java.util.Scanner;

public class HasPath-DFS {
    public static void main(String[] args) {
           /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		  Scanner s = new Scanner(System.in);
          int V = s.nextInt();
          int E = s.nextInt();
          int edges[][]=new int[V][V];
          for(int i=0;i<E;i++){
              int sv=s.nextInt();
              int ev=s.nextInt();
              edges[sv][ev]=1;
              edges[ev][sv]=1;
          }
          int V1=s.nextInt();
          int V2=s.nextInt();
          boolean visited[]=new boolean[V];
          boolean ans=hasPath(edges,V1,V2,visited);
          System.out.println(ans);
      }
      public static boolean hasPath(int[][] edges,int V1, int V2,boolean visited[]){
        visited[V1]=true;
          if(V1>=edges.length || V2>=edges.length){
        return false;
      }
      if(V1==V2  || edges[V1][V2]==1){
        return true;
      }
      boolean ans=false;
      
      for(int i=0; i<edges.length; i++){
        if(edges[V1][i]==1 && !visited[i]){
          ans=hasPath(edges, i, V2, visited);
  
  if(ans==true){
    
    break;
   
  }
        }
      }
     
       return ans;
    }
}
