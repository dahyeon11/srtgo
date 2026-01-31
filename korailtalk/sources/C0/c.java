package C0;

import android.os.Trace;

/* loaded from: classes.dex */
abstract class c {
    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
