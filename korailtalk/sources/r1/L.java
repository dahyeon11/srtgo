package R1;

import Q7.C0709m;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.QQ;
import y1.EnumC6522c;

/* loaded from: classes.dex */
public final class L extends T1.b {

    /* renamed from: a, reason: collision with root package name */
    private final K f4309a;

    /* renamed from: b, reason: collision with root package name */
    private final QQ f4310b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4311c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4312d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4313e = G1.u.zzB().currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f4314f;

    public L(K k8, boolean z8, int i8, Boolean bool, QQ qq) {
        this.f4309a = k8;
        this.f4311c = z8;
        this.f4312d = i8;
        this.f4314f = bool;
        this.f4310b = qq;
    }

    private static long a() {
        return G1.u.zzB().currentTimeMillis() + ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
    }

    private final long b() {
        return G1.u.zzB().currentTimeMillis() - this.f4313e;
    }

    @Override // T1.b
    public final void onFailure(String str) {
        W.zzd(this.f4310b, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", EnumC6522c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C0709m.TRUE), new Pair("lat_ms", Long.toString(b())), new Pair("sgpc_rn", Integer.toString(this.f4312d)), new Pair("sgpc_lsu", String.valueOf(this.f4314f)), new Pair("tpc", true != this.f4311c ? "0" : "1"));
        this.f4309a.e(this.f4311c, new M(null, str, a(), this.f4312d));
    }

    @Override // T1.b
    public final void onSuccess(T1.a aVar) {
        W.zzd(this.f4310b, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", EnumC6522c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C0709m.TRUE), new Pair("lat_ms", Long.toString(b())), new Pair("sgpc_rn", Integer.toString(this.f4312d)), new Pair("sgpc_lsu", String.valueOf(this.f4314f)), new Pair("tpc", true != this.f4311c ? "0" : "1"));
        this.f4309a.e(this.f4311c, new M(aVar, "", a(), this.f4312d));
    }
}
