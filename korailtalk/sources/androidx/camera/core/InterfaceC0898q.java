package androidx.camera.core;

import java.util.List;

/* renamed from: androidx.camera.core.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0898q {
    public static final z.Z DEFAULT_ID = z.Z.create(new Object());

    List<r> filter(List<r> list);

    default z.Z getIdentifier() {
        return DEFAULT_ID;
    }
}
