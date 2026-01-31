package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class Ty0 extends Px0 {

    /* renamed from: a */
    private final Zy0 f16560a;

    /* renamed from: b */
    protected Zy0 f16561b;

    protected Ty0(Zy0 zy0) {
        this.f16560a = zy0;
        if (zy0.T()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16561b = f();
    }

    private Zy0 f() {
        return this.f16560a.A();
    }

    private static void g(Object obj, Object obj2) {
        Zz0.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Px0
    protected /* bridge */ /* synthetic */ Px0 b(Qx0 qx0) {
        h((Zy0) qx0);
        return this;
    }

    protected Ty0 h(Zy0 zy0) {
        zzbj(zy0);
        return this;
    }

    protected final void i() {
        if (this.f16561b.T()) {
            return;
        }
        j();
    }

    protected void j() {
        Zy0 zy0F = f();
        g(zy0F, this.f16561b);
        this.f16561b = zy0F;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ Px0 zzaW(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) throws IOException {
        zzbk(abstractC4816wy0, iy0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ Px0 zzaZ(byte[] bArr, int i8, int i9) throws C4021pz0 {
        zzbl(bArr, i8, i9);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ Px0 zzba(byte[] bArr, int i8, int i9, Iy0 iy0) throws C4021pz0 {
        zzbm(bArr, i8, i9, iy0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0, com.google.android.gms.internal.ads.Oz0
    public /* bridge */ /* synthetic */ Oz0 zzaW(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) throws IOException {
        zzbk(abstractC4816wy0, iy0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public /* bridge */ /* synthetic */ Oz0 zzaZ(byte[] bArr, int i8, int i9) throws C4021pz0 {
        zzbl(bArr, i8, i9);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public /* bridge */ /* synthetic */ Oz0 zzba(byte[] bArr, int i8, int i9, Iy0 iy0) throws C4021pz0 {
        zzbm(bArr, i8, i9, iy0);
        return this;
    }

    public final Ty0 zzbg() {
        if (this.f16560a.T()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16561b = f();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    /* renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Ty0 zzaC() {
        Ty0 ty0ZzcY = zzbt().zzcY();
        ty0ZzcY.f16561b = zzbs();
        return ty0ZzcY;
    }

    public Ty0 zzbj(Zy0 zy0) {
        if (zzbt().equals(zy0)) {
            return this;
        }
        i();
        g(this.f16561b, zy0);
        return this;
    }

    public Ty0 zzbk(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) throws IOException {
        i();
        try {
            Zz0.zza().zzb(this.f16561b.getClass()).zzh(this.f16561b, C4930xy0.zzq(abstractC4816wy0), iy0);
            return this;
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof IOException) {
                throw ((IOException) e8.getCause());
            }
            throw e8;
        }
    }

    public Ty0 zzbl(byte[] bArr, int i8, int i9) throws C4021pz0 {
        zzbm(bArr, i8, i9, Iy0.f13552c);
        return this;
    }

    public Ty0 zzbm(byte[] bArr, int i8, int i9, Iy0 iy0) throws C4021pz0 {
        i();
        try {
            Zz0.zza().zzb(this.f16561b.getClass()).zzi(this.f16561b, bArr, i8, i8 + i9, new Vx0(iy0));
            return this;
        } catch (C4021pz0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw C4021pz0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.Px0, com.google.android.gms.internal.ads.Oz0
    /* renamed from: zzbn */
    public final Zy0 zzbr() {
        Zy0 zy0Zzbs = zzbs();
        if (zy0Zzbs.zzbw()) {
            return zy0Zzbs;
        }
        throw Px0.d(zy0Zzbs);
    }

    @Override // com.google.android.gms.internal.ads.Px0, com.google.android.gms.internal.ads.Oz0
    /* renamed from: zzbo */
    public Zy0 zzbs() {
        if (!this.f16561b.T()) {
            return this.f16561b;
        }
        this.f16561b.w();
        return this.f16561b;
    }

    @Override // com.google.android.gms.internal.ads.Px0, com.google.android.gms.internal.ads.Oz0, com.google.android.gms.internal.ads.Qz0
    /* renamed from: zzbp */
    public Zy0 zzbt() {
        return this.f16560a;
    }

    public /* bridge */ /* synthetic */ Oz0 zzbq() {
        zzbg();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Px0, com.google.android.gms.internal.ads.Oz0, com.google.android.gms.internal.ads.Qz0
    public final boolean zzbw() {
        return Zy0.S(this.f16561b, false);
    }
}
