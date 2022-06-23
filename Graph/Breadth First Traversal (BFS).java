import java.io.*;
import java.util.*;

public class Main {
    
   public static class Pair{
       int vtx;
       String psf;
       
       public Pair(int vtx,String psf){
           this.vtx=vtx;
           this.psf=psf;
       }
   }
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());


    Queue<Pair> q=new ArrayDeque<>();
    boolean visited[]=new boolean[vtces];
    
    
    q.add(new Pair(src,src+""));
    
    while(q.size()>0){
        //  Remove
        Pair rp=q.remove();
        // check for visited
        if(visited[rp.vtx]==false){
            // Mark and Print
            visited[rp.vtx]=true;
            
            System.out.println(rp.vtx +"@" +rp.psf);
            
            // Add unvisited nbrs
            for(Edge e:graph[rp.vtx]){
                int nbr=e.nbr;
                if(visited[nbr]==false){
                    q.add(new Pair(nbr ,rp.psf+nbr));
                }
            }
        }
    } 
   }
}
