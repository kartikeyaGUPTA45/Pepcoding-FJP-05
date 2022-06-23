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

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      boolean visited[]=new boolean [vtces];
      
      hpc(graph,src,src,visited,src+"",0);
      
      
   }
   
   
   public static void hpc(ArrayList<Edge>graph[],int src1,int src2,boolean [] visited,String asf, int vvsf ){
       if(vvsf==graph.length-1){
           System.out.print(asf);
           
           boolean hc=false;
           for(Edge e:graph[src2]){
               int nbr=e.nbr;
               if(nbr==src1){
                   hc=true;
                   break;
               }
           }
           
           if(hc==true){
               System.out.println("*");
           }else {
               System.out.println(".");
           }
           
           return ;
       }
       
       
       
       visited[src1]=true;
       
       for(Edge e:graph[src1]){
           int nbr=e.nbr;
           if(visited[nbr]==false){
               hpc(graph,nbr,src2,visited,asf+nbr,vvsf+1);
           }
       }
       
       visited[src1]=false;
       
   }

}
