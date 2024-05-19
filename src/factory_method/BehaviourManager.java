package factory_method;

public class BehaviourManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        // 返回一个行为。
        return new Behaviour();
    }

}
