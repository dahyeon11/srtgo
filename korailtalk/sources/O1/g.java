package o1;

import java.util.Arrays;
import m1.C5904b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final C5904b f34422a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34423b;

    public g(C5904b c5904b, byte[] bArr) {
        if (c5904b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f34422a = c5904b;
        this.f34423b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f34422a.equals(gVar.f34422a)) {
            return Arrays.equals(this.f34423b, gVar.f34423b);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.f34423b;
    }

    public C5904b getEncoding() {
        return this.f34422a;
    }

    public int hashCode() {
        return ((this.f34422a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f34423b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f34422a + ", bytes=[...]}";
    }
}
