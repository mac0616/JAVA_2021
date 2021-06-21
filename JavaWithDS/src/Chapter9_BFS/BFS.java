package Chapter9_BFS;
import java.util.*;
public class BFS {
	int N;
	List<Edge>[] graph;
	private boolean[] visited;
	public BFS(List<Edge>[] adjList) {
		N = adjList.length;
		graph = adjList;
		visited = new boolean[N];
		for(int i = 0; i < N; i++) visited[i] = false;
		for(int i = 0; i < N; i++) if (!visited[i]) bfs(i);
	}
	private void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[i] = true;
		q.add(i);
		while (!q.isEmpty()) {
			int j = q.remove();
			System.out.print(j + " ");
			for (Edge e: graph[j]) {
				if (!visited[e.adjvertex]) {
					visited[e.adjvertex] = true;
					q.add(e.adjvertex);
				}
			}
		}
	}
}