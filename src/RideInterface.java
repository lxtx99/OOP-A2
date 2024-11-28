public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);  // 将游客添加到队列
    void removeVisitorFromQueue(Visitor visitor);  // 从队列中移除游客
    void printQueue();  // 打印队列中的游客
    void runOneCycle();  // 运行骑行一个周期
    void addVisitorToHistory(Visitor visitor);  // 将游客添加到乘车历史
    boolean checkVisitorFromHistory(Visitor visitor);  // 检查游客是否在历史记录中
    int numberOfVisitors();  // 返回乘车历史中的游客数量
    void printRideHistory();  // 打印乘车历史记录
}
