package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0195b selectModule(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0195b c0195b = new DynamiteModule.b.C0195b();
        int iZzb = aVar.zzb(context, str, false);
        c0195b.remoteVersion = iZzb;
        c0195b.selection = iZzb != 0 ? 1 : 0;
        return c0195b;
    }
}
