package Graphs-1;
import java.util.Scanner;;
public class DFS-traversal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        int[][] adjMatrix=new int[n][n];
        for(int i=0; i<e; i++) {
            int v1=s.nextInt();
            int v2=s.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }
        DFS(adjMatrix);
   }

   private static void DFS(int[][] adjMatrix) {
       int n=adjMatrix.length;
       boolean visited[]=new boolean[n];
       
       Dfs(adjMatrix,0, visited,n);
       
   }

   private static void Dfs(int[][] adjMatrix, int cv, boolean[] visited, int n) {
       
       visited[cv]=true;			
       System.out.print(cv+" ");
       for(int i=0; i<n; i++) {
           if(adjMatrix[cv][i]==1 && !visited[i]) {
               Dfs(adjMatrix,i,visited,n);
               
           }
       }
       
   }

}
