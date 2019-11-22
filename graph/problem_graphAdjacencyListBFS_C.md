# 문제

- 학교 알고리즘 실습문제: 그래프 인접행렬 너비 우선 탐색(Graph AdjacencyMatrix BFS(Breadth-First Search)) 문제

# 풀이

#### (생각하기)

- 너비 우선 탐색(BFS): 시작 정점을 방문한 후 시작 정점에 인접한 모든 정점들을 우선 방문하는 방법(깊게 탐색하기 전에 넓게 탐색한다고 생각하면 됨)
- 더 이상 방문하지 않은 정점이 없을 때까지 모든 정점들에 대해서도 너비 우선 탐색을 적용(**어떤 노드를 방문했는지 여부 검사 필요** )
- 출발노드에서 목표노드까지의 최단 길이 경로를 보장하는 알고리즘
- BFS는 재귀적으로 동작하지 않음
- BFS의 시간 복잡도

  - 인접 리스트로 표현된 그래프: O(N+E)
  - 인접 행렬로 표현된 그래프: O(N^2)

#### (구현하기)

- 인접행렬그래프로 구현
- 방문한 노드들을 차례로 저장한 후 꺼낼 수 있는 자료구조인 큐(Queue)를 사용(선입선출(FIFO))
- BFS 탐색 방법
  1. 탐색하고자 하는 정점에서 시작
  2. 자식 노드들을 큐(queue)에 저장
  3. 큐(queue)에 저장된 노드들을 차례로 방문. 방문한 곳은 pop한 후 방문한곳 체크. 각각의 자식들을 큐(queue)에 저장
  4. 위의 과정을 반복
  5. 모든 노드를 방문하면 탐색을 마침
- 즉, 현재 나의 위치에서 가장 가까운 노드를 먼저 방문->
  방문하면서 현재 위치는 pop-> 방문한 곳은 체크 -> 방문할 곳은 큐에 넣는 과정

> 입력
>
> - 첫 줄에 정점의 개수 n , 간선의 개수 m, 순회 시작 정점 번호 s가 주어짐
> - 이후 m개의 줄에 한 줄에 하나씩 간선의 정보(간선의 양 끝 정점 번호)가 주어짐. (간선은 임의의 순서로 입력, 중복 입력되는 간선은 없음)
> - 무방향 간선
>
> 출력
>
> - 출발정점 s에서 출발하는 BFS의 방문 순서대로 정점 번호를 출력
>
> <img src="image/img6.jpg" width="100%">

# 소스코드 (C언어)

```C
#include<stdio.h>
#include<stdlib.h>
#include<memory.h>

enum VisitMode { NotVisited, Visited };

typedef int ElementType;

typedef struct tagGraph {
	int **matrix; //그래프 인접행렬
	int vertexCount; //정점 개수
}Graph;


Graph* CreateGraph(int max_vertex);//그래프생성
void AddEdge(Graph *graph, int from, int target); //간선 생성

Graph* CreateGraph(int max_vertex) { //그래프 생성
	int i = 0;
	Graph* graph = (Graph*)malloc(sizeof(Graph));
	graph->vertexCount = max_vertex; //최대 정점 개수 설정
	graph->matrix = (int **)malloc(sizeof(int *)*(max_vertex+1));//인접행렬 메모리 할당

	for (i = 0; i <= max_vertex; i++) {
		graph->matrix[i] = (int *)malloc(sizeof(int)*(max_vertex+1));//i행 메모리 할당
		memset(graph->matrix[i], 0, sizeof(int)*(max_vertex+1)); //메모리 0으로 초기화
	}
	return graph;
}

void AddEdge(Graph *graph, int from, int target) { //간선 생성
	graph->matrix[from][target] = 1; //간선 weight 설정
	graph->matrix[target][from] = 1; //간선 weight 설정
}

void BFS(Graph* graph,int startVertex) {
	int i = 0;
	int size = graph->vertexCount;
	int *queue; // 큐 배열 동적할당 변수
	int *visit; //방문 배열 동적할당 변수
	int rear = 0,front=0;

	queue = (int*)malloc(sizeof(int)*size);
	visit = (int*)malloc(sizeof(int)*(size+1));

	memset(visit, 0, sizeof(int)*(size+1)); //메모리 0으로 초기화


	*(visit + startVertex) = Visited; //시작 정점 방문표시
	printf("%d\n", startVertex);

	queue[rear++] = startVertex; //큐에 시작 정점을 삽입하고 rear 1 증가
	while (front < rear) {
		startVertex = queue[front++];
		for (i = 1; i <= graph->vertexCount; i++) {
			if (graph->matrix[startVertex][i] == 1 && !visit[i]) {//간선이 있는 정점인데, 방문하지 않은경우
				visit[i] = Visited; //방문표시
				printf("%d\n", i);
				queue[rear++] = i;
			}
		}
	}


}

int main() {
	Graph *graph;

	int vertex1, vertex2;

	int vertexSize, edgeSize, startVertex;//정점개수,간선개수,순회 시작 정점번호
	int i;

	scanf("%d %d %d", &vertexSize, &edgeSize, &startVertex);


	graph=CreateGraph(vertexSize); //인접행렬 그래프 생성

	for (i = 0; i < edgeSize; i++) { //두 정점 간선 잇기
		scanf("%d %d", &vertex1, &vertex2);

		AddEdge(graph, vertex1, vertex2); //간선 추가
	}

	BFS(graph, startVertex);


	return 0;
}






```

# 느낀점

- BFS 알고리즘이 재귀적으로 동작하는 DFS 알고리즘보다 구현하는데 있어서 좀 더 복잡한 느낌이다.
- 최단거리를 구하는 문제는 DFS보다는 BFS로 풀어야겠다.

# 참고자료(Reference)

- 문제해결중심으로 알고리즘 (저자:국형준)
- [나무위키-BFS](https://namu.wiki/w/BFS)
- [hackerearth](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/tutorial/)
