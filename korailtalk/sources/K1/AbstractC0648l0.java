package K1;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.C4116qq;
import java.util.concurrent.Callable;

/* renamed from: K1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0648l0 {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            L1.n.zzh("Unexpected exception.", th);
            C4116qq.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
