package K1;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: K1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628b0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f2803a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f2804b = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.f2803a.get(num);
    }
}
