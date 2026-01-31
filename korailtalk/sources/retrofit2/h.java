package retrofit2;

import Q7.X;

/* loaded from: classes3.dex */
public class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final int f35969a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35970b;

    /* renamed from: c, reason: collision with root package name */
    private final transient w f35971c;

    public h(w<?> wVar) {
        super(a(wVar));
        this.f35969a = wVar.code();
        this.f35970b = wVar.message();
        this.f35971c = wVar;
    }

    private static String a(w wVar) {
        B.b(wVar, "response == null");
        return "HTTP " + wVar.code() + X.SPACE + wVar.message();
    }

    public int code() {
        return this.f35969a;
    }

    public String message() {
        return this.f35970b;
    }

    public w<?> response() {
        return this.f35971c;
    }
}
