package strategy;
//策略模式和函数式编程是一致的。都是控制反转，有第三方根据需要来实现算法，只好符合算法签名即可。。
public interface SortStrategy {
    void sort(int[] array);
}
