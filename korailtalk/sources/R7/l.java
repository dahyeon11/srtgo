package R7;

import Q7.C0697a;
import Q7.C0708l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public class l extends m {

    /* renamed from: e, reason: collision with root package name */
    private boolean f4513e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4514f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4515g;

    /* renamed from: h, reason: collision with root package name */
    protected String[] f4516h;

    /* renamed from: i, reason: collision with root package name */
    protected String[] f4517i;

    /* renamed from: j, reason: collision with root package name */
    private Class f4518j;

    public l(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] e(int i8) {
        return new String[i8];
    }

    static String[] f(Collection collection) {
        return collection == null ? C0708l.EMPTY_STRING_ARRAY : g(collection.toArray());
    }

    static String[] g(Object[] objArr) {
        return (String[]) W7.o.nonNull(objArr).map(new j()).toArray(new IntFunction() { // from class: R7.k
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return l.e(i8);
            }
        });
    }

    private void h() {
        if (C0708l.containsAny(this.f4516h, this.f4517i)) {
            o.s0(getObject());
            throw new IllegalStateException("includeFieldNames and excludeFieldNames must not intersect");
        }
    }

    public static String toString(Object obj) {
        return toString(obj, null, false, false, null);
    }

    public static String toStringExclude(Object obj, Collection<String> collection) {
        return toStringExclude(obj, f(collection));
    }

    public static String toStringInclude(Object obj, Collection<String> collection) {
        return toStringInclude(obj, f(collection));
    }

    protected boolean b(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !isAppendTransients()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !isAppendStatics()) {
            return false;
        }
        String[] strArr = this.f4516h;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return C0708l.isNotEmpty(this.f4517i) ? Arrays.binarySearch(this.f4517i, field.getName()) >= 0 : !field.isAnnotationPresent(n.class);
        }
        return false;
    }

    protected void c(Class cls) throws SecurityException {
        if (cls.isArray()) {
            reflectionAppendArray(getObject());
            return;
        }
        Field[] fieldArr = (Field[]) C0697a.sort(cls.getDeclaredFields(), Comparator.comparing(new e()));
        AccessibleObject.setAccessible(fieldArr, true);
        for (Field field : fieldArr) {
            String name = field.getName();
            if (b(field)) {
                try {
                    Object objD = d(field);
                    if (!this.f4515g || objD != null) {
                        append(name, objD, !field.isAnnotationPresent(p.class));
                    }
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(e8);
                }
            }
        }
    }

    protected Object d(Field field) {
        return field.get(getObject());
    }

    public String[] getExcludeFieldNames() {
        return (String[]) this.f4516h.clone();
    }

    public String[] getIncludeFieldNames() {
        return (String[]) this.f4517i.clone();
    }

    public Class<?> getUpToClass() {
        return this.f4518j;
    }

    public boolean isAppendStatics() {
        return this.f4513e;
    }

    public boolean isAppendTransients() {
        return this.f4514f;
    }

    public boolean isExcludeNullValues() {
        return this.f4515g;
    }

    public l reflectionAppendArray(Object obj) {
        getStyle().Z(getStringBuffer(), null, obj);
        return this;
    }

    public void setAppendStatics(boolean z8) {
        this.f4513e = z8;
    }

    public void setAppendTransients(boolean z8) {
        this.f4514f = z8;
    }

    public l setExcludeFieldNames(String... strArr) {
        if (strArr == null) {
            this.f4516h = null;
        } else {
            this.f4516h = (String[]) C0697a.sort(g(strArr));
        }
        return this;
    }

    public void setExcludeNullValues(boolean z8) {
        this.f4515g = z8;
    }

    public l setIncludeFieldNames(String... strArr) {
        if (strArr == null) {
            this.f4517i = null;
        } else {
            this.f4517i = (String[]) C0697a.sort(g(strArr));
        }
        return this;
    }

    public void setUpToClass(Class<?> cls) {
        Object object;
        if (cls != null && (object = getObject()) != null && !cls.isInstance(object)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.f4518j = cls;
    }

    public l(Object obj, o oVar) {
        super(obj, oVar);
    }

    public static String toString(Object obj, o oVar) {
        return toString(obj, oVar, false, false, null);
    }

    public static String toStringExclude(Object obj, String... strArr) {
        return new l(obj).setExcludeFieldNames(strArr).toString();
    }

    public static String toStringInclude(Object obj, String... strArr) {
        return new l(obj).setIncludeFieldNames(strArr).toString();
    }

    public l(Object obj, o oVar, StringBuffer stringBuffer) {
        super(obj, oVar, stringBuffer);
    }

    public static String toString(Object obj, o oVar, boolean z8) {
        return toString(obj, oVar, z8, false, null);
    }

    public <T> l(T t8, o oVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z8, boolean z9) {
        super(t8, oVar, stringBuffer);
        setUpToClass(cls);
        setAppendTransients(z8);
        setAppendStatics(z9);
    }

    public static String toString(Object obj, o oVar, boolean z8, boolean z9) {
        return toString(obj, oVar, z8, z9, null);
    }

    public static <T> String toString(T t8, o oVar, boolean z8, boolean z9, boolean z10, Class<? super T> cls) {
        return new l(t8, oVar, null, cls, z8, z9, z10).toString();
    }

    public static <T> String toString(T t8, o oVar, boolean z8, boolean z9, Class<? super T> cls) {
        return new l(t8, oVar, null, cls, z8, z9).toString();
    }

    public <T> l(T t8, o oVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z8, boolean z9, boolean z10) {
        super(t8, oVar, stringBuffer);
        setUpToClass(cls);
        setAppendTransients(z8);
        setAppendStatics(z9);
        setExcludeNullValues(z10);
    }

    @Override // R7.m
    public String toString() throws SecurityException {
        if (getObject() == null) {
            return getStyle().U();
        }
        h();
        Class<?> superclass = getObject().getClass();
        c(superclass);
        while (superclass.getSuperclass() != null && superclass != getUpToClass()) {
            superclass = superclass.getSuperclass();
            c(superclass);
        }
        return super.toString();
    }
}
