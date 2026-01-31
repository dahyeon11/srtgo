package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Rs */
/* loaded from: classes2.dex */
public final class C1857Rs extends AbstractC1583Lc implements InterfaceC1939Ts {
    C1857Rs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final InterfaceC6172a zze(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, String str, InterfaceC6172a interfaceC6172a3) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a3);
        Parcel parcelB = b(11, parcelA);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzf(InterfaceC6172a interfaceC6172a, C2103Xs c2103Xs, InterfaceC1816Qs interfaceC1816Qs) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, c2103Xs);
        AbstractC1664Nc.zzf(parcelA, interfaceC1816Qs);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzg(C3546lq c3546lq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c3546lq);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzh(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC3091hq);
        c(10, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzi(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC3091hq);
        c(9, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzj(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(8, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzk(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzl(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC3091hq);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzm(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC3091hq);
        c(5, parcelA);
    }
}
