package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1436Hk0 extends AbstractC4218rk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13355a;

    /* renamed from: b, reason: collision with root package name */
    private int f13356b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1518Jk0 f13357c;

    C1436Hk0(C1518Jk0 c1518Jk0, int i8) {
        this.f13357c = c1518Jk0;
        this.f13355a = C1518Jk0.j(c1518Jk0, i8);
        this.f13356b = i8;
    }

    private final void a() {
        int i8 = this.f13356b;
        if (i8 == -1 || i8 >= this.f13357c.size() || !AbstractC4672vj0.zza(this.f13355a, C1518Jk0.j(this.f13357c, this.f13356b))) {
            this.f13356b = this.f13357c.z(this.f13355a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object getKey() {
        return this.f13355a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object getValue() {
        Map mapO = this.f13357c.o();
        if (mapO != null) {
            return mapO.get(this.f13355a);
        }
        a();
        int i8 = this.f13356b;
        if (i8 == -1) {
            return null;
        }
        return C1518Jk0.m(this.f13357c, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapO = this.f13357c.o();
        if (mapO != null) {
            return mapO.put(this.f13355a, obj);
        }
        a();
        int i8 = this.f13356b;
        if (i8 == -1) {
            this.f13357c.put(this.f13355a, obj);
            return null;
        }
        C1518Jk0 c1518Jk0 = this.f13357c;
        Object objM = C1518Jk0.m(c1518Jk0, i8);
        C1518Jk0.q(c1518Jk0, this.f13356b, obj);
        return objM;
    }
}
