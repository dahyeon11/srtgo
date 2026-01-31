package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class DD0 {
    static HashSet a(int i8) {
        return new HashSet(b(i8));
    }

    private static int b(int i8) {
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap zzb(int i8) {
        return new LinkedHashMap(b(i8));
    }

    public static List zzc(int i8) {
        return i8 == 0 ? Collections.emptyList() : new ArrayList(i8);
    }
}
