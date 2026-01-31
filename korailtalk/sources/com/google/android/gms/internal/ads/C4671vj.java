package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.vj */
/* loaded from: classes2.dex */
public final class C4671vj extends AbstractC1583Lc implements InterfaceC4899xj {
    C4671vj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final H1.V0 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC2168Zi zzf() {
        InterfaceC2168Zi c2086Xi;
        Parcel parcelB = b(16, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2086Xi = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c2086Xi = iInterfaceQueryLocalInterface instanceof InterfaceC2168Zi ? (InterfaceC2168Zi) iInterfaceQueryLocalInterface : new C2086Xi(strongBinder);
        }
        parcelB.recycle();
        return c2086Xi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC2503cj zzg(String str) {
        InterfaceC2503cj c2274aj;
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(2, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2274aj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c2274aj = iInterfaceQueryLocalInterface instanceof InterfaceC2503cj ? (InterfaceC2503cj) iInterfaceQueryLocalInterface : new C2274aj(strongBinder);
        }
        parcelB.recycle();
        return c2274aj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final InterfaceC6172a zzh() {
        Parcel parcelB = b(9, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final String zzi() {
        Parcel parcelB = b(4, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final String zzj(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(1, parcelA);
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final List zzk() {
        Parcel parcelB = b(3, a());
        ArrayList<String> arrayListCreateStringArrayList = parcelB.createStringArrayList();
        parcelB.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzl() {
        c(8, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzm() {
        c(15, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzn(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzo() {
        c(6, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final void zzp(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(14, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzq() {
        Parcel parcelB = b(12, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzr(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        Parcel parcelB = b(17, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzs(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        Parcel parcelB = b(10, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4899xj
    public final boolean zzt() {
        Parcel parcelB = b(13, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
