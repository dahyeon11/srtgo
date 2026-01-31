package x7;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import S6.r;
import f7.InterfaceC5519a;
import f7.l;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6498c {
    public static final C6498c INSTANCE = new C6498c();

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f37522a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f37523b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC0755i f37524c = AbstractC0756j.lazy(a.INSTANCE);

    /* renamed from: x7.c$a */
    static final class a extends Lambda implements InterfaceC5519a {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final List<Integer> invoke() {
            return C6498c.INSTANCE.g(100);
        }
    }

    /* renamed from: x7.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f37525a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37526b;

        /* renamed from: c, reason: collision with root package name */
        private final int f37527c;

        public b(int i8, int i9, int i10) {
            this.f37525a = i8;
            this.f37526b = i9;
            this.f37527c = i10;
        }

        public static /* synthetic */ b copy$default(b bVar, int i8, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i8 = bVar.f37525a;
            }
            if ((i11 & 2) != 0) {
                i9 = bVar.f37526b;
            }
            if ((i11 & 4) != 0) {
                i10 = bVar.f37527c;
            }
            return bVar.copy(i8, i9, i10);
        }

        public final int component1() {
            return this.f37525a;
        }

        public final int component2() {
            return this.f37526b;
        }

        public final int component3() {
            return this.f37527c;
        }

        public final b copy(int i8, int i9, int i10) {
            return new b(i8, i9, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f37525a == bVar.f37525a && this.f37526b == bVar.f37526b && this.f37527c == bVar.f37527c;
        }

        public final int getBlock() {
            return this.f37527c;
        }

        public final int getDecode() {
            return this.f37525a;
        }

        public final int getEncode() {
            return this.f37526b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f37525a) * 31) + Integer.hashCode(this.f37526b)) * 31) + Integer.hashCode(this.f37527c);
        }

        public String toString() {
            return "SizeInfo(decode=" + this.f37525a + ", encode=" + this.f37526b + ", block=" + this.f37527c + ')';
        }
    }

    /* renamed from: x7.c$c, reason: collision with other inner class name */
    static final class C0433c extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0433c(int i8) {
            super(1);
            this.f37528a = i8;
        }

        @Override // f7.l
        public final String invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C6498c c6498c = C6498c.INSTANCE;
            return c6498c.c("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", ((Number) c6498c.f().get(this.f37528a % 29)).intValue(), ((Number) c6498c.f().get((this.f37528a / 29) % 29)).intValue());
        }
    }

    /* renamed from: x7.c$d */
    static final class d extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8) {
            super(1);
            this.f37529a = i8;
        }

        @Override // f7.l
        public final List<Integer> invoke(Integer it) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList();
            int i8 = this.f37529a + 1;
            arrayList.add(2);
            int i9 = 3;
            while (arrayList.size() < i8) {
                int iSqrt = (int) Math.sqrt(i9);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext() && (iIntValue = ((Number) it2.next()).intValue()) <= iSqrt) {
                    if (i9 % iIntValue == 0) {
                        break;
                    }
                }
                arrayList.add(Integer.valueOf(i9));
                i9++;
            }
            arrayList.remove(0);
            return r.toList(arrayList);
        }
    }

    private C6498c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str, int i8, int i9) {
        int length = str.length();
        int iD = d(length);
        int[] iArr = new int[iD];
        char[] cArr = new char[iD];
        BigInteger bigIntegerMultiply = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i8);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(i9);
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(iD);
        int i10 = 0;
        while (i10 < iD) {
            Intrinsics.checkNotNull(bigIntegerMultiply);
            Intrinsics.checkNotNull(bigIntegerValueOf3);
            BigInteger bigIntegerRemainder = bigIntegerMultiply.remainder(bigIntegerValueOf3);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
            Intrinsics.checkNotNull(bigIntegerValueOf2);
            BigInteger bigIntegerMultiply2 = bigIntegerRemainder.multiply(bigIntegerValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply2, "multiply(...)");
            BigInteger bigIntegerRemainder2 = bigIntegerMultiply2.remainder(bigIntegerValueOf3);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder2, "remainder(...)");
            int iIntValue = bigIntegerRemainder2.intValue();
            BigInteger bigInteger = bigIntegerValueOf2;
            int i11 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i11;
            if (i11 == 1) {
                cArr[i10] = str.charAt(iIntValue);
            }
            Intrinsics.checkNotNull(bigIntegerMultiply);
            Intrinsics.checkNotNull(bigIntegerValueOf);
            bigIntegerMultiply = bigIntegerMultiply.multiply(bigIntegerValueOf);
            Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
            i10++;
            bigIntegerValueOf2 = bigInteger;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < iD; i12++) {
            char c9 = cArr[i12];
            if (c9 == 0) {
                int i13 = 0;
                while (true) {
                    if (i13 >= iD) {
                        break;
                    }
                    if (iArr[i13] == 0) {
                        char cCharAt = str.charAt(i13);
                        cArr[i12] = cCharAt;
                        sb2.append(cCharAt);
                        iArr[i13] = 1;
                        break;
                    }
                    i13++;
                }
            } else {
                sb.append(c9);
            }
        }
        while (iD < length) {
            sb2.append(str.charAt(iD));
            iD++;
        }
        if (sb2.length() < ((Number) f().get(0)).intValue()) {
            return sb.toString() + ((Object) sb2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb.toString());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb3.append(c(string, i8, i9));
        return sb3.toString();
    }

    private final int d(int i8) {
        int iIntValue;
        Iterator it = f().iterator();
        int i9 = 1;
        while (it.hasNext() && (iIntValue = ((Number) it.next()).intValue()) <= i8) {
            i9 = iIntValue;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(l tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List f() {
        return (List) f37524c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List g(int i8) {
        ConcurrentHashMap concurrentHashMap = f37522a;
        Integer numValueOf = Integer.valueOf(i8);
        final d dVar = new d(i8);
        Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(numValueOf, new Function() { // from class: x7.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C6498c.h(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objComputeIfAbsent, "computeIfAbsent(...)");
        return (List) objComputeIfAbsent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(l tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    private static final char i(String str, BigInteger bigInteger, int i8, String str2) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            if (l7.r.indexOf$default((CharSequence) str2, str.charAt(i9), 0, false, 6, (Object) null) < 0) {
                if (bigInteger.longValue() == j8) {
                    return str.charAt(i9);
                }
                j8++;
            }
        }
        return ' ';
    }

    public static /* synthetic */ String makeEncodeTable$default(C6498c c6498c, BigInteger bigInteger, int i8, String str, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            str = null;
        }
        return c6498c.makeEncodeTable(bigInteger, i8, str);
    }

    public static /* synthetic */ String primeEncode$default(C6498c c6498c, Object obj, Object obj2, long j8, int i8, Object obj3) {
        if ((i8 & 2) != 0) {
            obj2 = null;
        }
        if ((i8 & 4) != 0) {
            j8 = System.currentTimeMillis();
        }
        return c6498c.primeEncode(obj, obj2, j8);
    }

    public final String encodeNormalBE(Object str, String table, int i8, int i9, int i10) {
        long jLongValue;
        int i11 = i8;
        int i12 = i9;
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(table, "table");
        String string = str.toString();
        List<Integer> listString2xA1s = i11 == 161 ? string2xA1s(string) : string2xA1s(string);
        StringBuilder sb = new StringBuilder();
        int[] iArr = new int[i10 + 1];
        int size = listString2xA1s.size() % i10;
        int size2 = listString2xA1s.size() - size;
        int i13 = 0;
        while (true) {
            jLongValue = 0;
            if (i13 >= size2) {
                break;
            }
            int i14 = 0;
            while (i14 < i10) {
                jLongValue = (jLongValue * i11) + listString2xA1s.get(i13).longValue();
                i14++;
                i13++;
            }
            int i15 = i13;
            if (i10 >= 0) {
                int i16 = 0;
                while (true) {
                    long j8 = i12;
                    iArr[i16] = (int) (jLongValue % j8);
                    jLongValue /= j8;
                    if (i16 == i10) {
                        break;
                    }
                    i16++;
                    i12 = i9;
                }
            }
            for (int i17 = i10; -1 < i17; i17--) {
                sb.append(table.charAt(iArr[i17]));
            }
            i11 = i8;
            i12 = i9;
            i13 = i15;
        }
        if (size > 0) {
            int i18 = 0;
            while (i18 < size) {
                jLongValue = (jLongValue * i8) + listString2xA1s.get(i13).longValue();
                i18++;
                i13++;
            }
            if (size >= 0) {
                int i19 = 0;
                while (true) {
                    long j9 = i9;
                    iArr[i19] = (int) (jLongValue % j9);
                    jLongValue /= j9;
                    if (i19 == size) {
                        break;
                    }
                    i19++;
                }
            }
            while (-1 < size) {
                sb.append(table.charAt(iArr[size]));
                size--;
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final String getOrderTable(Object num) {
        int iLongValue;
        Intrinsics.checkNotNullParameter(num, "num");
        if (num instanceof BigInteger) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(841L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
            BigInteger bigIntegerRemainder = ((BigInteger) num).remainder(bigIntegerValueOf);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
            iLongValue = bigIntegerRemainder.intValue();
        } else if (num instanceof Integer) {
            iLongValue = ((Number) num).intValue();
        } else {
            if (!(num instanceof Long)) {
                throw new IllegalArgumentException("Invalid number type");
            }
            iLongValue = (int) ((Number) num).longValue();
        }
        ConcurrentHashMap concurrentHashMap = f37523b;
        Integer numValueOf = Integer.valueOf(iLongValue);
        final C0433c c0433c = new C0433c(iLongValue);
        Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(numValueOf, new Function() { // from class: x7.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C6498c.e(c0433c, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objComputeIfAbsent, "computeIfAbsent(...)");
        return (String) objComputeIfAbsent;
    }

    public final String makeEncodeTable(BigInteger num, int i8, String str) {
        Intrinsics.checkNotNullParameter(num, "num");
        if (str == null) {
            str = getOrderTable(num);
            BigInteger bigIntegerValueOf = BigInteger.valueOf(841L);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
            num = num.divide(bigIntegerValueOf);
            Intrinsics.checkNotNullExpressionValue(num, "divide(...)");
        }
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = i8 - i9;
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(j8);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf2, "valueOf(...)");
            BigInteger bigIntegerRemainder = num.remainder(bigIntegerValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb.append(i(str, bigIntegerRemainder, i8, string));
            BigInteger bigIntegerValueOf3 = BigInteger.valueOf(j8);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf3, "valueOf(...)");
            num = num.divide(bigIntegerValueOf3);
            Intrinsics.checkNotNullExpressionValue(num, "divide(...)");
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final BigInteger makeKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        int length = key.length();
        for (int i8 = 0; i8 < length; i8++) {
            int iCodePointAt = key.codePointAt(i8);
            int i9 = 32768;
            for (int i10 = 0; i10 < 16 && (i9 & iCodePointAt) == 0; i10++) {
                i9 >>= 1;
            }
            Intrinsics.checkNotNull(bigIntegerAdd);
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i9 << 1);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
            BigInteger bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerValueOf);
            Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(iCodePointAt);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf2, "valueOf(...)");
            bigIntegerAdd = bigIntegerMultiply.add(bigIntegerValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigIntegerAdd);
        return bigIntegerAdd;
    }

    public final String primeEncode(Object org2, Object obj, long j8) {
        Intrinsics.checkNotNullParameter(org2, "org");
        b bVarSizesByIndex = sizesByIndex(161, 0);
        boolean z8 = org2 instanceof String;
        if (obj == null) {
            int i8 = (z8 ? 1 : 0) % 10;
            String orderTable = getOrderTable(Integer.valueOf(i8));
            return ((((String.valueOf((char) (i8 + 48)) + orderTable.charAt(bVarSizesByIndex.getDecode() / 62)) + orderTable.charAt(bVarSizesByIndex.getDecode() % 62)) + orderTable.charAt(bVarSizesByIndex.getBlock())) + orderTable.charAt(bVarSizesByIndex.getEncode() - 1)) + encodeNormalBE(org2, orderTable, bVarSizesByIndex.getDecode(), bVarSizesByIndex.getEncode(), bVarSizesByIndex.getBlock());
        }
        if (!(obj instanceof String)) {
            return "";
        }
        int i9 = (z8 ? 1 : 0) % 26;
        String orderTable2 = getOrderTable(Integer.valueOf(i9));
        String str = (((String.valueOf((char) (i9 + 97)) + orderTable2.charAt(bVarSizesByIndex.getDecode() / 62)) + orderTable2.charAt(bVarSizesByIndex.getDecode() % 62)) + orderTable2.charAt(bVarSizesByIndex.getBlock())) + orderTable2.charAt(bVarSizesByIndex.getEncode() - 1);
        String strEncodeNormalBE = encodeNormalBE(obj, orderTable2, bVarSizesByIndex.getDecode(), bVarSizesByIndex.getEncode(), bVarSizesByIndex.getBlock());
        return ((str + orderTable2.charAt(strEncodeNormalBE.length())) + strEncodeNormalBE) + encodeNormalBE(org2, makeEncodeTable(makeKey((String) obj), bVarSizesByIndex.getEncode(), orderTable2), bVarSizesByIndex.getDecode(), bVarSizesByIndex.getEncode(), bVarSizesByIndex.getBlock());
    }

    public final b sizesByIndex(int i8, int i9) {
        int iIntValue;
        int iIntValue2 = 30;
        Iterator it = r.listOf((Object[]) new Integer[]{30, 46, 59}).iterator();
        int i10 = 2;
        while (it.hasNext() && i9 >= (iIntValue = 63 - (iIntValue2 = ((Number) it.next()).intValue()))) {
            i9 -= iIntValue;
            i10++;
        }
        return new b(i8, iIntValue2 + i9, i10);
    }

    public final List<Integer> string2xA1s(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        ArrayList arrayList = new ArrayList();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (iCodePointAt < 128) {
                arrayList.add(Integer.valueOf(iCodePointAt));
            } else if (iCodePointAt < 2048) {
                arrayList.add(Integer.valueOf(128 | ((iCodePointAt >> 7) & 15)));
                arrayList.add(Integer.valueOf(iCodePointAt & 127));
            } else if (iCodePointAt >= 262144) {
                arrayList.add(160);
                arrayList.add(Integer.valueOf((iCodePointAt >> 14) & 127));
                arrayList.add(Integer.valueOf((iCodePointAt >> 7) & 127));
                arrayList.add(Integer.valueOf(iCodePointAt & 127));
            } else if ((63488 & iCodePointAt) != 55296) {
                arrayList.add(Integer.valueOf(((iCodePointAt >> 14) & 15) | 144));
                arrayList.add(Integer.valueOf((iCodePointAt >> 7) & 127));
                arrayList.add(Integer.valueOf(iCodePointAt & 127));
            }
        }
        return arrayList;
    }
}
