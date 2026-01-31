package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1023l f9944a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC1019h.a.values().length];
            try {
                iArr[AbstractC1019h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1019h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1019h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1019h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1019h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1019h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1019h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC1014c defaultLifecycleObserver, InterfaceC1023l interfaceC1023l) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9944a = interfaceC1023l;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                InterfaceC1023l interfaceC1023l = this.f9944a;
                if (interfaceC1023l != null) {
                    interfaceC1023l.onStateChanged(source, event);
                    return;
                }
                return;
        }
    }
}
