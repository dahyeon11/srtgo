package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.Mg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1632Mg0 {

    /* renamed from: a, reason: collision with root package name */
    private final File f14680a;

    /* renamed from: b, reason: collision with root package name */
    final File f14681b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f14682c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC1214Cc f14683d;

    public C1632Mg0(Context context, EnumC1214Cc enumC1214Cc) {
        this.f14682c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        AbstractC1673Ng0.zza(dir, false);
        this.f14680a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        AbstractC1673Ng0.zza(dir2, true);
        this.f14681b = dir2;
        this.f14683d = enumC1214Cc;
    }

    private final File b() {
        File file = new File(this.f14680a, Integer.toString(this.f14683d.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String c() {
        return "FBAMTD" + this.f14683d.zza();
    }

    private final String d() {
        return "LATMTD" + this.f14683d.zza();
    }

    final C1542Kc a(int i8) {
        String string = i8 == 1 ? this.f14682c.getString(d(), null) : this.f14682c.getString(c(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = o2.k.stringToBytes(string);
            AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
            C1542Kc c1542KcZzh = C1542Kc.zzh(AbstractC3677my0.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = c1542KcZzh.zzk();
            File fileZzb = AbstractC1673Ng0.zzb(strZzk, "pcam.jar", b());
            if (!fileZzb.exists()) {
                fileZzb = AbstractC1673Ng0.zzb(strZzk, "pcam", b());
            }
            File fileZzb2 = AbstractC1673Ng0.zzb(strZzk, "pcbc", b());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return c1542KcZzh;
                }
            }
        } catch (C4021pz0 unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.C1337Fc r8, com.google.android.gms.internal.ads.InterfaceC1919Tg0 r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1632Mg0.zza(com.google.android.gms.internal.ads.Fc, com.google.android.gms.internal.ads.Tg0):boolean");
    }

    public final C1592Lg0 zzc(int i8) {
        C1542Kc c1542KcA = a(1);
        if (c1542KcA == null) {
            return null;
        }
        String strZzk = c1542KcA.zzk();
        File fileZzb = AbstractC1673Ng0.zzb(strZzk, "pcam.jar", b());
        if (!fileZzb.exists()) {
            fileZzb = AbstractC1673Ng0.zzb(strZzk, "pcam", b());
        }
        return new C1592Lg0(c1542KcA, fileZzb, AbstractC1673Ng0.zzb(strZzk, "pcbc", b()), AbstractC1673Ng0.zzb(strZzk, "pcopt", b()));
    }
}
