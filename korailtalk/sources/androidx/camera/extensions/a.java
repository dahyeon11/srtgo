package androidx.camera.extensions;

import H.n;
import Z.h;
import androidx.camera.core.InterfaceC0898q;
import androidx.camera.core.r;
import java.util.ArrayList;
import java.util.List;
import y.j;
import z.InterfaceC6552A;
import z.Z;

/* loaded from: classes.dex */
final class a implements InterfaceC0898q {

    /* renamed from: a, reason: collision with root package name */
    private final Z f7896a;

    /* renamed from: b, reason: collision with root package name */
    private final n f7897b;

    a(String str, n nVar) {
        this.f7896a = Z.create(str);
        this.f7897b = nVar;
    }

    @Override // androidx.camera.core.InterfaceC0898q
    public List<r> filter(List<r> list) {
        ArrayList arrayList = new ArrayList();
        for (r rVar : list) {
            h.checkArgument(rVar instanceof InterfaceC6552A, "The camera info doesn't contain internal implementation.");
            if (this.f7897b.isExtensionAvailable(j.from(rVar).getCameraId(), j.from(rVar).getCameraCharacteristicsMap())) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.InterfaceC0898q
    public Z getIdentifier() {
        return this.f7896a;
    }
}
