package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import com.kakao.sdk.user.Constants;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4907xn implements InterfaceC3199in {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3426kn f23787a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3654mn f23788b;

    /* renamed from: c, reason: collision with root package name */
    private final C2740en f23789c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23790d;

    C4907xn(C2740en c2740en, String str, InterfaceC3654mn interfaceC3654mn, InterfaceC3426kn interfaceC3426kn) {
        this.f23789c = c2740en;
        this.f23790d = str;
        this.f23788b = interfaceC3654mn;
        this.f23787a = interfaceC3426kn;
    }

    static /* bridge */ /* synthetic */ void b(C4907xn c4907xn, C2135Ym c2135Ym, InterfaceC2855fn interfaceC2855fn, Object obj, C1203Bt c1203Bt) throws JSONException {
        try {
            G1.u.zzp();
            String string = UUID.randomUUID().toString();
            AbstractC2172Zk.zzo.zzc(string, new C4793wn(c4907xn, c2135Ym, c1203Bt));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ID, string);
            jSONObject.put("args", c4907xn.f23788b.zzb(obj));
            interfaceC2855fn.zzl(c4907xn.f23790d, jSONObject);
        } catch (Exception e8) {
            try {
                c1203Bt.zzd(e8);
                L1.n.zzh("Unable to invokeJavascript", e8);
            } finally {
                c2135Ym.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3199in, com.google.android.gms.internal.ads.InterfaceC3997pn0
    public final com.google.common.util.concurrent.C zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3199in
    public final com.google.common.util.concurrent.C zzb(Object obj) {
        C1203Bt c1203Bt = new C1203Bt();
        C2135Ym c2135YmZzb = this.f23789c.zzb(null);
        AbstractC0667v0.zza("callJs > getEngine: Promise created");
        c2135YmZzb.zzj(new C4565un(this, c2135YmZzb, obj, c1203Bt), new C4679vn(this, c1203Bt, c2135YmZzb));
        return c1203Bt;
    }
}
