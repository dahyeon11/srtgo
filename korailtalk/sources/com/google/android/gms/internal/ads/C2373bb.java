package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bb */
/* loaded from: classes2.dex */
public final class C2373bb extends AbstractC2258ab {
    protected C2373bb(Context context, String str, boolean z8) {
        super(context, str, z8);
    }

    public static C2373bb zzt(String str, Context context, boolean z8) {
        AbstractC2258ab.l(context, false);
        return new C2373bb(context, str, false);
    }

    @Deprecated
    public static C2373bb zzu(String str, Context context, boolean z8, int i8) {
        AbstractC2258ab.l(context, z8);
        return new C2373bb(context, str, z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2258ab
    protected final List j(C1294Eb c1294Eb, Context context, C3357k9 c3357k9, C2327b9 c2327b9) {
        if (c1294Eb.zzk() == null || !this.f17989v) {
            return super.j(c1294Eb, context, c3357k9, null);
        }
        int iZza = c1294Eb.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.j(c1294Eb, context, c3357k9, null));
        arrayList.add(new C2113Yb(c1294Eb, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", c3357k9, iZza, 24));
        return arrayList;
    }
}
