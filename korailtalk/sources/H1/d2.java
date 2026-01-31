package H1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import y1.C6528i;

/* loaded from: classes.dex */
public final class d2 extends AbstractC5814a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final d2[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public d2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int b(DisplayMetrics displayMetrics) {
        int i8 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i8 <= 400) {
            return 32;
        }
        return i8 <= 720 ? 50 : 90;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (b(displayMetrics) * displayMetrics.density);
    }

    public static d2 zzb() {
        return new d2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static d2 zzc() {
        return new d2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static d2 zzd() {
        return new d2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static d2 zze() {
        return new d2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, str, false);
        AbstractC5816c.writeInt(parcel, 3, this.zzb);
        AbstractC5816c.writeInt(parcel, 4, this.zzc);
        AbstractC5816c.writeBoolean(parcel, 5, this.zzd);
        AbstractC5816c.writeInt(parcel, 6, this.zze);
        AbstractC5816c.writeInt(parcel, 7, this.zzf);
        AbstractC5816c.writeTypedArray(parcel, 8, this.zzg, i8, false);
        AbstractC5816c.writeBoolean(parcel, 9, this.zzh);
        AbstractC5816c.writeBoolean(parcel, 10, this.zzi);
        AbstractC5816c.writeBoolean(parcel, 11, this.zzj);
        AbstractC5816c.writeBoolean(parcel, 12, this.zzk);
        AbstractC5816c.writeBoolean(parcel, 13, this.zzl);
        AbstractC5816c.writeBoolean(parcel, 14, this.zzm);
        AbstractC5816c.writeBoolean(parcel, 15, this.zzn);
        AbstractC5816c.writeBoolean(parcel, 16, this.zzo);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public d2(Context context, C6528i c6528i) {
        this(context, new C6528i[]{c6528i});
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d2(android.content.Context r13, y1.C6528i[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.d2.<init>(android.content.Context, y1.i[]):void");
    }

    d2(String str, int i8, int i9, boolean z8, int i10, int i11, d2[] d2VarArr, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.zza = str;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = z8;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = d2VarArr;
        this.zzh = z9;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = z12;
        this.zzl = z13;
        this.zzm = z14;
        this.zzn = z15;
        this.zzo = z16;
    }
}
