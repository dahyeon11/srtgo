package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4529uQ {
    public static final AbstractC2394bl0 zza;
    public static final AbstractC2394bl0 zzb;

    /* renamed from: a, reason: collision with root package name */
    private final String f23047a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC4415tQ f23048b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4415tQ f23049c;

    static {
        EnumC4415tQ enumC4415tQ = EnumC4415tQ.PUBLIC_API_CALL;
        EnumC4415tQ enumC4415tQ2 = EnumC4415tQ.PUBLIC_API_CALLBACK;
        C4529uQ c4529uQ = new C4529uQ("tqgt", enumC4415tQ, enumC4415tQ2);
        EnumC4415tQ enumC4415tQ3 = EnumC4415tQ.DYNAMITE_ENTER;
        C4529uQ c4529uQ2 = new C4529uQ("l.dl", enumC4415tQ, enumC4415tQ3);
        EnumC4415tQ enumC4415tQ4 = EnumC4415tQ.CLIENT_SIGNALS_START;
        C4529uQ c4529uQ3 = new C4529uQ("l.rcc", enumC4415tQ3, enumC4415tQ4);
        EnumC4415tQ enumC4415tQ5 = EnumC4415tQ.CLIENT_SIGNALS_END;
        C4529uQ c4529uQ4 = new C4529uQ("l.cs", enumC4415tQ4, enumC4415tQ5);
        EnumC4415tQ enumC4415tQ6 = EnumC4415tQ.SERVICE_CONNECTED;
        C4529uQ c4529uQ5 = new C4529uQ("l.cts", enumC4415tQ5, enumC4415tQ6);
        EnumC4415tQ enumC4415tQ7 = EnumC4415tQ.GMS_SIGNALS_START;
        EnumC4415tQ enumC4415tQ8 = EnumC4415tQ.GMS_SIGNALS_END;
        C4529uQ c4529uQ6 = new C4529uQ("l.gs", enumC4415tQ7, enumC4415tQ8);
        EnumC4415tQ enumC4415tQ9 = EnumC4415tQ.GET_SIGNALS_SDKCORE_START;
        C4529uQ c4529uQ7 = new C4529uQ("l.jse", enumC4415tQ8, enumC4415tQ9);
        EnumC4415tQ enumC4415tQ10 = EnumC4415tQ.GET_SIGNALS_SDKCORE_END;
        zza = AbstractC2394bl0.zzs(c4529uQ, c4529uQ2, c4529uQ3, c4529uQ4, c4529uQ5, c4529uQ6, c4529uQ7, new C4529uQ("l.gs-sdkcore", enumC4415tQ9, enumC4415tQ10), new C4529uQ("l.gs-pp", enumC4415tQ10, enumC4415tQ2));
        C4529uQ c4529uQ8 = new C4529uQ("l.al", enumC4415tQ, enumC4415tQ2);
        C4529uQ c4529uQ9 = new C4529uQ("l.dl", enumC4415tQ, enumC4415tQ3);
        C4529uQ c4529uQ10 = new C4529uQ("l.rcc", enumC4415tQ3, enumC4415tQ4);
        C4529uQ c4529uQ11 = new C4529uQ("l.cs", enumC4415tQ4, enumC4415tQ5);
        C4529uQ c4529uQ12 = new C4529uQ("l.cts", enumC4415tQ5, enumC4415tQ6);
        C4529uQ c4529uQ13 = new C4529uQ("l.gs", enumC4415tQ7, enumC4415tQ8);
        EnumC4415tQ enumC4415tQ11 = EnumC4415tQ.GET_AD_DICTIONARY_SDKCORE_START;
        C4529uQ c4529uQ14 = new C4529uQ("l.jse", enumC4415tQ8, enumC4415tQ11);
        EnumC4415tQ enumC4415tQ12 = EnumC4415tQ.GET_AD_DICTIONARY_SDKCORE_END;
        C4529uQ c4529uQ15 = new C4529uQ("l.gad-js", enumC4415tQ11, enumC4415tQ12);
        EnumC4415tQ enumC4415tQ13 = EnumC4415tQ.HTTP_RESPONSE_READY;
        zzb = AbstractC2394bl0.zzt(c4529uQ8, c4529uQ9, c4529uQ10, c4529uQ11, c4529uQ12, c4529uQ13, c4529uQ14, c4529uQ15, new C4529uQ("l.http", enumC4415tQ12, enumC4415tQ13), new C4529uQ("l.nml-js", enumC4415tQ13, EnumC4415tQ.SERVER_RESPONSE_PARSE_START));
    }

    public C4529uQ(String str, EnumC4415tQ enumC4415tQ, EnumC4415tQ enumC4415tQ2) {
        this.f23047a = str;
        this.f23048b = enumC4415tQ;
        this.f23049c = enumC4415tQ2;
    }

    public final EnumC4415tQ zza() {
        return this.f23048b;
    }

    public final EnumC4415tQ zzb() {
        return this.f23049c;
    }

    public final String zzc() {
        return this.f23047a;
    }
}
