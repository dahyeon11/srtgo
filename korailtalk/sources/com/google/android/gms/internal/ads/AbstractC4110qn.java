package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4110qn {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f21988a = Charset.forName("UTF-8");
    public static final InterfaceC3768nn zza = new C3996pn();
    public static final InterfaceC3426kn zzb = new InterfaceC3426kn() { // from class: com.google.android.gms.internal.ads.on
        @Override // com.google.android.gms.internal.ads.InterfaceC3426kn
        public final Object zza(JSONObject jSONObject) {
            return AbstractC4110qn.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f21988a));
    }
}
