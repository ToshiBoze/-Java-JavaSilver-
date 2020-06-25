public class A implements C {
    B b = new B();
    A a = b;
    C c = a;
}
class B extends A {}
interface C {}