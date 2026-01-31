package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.internal.ads.dn */
/* loaded from: classes2.dex */
public final class C2626dn extends C1490It {

    /* renamed from: d */
    private final K1.F f18679d;

    /* renamed from: c */
    private final Object f18678c = new Object();

    /* renamed from: e */
    private boolean f18680e = false;

    /* renamed from: f */
    private int f18681f = 0;

    public C2626dn(K1.F f8) {
        this.f18679d = f8;
    }

    protected final void b() {
        AbstractC0667v0.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.f18678c) {
            try {
                AbstractC0667v0.zza("maybeDestroy: Lock acquired");
                AbstractC5683p.checkState(this.f18681f >= 0);
                if (this.f18680e && this.f18681f == 0) {
                    AbstractC0667v0.zza("No reference is left (including root). Cleaning up engine.");
                    zzj(new C2511cn(this), new C1326Et());
                } else {
                    AbstractC0667v0.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0667v0.zza("maybeDestroy: Lock released");
    }

    protected final void c() {
        AbstractC0667v0.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.f18678c) {
            AbstractC0667v0.zza("releaseOneReference: Lock acquired");
            AbstractC5683p.checkState(this.f18681f > 0);
            AbstractC0667v0.zza("Releasing 1 reference for JS Engine");
            this.f18681f--;
            b();
        }
        AbstractC0667v0.zza("releaseOneReference: Lock released");
    }

    public final C2135Ym zza() {
        C2135Ym c2135Ym = new C2135Ym(this);
        AbstractC0667v0.zza("createNewReference: Trying to acquire lock");
        synchronized (this.f18678c) {
            AbstractC0667v0.zza("createNewReference: Lock acquired");
            zzj(new C2176Zm(this, c2135Ym), new C2282an(this, c2135Ym));
            AbstractC5683p.checkState(this.f18681f >= 0);
            this.f18681f++;
        }
        AbstractC0667v0.zza("createNewReference: Lock released");
        return c2135Ym;
    }

    public final void zzb() {
        AbstractC0667v0.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f18678c) {
            AbstractC0667v0.zza("markAsDestroyable: Lock acquired");
            AbstractC5683p.checkState(this.f18681f >= 0);
            AbstractC0667v0.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f18680e = true;
            b();
        }
        AbstractC0667v0.zza("markAsDestroyable: Lock released");
    }
}
