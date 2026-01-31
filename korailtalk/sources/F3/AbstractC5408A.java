package f3;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* renamed from: f3.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5408A {

    /* renamed from: a, reason: collision with root package name */
    final boolean f30587a;

    /* renamed from: f3.A$b */
    private static final class b extends AbstractC5408A implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final b f30588b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final BigInteger f30589c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d, reason: collision with root package name */
        private static final BigInteger f30590d = BigInteger.valueOf(Long.MAX_VALUE);

        b() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // f3.AbstractC5408A
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f30589c).min(f30590d).longValue();
        }

        @Override // f3.AbstractC5408A
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // f3.AbstractC5408A
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* renamed from: f3.A$c */
    private static final class c extends AbstractC5408A implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final c f30591b = new c();

        c() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // f3.AbstractC5408A
        public long distance(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // f3.AbstractC5408A
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // f3.AbstractC5408A
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // f3.AbstractC5408A
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // f3.AbstractC5408A
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    /* renamed from: f3.A$d */
    private static final class d extends AbstractC5408A implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final d f30592b = new d();

        d() {
            super(true);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // f3.AbstractC5408A
        public long distance(Long l8, Long l9) {
            long jLongValue = l9.longValue() - l8.longValue();
            if (l9.longValue() > l8.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l9.longValue() >= l8.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // f3.AbstractC5408A
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // f3.AbstractC5408A
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // f3.AbstractC5408A
        public Long next(Long l8) {
            long jLongValue = l8.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // f3.AbstractC5408A
        public Long previous(Long l8) {
            long jLongValue = l8.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public static AbstractC5408A bigIntegers() {
        return b.f30588b;
    }

    public static AbstractC5408A integers() {
        return c.f30591b;
    }

    public static AbstractC5408A longs() {
        return d.f30592b;
    }

    public abstract long distance(Comparable comparable, Comparable comparable2);

    public Comparable maxValue() {
        throw new NoSuchElementException();
    }

    public Comparable minValue() {
        throw new NoSuchElementException();
    }

    public abstract Comparable next(Comparable comparable);

    public abstract Comparable previous(Comparable comparable);

    protected AbstractC5408A() {
        this(false);
    }

    private AbstractC5408A(boolean z8) {
        this.f30587a = z8;
    }
}
