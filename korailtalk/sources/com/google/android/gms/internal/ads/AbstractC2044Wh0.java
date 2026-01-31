package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Wh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2044Wh0 {

    /* renamed from: g, reason: collision with root package name */
    static final String f17051g = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f17052a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17053b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17054c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17055d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17056e;

    /* renamed from: f, reason: collision with root package name */
    final C2085Xh0 f17057f;

    AbstractC2044Wh0(Context context, String str, String str2, String str3) {
        this.f17057f = C2085Xh0.b(context);
        this.f17052a = str;
        this.f17053b = str.concat("_3p");
        this.f17054c = str2;
        this.f17055d = str2.concat("_3p");
        this.f17056e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f17056e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }

    final long a(boolean z8) {
        return this.f17057f.a(z8 ? this.f17055d : this.f17054c, -1L);
    }

    final C2003Vh0 b(String str, String str2, long j8, boolean z8) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f17051g)) {
                    String strE = e(true);
                    String strC = this.f17057f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C2003Vh0();
        }
        boolean z9 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f17056e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z9);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f17057f.d(z9 ? this.f17055d : this.f17054c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j8) {
                return c(str, str2);
            }
        }
        String strE2 = e(z9);
        return (strE2 != null || z8) ? new C2003Vh0(strE2, a(z9)) : c(str, str2);
    }

    final C2003Vh0 c(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f17057f.d("paid_3p_hash_key", string);
        return d(h(str, str2, string), true);
    }

    final C2003Vh0 d(String str, boolean z8) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f17056e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f17057f.d(z8 ? this.f17055d : this.f17054c, Long.valueOf(jCurrentTimeMillis));
        this.f17057f.d(z8 ? this.f17053b : this.f17052a, str);
        return new C2003Vh0(str, jCurrentTimeMillis);
    }

    final String e(boolean z8) {
        return this.f17057f.c(z8 ? this.f17053b : this.f17052a, null);
    }

    final void f(boolean z8) throws IOException {
        this.f17057f.e(z8 ? this.f17055d : this.f17054c);
        this.f17057f.e(z8 ? this.f17053b : this.f17052a);
    }

    final boolean g(boolean z8) {
        return this.f17057f.g(this.f17052a);
    }
}
