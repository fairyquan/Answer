package juc.threadpool;

public interface RejectPolicy<T> {
    void reject(BlockingQueue<T> queue,T task);
}
