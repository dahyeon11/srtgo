package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class a0 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final int f11059a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11060b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f11061c;

    public a0(String str) {
        this.f11059a = 0;
        this.f11060b = str;
        this.f11061c = null;
    }

    private void a(int i8) {
        if (this.f11059a == i8) {
            return;
        }
        throw new IllegalStateException("Expected " + i8 + ", but type is " + this.f11059a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f11061c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        a(0);
        return this.f11060b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f11059a;
    }

    public a0(byte[] bArr) {
        this.f11059a = 1;
        this.f11060b = null;
        this.f11061c = bArr;
    }
}
