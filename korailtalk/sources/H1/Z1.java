package H1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import y1.x;

/* loaded from: classes.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f1634a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f1635b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f1636c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f1637d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f1638e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f1639f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f1640g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f1641h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f1642i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f1643j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f1644k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f1645l = x.b.DEFAULT.getValue();

    /* renamed from: m, reason: collision with root package name */
    private long f1646m = 0;

    public final Y1 zza() {
        Bundle bundle = this.f1638e;
        Bundle bundle2 = this.f1634a;
        Bundle bundle3 = this.f1639f;
        return new Y1(8, -1L, bundle2, -1, this.f1635b, this.f1636c, this.f1637d, false, null, null, null, null, bundle, bundle3, this.f1640g, null, null, false, null, this.f1641h, this.f1642i, this.f1643j, this.f1644k, null, this.f1645l, this.f1646m);
    }

    public final Z1 zzb(Bundle bundle) {
        this.f1634a = bundle;
        return this;
    }

    public final Z1 zzc(int i8) {
        this.f1644k = i8;
        return this;
    }

    public final Z1 zzd(boolean z8) {
        this.f1636c = z8;
        return this;
    }

    public final Z1 zze(List list) {
        this.f1635b = list;
        return this;
    }

    public final Z1 zzf(String str) {
        this.f1642i = str;
        return this;
    }

    public final Z1 zzg(long j8) {
        this.f1646m = j8;
        return this;
    }

    public final Z1 zzh(int i8) {
        this.f1637d = i8;
        return this;
    }

    public final Z1 zzi(int i8) {
        this.f1641h = i8;
        return this;
    }
}
