package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.aZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2255aZ {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17978a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f17979b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f17980c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f17981d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f17982e = Integer.toString(4, 36);

    private static Bundle a(Spanned spanned, Object obj, int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f17978a, spanned.getSpanStart(obj));
        bundle2.putInt(f17979b, spanned.getSpanEnd(obj));
        bundle2.putInt(f17980c, spanned.getSpanFlags(obj));
        bundle2.putInt(f17981d, i8);
        if (bundle != null) {
            bundle2.putBundle(f17982e, bundle);
        }
        return bundle2;
    }

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C2424c00 c2424c00 : (C2424c00[]) spanned.getSpans(0, spanned.length(), C2424c00.class)) {
            arrayList.add(a(spanned, c2424c00, 1, c2424c00.zza()));
        }
        for (C2655e10 c2655e10 : (C2655e10[]) spanned.getSpans(0, spanned.length(), C2655e10.class)) {
            arrayList.add(a(spanned, c2655e10, 2, c2655e10.zza()));
        }
        for (BZ bz : (BZ[]) spanned.getSpans(0, spanned.length(), BZ.class)) {
            arrayList.add(a(spanned, bz, 3, null));
        }
        return arrayList;
    }
}
