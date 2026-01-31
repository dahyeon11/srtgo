package R1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final T1.a f4315a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4316b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4317c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4318d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4319e = new AtomicBoolean(false);

    public M(T1.a aVar, String str, long j8, int i8) {
        this.f4315a = aVar;
        this.f4316b = str;
        this.f4317c = j8;
        this.f4318d = i8;
    }

    public final int zza() {
        return this.f4318d;
    }

    public final T1.a zzb() {
        return this.f4315a;
    }

    public final String zzc() {
        return this.f4316b;
    }

    public final void zzd() {
        this.f4319e.set(true);
    }

    public final boolean zze() {
        return this.f4317c <= G1.u.zzB().currentTimeMillis();
    }

    public final boolean zzf() {
        return this.f4319e.get();
    }
}
