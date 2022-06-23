import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      int src=0;
      
      boolean visited[]=new boolean[vtces];
      
      for(int i=0;i<vtces;i++){
          if(visited[i]==false){
              boolean ans=isCycle(graph,i,visited);
              if(ans==true){
                  System.out.println(true);
                  return ;
              }
          }
      }
      
      System.out.println(false);
   }
   
   
   public static boolean isCycle(ArrayList<Edge>[] graph,int src,boolean visited[]){
       
       Queue<Integer>q=new ArrayDeque<>();
       q.add(src);
       
       while(q.size()>0){
           int vtx=q.remove();
           
           if(visited[vtx]==false){
               visited[vtx]=true;
               
               for(Edge e:graph[vtx]){
                   int nbr=e.nbr;
                   if(visited[nbr]==false){
                       q.add(nbr);
                   }
               }
           }else{
               return true;
           }
       }
       
       
       return false;
       
       
   }
}
