// !DIAGNOSTICS: -UNUSED_PARAMETER
// !CHECK_TYPE
// !WITH_NEW_INFERENCE
// FILE: A.java

public class A<E> {
    public <T extends E, Q> A(E x, java.util.List<E> y) {}
}

// FILE: main.kt

// TODO: It's effectively impossible to perform super call to such constructor
// if there is not enough information to infer corresponding arguments
// May be we could add some special syntax for such arguments
class B1(x: List<String>) : A<CharSequence>("", x)
class B2(x: List<Int>) : A<CharSequence>("", <!TYPE_MISMATCH!>x<!>)

class C : A<CharSequence> {
    constructor(x: List<String>) : super("", x)
    constructor(x: List<Int>, y: Int) : super("", <!TYPE_MISMATCH!>x<!>)
}
