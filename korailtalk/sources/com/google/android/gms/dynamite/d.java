package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0195b selectModule(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0195b c0195b = new DynamiteModule.b.C0195b();
        int iZzb = aVar.zzb(context, str, true);
        c0195b.remoteVersion = iZzb;
        if (iZzb != 0) {
            c0195b.selection = 1;
        } else {
            int iZza = aVar.zza(context, str);
            c0195b.localVersion = iZza;
            if (iZza != 0) {
                c0195b.selection = -1;
            }
        }
        return c0195b;
    }
}
