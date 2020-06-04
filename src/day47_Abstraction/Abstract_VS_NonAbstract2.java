package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method2(){ }
}

public class Abstract_VS_NonAbstract2 extends A {  // MANDATORY to override the abstract method of A
    // 2 methods
    @Override
    public void method1(){ }

}

abstract class B extends A{  // optional to override the abstract method of A
    // one abstract & one instance method
}

class C extends B {   // to compile, should override
    public void method1(){ }
}
