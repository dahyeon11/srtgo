package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum r implements InterfaceC6042a {
    FAMILY("가족석", "027"),
    ONDOL("온돌마루실", "039"),
    COUPLE("커플석", "040"),
    FAMILY_ROOM("패밀리룸", "041");


    /* renamed from: a, reason: collision with root package name */
    private String f35766a;

    /* renamed from: b, reason: collision with root package name */
    private String f35767b;

    r(String str, String str2) {
        this.f35766a = str;
        this.f35767b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35767b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35766a;
    }
}
