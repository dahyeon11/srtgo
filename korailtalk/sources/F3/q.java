package F3;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f1157a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1158b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1159c;

    /* renamed from: d, reason: collision with root package name */
    private s[] f1160d;

    /* renamed from: e, reason: collision with root package name */
    private final a f1161e;

    /* renamed from: f, reason: collision with root package name */
    private Map f1162f;

    /* renamed from: g, reason: collision with root package name */
    private final long f1163g;

    public q(String str, byte[] bArr, s[] sVarArr, a aVar) {
        this(str, bArr, sVarArr, aVar, System.currentTimeMillis());
    }

    public void addResultPoints(s[] sVarArr) {
        s[] sVarArr2 = this.f1160d;
        if (sVarArr2 == null) {
            this.f1160d = sVarArr;
            return;
        }
        if (sVarArr == null || sVarArr.length <= 0) {
            return;
        }
        s[] sVarArr3 = new s[sVarArr2.length + sVarArr.length];
        System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
        System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
        this.f1160d = sVarArr3;
    }

    public a getBarcodeFormat() {
        return this.f1161e;
    }

    public int getNumBits() {
        return this.f1159c;
    }

    public byte[] getRawBytes() {
        return this.f1158b;
    }

    public Map<r, Object> getResultMetadata() {
        return this.f1162f;
    }

    public s[] getResultPoints() {
        return this.f1160d;
    }

    public String getText() {
        return this.f1157a;
    }

    public long getTimestamp() {
        return this.f1163g;
    }

    public void putAllMetadata(Map<r, Object> map) {
        if (map != null) {
            Map map2 = this.f1162f;
            if (map2 == null) {
                this.f1162f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(r rVar, Object obj) {
        if (this.f1162f == null) {
            this.f1162f = new EnumMap(r.class);
        }
        this.f1162f.put(rVar, obj);
    }

    public String toString() {
        return this.f1157a;
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar, long j8) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, sVarArr, aVar, j8);
    }

    public q(String str, byte[] bArr, int i8, s[] sVarArr, a aVar, long j8) {
        this.f1157a = str;
        this.f1158b = bArr;
        this.f1159c = i8;
        this.f1160d = sVarArr;
        this.f1161e = aVar;
        this.f1162f = null;
        this.f1163g = j8;
    }
}
