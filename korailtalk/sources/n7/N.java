package n7;

import t7.AbstractC6368a;
import t7.AbstractC6369b;

/* loaded from: classes3.dex */
public enum N {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N.values().length];
            try {
                iArr[N.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final <T> void invoke(f7.l lVar, W6.d<? super T> dVar) throws Throwable {
        int i8 = a.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            AbstractC6368a.startCoroutineCancellable(lVar, dVar);
            return;
        }
        if (i8 == 2) {
            W6.f.startCoroutine(lVar, dVar);
        } else if (i8 == 3) {
            AbstractC6369b.startCoroutineUndispatched(lVar, dVar);
        } else if (i8 != 4) {
            throw new R6.n();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(f7.p pVar, R r8, W6.d<? super T> dVar) throws Throwable {
        int i8 = a.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            AbstractC6368a.startCoroutineCancellable$default(pVar, r8, dVar, null, 4, null);
            return;
        }
        if (i8 == 2) {
            W6.f.startCoroutine(pVar, r8, dVar);
        } else if (i8 == 3) {
            AbstractC6369b.startCoroutineUndispatched(pVar, r8, dVar);
        } else if (i8 != 4) {
            throw new R6.n();
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
