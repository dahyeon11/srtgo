package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3277jR {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2394bl0 f20252a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20253b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f20254c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private KR f20255d;

    /* renamed from: e, reason: collision with root package name */
    private KR f20256e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20257f;

    public C3277jR(AbstractC2394bl0 abstractC2394bl0) {
        this.f20252a = abstractC2394bl0;
        KR kr2 = KR.zza;
        this.f20255d = kr2;
        this.f20256e = kr2;
        this.f20257f = false;
    }

    private final int a() {
        return this.f20254c.length - 1;
    }

    private final void b(ByteBuffer byteBuffer) {
        boolean z8;
        do {
            int i8 = 0;
            z8 = false;
            while (i8 <= a()) {
                if (!this.f20254c[i8].hasRemaining()) {
                    NS ns = (NS) this.f20253b.get(i8);
                    if (!ns.zzh()) {
                        ByteBuffer byteBuffer2 = i8 > 0 ? this.f20254c[i8 - 1] : byteBuffer.hasRemaining() ? byteBuffer : NS.zza;
                        long jRemaining = byteBuffer2.remaining();
                        ns.zze(byteBuffer2);
                        this.f20254c[i8] = ns.zzb();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z9 = true;
                        if (jRemaining2 <= 0 && !this.f20254c[i8].hasRemaining()) {
                            z9 = false;
                        }
                        z8 |= z9;
                    } else if (!this.f20254c[i8].hasRemaining() && i8 < a()) {
                        ((NS) this.f20253b.get(i8 + 1)).zzd();
                    }
                }
                i8++;
            }
        } while (z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3277jR)) {
            return false;
        }
        C3277jR c3277jR = (C3277jR) obj;
        if (this.f20252a.size() != c3277jR.f20252a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f20252a.size(); i8++) {
            if (this.f20252a.get(i8) != c3277jR.f20252a.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f20252a.hashCode();
    }

    public final KR zza(KR kr2) throws C3620mS {
        if (kr2.equals(KR.zza)) {
            throw new C3620mS("Unhandled input format:", kr2);
        }
        for (int i8 = 0; i8 < this.f20252a.size(); i8++) {
            NS ns = (NS) this.f20252a.get(i8);
            KR krZza = ns.zza(kr2);
            if (ns.zzg()) {
                F10.zzf(!krZza.equals(KR.zza));
                kr2 = krZza;
            }
        }
        this.f20256e = kr2;
        return kr2;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return NS.zza;
        }
        ByteBuffer byteBuffer = this.f20254c[a()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        b(NS.zza);
        return this.f20254c[a()];
    }

    public final void zzc() {
        this.f20253b.clear();
        this.f20255d = this.f20256e;
        this.f20257f = false;
        for (int i8 = 0; i8 < this.f20252a.size(); i8++) {
            NS ns = (NS) this.f20252a.get(i8);
            ns.zzc();
            if (ns.zzg()) {
                this.f20253b.add(ns);
            }
        }
        this.f20254c = new ByteBuffer[this.f20253b.size()];
        for (int i9 = 0; i9 <= a(); i9++) {
            this.f20254c[i9] = ((NS) this.f20253b.get(i9)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.f20257f) {
            return;
        }
        this.f20257f = true;
        ((NS) this.f20253b.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.f20257f) {
            return;
        }
        b(byteBuffer);
    }

    public final void zzf() {
        for (int i8 = 0; i8 < this.f20252a.size(); i8++) {
            NS ns = (NS) this.f20252a.get(i8);
            ns.zzc();
            ns.zzf();
        }
        this.f20254c = new ByteBuffer[0];
        KR kr2 = KR.zza;
        this.f20255d = kr2;
        this.f20256e = kr2;
        this.f20257f = false;
    }

    public final boolean zzg() {
        return this.f20257f && ((NS) this.f20253b.get(a())).zzh() && !this.f20254c[a()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.f20253b.isEmpty();
    }
}
