package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3518lc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private List f20685i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f20686j;

    public C3518lc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, Context context) {
        super(c1294Eb, "/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", c3357k9, i8, 31);
        this.f20685i = null;
        this.f20686j = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        this.f23265e.zzad(-1L);
        this.f23265e.zzY(-1L);
        Context contextZzb = this.f20686j;
        if (contextZzb == null) {
            contextZzb = this.f23262b.zzb();
        }
        if (this.f20685i == null) {
            this.f20685i = (List) this.f23266f.invoke(null, contextZzb);
        }
        List list = this.f20685i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f23265e) {
            this.f23265e.zzad(((Long) this.f20685i.get(0)).longValue());
            this.f23265e.zzY(((Long) this.f20685i.get(1)).longValue());
        }
    }
}
