// !LANGUAGE: +ArrayLiteralsInAnnotations
// !WITH_NEW_INFERENCE

annotation class Foo(
        val a: Array<String> = ["/"],
        val b: Array<String> = [],
        val c: Array<String> = ["1", "2"]
)

annotation class Bar(
        val a: Array<String> = <!TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH!>[<!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!>' '<!>]<!>,
        val b: Array<String> = <!NI;ANNOTATION_PARAMETER_DEFAULT_VALUE_MUST_BE_CONSTANT!><!TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH!><!ANNOTATION_PARAMETER_DEFAULT_VALUE_MUST_BE_CONSTANT!>["", <!NI;EMPTY_CHARACTER_LITERAL!><!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!><!EMPTY_CHARACTER_LITERAL!>''<!><!><!>]<!><!><!>,
        val c: Array<String> = <!TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH!>[<!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!>1<!>]<!>
)

annotation class Base(
        val a0: IntArray = [],
        val a1: IntArray = [1],
        val b1: FloatArray = [1f],
        val b0: FloatArray = []
)

annotation class Err(
        val a: IntArray = [<!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!><!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!><!CONSTANT_EXPECTED_TYPE_MISMATCH!>1L<!><!><!>],
        val b: Array<String> = <!TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH!>[<!NI;CONSTANT_EXPECTED_TYPE_MISMATCH!>1<!>]<!>
)