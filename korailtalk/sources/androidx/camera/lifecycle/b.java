package androidx.camera.lifecycle;

import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0901s;
import androidx.camera.core.h1;
import java.util.List;

/* loaded from: classes.dex */
interface b extends InterfaceC0901s {
    @Override // androidx.camera.core.InterfaceC0901s
    /* synthetic */ List getAvailableCameraInfos();

    @Override // androidx.camera.core.InterfaceC0901s
    /* synthetic */ boolean hasCamera(C0903t c0903t);

    boolean isBound(h1 h1Var);

    void unbind(h1... h1VarArr);

    void unbindAll();
}
