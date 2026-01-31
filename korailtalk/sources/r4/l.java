package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum l implements InterfaceC6042a {
    DEFAULT("모든방향", "000"),
    RIGHT("순방향", "009"),
    REVERSE("역방향", "010");


    /* renamed from: a, reason: collision with root package name */
    private String f35746a;

    /* renamed from: b, reason: collision with root package name */
    private String f35747b;

    l(String str, String str2) {
        this.f35746a = str;
        this.f35747b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35747b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35746a;
    }
}
