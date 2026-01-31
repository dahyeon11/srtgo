package S7;

import Q7.C;
import Q7.C0708l;
import Q7.X;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f4771a = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    @Deprecated
    public f() {
    }

    public static <T extends RuntimeException> T asRuntimeException(Throwable th) {
        return (T) b(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable c(Throwable th, String str) throws NoSuchMethodException, SecurityException {
        Method method;
        if (str != null) {
            try {
                method = th.getClass().getMethod(str, null);
            } catch (NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
                try {
                    return (Throwable) method.invoke(th, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    static List d(Throwable th) {
        StringTokenizer stringTokenizer = new StringTokenizer(getStackTrace(th), System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z8 = true;
            } else if (z8) {
                break;
            }
        }
        return arrayList;
    }

    static String[] e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    private static int f(Throwable th, Class cls, int i8, boolean z8) {
        if (th != null && cls != null) {
            if (i8 < 0) {
                i8 = 0;
            }
            Throwable[] throwables = getThrowables(th);
            if (i8 >= throwables.length) {
                return -1;
            }
            if (z8) {
                while (i8 < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i8].getClass())) {
                        return i8;
                    }
                    i8++;
                }
            } else {
                while (i8 < throwables.length) {
                    if (cls.equals(throwables[i8].getClass())) {
                        return i8;
                    }
                    i8++;
                }
            }
        }
        return -1;
    }

    public static void forEach(Throwable th, Consumer<Throwable> consumer) {
        stream(th).forEach(consumer);
    }

    @Deprecated
    public static Throwable getCause(Throwable th) {
        return getCause(th, null);
    }

    @Deprecated
    public static String[] getDefaultCauseMethodNames() {
        return (String[]) C0708l.clone(f4771a);
    }

    public static String getMessage(Throwable th) {
        if (th == null) {
            return "";
        }
        return C.getShortClassName(th, null) + ": " + X.defaultString(th.getMessage());
    }

    public static Throwable getRootCause(Throwable th) {
        List<Throwable> throwableList = getThrowableList(th);
        if (throwableList.isEmpty()) {
            return null;
        }
        return throwableList.get(throwableList.size() - 1);
    }

    public static String getRootCauseMessage(Throwable th) {
        Throwable rootCause = getRootCause(th);
        if (rootCause != null) {
            th = rootCause;
        }
        return getMessage(th);
    }

    public static String[] getRootCauseStackTrace(Throwable th) {
        return (String[]) getRootCauseStackTraceList(th).toArray(C0708l.EMPTY_STRING_ARRAY);
    }

    public static List<String> getRootCauseStackTraceList(Throwable th) {
        List listD;
        if (th == null) {
            return Collections.emptyList();
        }
        Throwable[] throwables = getThrowables(th);
        int length = throwables.length;
        ArrayList arrayList = new ArrayList();
        int i8 = length - 1;
        List listD2 = d(throwables[i8]);
        while (true) {
            int i9 = length - 1;
            if (i9 < 0) {
                return arrayList;
            }
            if (i9 != 0) {
                listD = d(throwables[length - 2]);
                removeCommonFrames(listD2, listD);
            } else {
                listD = listD2;
            }
            if (i9 == i8) {
                arrayList.add(throwables[i9].toString());
            } else {
                arrayList.add(" [wrapped] " + throwables[i9].toString());
            }
            arrayList.addAll(listD2);
            listD2 = listD;
            length = i9;
        }
    }

    public static String[] getStackFrames(Throwable th) {
        return th == null ? C0708l.EMPTY_STRING_ARRAY : e(getStackTrace(th));
    }

    public static String getStackTrace(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.toString();
    }

    public static int getThrowableCount(Throwable th) {
        return getThrowableList(th).size();
    }

    public static List<Throwable> getThrowableList(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    public static Throwable[] getThrowables(Throwable th) {
        return (Throwable[]) getThrowableList(th).toArray(C0708l.EMPTY_THROWABLE_ARRAY);
    }

    private static Throwable h(Throwable th, Class cls, int i8, boolean z8) {
        if (th != null && cls != null) {
            if (i8 < 0) {
                i8 = 0;
            }
            Throwable[] throwables = getThrowables(th);
            if (i8 >= throwables.length) {
                return null;
            }
            if (z8) {
                while (i8 < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i8].getClass())) {
                        return (Throwable) cls.cast(throwables[i8]);
                    }
                    i8++;
                }
            } else {
                while (i8 < throwables.length) {
                    if (cls.equals(throwables[i8].getClass())) {
                        return (Throwable) cls.cast(throwables[i8]);
                    }
                    i8++;
                }
            }
        }
        return null;
    }

    public static boolean hasCause(Throwable th, Class<? extends Throwable> cls) {
        if (th instanceof UndeclaredThrowableException) {
            th = th.getCause();
        }
        return cls.isInstance(th);
    }

    public static int indexOfThrowable(Throwable th, Class<? extends Throwable> cls) {
        return f(th, cls, 0, false);
    }

    public static int indexOfType(Throwable th, Class<? extends Throwable> cls) {
        return f(th, cls, 0, true);
    }

    public static boolean isChecked(Throwable th) {
        return (th == null || (th instanceof Error) || (th instanceof RuntimeException)) ? false : true;
    }

    public static boolean isUnchecked(Throwable th) {
        return th != null && ((th instanceof Error) || (th instanceof RuntimeException));
    }

    public static void printRootCauseStackTrace(Throwable th) {
        printRootCauseStackTrace(th, System.err);
    }

    public static void removeCommonFrames(List<String> list, List<String> list2) {
        Objects.requireNonNull(list, "causeFrames");
        Objects.requireNonNull(list2, "wrapperFrames");
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    @Deprecated
    public static <T> T rethrow(Throwable th) {
        return (T) b(th);
    }

    public static Stream<Throwable> stream(Throwable th) {
        return getThrowableList(th).stream();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static <T> T throwUnchecked(T t8) {
        if (t8 instanceof RuntimeException) {
            throw ((RuntimeException) t8);
        }
        if (t8 instanceof Error) {
            throw ((Error) t8);
        }
        return t8;
    }

    public static <T extends Throwable> T throwableOfThrowable(Throwable th, Class<T> cls) {
        return (T) h(th, cls, 0, false);
    }

    public static <T extends Throwable> T throwableOfType(Throwable th, Class<T> cls) {
        return (T) h(th, cls, 0, true);
    }

    public static <R> R wrapAndThrow(Throwable th) {
        throw new UndeclaredThrowableException(throwUnchecked(th));
    }

    @Deprecated
    public static Throwable getCause(final Throwable th, String[] strArr) {
        if (th == null) {
            return null;
        }
        if (strArr == null) {
            Throwable cause = th.getCause();
            if (cause != null) {
                return cause;
            }
            strArr = f4771a;
        }
        return (Throwable) Stream.of((Object[]) strArr).map(new Function() { // from class: S7.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f.c(th, (String) obj);
            }
        }).filter(new Predicate() { // from class: S7.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((Throwable) obj);
            }
        }).findFirst().orElse(null);
    }

    public static int indexOfThrowable(Throwable th, Class<? extends Throwable> cls, int i8) {
        return f(th, cls, i8, false);
    }

    public static int indexOfType(Throwable th, Class<? extends Throwable> cls, int i8) {
        return f(th, cls, i8, true);
    }

    public static void printRootCauseStackTrace(Throwable th, final PrintStream printStream) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printStream, "printStream");
        getRootCauseStackTraceList(th).forEach(new Consumer() { // from class: S7.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                printStream.println((String) obj);
            }
        });
        printStream.flush();
    }

    public static <T extends Throwable> T throwableOfThrowable(Throwable th, Class<T> cls, int i8) {
        return (T) h(th, cls, i8, false);
    }

    public static <T extends Throwable> T throwableOfType(Throwable th, Class<T> cls, int i8) {
        return (T) h(th, cls, i8, true);
    }

    public static void printRootCauseStackTrace(Throwable th, final PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printWriter, "printWriter");
        getRootCauseStackTraceList(th).forEach(new Consumer() { // from class: S7.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                printWriter.println((String) obj);
            }
        });
        printWriter.flush();
    }

    public static <T extends Throwable> T throwUnchecked(T t8) {
        if (isUnchecked(t8)) {
            throw asRuntimeException(t8);
        }
        return t8;
    }

    private static Object b(Throwable th) throws Throwable {
        throw th;
    }
}
