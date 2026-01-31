package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.pT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3963pT implements NS {

    /* renamed from: a, reason: collision with root package name */
    protected KR f21766a;

    /* renamed from: b, reason: collision with root package name */
    protected KR f21767b;

    /* renamed from: c, reason: collision with root package name */
    private KR f21768c;

    /* renamed from: d, reason: collision with root package name */
    private KR f21769d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f21770e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f21771f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21772g;

    public AbstractC3963pT() {
        ByteBuffer byteBuffer = NS.zza;
        this.f21770e = byteBuffer;
        this.f21771f = byteBuffer;
        KR kr2 = KR.zza;
        this.f21768c = kr2;
        this.f21769d = kr2;
        this.f21766a = kr2;
        this.f21767b = kr2;
    }

    protected final ByteBuffer a(int i8) {
        if (this.f21770e.capacity() < i8) {
            this.f21770e = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        } else {
            this.f21770e.clear();
        }
        ByteBuffer byteBuffer = this.f21770e;
        this.f21771f = byteBuffer;
        return byteBuffer;
    }

    protected final boolean b() {
        return this.f21771f.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final KR zza(KR kr2) {
        this.f21768c = kr2;
        this.f21769d = zzi(kr2);
        return zzg() ? this.f21769d : KR.zza;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f21771f;
        this.f21771f = NS.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzc() {
        this.f21771f = NS.zza;
        this.f21772g = false;
        this.f21766a = this.f21768c;
        this.f21767b = this.f21769d;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzd() {
        this.f21772g = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.NS
    public abstract /* synthetic */ void zze(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzf() {
        zzc();
        this.f21770e = NS.zza;
        KR kr2 = KR.zza;
        this.f21768c = kr2;
        this.f21769d = kr2;
        this.f21766a = kr2;
        this.f21767b = kr2;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.NS
    public boolean zzg() {
        return this.f21769d != KR.zza;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public boolean zzh() {
        return this.f21772g && this.f21771f == NS.zza;
    }

    protected KR zzi(KR kr2) {
        throw null;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }
}
