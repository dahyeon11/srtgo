package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class c implements DynamiteModule.b.a {
    c() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int zzb(Context context, String str, boolean z8) {
        return DynamiteModule.zza(context, str, z8);
    }
}
