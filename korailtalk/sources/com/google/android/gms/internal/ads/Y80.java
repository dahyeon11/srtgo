package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Y80 implements InterfaceC3358k90 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2797fF f17339a;

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC2797fF zzd() {
        return this.f17339a;
    }

    public final synchronized com.google.common.util.concurrent.C zzb(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, InterfaceC2797fF interfaceC2797fF) {
        HD hdZzb;
        try {
            if (interfaceC2797fF != null) {
                this.f17339a = interfaceC2797fF;
            } else {
                this.f17339a = (InterfaceC2797fF) interfaceC3244j90.zza(c3472l90.zzb).zzh();
            }
            hdZzb = this.f17339a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return hdZzb.zzi(hdZzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zzc(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, Object obj) {
        return zzb(c3472l90, interfaceC3244j90, null);
    }
}
