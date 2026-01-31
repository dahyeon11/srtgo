package f1;

import T0.AbstractC0786c;
import T0.w;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f30506a = new HashSet();

    @Override // T0.w
    public void debug(String str) {
        debug(str, null);
    }

    @Override // T0.w
    public void error(String str, Throwable th) {
        boolean z8 = AbstractC0786c.DBG;
    }

    @Override // T0.w
    public void warning(String str) {
        warning(str, null);
    }

    @Override // T0.w
    public void debug(String str, Throwable th) {
        boolean z8 = AbstractC0786c.DBG;
    }

    @Override // T0.w
    public void warning(String str, Throwable th) {
        Set set = f30506a;
        if (set.contains(str)) {
            return;
        }
        Log.w(AbstractC0786c.TAG, str, th);
        set.add(str);
    }
}
