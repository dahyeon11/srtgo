package com.google.android.gms.ads.internal.overlay;

import G1.k;
import H1.C;
import H1.InterfaceC0517a;
import J1.InterfaceC0619b;
import J1.j;
import J1.w;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.DJ;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;
import com.google.android.gms.internal.ads.InterfaceC3990pk;
import com.google.android.gms.internal.ads.InterfaceC4217rk;
import com.google.android.gms.internal.ads.MF;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import r2.InterfaceC6172a;
import r2.b;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();
    public final j zza;
    public final InterfaceC0517a zzb;
    public final w zzc;
    public final InterfaceC2065Wv zzd;
    public final InterfaceC4217rk zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final InterfaceC0619b zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final L1.a zzm;
    public final String zzn;
    public final k zzo;
    public final InterfaceC3990pk zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final MF zzt;
    public final DJ zzu;
    public final InterfaceC1568Kp zzv;
    public final boolean zzw;

    public AdOverlayInfoParcel(InterfaceC0517a interfaceC0517a, w wVar, InterfaceC3990pk interfaceC3990pk, InterfaceC4217rk interfaceC4217rk, InterfaceC0619b interfaceC0619b, InterfaceC2065Wv interfaceC2065Wv, boolean z8, int i8, String str, L1.a aVar, DJ dj, InterfaceC1568Kp interfaceC1568Kp, boolean z9) {
        this.zza = null;
        this.zzb = interfaceC0517a;
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzp = interfaceC3990pk;
        this.zze = interfaceC4217rk;
        this.zzf = null;
        this.zzg = z8;
        this.zzh = null;
        this.zzi = interfaceC0619b;
        this.zzj = i8;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = aVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = dj;
        this.zzv = interfaceC1568Kp;
        this.zzw = z9;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        j jVar = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 2, jVar, i8, false);
        AbstractC5816c.writeIBinder(parcel, 3, b.wrap(this.zzb).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 4, b.wrap(this.zzc).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 5, b.wrap(this.zzd).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 6, b.wrap(this.zze).asBinder(), false);
        AbstractC5816c.writeString(parcel, 7, this.zzf, false);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzg);
        AbstractC5816c.writeString(parcel, 9, this.zzh, false);
        AbstractC5816c.writeIBinder(parcel, 10, b.wrap(this.zzi).asBinder(), false);
        AbstractC5816c.writeInt(parcel, 11, this.zzj);
        AbstractC5816c.writeInt(parcel, 12, this.zzk);
        AbstractC5816c.writeString(parcel, 13, this.zzl, false);
        AbstractC5816c.writeParcelable(parcel, 14, this.zzm, i8, false);
        AbstractC5816c.writeString(parcel, 16, this.zzn, false);
        AbstractC5816c.writeParcelable(parcel, 17, this.zzo, i8, false);
        AbstractC5816c.writeIBinder(parcel, 18, b.wrap(this.zzp).asBinder(), false);
        AbstractC5816c.writeString(parcel, 19, this.zzq, false);
        AbstractC5816c.writeString(parcel, 24, this.zzr, false);
        AbstractC5816c.writeString(parcel, 25, this.zzs, false);
        AbstractC5816c.writeIBinder(parcel, 26, b.wrap(this.zzt).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 27, b.wrap(this.zzu).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 28, b.wrap(this.zzv).asBinder(), false);
        AbstractC5816c.writeBoolean(parcel, 29, this.zzw);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AdOverlayInfoParcel(InterfaceC0517a interfaceC0517a, w wVar, InterfaceC3990pk interfaceC3990pk, InterfaceC4217rk interfaceC4217rk, InterfaceC0619b interfaceC0619b, InterfaceC2065Wv interfaceC2065Wv, boolean z8, int i8, String str, String str2, L1.a aVar, DJ dj, InterfaceC1568Kp interfaceC1568Kp) {
        this.zza = null;
        this.zzb = interfaceC0517a;
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzp = interfaceC3990pk;
        this.zze = interfaceC4217rk;
        this.zzf = str2;
        this.zzg = z8;
        this.zzh = str;
        this.zzi = interfaceC0619b;
        this.zzj = i8;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = aVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = dj;
        this.zzv = interfaceC1568Kp;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(InterfaceC0517a interfaceC0517a, w wVar, InterfaceC0619b interfaceC0619b, InterfaceC2065Wv interfaceC2065Wv, int i8, L1.a aVar, String str, k kVar, String str2, String str3, String str4, MF mf, InterfaceC1568Kp interfaceC1568Kp) {
        this.zza = null;
        this.zzb = null;
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzaJ)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i8;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = aVar;
        this.zzn = str;
        this.zzo = kVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = mf;
        this.zzu = null;
        this.zzv = interfaceC1568Kp;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(InterfaceC0517a interfaceC0517a, w wVar, InterfaceC0619b interfaceC0619b, InterfaceC2065Wv interfaceC2065Wv, boolean z8, int i8, L1.a aVar, DJ dj, InterfaceC1568Kp interfaceC1568Kp) {
        this.zza = null;
        this.zzb = interfaceC0517a;
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z8;
        this.zzh = null;
        this.zzi = interfaceC0619b;
        this.zzj = i8;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = aVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = dj;
        this.zzv = interfaceC1568Kp;
        this.zzw = false;
    }

    AdOverlayInfoParcel(j jVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z8, String str2, IBinder iBinder5, int i8, int i9, String str3, L1.a aVar, String str4, k kVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z9) {
        this.zza = jVar;
        this.zzb = (InterfaceC0517a) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder));
        this.zzc = (w) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder2));
        this.zzd = (InterfaceC2065Wv) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder3));
        this.zzp = (InterfaceC3990pk) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder6));
        this.zze = (InterfaceC4217rk) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z8;
        this.zzh = str2;
        this.zzi = (InterfaceC0619b) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder5));
        this.zzj = i8;
        this.zzk = i9;
        this.zzl = str3;
        this.zzm = aVar;
        this.zzn = str4;
        this.zzo = kVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (MF) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder7));
        this.zzu = (DJ) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder8));
        this.zzv = (InterfaceC1568Kp) b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder9));
        this.zzw = z9;
    }

    public AdOverlayInfoParcel(j jVar, InterfaceC0517a interfaceC0517a, w wVar, InterfaceC0619b interfaceC0619b, L1.a aVar, InterfaceC2065Wv interfaceC2065Wv, DJ dj) {
        this.zza = jVar;
        this.zzb = interfaceC0517a;
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = interfaceC0619b;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = aVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = dj;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(w wVar, InterfaceC2065Wv interfaceC2065Wv, int i8, L1.a aVar) {
        this.zzc = wVar;
        this.zzd = interfaceC2065Wv;
        this.zzj = 1;
        this.zzm = aVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(InterfaceC2065Wv interfaceC2065Wv, L1.a aVar, String str, String str2, int i8, InterfaceC1568Kp interfaceC1568Kp) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = interfaceC2065Wv;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = aVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = interfaceC1568Kp;
        this.zzw = false;
    }
}
