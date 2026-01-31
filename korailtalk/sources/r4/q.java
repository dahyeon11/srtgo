package r4;

import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum q implements InterfaceC6042a {
    NO_SMOKING("금연", "007"),
    SMOKING("흡연", "008"),
    DISABLE("사용안함", "000");


    /* renamed from: a, reason: collision with root package name */
    private String f35763a;

    /* renamed from: b, reason: collision with root package name */
    private String f35764b;

    q(String str, String str2) {
        this.f35763a = str;
        this.f35764b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35764b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35763a;
    }
}
