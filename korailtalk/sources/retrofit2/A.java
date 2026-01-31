package retrofit2;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    private static final z f35931a = new A();

    A() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (B.m(annotationArr, z.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f35931a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return z.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof z;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + z.class.getName() + "()";
    }
}
