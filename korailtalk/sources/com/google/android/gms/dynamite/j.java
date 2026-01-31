package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0195b selectModule(Context context, String str, DynamiteModule.b.a aVar) {
        int iZzb;
        DynamiteModule.b.C0195b c0195b = new DynamiteModule.b.C0195b();
        int iZza = aVar.zza(context, str);
        c0195b.localVersion = iZza;
        int i8 = 1;
        int i9 = 0;
        if (iZza != 0) {
            iZzb = aVar.zzb(context, str, false);
            c0195b.remoteVersion = iZzb;
        } else {
            iZzb = aVar.zzb(context, str, true);
            c0195b.remoteVersion = iZzb;
        }
        int i10 = c0195b.localVersion;
        if (i10 == 0) {
            if (iZzb == 0) {
                i8 = 0;
            }
            c0195b.selection = i8;
            return c0195b;
        }
        i9 = i10;
        if (iZzb < i9) {
            i8 = -1;
        }
        c0195b.selection = i8;
        return c0195b;
    }
}
