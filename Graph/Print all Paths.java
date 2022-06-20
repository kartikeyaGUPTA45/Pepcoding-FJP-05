
   public static void allPaths(ArrayList<Edge>graph[],int src,int dest,boolean []visited,String psf){
       
       if(src==dest){
           System.out.println(psf);
           return ;
       }
       
       
       visited[src]=true;
       
       for(Edge e:graph[src]){
           int nbr=e.nbr;
           if(visited[nbr]==false){
               allPaths(graph,nbr,dest,visited,psf+nbr);
           }
       }
       
       visited[src]=false;
   }
