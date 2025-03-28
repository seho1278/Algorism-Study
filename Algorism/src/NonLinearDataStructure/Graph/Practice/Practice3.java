package NonLinearDataStructure.Graph.Practice;

/*
주어진 그래프를 두 개의 그래프로 분리할 수 있는지 확인 하는 프로그램을 작성
분리 조건 : 인접하지 않은 노드끼리 분리

모든 노드는 연결되어 있다.
분리 가능하면 true, 불가능하면 false 출력

예시 입출력
그래프 : {{1, 3}, {0, 2}, {1, 3}, {0, 2}}
출력 : true

그래프 : {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}
출력 : false
 */

public class Practice3 {
    public static void solution(int[][] graph) {
        int[] flags = new int[graph.length];

        if (checkSplit(graph, flags, 1, 0) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkSplit(int[][] graph, int[] flags, int flag, int node) {
        // 이미 방문한 경우
        if (flags[node] != 0) {
            return flags[node] == flag;
        }

        flags[node] = flag;
        for (int adjacentNode: graph[node]) {
            if (!checkSplit(graph, flags, -flag, adjacentNode)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test code
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        solution(graph);

        graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        solution(graph);
    }
}
