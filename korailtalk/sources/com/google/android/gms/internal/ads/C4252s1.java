package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4252s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f22541a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f22541a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i8 = AbstractC2281am0.zza;
            int i9 = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i9 <= 0 && i10 <= 0) {
                return false;
            }
            this.zza = i9;
            this.zzb = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(C1735Ot c1735Ot) {
        for (int i8 = 0; i8 < c1735Ot.zza(); i8++) {
            InterfaceC3894ot interfaceC3894otZzb = c1735Ot.zzb(i8);
            if (interfaceC3894otZzb instanceof W2) {
                W2 w22 = (W2) interfaceC3894otZzb;
                if ("iTunSMPB".equals(w22.zzb) && a(w22.zzc)) {
                    return true;
                }
            } else if (interfaceC3894otZzb instanceof C2773f3) {
                C2773f3 c2773f3 = (C2773f3) interfaceC3894otZzb;
                if ("com.apple.iTunes".equals(c2773f3.zza) && "iTunSMPB".equals(c2773f3.zzb) && a(c2773f3.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
