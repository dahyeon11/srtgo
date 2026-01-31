package androidx.camera.core;

import java.util.LinkedHashSet;
import z.InterfaceC6553B;
import z.InterfaceC6601s;

/* renamed from: androidx.camera.core.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0888l {
    InterfaceC0892n getCameraControl();

    r getCameraInfo();

    LinkedHashSet<InterfaceC6553B> getCameraInternals();

    InterfaceC6601s getExtendedConfig();

    default boolean isUseCasesCombinationSupported(h1... h1VarArr) {
        return true;
    }

    void setExtendedConfig(InterfaceC6601s interfaceC6601s);
}
