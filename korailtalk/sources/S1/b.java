package S1;

import android.content.Context;
import com.google.android.gms.internal.ads.GD0;
import com.google.android.gms.internal.ads.XD0;

/* loaded from: classes.dex */
public final class b implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f4602a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f4603b;

    public b(XD0 xd0, XD0 xd02) {
        this.f4602a = xd0;
        this.f4603b = xd02;
    }

    public static b create(XD0 xd0, XD0 xd02) {
        return new b(xd0, xd02);
    }

    public static a newInstance(Context context, L1.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return newInstance((Context) this.f4602a.zzb(), (L1.a) this.f4603b.zzb());
    }
}
