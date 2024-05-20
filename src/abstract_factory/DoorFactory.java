package abstract_factory;

// todo例子没有说明多个产品之间的依赖关系。考虑修改
public interface DoorFactory {
    Door makeDoor();

    DoorFittingExpert makeFittingExpert();
}
