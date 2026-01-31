package S6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0758b implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private j0 f4687a = j0.NotReady;

    /* renamed from: b, reason: collision with root package name */
    private Object f4688b;

    /* renamed from: S6.b$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean d() {
        this.f4687a = j0.Failed;
        a();
        return this.f4687a == j0.Ready;
    }

    protected abstract void a();

    protected final void b() {
        this.f4687a = j0.Done;
    }

    protected final void c(Object obj) {
        this.f4688b = obj;
        this.f4687a = j0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        j0 j0Var = this.f4687a;
        if (j0Var == j0.Failed) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i8 = a.$EnumSwitchMapping$0[j0Var.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4687a = j0.NotReady;
        return this.f4688b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
