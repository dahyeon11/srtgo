package J6;

import java.io.IOException;

/* loaded from: classes.dex */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: a, reason: collision with root package name */
    private final String f2675a;

    i(String str) {
        this.f2675a = str;
    }

    public static i get(String str) throws IOException {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.f2675a)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f2675a)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.f2675a)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.f2675a)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f2675a;
    }
}
