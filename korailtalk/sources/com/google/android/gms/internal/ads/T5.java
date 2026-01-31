package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class T5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16405c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16406d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f16407a = new C4099qh0();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f16408b = new StringBuilder();

    static String a(C4099qh0 c4099qh0, StringBuilder sb) {
        b(c4099qh0);
        if (c4099qh0.zzb() == 0) {
            return null;
        }
        String strC = c(c4099qh0, sb);
        if (!"".equals(strC)) {
            return strC;
        }
        char cZzm = (char) c4099qh0.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    static void b(C4099qh0 c4099qh0) {
        while (true) {
            for (boolean z8 = true; c4099qh0.zzb() > 0 && z8; z8 = false) {
                char c9 = (char) c4099qh0.zzM()[c4099qh0.zzd()];
                if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
                    c4099qh0.zzL(1);
                } else {
                    int iZzd = c4099qh0.zzd();
                    int iZze = c4099qh0.zze();
                    byte[] bArrZzM = c4099qh0.zzM();
                    if (iZzd + 2 <= iZze) {
                        int i8 = iZzd + 1;
                        if (bArrZzM[iZzd] == 47) {
                            int i9 = iZzd + 2;
                            if (bArrZzM[i8] == 42) {
                                while (true) {
                                    int i10 = i9 + 1;
                                    if (i10 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzM[i9]) == '*' && ((char) bArrZzM[i10]) == '/') {
                                        iZze = i9 + 2;
                                        i9 = iZze;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                                c4099qh0.zzL(iZze - c4099qh0.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String c(C4099qh0 c4099qh0, StringBuilder sb) {
        boolean z8;
        char c9;
        sb.setLength(0);
        int iZzd = c4099qh0.zzd();
        int iZze = c4099qh0.zze();
        loop0: while (true) {
            for (false; iZzd < iZze && !z8; true) {
                c9 = (char) c4099qh0.zzM()[iZzd];
                z8 = (c9 < 'A' || c9 > 'Z') && (c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_');
            }
            sb.append(c9);
            iZzd++;
        }
        c4099qh0.zzL(iZzd - c4099qh0.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0317, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.C4099qh0 r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T5.zzb(com.google.android.gms.internal.ads.qh0):java.util.List");
    }
}
