package kosta.algorithm;

import java.util.Scanner;

public class DfsExam2 {

	static int T;
	static int N, M;
	static int Answer;
	static int MAT[][] = new int[11][11];
	static int visited[] = new int[11];
	
	public static void dfs(int idx, int cost, int cnt) { //DFS 탐색(출발지, 비용(누적된 비용값, 최소값), 현재까지 방문한 도시의 수)
		//종료조건(모든 도시를 방문했을 때)
		//시작점으로 돌아갈 길이 있는 경우만
		if(cnt == N) {
			if(MAT[idx][M] != 0) {	
				//기존 답보다 새로운 비용이 더 적은 경우
				if(Answer == -1 || Answer > cost + MAT[idx][M]) {
				 Answer = cost + MAT[idx][M];	
				}
			}
			System.out.println();
		} else { //탐색조건			
			//방문한 적이 없고, 길이 있는 도시만 검색
			for(int i = 1; i <= N; i++) {			
				if(visited[i] == 0 && MAT[idx][i] != 0) {
				   //가지치기 (기존 정답보다 누적비용이 적은 경우 탐색 필요)
					if(Answer == -1 || Answer > cost+ MAT[idx][i]) {
					visited[i] = 1; 				  			   
				   dfs(i, cost+ MAT[idx][i], cnt+1);
				   visited[i] = 0;
				   }		
				}
			}
		
		}
	}
		
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); //도시 수
			M = sc.nextInt(); // 출발도시
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					MAT[i][j] = 0;
				}
			}
			for(int i = 1; i <= N; i++) {
				visited[i] = 0;
			}
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					MAT[i][j] = sc.nextInt();
				}
			}
			
			visited[M] = 1;
			Answer = -1;
			//DFS 탐색(위치, 비용(누적된 비용값, 최소값), 현재까지 방문한 도시의 수)
			dfs(M, 0, 1);
			System.out.println("#" + test_case + " " + Answer);
		}
	}

}
