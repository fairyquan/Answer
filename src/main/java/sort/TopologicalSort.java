package sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 拓扑排序
 */
public class TopologicalSort {
	public static int[] visited_dfs;//状态数组，表明每一个结点的状态
	public static int[][] graph;//数据
	public static int num;//结点个数
	public static boolean valid = true;//是否存在闭环
	public void DFS_sort(int[][] a, int num1) {//程序入口
		num = num1;
		graph = a;
		visited_dfs = new int[num];
		//遍历每一个点，因此多个满足条件的结点，下表小的先输出
		for(int i =0;i<num;i++) {
			//表明该点并没有被访问
			if(visited_dfs[i] == 0) {
				//dfs遍历该点
				dfs(i);
			}
		}
			
	}
	private void dfs(int i) {
		//赋值为1 表明该点正在搜索
		visited_dfs[i]= 1 ;
		for(int j=0;j<num;j++) {
			//找到所有指向该节点的节点
			if(graph[j][i]!=0 ) {
				//如果该节点没有被访问
				if(visited_dfs[j]==0) {
                    dfs(j);//需要继续寻找该点的前驱
					if(!valid) {//如果存在闭环，就没必要继续了，直接返回即可
						return;
					}
				}
				//如果是正在访问状态 则说明存在闭环 即不存在
				else if(visited_dfs[j]==1) {

					valid = false;
					return;
				}
				//如果是访问完毕状态 相当于该点与当前结点并无路径指向，因此不需要执行操作
			}
		}
		//进行到这里说明所有指向该节点的都已经完成将该值标记为已经完成状态  可以输出该值
		visited_dfs[i]=2;

	}

	public void BFS_sort(int[][] a, int num1) {
		//统计每一个点的入度
		int[] indeg = new int[num1];
		for(int i=0;i<num1;i++) {
			for(int j=0;j<num1;j++) {
				if(a[i][j] == 1) {
					indeg[j]++;
				}
			}
		}
		//存储入度为零的点
		Queue<Integer> queue = new LinkedList<>();
		//寻找入度为零的点 并放入队列中
		for(int i=0;i<num1;i++) {
			if(indeg[i] == 0) {
				queue.add(i);
			}
		}
		int visitedNum = 0;
		while(!queue.isEmpty()) {
			Integer i = queue.poll();
			visitedNum++;
			for(int j=0;j<num1;j++) {
				if(a[i][j]==1) {
					indeg[j]--;
					if(indeg[j]==0) {
						queue.offer(j);
					}
				}
			}
		}
		if(visitedNum != num1) {
			System.out.println("存在闭环");
		}
	}
}