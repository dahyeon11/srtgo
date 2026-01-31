package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.rl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4220rl0 {
    public static ArrayList zza(int i8) {
        AbstractC4560uk0.a(i8, "initialArraySize");
        return new ArrayList(i8);
    }

    public static List zzb(List list, InterfaceC3875oj0 interfaceC3875oj0) {
        return list instanceof RandomAccess ? new C3879ol0(list, interfaceC3875oj0) : new C4107ql0(list, interfaceC3875oj0);
    }
}
