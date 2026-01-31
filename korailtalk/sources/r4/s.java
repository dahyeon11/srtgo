package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum s implements InterfaceC6042a {
    ALL("전체", "109"),
    KTX("KTX", "100"),
    SAEMAUL("새마을/ITX-마음", "101"),
    MUGUNGHWA("무궁화", "102"),
    ITX_YOUTH("ITX-청춘", "104"),
    SRT("SRT", "300"),
    VTRN("V-Train", "202"),
    STRN("S-Train", "203"),
    DTRN("DMZ-Train", "204"),
    ATRN("정선아리랑열차", "205"),
    GTRN("서해금빛열차", "206"),
    XTRN("동해산타열차", "207"),
    LIMOUSINE("공항리무진", "980");


    /* renamed from: a, reason: collision with root package name */
    private String f35769a;

    /* renamed from: b, reason: collision with root package name */
    private String f35770b;

    s(String str, String str2) {
        this.f35769a = str;
        this.f35770b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35770b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35769a;
    }
}
