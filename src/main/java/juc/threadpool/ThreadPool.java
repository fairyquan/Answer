package juc.threadpool;


import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    //任务队列
    private BlockingQueue<Runnable> taskQueue;
    //线程集合
    private HashSet<Worker> workers = new HashSet<>();
    //核心线程数
    private int coreSize;
    //获取任务的超时时间
    private long timeout;
    private TimeUnit timeUnit;
    //拒绝策略
    private RejectPolicy<Runnable> rejectPolicy;

    //执行任务
    public void execute(Runnable task) {
        //当任务数没有超过coreSize时，直接交给worker对象执行
        //当任务数超过coreSize时，加入任务队列暂存
        synchronized (workers){
            if (workers.size() < coreSize) {
                Worker worker = new Worker(task);
                System.out.println("新增worker"+worker.getName()+"当前任务："+task);
                workers.add(worker);
                worker.start();
            }else{
                System.out.println(task+"加入任务队列");
                taskQueue.tryPut(rejectPolicy,task);
            }
        }
    }

    public ThreadPool(int coreSize, long timeout, TimeUnit timeUnit, int queueCapacity,RejectPolicy<Runnable> rejectPolicy) {
        this.coreSize = coreSize;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
        this.taskQueue = new BlockingQueue<>(queueCapacity);
        this.rejectPolicy=rejectPolicy;
    }

    class Worker extends Thread {
        private Runnable task;
        public Worker(Runnable task) {
            this.task=task;
        }

        @Override
        public void run() {
            //执行任务
//            while (task!=null || (task=taskQueue.take())!=null){
            while (task!=null || (task=taskQueue.poll(timeout,timeUnit))!=null){
                try {
                    System.out.println(task+"正在被"+this+"执行...");
                    task.run();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    task=null;
                }
            }
            synchronized (workers){
                System.out.println(this+"worker被移除");
                workers.remove(this);
            }
        }
    }
}
