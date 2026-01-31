package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Dv0 implements Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12711a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f12712b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f12713c;

    /* renamed from: d, reason: collision with root package name */
    private NB0 f12714d;

    protected Dv0(boolean z8) {
        this.f12711a = z8;
    }

    protected final void a() {
        NB0 nb0 = this.f12714d;
        int i8 = AbstractC2281am0.zza;
        for (int i9 = 0; i9 < this.f12713c; i9++) {
            ((InterfaceC4279sE0) this.f12712b.get(i9)).zzb(this, nb0, this.f12711a);
        }
        this.f12714d = null;
    }

    protected final void b(NB0 nb0) {
        for (int i8 = 0; i8 < this.f12713c; i8++) {
            ((InterfaceC4279sE0) this.f12712b.get(i8)).zzc(this, nb0, this.f12711a);
        }
    }

    protected final void c(NB0 nb0) {
        this.f12714d = nb0;
        for (int i8 = 0; i8 < this.f12713c; i8++) {
            ((InterfaceC4279sE0) this.f12712b.get(i8)).zzd(this, nb0, this.f12711a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public abstract /* synthetic */ int zza(byte[] bArr, int i8, int i9);

    @Override // com.google.android.gms.internal.ads.Ky0
    public abstract /* synthetic */ long zzb(NB0 nb0);

    @Override // com.google.android.gms.internal.ads.Ky0
    public abstract /* synthetic */ Uri zzc();

    @Override // com.google.android.gms.internal.ads.Ky0
    public abstract /* synthetic */ void zzd();

    @Override // com.google.android.gms.internal.ads.Ky0
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
        interfaceC4279sE0.getClass();
        if (this.f12712b.contains(interfaceC4279sE0)) {
            return;
        }
        this.f12712b.add(interfaceC4279sE0);
        this.f12713c++;
    }

    protected final void zzg(int i8) {
        NB0 nb0 = this.f12714d;
        int i9 = AbstractC2281am0.zza;
        for (int i10 = 0; i10 < this.f12713c; i10++) {
            ((InterfaceC4279sE0) this.f12712b.get(i10)).zza(this, nb0, this.f12711a, i8);
        }
    }
}
