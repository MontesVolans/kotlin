// !CHECK_TYPE
// !WITH_NEW_INFERENCE

// FILE: J.java

import org.jetbrains.annotations.*;

public class J {
    @NotNull
    public static J staticNN;
    @Nullable
    public static J staticN;
    public static J staticJ;
}

// FILE: k.kt

fun test() {
    // @NotNull platform type
    val platformNN = J.staticNN
    // @Nullable platform type
    val platformN = J.staticN
    // platform type with no annotation
    val platformJ = J.staticJ

    checkSubtype<J>(platformNN)
    checkSubtype<J>(<!NI;TYPE_MISMATCH!><!NI;TYPE_MISMATCH!><!TYPE_MISMATCH!>platformN<!><!><!>)
    checkSubtype<J>(platformJ)

    checkSubtype<J?>(platformNN)
    checkSubtype<J?>(platformN)
    checkSubtype<J?>(platformJ)
}
