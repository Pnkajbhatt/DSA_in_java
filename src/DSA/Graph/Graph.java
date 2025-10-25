package DSA.Graph;
        
public class Graph {
    int[][] adjmatrix;
    Graph(int nodes){
          adjmatrix  = new int[nodes][nodes];
    }
    
    public void addedgeinGraph(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            if(isDirected){
                adjmatrix[u][v] = 1;
            }else{
                adjmatrix[u][v] = 1;
                adjmatrix[v][u] = 1;
            }

        }
    }
    
    public void printGraphMatrix(){
        for(int i= 0 ; i < adjmatrix.length ; i++){
            for(int j=0; j < adjmatrix[i].length;j++){
                System.out.print(adjmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0,1},{0,2},{1,3}};
        int node =4;
        Graph graph = new Graph(node);
        graph.addedgeinGraph(edges,false);
        graph.printGraphMatrix();
        
    }
}
