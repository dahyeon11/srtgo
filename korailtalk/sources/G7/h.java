package G7;

import C7.C;
import C7.K;

/* loaded from: classes3.dex */
public final class h extends K {

    /* renamed from: b, reason: collision with root package name */
    private final String f1508b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1509c;

    /* renamed from: d, reason: collision with root package name */
    private final P7.e f1510d;

    public h(String str, long j8, P7.e eVar) {
        this.f1508b = str;
        this.f1509c = j8;
        this.f1510d = eVar;
    }

    @Override // C7.K
    public long contentLength() {
        return this.f1509c;
    }

    @Override // C7.K
    public C contentType() {
        String str = this.f1508b;
        if (str != null) {
            return C.parse(str);
        }
        return null;
    }

    @Override // C7.K
    public P7.e source() {
        return this.f1510d;
    }
}
