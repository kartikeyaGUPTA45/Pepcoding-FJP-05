import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
      int src;
      int nbr;
    //   int wt;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
        //  this.wt = wt;
      }
   }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      // write your code here
       ArrayList<Edge>[] graph = new ArrayList[n];
      for (int i = 0; i < n; i++) {
         graph[i] = new ArrayList<>();
      }

    //   int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < k; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
        //  int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      boolean[]visited=new boolean[n];
      
      for(int i=0;i<n;i++){
          if(visited[i]==false){
              ArrayList<Integer>comp=new ArrayList<>();
              getComponents(graph,i,visited,comp);
              comps.add(comp);
          }
      }
      
      int ans=0;
      
      for(int i=0;i<comps.size();i++){
          for(int j=i+1;j<comps.size();j++){
              ans+=comps.get(i).size()*comps.get(j).size();
          }
      }
      
      System.out.println(ans);
     
   }
   
    public static void getComponents(ArrayList<Edge>[] graph,int src,boolean [] visited,ArrayList<Integer>comp){
       visited[src]=true;
       comp.add(src);
       for(Edge e:graph[src]){
           int nbr=e.nbr;
           if(visited[nbr]==false){
               getComponents(graph,nbr,visited,comp);
           }
       }
       
   }

}
