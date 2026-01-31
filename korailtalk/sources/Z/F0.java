package z;

import androidx.camera.core.InterfaceC0897p0;
import androidx.camera.core.InterfaceC0902s0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F0 implements InterfaceC6579f0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f37716a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0902s0 f37717b;

    public F0(InterfaceC0902s0 interfaceC0902s0, String str) {
        InterfaceC0897p0 imageInfo = interfaceC0902s0.getImageInfo();
        if (imageInfo == null) {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        Integer num = (Integer) imageInfo.getTagBundle().getTag(str);
        if (num == null) {
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.f37716a = num.intValue();
        this.f37717b = interfaceC0902s0;
    }

    public void close() {
        this.f37717b.close();
    }

    @Override // z.InterfaceC6579f0
    public List<Integer> getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.f37716a));
    }

    @Override // z.InterfaceC6579f0
    public com.google.common.util.concurrent.C getImageProxy(int i8) {
        return i8 != this.f37716a ? B.f.immediateFailedFuture(new IllegalArgumentException("Capture id does not exist in the bundle")) : B.f.immediateFuture(this.f37717b);
    }
}
