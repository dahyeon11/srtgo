package com.google.android.gms.internal.ads;

import i2.AbstractC5681n;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3776nr extends AbstractBinderC4004pr {

    /* renamed from: a, reason: collision with root package name */
    private final String f21356a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21357b;

    public BinderC3776nr(String str, int i8) {
        this.f21356a = str;
        this.f21357b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC3776nr)) {
            BinderC3776nr binderC3776nr = (BinderC3776nr) obj;
            if (AbstractC5681n.equal(this.f21356a, binderC3776nr.f21356a)) {
                if (AbstractC5681n.equal(Integer.valueOf(this.f21357b), Integer.valueOf(binderC3776nr.f21357b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4004pr, com.google.android.gms.internal.ads.InterfaceC4118qr
    public final int zzb() {
        return this.f21357b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4004pr, com.google.android.gms.internal.ads.InterfaceC4118qr
    public final String zzc() {
        return this.f21356a;
    }
}
