package f3;

import f3.AbstractC5465h0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: f3.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5482q extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final transient AbstractC5465h0 f31070a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int[] f31071b;

    /* renamed from: f3.q$a */
    class a extends AbstractC5465h0 {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31072c;

        a(int i8) {
            this.f31072c = i8;
        }

        @Override // java.util.List
        public Object get(int i8) {
            e3.w.checkElementIndex(i8, size());
            return ((List) C5482q.this.f31070a.get(i8)).get(C5482q.this.d(this.f31072c, i8));
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C5482q.this.f31070a.size();
        }
    }

    C5482q(AbstractC5465h0 abstractC5465h0) {
        this.f31070a = abstractC5465h0;
        int[] iArr = new int[abstractC5465h0.size() + 1];
        iArr[abstractC5465h0.size()] = 1;
        try {
            for (int size = abstractC5465h0.size() - 1; size >= 0; size--) {
                iArr[size] = i3.b.checkedMultiply(iArr[size + 1], ((List) abstractC5465h0.get(size)).size());
            }
            this.f31071b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    static List c(List list) {
        AbstractC5465h0.a aVar = new AbstractC5465h0.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5465h0 abstractC5465h0CopyOf = AbstractC5465h0.copyOf((Collection) it.next());
            if (abstractC5465h0CopyOf.isEmpty()) {
                return AbstractC5465h0.of();
            }
            aVar.add((Object) abstractC5465h0CopyOf);
        }
        return new C5482q(aVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i8, int i9) {
        return (i8 / this.f31071b[i9 + 1]) % ((List) this.f31070a.get(i9)).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.f31070a.size()) {
            return false;
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (!((List) this.f31070a.get(i8)).contains(it.next())) {
                return false;
            }
            i8++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f31070a.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i8 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = ((List) this.f31070a.get(iNextIndex)).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i8 += iIndexOf * this.f31071b[iNextIndex + 1];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f31070a.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i8 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = ((List) this.f31070a.get(iNextIndex)).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i8 += iLastIndexOf * this.f31071b[iNextIndex + 1];
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31071b[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public AbstractC5465h0 get(int i8) {
        e3.w.checkElementIndex(i8, size());
        return new a(i8);
    }
}
