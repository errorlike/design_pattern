package factory_method;

public abstract class HiringManager {
    //todo 修改一下interface的名称，interface是行为的封装，如果命名成interviewer，感觉上会是一个对象。
    // 所有的负责招聘的人员都有通用的一些行为，比如说进行面试。
    // 这些行为被抽取到同一个父类中来避免重复。
    //inteviewer这个接口实际上是为了包装askQustion的这个行为。
    // 所有的招聘经理都有着askQustion的这个行为，但是父类并不知道具体的子类行为。每个子类有不同的问题。
    abstract protected Interviewer makeInterviewer();
    // 进行面试依赖于askQuestion()。
    public void takeInterview() {
        System.out.println(makeInterviewer().askQuestion());
    };
}
