package i2;

import android.content.Context;
import android.util.SparseIntArray;
import f2.C5397g;
import f2.C5398h;
import g2.C5539a;

/* renamed from: i2.K */
/* loaded from: classes.dex */
public final class C5652K {

    /* renamed from: a */
    private final SparseIntArray f31711a;

    /* renamed from: b */
    private C5398h f31712b;

    public C5652K() {
        this(C5397g.getInstance());
    }

    public final int zaa(Context context, int i8) {
        return this.f31711a.get(i8, -1);
    }

    public final int zab(Context context, C5539a.f fVar) {
        AbstractC5683p.checkNotNull(context);
        AbstractC5683p.checkNotNull(fVar);
        int i8 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa == -1) {
            int i9 = 0;
            while (true) {
                if (i9 >= this.f31711a.size()) {
                    i8 = -1;
                    break;
                }
                int iKeyAt = this.f31711a.keyAt(i9);
                if (iKeyAt > minApkVersion && this.f31711a.get(iKeyAt) == 0) {
                    break;
                }
                i9++;
            }
            iZaa = i8 == -1 ? this.f31712b.isGooglePlayServicesAvailable(context, minApkVersion) : i8;
            this.f31711a.put(minApkVersion, iZaa);
        }
        return iZaa;
    }

    public final void zac() {
        this.f31711a.clear();
    }

    public C5652K(C5398h c5398h) {
        this.f31711a = new SparseIntArray();
        AbstractC5683p.checkNotNull(c5398h);
        this.f31712b = c5398h;
    }
}
