// !DIAGNOSTICS: -UNUSED_PARAMETER
// !WITH_NEW_INFERENCE
fun <T> g(x: T) = 1
fun h(x: () -> Unit) = 1

fun foo() {
    <!NI;UNRESOLVED_REFERENCE!><!UNRESOLVED_REFERENCE!>f<!><!>(::<!NI;SYNTAX!><!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!><!><!SYNTAX!><!>)
    <!TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>g<!>(::<!NI;SYNTAX!><!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!><!><!SYNTAX!><!>)
    h(::<!NI;SYNTAX!><!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!><!><!SYNTAX!><!>)
}
