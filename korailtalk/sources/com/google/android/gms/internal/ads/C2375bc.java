package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2375bc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final Map f18161i;

    /* renamed from: j, reason: collision with root package name */
    private final View f18162j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f18163k;

    public C2375bc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, Map map, View view, Context context) {
        super(c1294Eb, "SKSJAjN3UKeguXyEasCGg04d/yJuUN8XZYgactMp4rfMtHcIJcD0mydl5RKvI49M", "lnMUlT0qopStslq/RfZHkyvg0xAUTVuMPsMot4SEaYA=", c3357k9, i8, 85);
        this.f18161i = map;
        this.f18162j = view;
        this.f18163k = context;
    }

    private final long b(int i8) {
        Map map = this.f18161i;
        Integer numValueOf = Integer.valueOf(i8);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f18161i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        long[] jArr = {b(1), b(2)};
        Context contextZzb = this.f18163k;
        if (contextZzb == null) {
            contextZzb = this.f23262b.zzb();
        }
        long[] jArr2 = (long[]) this.f23266f.invoke(null, jArr, contextZzb, this.f18162j);
        long j8 = jArr2[0];
        this.f18161i.put(1, Long.valueOf(jArr2[1]));
        long j9 = jArr2[2];
        this.f18161i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f23265e) {
            this.f23265e.zzx(j8);
            this.f23265e.zzw(j9);
        }
    }
}
