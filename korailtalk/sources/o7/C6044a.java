package o7;

import android.os.Looper;
import java.util.List;
import n7.F0;
import s7.x;
import s7.y;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6044a implements y {
    @Override // s7.y
    public F0 createDispatcher(List<? extends y> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.asHandler(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // s7.y
    public int getLoadPriority() {
        return x.MAX_CAPACITY_MASK;
    }

    @Override // s7.y
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
