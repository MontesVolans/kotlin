// !DIAGNOSTICS: -UNUSED_PARAMETER
// !WITH_NEW_INFERENCE

import kotlin.reflect.KProperty

class A<R>() {
    operator fun <T> getValue(t: Any?, p: KProperty<*>): T = null!!
    operator fun <T> setValue(t: Any?, p: KProperty<*>, x: T) = Unit
}

var a1: Int by <!TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>A<!>()
var a2: Int by A<String>()

class B<R>() {
    operator fun <T> getValue(t: Any?, p: KProperty<*>): T = null!!
    operator fun setValue(t: Any?, p: KProperty<*>, x: R) = Unit
}

var b1: Int by B()
var b2: Int by B<Number>()

class C<R>() {
    operator fun getValue(t: Any?, p: KProperty<*>): R = null!!
    operator fun <T> setValue(t: Any?, p: KProperty<*>, x: T) = Unit
}

var c1: Int by <!NI;DELEGATE_SPECIAL_FUNCTION_RETURN_TYPE_MISMATCH!>C()<!>
var c2: Int by <!NI;DELEGATE_SPECIAL_FUNCTION_RETURN_TYPE_MISMATCH!><!DELEGATE_SPECIAL_FUNCTION_RETURN_TYPE_MISMATCH!>C<Number>()<!><!>
