package pattern.behavior.observer;

interface Observable{
    //添加观察者
    void addObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //发布推送消息
    void notify(String message);
}