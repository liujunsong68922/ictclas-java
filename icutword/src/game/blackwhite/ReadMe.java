package game.blackwhite;

public class ReadMe {
	//黑白棋的游戏规则如下：
	//1.棋盘的大小可以自定义，包括行数，列数
	//2.初始的棋子数量可以自定义，包括黑棋数，白棋数
	//3.初始化规则：随机在棋盘上分配指定数量的黑棋，白棋，如果重复，则原来的被覆盖
	//4.移动规则：各个棋子并发执行
	//5.棋子的计算规则：
	//5.1 如果本棋子周围的所有棋子都是其他颜色的棋子，那么本棋子死亡，线程终止。
	//5.2 如果本棋子周围的所有棋子都已经占完，停止执行。
	//5.3 如果本棋子周围有空白点，那么随机选择其中一个，将此处设置为同种颜色，并增加一个并行线程。
	//6.当棋盘上的棋子数量=棋盘数量时，游戏停止
	//7.打印棋盘的最终结果。
}
