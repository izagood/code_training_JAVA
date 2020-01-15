package week03.d2.dijkstra;

import java.util.Arrays;

public class Dijkstra {

    int n;
    int[][] maps;

    public Dijkstra(int n) {
        this.n = n;
        maps = new int[n+1][n+1];
    }

    void input(int i, int j, int w){
        maps[i][j] = w;
        maps[j][i] = w;
    }

    void dijkstra_start(int v){

        int[] distance = new int[n+1];
        boolean[] check = new boolean[n+1];

        // 거리 값 초기화
        for(int i=1; i<n+1; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        // 시작 노드
        distance[v] = 0;
        check[v] = true;

        // 방문할 수 있는 노드들을 해당 정점들간의 가중치 값 업데이트
        for(int i=1; i<n+1; i++){
            if(!check[i] && maps[v][i] != 0){
                distance[i] = maps[v][i];
            }
        }

        for(int a=0; a<n-1; a++){
            // 최소값 초기화
            int min = Integer.MAX_VALUE;
            int min_index = -1;

            // 최소값 찾기
            for(int i=1; i<n+1; i++){
                if(!check[i] && distance[i] != Integer.MAX_VALUE){
                    if(distance[i] < min){
                        min = distance[i];
                        min_index = i;
                    }
                }
            }

            check[min_index] = true;
            for(int i=1; i<n+1; i++){
                if (!check[i] && maps[min_index][i] != 0){
                    if(distance[i] > distance[min_index] + maps[min_index][i]){
                        distance[i] = distance[min_index] + maps[min_index][i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }
    public static void main(String[] args) {
        Dijkstra app = new Dijkstra(8);

        app.input(1,2, 3);
        app.input(1,5, 4);
        app.input(1,4, 4);
        app.input(2,3, 2);
        app.input(3,4, 1);
        app.input(4,5, 2);
        app.input(5,6, 4);
        app.input(4,7, 6);
        app.input(7,6, 3);
        app.input(3,8, 3);
        app.input(6,8, 2);

        app.dijkstra_start(1);
    }

}
