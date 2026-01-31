package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xa */
/* loaded from: classes2.dex */
public final class C4881xa {

    /* renamed from: a */
    private String f23747a;

    /* renamed from: b */
    private Uri f23748b;

    /* renamed from: c */
    private final C5111zb f23749c = new C5111zb();

    /* renamed from: d */
    private final C1306Eh f23750d = new C1306Eh(null);

    /* renamed from: e */
    private final List f23751e = Collections.emptyList();

    /* renamed from: f */
    private final AbstractC2394bl0 f23752f = AbstractC2394bl0.zzm();

    /* renamed from: g */
    private final C3077hj f23753g = new C3077hj();

    /* renamed from: h */
    private final C3540ln f23754h = C3540ln.zza;

    public final C4881xa zza(String str) {
        this.f23747a = str;
        return this;
    }

    public final C4881xa zzb(Uri uri) {
        this.f23748b = uri;
        return this;
    }

    public final C3658mp zzc() {
        Uri uri = this.f23748b;
        C1478Il c1478Il = uri != null ? new C1478Il(uri, null, null, null, this.f23751e, null, this.f23752f, null, -9223372036854775807L, null) : null;
        String str = this.f23747a;
        if (str == null) {
            str = "";
        }
        return new C3658mp(str, new C1462Id(this.f23749c, null), c1478Il, new C3306jk(this.f23753g), C3550ls.zza, this.f23754h, null);
    }
}
