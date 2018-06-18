package cn.yubajin.interpreter;

public interface ExecutorFactory {
    public abstract Executor createExecutor(String name);
}
