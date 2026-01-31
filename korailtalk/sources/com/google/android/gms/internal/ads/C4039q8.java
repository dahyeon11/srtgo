package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.q8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4039q8 {

    /* renamed from: a, reason: collision with root package name */
    long f21861a;

    /* renamed from: b, reason: collision with root package name */
    final String f21862b;

    /* renamed from: c, reason: collision with root package name */
    final String f21863c;

    /* renamed from: d, reason: collision with root package name */
    final long f21864d;

    /* renamed from: e, reason: collision with root package name */
    final long f21865e;

    /* renamed from: f, reason: collision with root package name */
    final long f21866f;

    /* renamed from: g, reason: collision with root package name */
    final long f21867g;

    /* renamed from: h, reason: collision with root package name */
    final List f21868h;

    /* JADX WARN: Illegal instructions before constructor call */
    C4039q8(String str, H7 h72) {
        String str2 = h72.zzb;
        long j8 = h72.zzc;
        long j9 = h72.zzd;
        long j10 = h72.zze;
        long j11 = h72.zzf;
        List arrayList = h72.zzh;
        if (arrayList == null) {
            Map map = h72.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Q7((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j8, j9, j10, j11, arrayList);
    }

    static C4039q8 a(C4152r8 c4152r8) throws IOException {
        if (C4494u8.a(c4152r8) != 538247942) {
            throw new IOException();
        }
        String strC = C4494u8.c(c4152r8);
        String strC2 = C4494u8.c(c4152r8);
        long jB = C4494u8.b(c4152r8);
        long jB2 = C4494u8.b(c4152r8);
        long jB3 = C4494u8.b(c4152r8);
        long jB4 = C4494u8.b(c4152r8);
        int iA = C4494u8.a(c4152r8);
        if (iA < 0) {
            throw new IOException("readHeaderList size=" + iA);
        }
        List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
        for (int i8 = 0; i8 < iA; i8++) {
            listEmptyList.add(new Q7(C4494u8.c(c4152r8).intern(), C4494u8.c(c4152r8).intern()));
        }
        return new C4039q8(strC, strC2, jB, jB2, jB3, jB4, listEmptyList);
    }

    private C4039q8(String str, String str2, long j8, long j9, long j10, long j11, List list) {
        this.f21862b = str;
        this.f21863c = true == "".equals(str2) ? null : str2;
        this.f21864d = j8;
        this.f21865e = j9;
        this.f21866f = j10;
        this.f21867g = j11;
        this.f21868h = list;
    }
}
