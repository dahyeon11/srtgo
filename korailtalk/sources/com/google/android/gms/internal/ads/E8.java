package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
final class E8 implements InterfaceC4266s8 {

    /* renamed from: a, reason: collision with root package name */
    private File f12771a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f12772b;

    E8(Context context) {
        this.f12772b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4266s8
    public final File zza() {
        if (this.f12771a == null) {
            this.f12771a = new File(this.f12772b.getCacheDir(), "volley");
        }
        return this.f12771a;
    }
}
