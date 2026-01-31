package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum n implements InterfaceC6042a {
    DEFAULT("모든 위치", "000"),
    ALONE("1인석", "011"),
    WINDOW("창측", "012"),
    INNER("내측", "013");


    /* renamed from: a, reason: collision with root package name */
    private String f35752a;

    /* renamed from: b, reason: collision with root package name */
    private String f35753b;

    n(String str, String str2) {
        this.f35752a = str;
        this.f35753b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35753b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35752a;
    }
}
