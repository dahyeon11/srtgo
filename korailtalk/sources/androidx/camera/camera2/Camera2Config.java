package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.A0;
import androidx.camera.core.C;
import androidx.camera.core.C0903t;
import androidx.camera.core.C0907v;
import java.util.Set;
import t.C6283j0;
import t.C6289m0;
import t.C6311y;
import z.AbstractC6559H;
import z.InterfaceC6606x;
import z.InterfaceC6607y;
import z.O0;

/* loaded from: classes.dex */
public abstract class Camera2Config {

    public static final class DefaultProvider implements C.b {
        @Override // androidx.camera.core.C.b
        public C getCameraXConfig() {
            return Camera2Config.defaultConfig();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6606x c(Context context, Object obj, Set set) throws A0 {
        try {
            return new C6283j0(context, obj, set);
        } catch (C0907v e8) {
            throw new A0(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ O0 d(Context context) {
        return new C6289m0(context);
    }

    public static C defaultConfig() {
        InterfaceC6607y.a aVar = new InterfaceC6607y.a() { // from class: r.a
            @Override // z.InterfaceC6607y.a
            public final InterfaceC6607y newInstance(Context context, AbstractC6559H abstractC6559H, C0903t c0903t) {
                return new C6311y(context, abstractC6559H, c0903t);
            }
        };
        InterfaceC6606x.a aVar2 = new InterfaceC6606x.a() { // from class: r.b
            @Override // z.InterfaceC6606x.a
            public final InterfaceC6606x newInstance(Context context, Object obj, Set set) {
                return Camera2Config.c(context, obj, set);
            }
        };
        return new C.a().setCameraFactoryProvider(aVar).setDeviceSurfaceManagerProvider(aVar2).setUseCaseConfigFactoryProvider(new O0.c() { // from class: r.c
            @Override // z.O0.c
            public final O0 newInstance(Context context) {
                return Camera2Config.d(context);
            }
        }).build();
    }
}
