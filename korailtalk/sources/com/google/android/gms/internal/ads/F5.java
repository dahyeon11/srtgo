package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class F5 implements InterfaceC3349k5 {

    /* renamed from: d */
    private static final Pattern f12922d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e */
    private static final Pattern f12923e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a */
    private final StringBuilder f12924a = new StringBuilder();

    /* renamed from: b */
    private final ArrayList f12925b = new ArrayList();

    /* renamed from: c */
    private final C4099qh0 f12926c = new C4099qh0();

    private static long a(Matcher matcher, int i8) {
        String strGroup = matcher.group(i8 + 1);
        long j8 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i8 + 2);
        strGroup2.getClass();
        long j9 = j8 + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i8 + 3);
        strGroup3.getClass();
        long j10 = j9 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i8 + 4);
        if (strGroup4 != null) {
            j10 += Long.parseLong(strGroup4);
        }
        return j10 * 1000;
    }

    public static float zzb(int i8) {
        if (i8 == 0) {
            return 0.08f;
        }
        if (i8 == 1) {
            return 0.5f;
        }
        if (i8 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:190:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0197  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r17, int r18, int r19, com.google.android.gms.internal.ads.C3235j5 r20, com.google.android.gms.internal.ads.InterfaceC3462l40 r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.F5.zza(byte[], int, int, com.google.android.gms.internal.ads.j5, com.google.android.gms.internal.ads.l40):void");
    }
}
