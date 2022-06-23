import java.io.*;
import java.util.*;

public class Main {
    
    static class Pair{
        int vtx;
        int level;
        
        Pair(int vtx,int level){
            this.vtx=vtx;
            this.level=level;
        }
    }    

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
      
      
      int []visited=new int [vtces];
      Arrays.fill(visited,-1);
      
      
      for(int i=0;i<vtces;i++){
          if(visited[i]==-1){
              boolean ans=isBipartite(graph,visited,i);
              
              if(ans==false){
                  System.out.println(false);
                  return ;
              }
          }
      }
      
      
      System.out.println(true);

   }
   
   
   public static boolean isBipartite(ArrayList<Edge>[]graph,int []visited,int src){
       
       Queue<Pair>q=new ArrayDeque<>();
       q.add(new Pair(src,0));
       
       while(q.size()>0){
           Pair rp=q.remove();
           if(visited[rp.vtx]!=-1){
               if(rp.level!=visited[rp.vtx]){
                   return false;
               }
               
           }else {
               visited[rp.vtx]=rp.level;
           }
           
           for(Edge e:graph[rp.vtx]){
               int nbr=e.nbr;
               if(visited[nbr]==-1){
                   q.add(new Pair(nbr,rp.level+1));
               }
           }
           
           
       }
       
       return true;
   }  
}
