package H1;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: H1.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525c1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1663a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1664b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1665c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f1666d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f1667e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1668f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1669g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1670h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f1671i;

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f1672j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f1673k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1674l;

    /* renamed from: m, reason: collision with root package name */
    private final String f1675m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1676n;

    /* renamed from: o, reason: collision with root package name */
    private final long f1677o = System.currentTimeMillis();

    public C0525c1(C0522b1 c0522b1, W1.b bVar) {
        this.f1663a = c0522b1.f1655g;
        this.f1664b = c0522b1.f1656h;
        this.f1665c = Collections.unmodifiableSet(c0522b1.f1649a);
        this.f1666d = c0522b1.f1650b;
        this.f1667e = Collections.unmodifiableMap(c0522b1.f1651c);
        this.f1668f = c0522b1.f1657i;
        this.f1669g = c0522b1.f1658j;
        this.f1670h = c0522b1.f1659k;
        this.f1671i = Collections.unmodifiableSet(c0522b1.f1652d);
        this.f1672j = c0522b1.f1653e;
        this.f1673k = Collections.unmodifiableSet(c0522b1.f1654f);
        this.f1674l = c0522b1.f1660l;
        this.f1675m = c0522b1.f1661m;
        this.f1676n = c0522b1.f1662n;
    }

    public final int zza() {
        return this.f1676n;
    }

    public final int zzb() {
        return this.f1670h;
    }

    public final long zzc() {
        return this.f1677o;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f1666d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.f1672j;
    }

    public final Bundle zzf(Class cls) {
        return this.f1666d.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f1666d;
    }

    @Deprecated
    public final N1.B zzh(Class cls) {
        android.support.v4.media.session.f.a(this.f1667e.get(cls));
        return null;
    }

    public final W1.b zzi() {
        return null;
    }

    public final String zzj() {
        return this.f1675m;
    }

    public final String zzk() {
        return this.f1663a;
    }

    public final String zzl() {
        return this.f1668f;
    }

    public final String zzm() {
        return this.f1669g;
    }

    public final List zzn() {
        return new ArrayList(this.f1664b);
    }

    public final Set zzo() {
        return this.f1673k;
    }

    public final Set zzp() {
        return this.f1665c;
    }

    @Deprecated
    public final boolean zzq() {
        return this.f1674l;
    }

    public final boolean zzr(Context context) {
        y1.x xVarZzc = C0564p1.zzf().zzc();
        C0591z.zzb();
        Set set = this.f1671i;
        String strZzz = L1.g.zzz(context);
        return set.contains(strZzz) || xVarZzc.getTestDeviceIds().contains(strZzz);
    }
}
