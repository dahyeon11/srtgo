package j7;

import Q7.C;
import j7.C5835a;
import j7.j;
import j7.m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u extends t {
    public static final /* synthetic */ boolean byteRangeContains(g gVar, double d9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d9);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t8, T minimumValue) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t8.compareTo(minimumValue) < 0 ? minimumValue : t8;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t8, T maximumValue) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t8.compareTo(maximumValue) > 0 ? maximumValue : t8;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t8, T t9, T t10) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        if (t9 == null || t10 == null) {
            if (t9 != null && t8.compareTo(t9) < 0) {
                return t9;
            }
            if (t10 != null && t8.compareTo(t10) > 0) {
                return t10;
            }
        } else {
            if (t9.compareTo(t10) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t10 + " is less than minimum " + t9 + C.PACKAGE_SEPARATOR_CHAR);
            }
            if (t8.compareTo(t9) < 0) {
                return t9;
            }
            if (t8.compareTo(t10) > 0) {
                return t10;
            }
        }
        return t8;
    }

    public static final /* synthetic */ boolean doubleRangeContains(g gVar, byte b9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Double.valueOf(b9));
    }

    public static final j downTo(int i8, byte b9) {
        return j.Companion.fromClosedRange(i8, b9, -1);
    }

    public static final int first(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    public static final Integer firstOrNull(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.getFirst());
    }

    public static final /* synthetic */ boolean floatRangeContains(g gVar, byte b9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Float.valueOf(b9));
    }

    public static final boolean intRangeContains(g gVar, byte b9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Integer.valueOf(b9));
    }

    public static final int last(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.getLast();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    public static final Integer lastOrNull(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.getLast());
    }

    public static final boolean longRangeContains(g gVar, byte b9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Long.valueOf(b9));
    }

    public static final int random(l lVar, h7.f random) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return h7.g.nextInt(random, lVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Integer randomOrNull(l lVar, h7.f random) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(h7.g.nextInt(random, lVar));
    }

    public static final j reversed(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return j.Companion.fromClosedRange(jVar.getLast(), jVar.getFirst(), -jVar.getStep());
    }

    public static final boolean shortRangeContains(g gVar, byte b9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Short.valueOf(b9));
    }

    public static j step(j jVar, int i8) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        t.checkStepIsPositive(i8 > 0, Integer.valueOf(i8));
        j.a aVar = j.Companion;
        int first = jVar.getFirst();
        int last = jVar.getLast();
        if (jVar.getStep() <= 0) {
            i8 = -i8;
        }
        return aVar.fromClosedRange(first, last, i8);
    }

    public static final Byte toByteExactOrNull(int i8) {
        if (new l(-128, 127).contains(i8)) {
            return Byte.valueOf((byte) i8);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j8) {
        if (new o(-2147483648L, 2147483647L).contains(j8)) {
            return Integer.valueOf((int) j8);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d9) {
        if (-9.223372036854776E18d > d9 || d9 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d9);
    }

    public static final Short toShortExactOrNull(int i8) {
        if (new l(-32768, 32767).contains(i8)) {
            return Short.valueOf((short) i8);
        }
        return null;
    }

    public static final l until(int i8, byte b9) {
        return new l(i8, b9 - 1);
    }

    public static final /* synthetic */ boolean byteRangeContains(g gVar, float f8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f8);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b9, byte b10) {
        return b9 < b10 ? b10 : b9;
    }

    public static final byte coerceAtMost(byte b9, byte b10) {
        return b9 > b10 ? b10 : b9;
    }

    public static final boolean doubleRangeContains(g gVar, float f8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Double.valueOf(f8));
    }

    public static final m downTo(long j8, byte b9) {
        return m.Companion.fromClosedRange(j8, b9, -1L);
    }

    public static final Long firstOrNull(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.getFirst());
    }

    public static final boolean floatRangeContains(g gVar, double d9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Float.valueOf((float) d9));
    }

    public static final boolean intRangeContains(r rVar, byte b9) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Integer.valueOf(b9));
    }

    public static final Long lastOrNull(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.getLast());
    }

    public static final boolean longRangeContains(r rVar, byte b9) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Long.valueOf(b9));
    }

    public static final m reversed(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m.Companion.fromClosedRange(mVar.getLast(), mVar.getFirst(), -mVar.getStep());
    }

    public static final boolean shortRangeContains(r rVar, byte b9) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Short.valueOf(b9));
    }

    public static final Byte toByteExactOrNull(long j8) {
        if (new o(-128L, 127L).contains(j8)) {
            return Byte.valueOf((byte) j8);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d9) {
        if (-2.147483648E9d > d9 || d9 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d9);
    }

    public static final Long toLongExactOrNull(float f8) {
        if (-9.223372E18f > f8 || f8 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f8);
    }

    public static final Short toShortExactOrNull(long j8) {
        if (new o(-32768L, 32767L).contains(j8)) {
            return Short.valueOf((short) j8);
        }
        return null;
    }

    public static final o until(long j8, byte b9) {
        return new o(j8, b9 - 1);
    }

    public static final boolean byteRangeContains(g gVar, int i8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i8);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s8, short s9) {
        return s8 < s9 ? s9 : s8;
    }

    public static final short coerceAtMost(short s8, short s9) {
        return s8 > s9 ? s9 : s8;
    }

    public static final boolean doubleRangeContains(r rVar, float f8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Double.valueOf(f8));
    }

    public static final j downTo(byte b9, byte b10) {
        return j.Companion.fromClosedRange(b9, b10, -1);
    }

    public static final Character firstOrNull(C5835a c5835a) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        if (c5835a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c5835a.getFirst());
    }

    public static final /* synthetic */ boolean floatRangeContains(g gVar, int i8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Float.valueOf(i8));
    }

    public static final /* synthetic */ boolean intRangeContains(g gVar, double d9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d9);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final Character lastOrNull(C5835a c5835a) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        if (c5835a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c5835a.getLast());
    }

    public static final /* synthetic */ boolean longRangeContains(g gVar, double d9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(d9);
        if (longExactOrNull != null) {
            return gVar.contains(longExactOrNull);
        }
        return false;
    }

    public static final long random(o oVar, h7.f random) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return h7.g.nextLong(random, oVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Long randomOrNull(o oVar, h7.f random) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(h7.g.nextLong(random, oVar));
    }

    public static final C5835a reversed(C5835a c5835a) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        return C5835a.Companion.fromClosedRange(c5835a.getLast(), c5835a.getFirst(), -c5835a.getStep());
    }

    public static final /* synthetic */ boolean shortRangeContains(g gVar, double d9) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d9);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final m step(m mVar, long j8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        t.checkStepIsPositive(j8 > 0, Long.valueOf(j8));
        m.a aVar = m.Companion;
        long first = mVar.getFirst();
        long last = mVar.getLast();
        if (mVar.getStep() <= 0) {
            j8 = -j8;
        }
        return aVar.fromClosedRange(first, last, j8);
    }

    public static final Byte toByteExactOrNull(short s8) {
        if (intRangeContains((g) new l(-128, 127), s8)) {
            return Byte.valueOf((byte) s8);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(float f8) {
        if (-2.1474836E9f > f8 || f8 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f8);
    }

    public static final Short toShortExactOrNull(double d9) {
        if (-32768.0d > d9 || d9 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d9);
    }

    public static final l until(byte b9, byte b10) {
        return new l(b9, b10 - 1);
    }

    public static final boolean byteRangeContains(r rVar, int i8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i8);
        if (byteExactOrNull != null) {
            return rVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i8, int i9) {
        return i8 < i9 ? i9 : i8;
    }

    public static int coerceAtMost(int i8, int i9) {
        return i8 > i9 ? i9 : i8;
    }

    public static final /* synthetic */ boolean doubleRangeContains(g gVar, int i8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Double.valueOf(i8));
    }

    public static final j downTo(short s8, byte b9) {
        return j.Companion.fromClosedRange(s8, b9, -1);
    }

    public static final long first(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    public static final /* synthetic */ boolean floatRangeContains(g gVar, long j8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Float.valueOf(j8));
    }

    public static final /* synthetic */ boolean intRangeContains(g gVar, float f8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f8);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final long last(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.getLast();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    public static final /* synthetic */ boolean longRangeContains(g gVar, float f8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(f8);
        if (longExactOrNull != null) {
            return gVar.contains(longExactOrNull);
        }
        return false;
    }

    public static final /* synthetic */ boolean shortRangeContains(g gVar, float f8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f8);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final Byte toByteExactOrNull(double d9) {
        if (-128.0d > d9 || d9 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d9);
    }

    public static final Short toShortExactOrNull(float f8) {
        if (-32768.0f > f8 || f8 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f8);
    }

    public static final l until(short s8, byte b9) {
        return new l(s8, b9 - 1);
    }

    public static final boolean byteRangeContains(g gVar, long j8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j8);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j8, long j9) {
        return j8 < j9 ? j9 : j8;
    }

    public static long coerceAtMost(long j8, long j9) {
        return j8 > j9 ? j9 : j8;
    }

    public static final /* synthetic */ boolean doubleRangeContains(g gVar, long j8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Double.valueOf(j8));
    }

    public static final C5835a downTo(char c9, char c10) {
        return C5835a.Companion.fromClosedRange(c9, c10, -1);
    }

    public static final /* synthetic */ boolean floatRangeContains(g gVar, short s8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Float.valueOf(s8));
    }

    public static final boolean intRangeContains(g gVar, long j8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j8);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(g gVar, int i8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Long.valueOf(i8));
    }

    public static final char random(c cVar, h7.f random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Character randomOrNull(c cVar, h7.f random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1));
    }

    public static final boolean shortRangeContains(g gVar, int i8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i8);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final C5835a step(C5835a c5835a, int i8) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        t.checkStepIsPositive(i8 > 0, Integer.valueOf(i8));
        C5835a.C0335a c0335a = C5835a.Companion;
        char first = c5835a.getFirst();
        char last = c5835a.getLast();
        if (c5835a.getStep() <= 0) {
            i8 = -i8;
        }
        return c0335a.fromClosedRange(first, last, i8);
    }

    public static final Byte toByteExactOrNull(float f8) {
        if (-128.0f > f8 || f8 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f8);
    }

    public static final c until(char c9, char c10) {
        return Intrinsics.compare((int) c10, 0) <= 0 ? c.Companion.getEMPTY() : new c(c9, (char) (c10 - 1));
    }

    public static final boolean byteRangeContains(r rVar, long j8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j8);
        if (byteExactOrNull != null) {
            return rVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f8, float f9) {
        return f8 < f9 ? f9 : f8;
    }

    public static float coerceAtMost(float f8, float f9) {
        return f8 > f9 ? f9 : f8;
    }

    public static final /* synthetic */ boolean doubleRangeContains(g gVar, short s8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Double.valueOf(s8));
    }

    public static j downTo(int i8, int i9) {
        return j.Companion.fromClosedRange(i8, i9, -1);
    }

    public static final boolean intRangeContains(r rVar, long j8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j8);
        if (intExactOrNull != null) {
            return rVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(r rVar, int i8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Long.valueOf(i8));
    }

    public static final boolean shortRangeContains(r rVar, int i8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i8);
        if (shortExactOrNull != null) {
            return rVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(g gVar, short s8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s8);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d9, double d10) {
        return d9 < d10 ? d10 : d9;
    }

    public static final double coerceAtMost(double d9, double d10) {
        return d9 > d10 ? d10 : d9;
    }

    public static final byte coerceIn(byte b9, byte b10, byte b11) {
        if (b10 <= b11) {
            return b9 < b10 ? b10 : b9 > b11 ? b11 : b9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b11) + " is less than minimum " + ((int) b10) + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final m downTo(long j8, int i8) {
        return m.Companion.fromClosedRange(j8, i8, -1L);
    }

    public static final char first(C5835a c5835a) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        if (!c5835a.isEmpty()) {
            return c5835a.getFirst();
        }
        throw new NoSuchElementException("Progression " + c5835a + " is empty.");
    }

    public static final boolean intRangeContains(g gVar, short s8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Integer.valueOf(s8));
    }

    public static final char last(C5835a c5835a) {
        Intrinsics.checkNotNullParameter(c5835a, "<this>");
        if (!c5835a.isEmpty()) {
            return c5835a.getLast();
        }
        throw new NoSuchElementException("Progression " + c5835a + " is empty.");
    }

    public static final boolean longRangeContains(g gVar, short s8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.contains(Long.valueOf(s8));
    }

    public static final boolean shortRangeContains(g gVar, long j8) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j8);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static l until(int i8, int i9) {
        if (i9 <= Integer.MIN_VALUE) {
            return l.Companion.getEMPTY();
        }
        return new l(i8, i9 - 1);
    }

    public static final boolean byteRangeContains(r rVar, short s8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s8);
        if (byteExactOrNull != null) {
            return rVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s8, short s9, short s10) {
        if (s9 <= s10) {
            return s8 < s9 ? s9 : s8 > s10 ? s10 : s8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s10) + " is less than minimum " + ((int) s9) + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final j downTo(byte b9, int i8) {
        return j.Companion.fromClosedRange(b9, i8, -1);
    }

    public static final boolean intRangeContains(r rVar, short s8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Integer.valueOf(s8));
    }

    public static final boolean longRangeContains(r rVar, short s8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.contains(Long.valueOf(s8));
    }

    public static final boolean shortRangeContains(r rVar, long j8) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j8);
        if (shortExactOrNull != null) {
            return rVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i8, int i9, int i10) {
        if (i9 <= i10) {
            return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final j downTo(short s8, int i8) {
        return j.Companion.fromClosedRange(s8, i8, -1);
    }

    public static final o until(long j8, int i8) {
        return new o(j8, i8 - 1);
    }

    public static long coerceIn(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final m downTo(int i8, long j8) {
        return m.Companion.fromClosedRange(i8, j8, -1L);
    }

    public static final l until(byte b9, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            return l.Companion.getEMPTY();
        }
        return new l(b9, i8 - 1);
    }

    public static final float coerceIn(float f8, float f9, float f10) {
        if (f9 <= f10) {
            return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final m downTo(long j8, long j9) {
        return m.Companion.fromClosedRange(j8, j9, -1L);
    }

    public static final double coerceIn(double d9, double d10, double d11) {
        if (d10 <= d11) {
            return d9 < d10 ? d10 : d9 > d11 ? d11 : d9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final m downTo(byte b9, long j8) {
        return m.Companion.fromClosedRange(b9, j8, -1L);
    }

    public static final l until(short s8, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            return l.Companion.getEMPTY();
        }
        return new l(s8, i8 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t8, f range) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t8, range.getStart()) || range.lessThanOrEquals(range.getStart(), t8)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t8) || range.lessThanOrEquals(t8, range.getEndInclusive())) ? t8 : (T) range.getEndInclusive() : (T) range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final m downTo(short s8, long j8) {
        return m.Companion.fromClosedRange(s8, j8, -1L);
    }

    public static final j downTo(int i8, short s8) {
        return j.Companion.fromClosedRange(i8, s8, -1);
    }

    public static final o until(int i8, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return o.Companion.getEMPTY();
        }
        return new o(i8, j8 - 1);
    }

    public static final m downTo(long j8, short s8) {
        return m.Companion.fromClosedRange(j8, s8, -1L);
    }

    public static final j downTo(byte b9, short s8) {
        return j.Companion.fromClosedRange(b9, s8, -1);
    }

    public static final o until(long j8, long j9) {
        if (j9 <= Long.MIN_VALUE) {
            return o.Companion.getEMPTY();
        }
        return new o(j8, j9 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t8, g range) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return (T) coerceIn((Comparable) t8, (f) range);
        }
        if (!range.isEmpty()) {
            return t8.compareTo(range.getStart()) < 0 ? (T) range.getStart() : t8.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final j downTo(short s8, short s9) {
        return j.Companion.fromClosedRange(s8, s9, -1);
    }

    public static final o until(byte b9, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return o.Companion.getEMPTY();
        }
        return new o(b9, j8 - 1);
    }

    public static final o until(short s8, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return o.Companion.getEMPTY();
        }
        return new o(s8, j8 - 1);
    }

    public static final l until(int i8, short s8) {
        return new l(i8, s8 - 1);
    }

    public static final int coerceIn(int i8, g range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) coerceIn(Integer.valueOf(i8), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i8 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i8 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final o until(long j8, short s8) {
        return new o(j8, s8 - 1);
    }

    public static final l until(byte b9, short s8) {
        return new l(b9, s8 - 1);
    }

    public static final l until(short s8, short s9) {
        return new l(s8, s9 - 1);
    }

    public static long coerceIn(long j8, g range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((Number) coerceIn(Long.valueOf(j8), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j8 < ((Number) range.getStart()).longValue() ? ((Number) range.getStart()).longValue() : j8 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + C.PACKAGE_SEPARATOR_CHAR);
    }
}
