package e3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5357b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0276b f30334a = EnumC0276b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f30335b;

    /* renamed from: e3.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30336a;

        static {
            int[] iArr = new int[EnumC0276b.values().length];
            f30336a = iArr;
            try {
                iArr[EnumC0276b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30336a[EnumC0276b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: e3.b$b, reason: collision with other inner class name */
    private enum EnumC0276b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC5357b() {
    }

    private boolean c() {
        this.f30334a = EnumC0276b.FAILED;
        this.f30335b = a();
        if (this.f30334a == EnumC0276b.DONE) {
            return false;
        }
        this.f30334a = EnumC0276b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f30334a = EnumC0276b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        w.checkState(this.f30334a != EnumC0276b.FAILED);
        int i8 = a.f30336a[this.f30334a.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f30334a = EnumC0276b.NOT_READY;
        Object objA = q.a(this.f30335b);
        this.f30335b = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
