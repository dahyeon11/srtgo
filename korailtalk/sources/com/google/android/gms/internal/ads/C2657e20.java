package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.internal.ads.e20 */
/* loaded from: classes2.dex */
public final class C2657e20 implements N50 {

    /* renamed from: a */
    private final N50 f18720a;

    /* renamed from: b */
    private final C1825Ra0 f18721b;

    /* renamed from: c */
    private final Context f18722c;

    /* renamed from: d */
    private final C3666mt f18723d;

    public C2657e20(C2545d30 c2545d30, C1825Ra0 c1825Ra0, Context context, C3666mt c3666mt) {
        this.f18720a = c2545d30;
        this.f18721b = c1825Ra0;
        this.f18722c = context;
        this.f18723d = c3666mt;
    }

    final /* synthetic */ C2772f20 a(T50 t50) {
        String str;
        boolean z8;
        String strZzm;
        float f8;
        int i8;
        int i9;
        int i10;
        DisplayMetrics displayMetrics;
        H1.d2 d2Var = this.f18721b.zze;
        H1.d2[] d2VarArr = d2Var.zzg;
        if (d2VarArr != null) {
            str = null;
            boolean z9 = false;
            boolean z10 = false;
            z8 = false;
            for (H1.d2 d2Var2 : d2VarArr) {
                boolean z11 = d2Var2.zzi;
                if (!z11 && !z9) {
                    str = d2Var2.zza;
                    z9 = true;
                }
                if (z11) {
                    if (z10) {
                        z10 = true;
                    } else {
                        z10 = true;
                        z8 = true;
                    }
                }
                if (z9 && z10) {
                    break;
                }
            }
        } else {
            str = d2Var.zza;
            z8 = d2Var.zzi;
        }
        Resources resources = this.f18722c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            f8 = 0.0f;
            i8 = 0;
            i9 = 0;
        } else {
            C3666mt c3666mt = this.f18723d;
            f8 = displayMetrics.density;
            i9 = displayMetrics.widthPixels;
            i8 = displayMetrics.heightPixels;
            strZzm = c3666mt.zzi().zzm();
        }
        StringBuilder sb = new StringBuilder();
        H1.d2[] d2VarArr2 = d2Var.zzg;
        if (d2VarArr2 != null) {
            boolean z12 = false;
            for (H1.d2 d2Var3 : d2VarArr2) {
                if (d2Var3.zzi) {
                    z12 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i11 = d2Var3.zze;
                    if (i11 == -1) {
                        i11 = f8 != 0.0f ? (int) (d2Var3.zzf / f8) : -1;
                    }
                    sb.append(i11);
                    sb.append("x");
                    int i12 = d2Var3.zzb;
                    if (i12 == -2) {
                        i12 = f8 != 0.0f ? (int) (d2Var3.zzc / f8) : -2;
                    }
                    sb.append(i12);
                }
            }
            if (z12) {
                if (sb.length() != 0) {
                    i10 = 0;
                    sb.insert(0, "|");
                } else {
                    i10 = 0;
                }
                sb.insert(i10, "320x50");
            }
        }
        return new C2772f20(d2Var, str, z8, sb.toString(), f8, i9, i8, strZzm, this.f18721b.zzq);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzm(this.f18720a.zzb(), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.d20
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.a((T50) obj);
            }
        }, AbstractC4805wt.zzf);
    }
}
