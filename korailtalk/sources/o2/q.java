package o2;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class q {
    @Deprecated
    public static void publishWorldReadableSharedPreferences(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
