package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1019h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f10031a = new AtomicReference();

    /* renamed from: androidx.lifecycle.h$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0154a Companion = new C0154a(null);

        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C0154a {

            /* renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0155a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ C0154a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a downFrom(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i8 = C0155a.$EnumSwitchMapping$0[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_DESTROY;
                }
                if (i8 == 2) {
                    return a.ON_STOP;
                }
                if (i8 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a downTo(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i8 = C0155a.$EnumSwitchMapping$0[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_STOP;
                }
                if (i8 == 2) {
                    return a.ON_PAUSE;
                }
                if (i8 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            public final a upFrom(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i8 = C0155a.$EnumSwitchMapping$0[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_START;
                }
                if (i8 == 2) {
                    return a.ON_RESUME;
                }
                if (i8 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a upTo(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i8 = C0155a.$EnumSwitchMapping$0[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_CREATE;
                }
                if (i8 == 2) {
                    return a.ON_START;
                }
                if (i8 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0154a() {
            }
        }

        /* renamed from: androidx.lifecycle.h$a$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            return Companion.downFrom(bVar);
        }

        public static final a downTo(b bVar) {
            return Companion.downTo(bVar);
        }

        public static final a upFrom(b bVar) {
            return Companion.upFrom(bVar);
        }

        public static final a upTo(b bVar) {
            return Companion.upTo(bVar);
        }

        public final b getTargetState() {
            switch (b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void addObserver(InterfaceC1024m interfaceC1024m);

    public abstract b getCurrentState();

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.f10031a;
    }

    public abstract void removeObserver(InterfaceC1024m interfaceC1024m);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.f10031a = atomicReference;
    }
}
