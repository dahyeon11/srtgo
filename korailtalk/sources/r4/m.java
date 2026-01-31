package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum m implements InterfaceC6042a {
    DISABLE("사용안함", "000");


    /* renamed from: a, reason: collision with root package name */
    private String f35749a;

    /* renamed from: b, reason: collision with root package name */
    private String f35750b;

    m(String str, String str2) {
        this.f35749a = str;
        this.f35750b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35750b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35749a;
    }
}
