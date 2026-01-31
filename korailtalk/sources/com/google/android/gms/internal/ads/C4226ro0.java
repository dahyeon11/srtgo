package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.ro0 */
/* loaded from: classes2.dex */
public final class C4226ro0 {

    /* renamed from: a */
    private final OutputStream f22516a;

    private C4226ro0(OutputStream outputStream) {
        this.f22516a = outputStream;
    }

    public static C4226ro0 zzb(OutputStream outputStream) {
        return new C4226ro0(outputStream);
    }

    public final void zza(C5154zw0 c5154zw0) throws IOException {
        try {
            c5154zw0.zzaU(this.f22516a);
        } finally {
            this.f22516a.close();
        }
    }
}
