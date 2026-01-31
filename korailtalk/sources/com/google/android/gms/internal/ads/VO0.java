package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class VO0 {

    /* renamed from: a, reason: collision with root package name */
    private UO0 f16849a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2589dP0 f16850b;

    protected final InterfaceC2589dP0 a() {
        InterfaceC2589dP0 interfaceC2589dP0 = this.f16850b;
        F10.zzb(interfaceC2589dP0);
        return interfaceC2589dP0;
    }

    protected final void b() {
        UO0 uo0 = this.f16849a;
        if (uo0 != null) {
            uo0.zzj();
        }
    }

    public FG0 zze() {
        throw null;
    }

    public void zzj() {
        this.f16849a = null;
        this.f16850b = null;
    }

    public void zzk(C3940pF0 c3940pF0) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract WO0 zzp(GG0[] gg0Arr, SN0 sn0, NM0 nm0, RG rg);

    public abstract void zzq(Object obj);

    public final void zzs(UO0 uo0, InterfaceC2589dP0 interfaceC2589dP0) {
        this.f16849a = uo0;
        this.f16850b = interfaceC2589dP0;
    }
}
