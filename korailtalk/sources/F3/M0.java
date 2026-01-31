package f3;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class M0 extends T0 implements Serializable {

    /* renamed from: c */
    static final M0 f30813c = new M0();

    /* renamed from: a */
    private transient T0 f30814a;

    /* renamed from: b */
    private transient T0 f30815b;

    private M0() {
    }

    @Override // f3.T0
    public <S extends Comparable<?>> T0 nullsFirst() {
        T0 t02 = this.f30814a;
        if (t02 != null) {
            return t02;
        }
        T0 t0NullsFirst = super.nullsFirst();
        this.f30814a = t0NullsFirst;
        return t0NullsFirst;
    }

    @Override // f3.T0
    public <S extends Comparable<?>> T0 nullsLast() {
        T0 t02 = this.f30815b;
        if (t02 != null) {
            return t02;
        }
        T0 t0NullsLast = super.nullsLast();
        this.f30815b = t0NullsLast;
        return t0NullsLast;
    }

    @Override // f3.T0
    public <S extends Comparable<?>> T0 reverse() {
        return e1.f30929a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        e3.w.checkNotNull(comparable);
        e3.w.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }
}
