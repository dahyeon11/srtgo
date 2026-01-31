package androidx.camera.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z.InterfaceC6561J;
import z.InterfaceC6564M;

/* loaded from: classes.dex */
abstract class D {

    static final class a implements InterfaceC6561J {

        /* renamed from: a, reason: collision with root package name */
        final List f7392a;

        a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f7392a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // z.InterfaceC6561J
        public List<InterfaceC6564M> getCaptureStages() {
            return this.f7392a;
        }
    }

    static InterfaceC6561J a(List list) {
        return new a(list);
    }

    static InterfaceC6561J b(InterfaceC6564M... interfaceC6564MArr) {
        return new a(Arrays.asList(interfaceC6564MArr));
    }

    static InterfaceC6561J c() {
        return b(new InterfaceC6564M.a());
    }
}
