package C0;

import android.os.Trace;

/* loaded from: classes.dex */
abstract class d {
    public static void beginAsyncSection(String str, int i8) {
        Trace.beginAsyncSection(str, i8);
    }

    public static void endAsyncSection(String str, int i8) {
        Trace.endAsyncSection(str, i8);
    }

    public static void setCounter(String str, int i8) {
        Trace.setCounter(str, i8);
    }
}
