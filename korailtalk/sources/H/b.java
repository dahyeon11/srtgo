package H;

import android.hardware.camera2.CaptureRequest;
import android.util.Pair;
import androidx.camera.extensions.impl.CaptureStageImpl;
import s.C6203b;
import z.C6562K;
import z.InterfaceC6564M;

/* loaded from: classes.dex */
public final class b implements InterfaceC6564M {

    /* renamed from: a, reason: collision with root package name */
    private final C6562K f1513a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1514b;

    public b(CaptureStageImpl captureStageImpl) {
        this.f1514b = captureStageImpl.getId();
        C6203b.a aVar = new C6203b.a();
        for (Pair pair : captureStageImpl.getParameters()) {
            aVar.setCaptureRequestOption((CaptureRequest.Key) pair.first, pair.second);
        }
        C6562K.a aVar2 = new C6562K.a();
        aVar2.addImplementationOptions(aVar.build());
        this.f1513a = aVar2.build();
    }

    @Override // z.InterfaceC6564M
    public C6562K getCaptureConfig() {
        return this.f1513a;
    }

    @Override // z.InterfaceC6564M
    public int getId() {
        return this.f1514b;
    }
}
