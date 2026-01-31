package z;

import androidx.camera.core.InterfaceC0888l;
import androidx.camera.core.InterfaceC0892n;
import androidx.camera.core.h1;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6553B extends InterfaceC0888l, h1.d {

    /* renamed from: z.B$a */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f37687a;

        a(boolean z8) {
            this.f37687a = z8;
        }

        boolean a() {
            return this.f37687a;
        }
    }

    void attachUseCases(Collection<h1> collection);

    void close();

    void detachUseCases(Collection<h1> collection);

    @Override // androidx.camera.core.InterfaceC0888l
    default InterfaceC0892n getCameraControl() {
        return getCameraControlInternal();
    }

    InterfaceC6605w getCameraControlInternal();

    @Override // androidx.camera.core.InterfaceC0888l
    default androidx.camera.core.r getCameraInfo() {
        return getCameraInfoInternal();
    }

    InterfaceC6552A getCameraInfoInternal();

    @Override // androidx.camera.core.InterfaceC0888l
    default LinkedHashSet<InterfaceC6553B> getCameraInternals() {
        return new LinkedHashSet<>(Collections.singleton(this));
    }

    t0 getCameraState();

    @Override // androidx.camera.core.InterfaceC0888l
    default InterfaceC6601s getExtendedConfig() {
        return AbstractC6604v.emptyConfig();
    }

    @Override // androidx.camera.core.InterfaceC0888l
    /* bridge */ /* synthetic */ default boolean isUseCasesCombinationSupported(h1... h1VarArr) {
        return super.isUseCasesCombinationSupported(h1VarArr);
    }

    /* synthetic */ void onUseCaseActive(h1 h1Var);

    /* synthetic */ void onUseCaseInactive(h1 h1Var);

    /* synthetic */ void onUseCaseReset(h1 h1Var);

    /* synthetic */ void onUseCaseUpdated(h1 h1Var);

    void open();

    com.google.common.util.concurrent.C release();

    default void setActiveResumingMode(boolean z8) {
    }

    @Override // androidx.camera.core.InterfaceC0888l
    default void setExtendedConfig(InterfaceC6601s interfaceC6601s) {
    }
}
