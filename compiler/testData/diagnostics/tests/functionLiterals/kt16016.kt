// !DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_VARIABLE
val la = { <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_ANONYMOUS_PARAMETER!>a<!> -> }
val las = { <!UNUSED_ANONYMOUS_PARAMETER!>a<!>: Int -> }

val larg = { <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_ANONYMOUS_PARAMETER!>a<!> -> }(123)
val twoarg = { <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_ANONYMOUS_PARAMETER!>a<!>, <!UNUSED_ANONYMOUS_PARAMETER!>b<!>: String, <!CANNOT_INFER_PARAMETER_TYPE, UNUSED_ANONYMOUS_PARAMETER!>c<!> -> }(123, "asdf", 123)