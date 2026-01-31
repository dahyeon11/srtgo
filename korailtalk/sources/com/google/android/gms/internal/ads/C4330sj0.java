package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.sj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4330sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22681a;

    /* renamed from: b, reason: collision with root package name */
    private final C4103qj0 f22682b;

    /* renamed from: c, reason: collision with root package name */
    private C4103qj0 f22683c;

    /* synthetic */ C4330sj0(String str, AbstractC4216rj0 abstractC4216rj0) {
        C4103qj0 c4103qj0 = new C4103qj0();
        this.f22682b = c4103qj0;
        this.f22683c = c4103qj0;
        str.getClass();
        this.f22681a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f22681a);
        sb.append('{');
        C4103qj0 c4103qj0 = this.f22682b.f21982b;
        String str = "";
        while (c4103qj0 != null) {
            Object obj = c4103qj0.f21981a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c4103qj0 = c4103qj0.f21982b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final C4330sj0 zza(Object obj) {
        C4103qj0 c4103qj0 = new C4103qj0();
        this.f22683c.f21982b = c4103qj0;
        this.f22683c = c4103qj0;
        c4103qj0.f21981a = obj;
        return this;
    }
}
