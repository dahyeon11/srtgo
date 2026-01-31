package z;

import android.content.Context;
import androidx.camera.core.C0903t;
import java.util.Set;

/* renamed from: z.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6607y {

    /* renamed from: z.y$a */
    public interface a {
        InterfaceC6607y newInstance(Context context, AbstractC6559H abstractC6559H, C0903t c0903t);
    }

    Set<String> getAvailableCameraIds();

    InterfaceC6553B getCamera(String str);

    Object getCameraManager();
}
