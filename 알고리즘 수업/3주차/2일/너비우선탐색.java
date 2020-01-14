package week03.d2.bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    int nodeNum;
    LinkedList<Integer> list[];

    public BFS(int n) {
        nodeNum = n;
        list = new LinkedList[n];

        // 노드 리스트 초기화
        for(int i=0; i<n; i++){
            list[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        list[v].add(w);
        list[w].add(v);
    }

    void BFS_start(int s){
        // 노드 방문 여부 체크
        boolean[] visited = new boolean[nodeNum];

        // BFS 구현을 위한 큐 생성
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s + " ");

            Iterator<Integer> i = list[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFS app = new BFS(4);

        app.addEdge(0,1);
        app.addEdge(0,2);
        app.addEdge(2,3);
        app.addEdge(3,3);
        
        app.BFS_start(2);
    }
}
