package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ue0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4548ue0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1342Fe0 f23092a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1342Fe0 f23093b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23094c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC5004ye0 f23095d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC1178Be0 f23096e;

    private C4548ue0(EnumC5004ye0 enumC5004ye0, EnumC1178Be0 enumC1178Be0, EnumC1342Fe0 enumC1342Fe0, EnumC1342Fe0 enumC1342Fe02, boolean z8) {
        this.f23095d = enumC5004ye0;
        this.f23096e = enumC1178Be0;
        this.f23092a = enumC1342Fe0;
        if (enumC1342Fe02 == null) {
            this.f23093b = EnumC1342Fe0.NONE;
        } else {
            this.f23093b = enumC1342Fe02;
        }
        this.f23094c = z8;
    }

    public static C4548ue0 zza(EnumC5004ye0 enumC5004ye0, EnumC1178Be0 enumC1178Be0, EnumC1342Fe0 enumC1342Fe0, EnumC1342Fe0 enumC1342Fe02, boolean z8) {
        AbstractC3981pf0.zzc(enumC5004ye0, "CreativeType is null");
        AbstractC3981pf0.zzc(enumC1178Be0, "ImpressionType is null");
        AbstractC3981pf0.zzc(enumC1342Fe0, "Impression owner is null");
        if (enumC1342Fe0 == EnumC1342Fe0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC5004ye0 == EnumC5004ye0.DEFINED_BY_JAVASCRIPT && enumC1342Fe0 == EnumC1342Fe0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC1178Be0 == EnumC1178Be0.DEFINED_BY_JAVASCRIPT && enumC1342Fe0 == EnumC1342Fe0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C4548ue0(enumC5004ye0, enumC1178Be0, enumC1342Fe0, enumC1342Fe02, z8);
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AbstractC3297jf0.zze(jSONObject, "impressionOwner", this.f23092a);
        AbstractC3297jf0.zze(jSONObject, "mediaEventsOwner", this.f23093b);
        AbstractC3297jf0.zze(jSONObject, "creativeType", this.f23095d);
        AbstractC3297jf0.zze(jSONObject, "impressionType", this.f23096e);
        AbstractC3297jf0.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f23094c));
        return jSONObject;
    }
}
