public class graph{
    int adjMatrix[][];
    graph(int nodes){
        adjMatrix = new int[nodes][nodes];//4*4 [
    }
    public void addEdgesInMatrix(int edges[][],boolean isDirected){
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            //directed
            if(isDirected){
                adjMatrix[u][v] =1;
            }else {
                //undirected
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }
    public void printMatrix(){
        for(int i =0;i<adjMatrix.length;i++){
            System.out.print("rows : "+ i + " -> ");
            for(int j =0;j< adjMatrix.length;j++){
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
        graph Graph = new graph(nodes);
        Graph.addEdgesInMatrix(edges,false);
        Graph.printMatrix();
    }
}