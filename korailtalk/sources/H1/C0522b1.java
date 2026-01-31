package H1;

import android.os.Bundle;
import android.text.TextUtils;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: H1.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522b1 {

    /* renamed from: g, reason: collision with root package name */
    private String f1655g;

    /* renamed from: i, reason: collision with root package name */
    private String f1657i;

    /* renamed from: j, reason: collision with root package name */
    private String f1658j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1660l;

    /* renamed from: m, reason: collision with root package name */
    private String f1661m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f1649a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f1650b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f1651c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f1652d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f1653e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f1654f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f1656h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f1659k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f1662n = 60000;

    public final void zzA(String str) {
        this.f1657i = str;
    }

    public final void zzB(String str) {
        this.f1658j = str;
    }

    @Deprecated
    public final void zzC(boolean z8) {
        this.f1659k = z8 ? 1 : 0;
    }

    public final void zzn(String str) {
        this.f1654f.add(str);
    }

    public final void zzo(Class cls, Bundle bundle) {
        if (this.f1650b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f1650b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.f1650b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        AbstractC5683p.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzp(String str, String str2) {
        this.f1653e.putString(str, str2);
    }

    public final void zzq(String str) {
        this.f1649a.add(str);
    }

    public final void zzr(Class cls, Bundle bundle) {
        this.f1650b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzs(N1.B b9) {
        this.f1651c.put(b9.getClass(), b9);
    }

    public final void zzt(String str) {
        this.f1652d.add(str);
    }

    public final void zzu(String str) {
        this.f1652d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(String str) {
        this.f1661m = str;
    }

    public final void zzw(String str) {
        this.f1655g = str;
    }

    public final void zzx(int i8) {
        this.f1662n = i8;
    }

    @Deprecated
    public final void zzy(boolean z8) {
        this.f1660l = z8;
    }

    public final void zzz(List list) {
        this.f1656h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                L1.n.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f1656h.add(str);
            }
        }
    }
}
