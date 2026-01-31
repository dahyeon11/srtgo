package s7;

import R6.q;
import a.AbstractC0819b;
import a.C0818a;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class J {

    /* renamed from: a */
    private static final StackTraceElement f36325a = new C0818a().coroutineBoundary();

    /* renamed from: b */
    private static final String f36326b;

    /* renamed from: c */
    private static final String f36327c;

    static {
        Object objM67constructorimpl;
        Object objM67constructorimpl2;
        try {
            q.a aVar = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(Y6.a.class.getCanonicalName());
        } catch (Throwable th) {
            q.a aVar2 = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
        }
        if (R6.q.m70exceptionOrNullimpl(objM67constructorimpl) != null) {
            objM67constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f36326b = (String) objM67constructorimpl;
        try {
            objM67constructorimpl2 = R6.q.m67constructorimpl(J.class.getCanonicalName());
        } catch (Throwable th2) {
            q.a aVar3 = R6.q.Companion;
            objM67constructorimpl2 = R6.q.m67constructorimpl(R6.r.createFailure(th2));
        }
        if (R6.q.m70exceptionOrNullimpl(objM67constructorimpl2) != null) {
            objM67constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f36327c = (String) objM67constructorimpl2;
    }

    private static final R6.p a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), th.getClass())) {
            return R6.v.to(th, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return R6.v.to(cause, stackTrace);
            }
        }
        return R6.v.to(th, new StackTraceElement[0]);
    }

    private static final Throwable b(Throwable th, Throwable th2, ArrayDeque arrayDeque) {
        arrayDeque.addFirst(f36325a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int iE = e(stackTrace, f36326b);
        int i8 = 0;
        if (iE == -1) {
            th2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return th2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iE];
        for (int i9 = 0; i9 < iE; i9++) {
            stackTraceElementArr[i9] = stackTrace[i9];
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i8 + iE] = (StackTraceElement) it.next();
            i8++;
        }
        th2.setStackTrace(stackTraceElementArr);
        return th2;
    }

    private static final ArrayDeque c(Y6.e eVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean d(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i8].getClassName())) {
                return i8;
            }
        }
        return -1;
    }

    private static final void f(StackTraceElement[] stackTraceElementArr, ArrayDeque arrayDeque) {
        int length = stackTraceElementArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i8])) {
                break;
            } else {
                i8++;
            }
        }
        int i9 = i8 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i9 > length2) {
            return;
        }
        while (true) {
            if (d(stackTraceElementArr[length2], (StackTraceElement) arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i9) {
                return;
            } else {
                length2--;
            }
        }
    }

    public static final Throwable g(Throwable th, Y6.e eVar) {
        R6.p pVarA = a(th);
        Throwable th2 = (Throwable) pVarA.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVarA.component2();
        Throwable thTryCopyException = AbstractC6254o.tryCopyException(th2);
        if (thTryCopyException == null) {
            return th;
        }
        ArrayDeque arrayDequeC = c(eVar);
        if (arrayDequeC.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            f(stackTraceElementArr, arrayDequeC);
        }
        return b(th2, thTryCopyException, arrayDequeC);
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return l7.r.startsWith$default(stackTraceElement.getClassName(), AbstractC0819b.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, (Object) null);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e8) {
        return e8;
    }

    public static final <E extends Throwable> E unwrapImpl(E e8) {
        E e9 = (E) e8.getCause();
        if (e9 != null && Intrinsics.areEqual(e9.getClass(), e8.getClass())) {
            for (StackTraceElement stackTraceElement : e8.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e9;
                }
            }
        }
        return e8;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e8, W6.d<?> dVar) {
        return e8;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    public static final <E extends Throwable> E unwrap(E e8) {
        return e8;
    }

    public static final Object recoverAndThrow(Throwable th, W6.d<?> dVar) throws Throwable {
        throw th;
    }
}
