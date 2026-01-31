package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4878xX {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23725a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f23726b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f23727c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f23728d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f23729e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f23730f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f23731g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f23732h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f23733i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f23734j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f23735k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f23736l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f23737m;

    /* renamed from: n, reason: collision with root package name */
    private static final String f23738n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f23739o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f23740p;

    /* renamed from: q, reason: collision with root package name */
    private static final String f23741q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f23742r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f23743s;

    @Deprecated
    public static final C4878xX zza;

    @Deprecated
    public static final RG0 zzb;
    public final CharSequence zzc;
    public final Layout.Alignment zzd;
    public final Layout.Alignment zze;
    public final Bitmap zzf;
    public final float zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final int zzk;
    public final float zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;
    public final float zzq;

    static {
        C4649vW c4649vW = new C4649vW();
        c4649vW.zzl("");
        zza = c4649vW.zzp();
        f23725a = Integer.toString(0, 36);
        f23726b = Integer.toString(17, 36);
        f23727c = Integer.toString(1, 36);
        f23728d = Integer.toString(2, 36);
        f23729e = Integer.toString(3, 36);
        f23730f = Integer.toString(18, 36);
        f23731g = Integer.toString(4, 36);
        f23732h = Integer.toString(5, 36);
        f23733i = Integer.toString(6, 36);
        f23734j = Integer.toString(7, 36);
        f23735k = Integer.toString(8, 36);
        f23736l = Integer.toString(9, 36);
        f23737m = Integer.toString(10, 36);
        f23738n = Integer.toString(11, 36);
        f23739o = Integer.toString(12, 36);
        f23740p = Integer.toString(13, 36);
        f23741q = Integer.toString(14, 36);
        f23742r = Integer.toString(15, 36);
        f23743s = Integer.toString(16, 36);
        zzb = new RG0() { // from class: com.google.android.gms.internal.ads.tV
        };
    }

    /* synthetic */ C4878xX(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int i8, int i9, float f9, int i10, int i11, float f10, float f11, float f12, boolean z8, int i12, int i13, float f13, WW ww) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            F10.zzd(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zzc = SpannedString.valueOf(charSequence);
        } else {
            this.zzc = charSequence != null ? charSequence.toString() : null;
        }
        this.zzd = alignment;
        this.zze = alignment2;
        this.zzf = bitmap;
        this.zzg = f8;
        this.zzh = i8;
        this.zzi = i9;
        this.zzj = f9;
        this.zzk = i10;
        this.zzl = f11;
        this.zzm = f12;
        this.zzn = i11;
        this.zzo = f10;
        this.zzp = i13;
        this.zzq = f13;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C4878xX.class == obj.getClass()) {
            C4878xX c4878xX = (C4878xX) obj;
            if (TextUtils.equals(this.zzc, c4878xX.zzc) && this.zzd == c4878xX.zzd && this.zze == c4878xX.zze && ((bitmap = this.zzf) != null ? !((bitmap2 = c4878xX.zzf) == null || !bitmap.sameAs(bitmap2)) : c4878xX.zzf == null) && this.zzg == c4878xX.zzg && this.zzh == c4878xX.zzh && this.zzi == c4878xX.zzi && this.zzj == c4878xX.zzj && this.zzk == c4878xX.zzk && this.zzl == c4878xX.zzl && this.zzm == c4878xX.zzm && this.zzn == c4878xX.zzn && this.zzo == c4878xX.zzo && this.zzp == c4878xX.zzp && this.zzq == c4878xX.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, Float.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Integer.valueOf(this.zzk), Float.valueOf(this.zzl), Float.valueOf(this.zzm), Boolean.FALSE, -16777216, Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp), Float.valueOf(this.zzq)});
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            bundle.putCharSequence(f23725a, charSequence);
            CharSequence charSequence2 = this.zzc;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListZza = AbstractC2255aZ.zza((Spanned) charSequence2);
                if (!arrayListZza.isEmpty()) {
                    bundle.putParcelableArrayList(f23726b, arrayListZza);
                }
            }
        }
        bundle.putSerializable(f23727c, this.zzd);
        bundle.putSerializable(f23728d, this.zze);
        bundle.putFloat(f23731g, this.zzg);
        bundle.putInt(f23732h, this.zzh);
        bundle.putInt(f23733i, this.zzi);
        bundle.putFloat(f23734j, this.zzj);
        bundle.putInt(f23735k, this.zzk);
        bundle.putInt(f23736l, this.zzn);
        bundle.putFloat(f23737m, this.zzo);
        bundle.putFloat(f23738n, this.zzl);
        bundle.putFloat(f23739o, this.zzm);
        bundle.putBoolean(f23741q, false);
        bundle.putInt(f23740p, -16777216);
        bundle.putInt(f23742r, this.zzp);
        bundle.putFloat(f23743s, this.zzq);
        if (this.zzf != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            F10.zzf(this.zzf.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f23730f, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final C4649vW zzb() {
        return new C4649vW(this, null);
    }
}
