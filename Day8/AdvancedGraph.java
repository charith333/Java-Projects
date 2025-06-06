import java.util.ArrayList;

public class AdvancedGraph {
	static class graph{
		private Map<Integer, List<Integer>> adjlist = new HashMap<Integer, List<Integer>>();
		
		void addEdge(int u,int v) {
			adjlist.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			adjlist.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
			
		}
		void printGraph() {
			for(int node : adjlist.KeySet()) {
				System.out.println("Node" + node + " is connected to :");
				
				for(int neighbor : adjlist.get(node)) {
					System.out.println(neighbor + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
