package factory_method;

public class Behaviour implements Interviewer {

    @Override
    public String askQuestion() {
        return "一些行为面试的问题";
    }

}
