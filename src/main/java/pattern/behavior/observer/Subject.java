package pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

//具体的被观察者
class Subject implements Observable{
    //观察者列表
    private List<Observer> list=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:list){
            observer.update(message);
        }
    }
}