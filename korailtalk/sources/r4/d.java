package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum d implements InterfaceC6042a {
    DIRECT_SQ_NO("직통", "1"),
    TRANSFER_SQ_NO("환승", "2");


    /* renamed from: a, reason: collision with root package name */
    private String f35734a;

    /* renamed from: b, reason: collision with root package name */
    private String f35735b;

    d(String str, String str2) {
        this.f35734a = str;
        this.f35735b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35735b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35734a;
    }
}
