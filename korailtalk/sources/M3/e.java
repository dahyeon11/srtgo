package M3;

import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3108a;

    /* renamed from: b, reason: collision with root package name */
    private int f3109b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3110c;

    /* renamed from: d, reason: collision with root package name */
    private final List f3111d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3112e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f3113f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f3114g;

    /* renamed from: h, reason: collision with root package name */
    private Object f3115h;

    /* renamed from: i, reason: collision with root package name */
    private final int f3116i;

    /* renamed from: j, reason: collision with root package name */
    private final int f3117j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> getByteSegments() {
        return this.f3111d;
    }

    public String getECLevel() {
        return this.f3112e;
    }

    public Integer getErasures() {
        return this.f3114g;
    }

    public Integer getErrorsCorrected() {
        return this.f3113f;
    }

    public int getNumBits() {
        return this.f3109b;
    }

    public Object getOther() {
        return this.f3115h;
    }

    public byte[] getRawBytes() {
        return this.f3108a;
    }

    public int getStructuredAppendParity() {
        return this.f3116i;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.f3117j;
    }

    public String getText() {
        return this.f3110c;
    }

    public boolean hasStructuredAppend() {
        return this.f3116i >= 0 && this.f3117j >= 0;
    }

    public void setErasures(Integer num) {
        this.f3114g = num;
    }

    public void setErrorsCorrected(Integer num) {
        this.f3113f = num;
    }

    public void setNumBits(int i8) {
        this.f3109b = i8;
    }

    public void setOther(Object obj) {
        this.f3115h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i8, int i9) {
        this.f3108a = bArr;
        this.f3109b = bArr == null ? 0 : bArr.length * 8;
        this.f3110c = str;
        this.f3111d = list;
        this.f3112e = str2;
        this.f3116i = i9;
        this.f3117j = i8;
    }
}
