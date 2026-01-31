package f3;

import java.util.NoSuchElementException;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5452b extends t1 {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0293b f30870a = EnumC0293b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f30871b;

    /* renamed from: f3.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30872a;

        static {
            int[] iArr = new int[EnumC0293b.values().length];
            f30872a = iArr;
            try {
                iArr[EnumC0293b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30872a[EnumC0293b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: f3.b$b, reason: collision with other inner class name */
    private enum EnumC0293b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC5452b() {
    }

    private boolean b() {
        this.f30870a = EnumC0293b.FAILED;
        this.f30871b = computeNext();
        if (this.f30870a == EnumC0293b.DONE) {
            return false;
        }
        this.f30870a = EnumC0293b.READY;
        return true;
    }

    protected final Object a() {
        this.f30870a = EnumC0293b.DONE;
        return null;
    }

    protected abstract Object computeNext();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        e3.w.checkState(this.f30870a != EnumC0293b.FAILED);
        int i8 = a.f30872a[this.f30870a.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            return b();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f30870a = EnumC0293b.NOT_READY;
        Object objA = N0.a(this.f30871b);
        this.f30871b = null;
        return objA;
    }

    public final Object peek() {
        if (hasNext()) {
            return N0.a(this.f30871b);
        }
        throw new NoSuchElementException();
    }
}
