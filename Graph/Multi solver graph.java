 public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
      
      if(src==dest){
          
        //    For shortest path
        if(wsf<spathwt){
            spathwt=wsf;
            spath=psf;
        }
        
        // Longest path
        if(wsf>lpathwt){
            lpathwt=wsf;
            lpath=psf;
        }
        
        // Ceil path
        if(wsf>criteria && wsf<cpathwt){
            cpathwt=wsf;
            cpath=psf;
        }
        
        // Floor path
        if(wsf<criteria && wsf>fpathwt){
            fpathwt=wsf;
            fpath=psf;
        }
        
        if(pq.size()<k){
            pq.add(new Pair(wsf,psf));
        }else{
            if(pq.peek().wsf<wsf){
                pq.remove();
                pq.add(new Pair(wsf,psf));
            }
        }
        
        return ;
          
      }
      
      visited[src]=true;
      
      for(Edge e:graph[src]){
          int nbr=e.nbr;
          int wt=e.wt;
          
          if(visited[nbr]==false){
              multisolver(graph,nbr,dest,visited,criteria,k,psf+nbr,wsf+wt);
          }
      }
      
      visited[src]=false;
   }
