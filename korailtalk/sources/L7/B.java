package l7;

import Q7.C0709m;
import Q7.X;
import S6.AbstractC0765i;
import S6.AbstractC0775q;
import S6.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public class B extends C5894A {

    public static final class a extends AbstractC0775q {

        /* renamed from: a */
        private int f33993a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f33994b;

        a(CharSequence charSequence) {
            this.f33994b = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33993a < this.f33994b.length();
        }

        @Override // S6.AbstractC0775q
        public char nextChar() {
            CharSequence charSequence = this.f33994b;
            int i8 = this.f33993a;
            this.f33993a = i8 + 1;
            return charSequence.charAt(i8);
        }
    }

    static final class b extends Lambda implements f7.p {

        /* renamed from: a */
        final /* synthetic */ char[] f33995a;

        /* renamed from: b */
        final /* synthetic */ boolean f33996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z8) {
            super(2);
            this.f33995a = cArr;
            this.f33996b = z8;
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CharSequence) obj, ((Number) obj2).intValue());
        }

        public final R6.p invoke(CharSequence $receiver, int i8) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            int iIndexOfAny = B.indexOfAny($receiver, this.f33995a, i8, this.f33996b);
            if (iIndexOfAny < 0) {
                return null;
            }
            return R6.v.to(Integer.valueOf(iIndexOfAny), 1);
        }
    }

    static final class c extends Lambda implements f7.p {

        /* renamed from: a */
        final /* synthetic */ List f33997a;

        /* renamed from: b */
        final /* synthetic */ boolean f33998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, boolean z8) {
            super(2);
            this.f33997a = list;
            this.f33998b = z8;
        }

        public final R6.p invoke(CharSequence $receiver, int i8) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            R6.p pVarC = B.c($receiver, this.f33997a, i8, this.f33998b, false);
            if (pVarC != null) {
                return R6.v.to(pVarC.getFirst(), Integer.valueOf(((String) pVarC.getSecond()).length()));
            }
            return null;
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class d extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ CharSequence f33999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f33999a = charSequence;
        }

        @Override // f7.l
        public final String invoke(j7.l it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return B.substring(this.f33999a, it);
        }
    }

    static final class e extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ CharSequence f34000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.f34000a = charSequence;
        }

        @Override // f7.l
        public final String invoke(j7.l it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return B.substring(this.f34000a, it);
        }
    }

    public static final R6.p c(CharSequence charSequence, Collection collection, int i8, boolean z8, boolean z9) {
        Object next;
        Object next2;
        if (!z8 && collection.size() == 1) {
            String str = (String) S6.r.single(collection);
            int iIndexOf$default = !z9 ? r.indexOf$default(charSequence, str, i8, false, 4, (Object) null) : r.lastIndexOf$default(charSequence, str, i8, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                return null;
            }
            return R6.v.to(Integer.valueOf(iIndexOf$default), str);
        }
        j7.j lVar = !z9 ? new j7.l(j7.s.coerceAtLeast(i8, 0), charSequence.length()) : j7.s.downTo(j7.s.coerceAtMost(i8, r.getLastIndex(charSequence)), 0);
        if (charSequence instanceof String) {
            int first = lVar.getFirst();
            int last = lVar.getLast();
            int step = lVar.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (r.regionMatches(str2, 0, (String) charSequence, first, str2.length(), z8)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return R6.v.to(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = lVar.getFirst();
            int last2 = lVar.getLast();
            int step2 = lVar.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z8)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return R6.v.to(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final String commonPrefixWith(CharSequence charSequence, CharSequence other, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i8 = 0;
        while (i8 < iMin && C5899e.equals(charSequence.charAt(i8), other.charAt(i8), z8)) {
            i8++;
        }
        int i9 = i8 - 1;
        if (hasSurrogatePairAt(charSequence, i9) || hasSurrogatePairAt(other, i9)) {
            i8--;
        }
        return charSequence.subSequence(0, i8).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z8);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence other, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, other.length());
        int i8 = 0;
        while (i8 < iMin && C5899e.equals(charSequence.charAt((length - i8) - 1), other.charAt((r1 - i8) - 1), z8)) {
            i8++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i8) - 1) || hasSurrogatePairAt(other, (r1 - i8) - 1)) {
            i8--;
        }
        return charSequence.subSequence(length - i8, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z8);
    }

    public static final boolean contains(CharSequence charSequence, CharSequence other, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (r.indexOf$default(charSequence, (String) other, 0, z8, 2, (Object) null) < 0) {
                return false;
            }
        } else if (e(charSequence, other, 0, charSequence.length(), z8, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return contains(charSequence, charSequence2, z8);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C5894A.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!C5899e.equals(charSequence.charAt(i8), charSequence2.charAt(i8), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (charSequence.charAt(i8) != charSequence2.charAt(i8)) {
                return false;
            }
        }
        return true;
    }

    private static final int d(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9) {
        j7.j lVar = !z9 ? new j7.l(j7.s.coerceAtLeast(i8, 0), j7.s.coerceAtMost(i9, charSequence.length())) : j7.s.downTo(j7.s.coerceAtMost(i8, r.getLastIndex(charSequence)), j7.s.coerceAtLeast(i9, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = lVar.getFirst();
            int last = lVar.getLast();
            int step = lVar.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!r.regionMatches((String) charSequence2, 0, (String) charSequence, first, charSequence2.length(), z8)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = lVar.getFirst();
        int last2 = lVar.getLast();
        int step2 = lVar.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (!regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z8)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    static /* synthetic */ int e(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z9 = false;
        }
        return d(charSequence, charSequence2, i8, i9, z8, z9);
    }

    public static final boolean endsWith(CharSequence charSequence, char c9, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && C5899e.equals(charSequence.charAt(r.getLastIndex(charSequence)), c9, z8);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return endsWith(charSequence, c9, z8);
    }

    private static final k7.m f(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9) {
        requireNonNegativeLimit(i9);
        return new g(charSequence, i8, i9, new b(cArr, z8));
    }

    public static final R6.p findAnyOf(CharSequence charSequence, Collection<String> strings, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return c(charSequence, strings, i8, z8, false);
    }

    public static /* synthetic */ R6.p findAnyOf$default(CharSequence charSequence, Collection collection, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return findAnyOf(charSequence, collection, i8, z8);
    }

    public static final R6.p findLastAnyOf(CharSequence charSequence, Collection<String> strings, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return c(charSequence, strings, i8, z8, true);
    }

    public static /* synthetic */ R6.p findLastAnyOf$default(CharSequence charSequence, Collection collection, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = r.getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return findLastAnyOf(charSequence, collection, i8, z8);
    }

    private static final k7.m g(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9) {
        requireNonNegativeLimit(i9);
        return new g(charSequence, i8, i9, new c(AbstractC0765i.asList(strArr), z8));
    }

    public static final j7.l getIndices(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new j7.l(0, charSequence.length() - 1);
    }

    public static int getLastIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    static /* synthetic */ k7.m h(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return f(charSequence, cArr, i8, z8, i9);
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new j7.l(0, charSequence.length() + (-2)).contains(i8) && Character.isHighSurrogate(charSequence.charAt(i8)) && Character.isLowSurrogate(charSequence.charAt(i8 + 1));
    }

    static /* synthetic */ k7.m i(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return g(charSequence, strArr, i8, z8, i9);
    }

    public static final int indexOf(CharSequence charSequence, char c9, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z8 || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c9}, i8, z8) : ((String) charSequence).indexOf(c9, i8);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c9, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return indexOf(charSequence, c9, i8, z8);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0765i.single(chars), i8);
        }
        M it = new j7.l(j7.s.coerceAtLeast(i8, 0), r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            for (char c9 : chars) {
                if (C5899e.equals(c9, cCharAt, z8)) {
                    return iNextInt;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return indexOfAny(charSequence, cArr, i8, z8);
    }

    public static final AbstractC0775q iterator(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    private static final List j(CharSequence charSequence, String str, boolean z8, int i8) {
        requireNonNegativeLimit(i8);
        int length = 0;
        int iIndexOf = indexOf(charSequence, str, 0, z8);
        if (iIndexOf == -1 || i8 == 1) {
            return S6.r.listOf(charSequence.toString());
        }
        boolean z9 = i8 > 0;
        ArrayList arrayList = new ArrayList(z9 ? j7.s.coerceAtMost(i8, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
            length = str.length() + iIndexOf;
            if (z9 && arrayList.size() == i8 - 1) {
                break;
            }
            iIndexOf = indexOf(charSequence, str, length, z8);
        } while (iIndexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final int lastIndexOf(CharSequence charSequence, char c9, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z8 || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c9}, i8, z8) : ((String) charSequence).lastIndexOf(c9, i8);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c9, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = r.getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return lastIndexOf(charSequence, c9, i8, z8);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC0765i.single(chars), i8);
        }
        for (int iCoerceAtMost = j7.s.coerceAtMost(i8, r.getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            for (char c9 : chars) {
                if (C5899e.equals(c9, cCharAt, z8)) {
                    return iCoerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = r.getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return lastIndexOfAny(charSequence, cArr, i8, z8);
    }

    public static final k7.m lineSequence(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return splitToSequence$default(charSequence, new String[]{"\r\n", X.LF, X.CR}, false, 0, 6, (Object) null);
    }

    public static final List<String> lines(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return k7.p.toList(lineSequence(charSequence));
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i8, char c9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append(charSequence);
        M it = new j7.l(1, i8 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c9);
        }
        return sb;
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i8, char c9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c9 = ' ';
        }
        return padEnd(charSequence, i8, c9);
    }

    public static final CharSequence padStart(CharSequence charSequence, int i8, char c9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        M it = new j7.l(1, i8 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c9);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i8, char c9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c9 = ' ';
        }
        return padStart(charSequence, i8, c9);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!C5899e.equals(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z8)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return startsWith$default(charSequence, prefix, false, 2, (Object) null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i8, int i9) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
        }
        if (i9 == i8) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i9 - i8));
        sb.append(charSequence, 0, i8);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(charSequence, i9, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return endsWith$default(charSequence, suffix, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && startsWith$default(charSequence, prefix, false, 2, (Object) null) && endsWith$default(charSequence, suffix, false, 2, (Object) null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String replaceAfter(String str, char c9, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iIndexOf$default + 1, str.length(), replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c9, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c9, str2, str3);
    }

    public static final String replaceAfterLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = r.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iLastIndexOf$default + delimiter.length(), str.length(), replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, char c9, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c9, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c9, str2, str3);
    }

    public static final String replaceBeforeLast(String str, char c9, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iLastIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c9, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c9, str2, str3);
    }

    public static final CharSequence replaceRange(CharSequence charSequence, int i8, int i9, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i9 >= i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i8);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i9, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
    }

    public static final void requireNonNegativeLimit(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List<String> split(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return j(charSequence, str, z8, i8);
            }
        }
        Iterable iterableAsIterable = k7.p.asIterable(i(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(S6.r.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (j7.l) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return split(charSequence, strArr, z8, i8);
    }

    public static final k7.m splitToSequence(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return k7.p.map(i(charSequence, delimiters, 0, z8, i8, 2, null), new d(charSequence));
    }

    public static /* synthetic */ k7.m splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return splitToSequence(charSequence, strArr, z8, i8);
    }

    public static final boolean startsWith(CharSequence charSequence, char c9, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && C5899e.equals(charSequence.charAt(0), c9, z8);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return startsWith(charSequence, c9, z8);
    }

    public static final CharSequence subSequence(CharSequence charSequence, j7.l range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static final String substring(String str, j7.l range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringAfter(String str, char c9, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c9, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c9, str2);
    }

    public static String substringAfterLast(String str, char c9, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c9, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return r.substringAfterLast(str, c9, str2);
    }

    public static final String substringBefore(String str, char c9, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c9, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c9, str2);
    }

    public static final String substringBeforeLast(String str, char c9, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c9, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c9, str2);
    }

    public static final boolean toBooleanStrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, C0709m.TRUE)) {
            return true;
        }
        if (Intrinsics.areEqual(str, C0709m.FALSE)) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final Boolean toBooleanStrictOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, C0709m.TRUE)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, C0709m.FALSE)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence trim(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zBooleanValue = ((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(!z8 ? i8 : length)))).booleanValue();
            if (z8) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i8 = length - 1;
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i8 < 0) {
                return "";
            }
            length = i8;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return contains(charSequence, c9, z8);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z8 && (charSequence instanceof String) && (suffix instanceof String)) ? C5894A.endsWith$default((String) charSequence, (String) suffix, false, 2, null) : regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z8);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return endsWith(charSequence, charSequence2, z8);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return indexOf(charSequence, str, i8, z8);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i8, z8);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = r.getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return lastIndexOf(charSequence, str, i8, z8);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = r.getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i8, z8);
    }

    public static /* synthetic */ String padEnd$default(String str, int i8, char c9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c9 = ' ';
        }
        return padEnd(str, i8, c9);
    }

    public static /* synthetic */ String padStart$default(String str, int i8, char c9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c9 = ' ';
        }
        return r.padStart(str, i8, c9);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c9, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c9, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return split(charSequence, cArr, z8, i8);
    }

    public static final k7.m splitToSequence(CharSequence charSequence, char[] delimiters, boolean z8, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return k7.p.map(h(charSequence, delimiters, 0, z8, i8, 2, null), new e(charSequence));
    }

    public static /* synthetic */ k7.m splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return splitToSequence(charSequence, cArr, z8, i8);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z8 && (charSequence instanceof String) && (prefix instanceof String)) ? r.startsWith$default((String) charSequence, (String) prefix, false, 2, (Object) null) : regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return startsWith(charSequence, charSequence2, z8);
    }

    public static final String substring(CharSequence charSequence, j7.l range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    public static final String replaceAfter(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iIndexOf$default + delimiter.length(), str.length(), replacement).toString();
    }

    public static final String replaceAfterLast(String str, char c9, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c9, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iLastIndexOf$default + 1, str.length(), replacement).toString();
    }

    public static final String replaceBefore(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iIndexOf$default, replacement).toString();
    }

    public static final String replaceBeforeLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = r.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iLastIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return startsWith(charSequence, charSequence2, i8, z8);
    }

    public static final String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringAfterLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = r.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = r.indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = r.lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean contains(CharSequence charSequence, char c9, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return r.indexOf$default(charSequence, c9, 0, z8, 2, (Object) null) >= 0;
    }

    public static final int indexOf(CharSequence charSequence, String string, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i8);
        }
        return e(charSequence, string, i8, charSequence.length(), z8, false, 16, null);
    }

    public static final int lastIndexOf(CharSequence charSequence, String string, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i8);
        }
        return d(charSequence, string, i8, 0, z8, true);
    }

    public static final String removePrefix(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String removeSuffix(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String removeSurrounding(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !startsWith$default((CharSequence) str, prefix, false, 2, (Object) null) || !endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String trim(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zBooleanValue = ((Boolean) predicate.invoke(Character.valueOf(str.charAt(!z8 ? i8 : length)))).booleanValue();
            if (z8) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return str.subSequence(i8, length + 1).toString();
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z8 && (charSequence instanceof String) && (prefix instanceof String)) {
            return C5894A.startsWith$default((String) charSequence, (String) prefix, i8, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i8, prefix, 0, prefix.length(), z8);
    }

    public static final String trimEnd(String str, f7.l predicate) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(length)))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final String trimStart(String str, f7.l predicate) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(i8, str.length());
                    break;
                }
                i8++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static final CharSequence removeRange(CharSequence charSequence, j7.l range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(charSequence, delimiter, delimiter);
    }

    public static final CharSequence replaceRange(CharSequence charSequence, j7.l range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    public static final String removeSurrounding(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(str, delimiter, delimiter);
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> strings, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        R6.p pVarC = c(charSequence, strings, i8, z8, false);
        if (pVarC != null) {
            return ((Number) pVarC.getFirst()).intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> strings, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        R6.p pVarC = c(charSequence, strings, i8, z8, true);
        if (pVarC != null) {
            return ((Number) pVarC.getFirst()).intValue();
        }
        return -1;
    }

    public static final String padEnd(String str, int i8, char c9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i8, c9).toString();
    }

    public static String padStart(String str, int i8, char c9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i8, c9).toString();
    }

    public static final CharSequence trim(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zContains = AbstractC0765i.contains(chars, charSequence.charAt(!z8 ? i8 : length));
            if (z8) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!AbstractC0765i.contains(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!AbstractC0765i.contains(chars, charSequence.charAt(i8))) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }

    public static final List<String> split(CharSequence charSequence, char[] delimiters, boolean z8, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return j(charSequence, String.valueOf(delimiters[0]), z8, i8);
        }
        Iterable iterableAsIterable = k7.p.asIterable(h(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(S6.r.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (j7.l) it.next()));
        }
        return arrayList;
    }

    public static final String trim(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zContains = AbstractC0765i.contains(chars, str.charAt(!z8 ? i8 : length));
            if (z8) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return str.subSequence(i8, length + 1).toString();
    }

    public static final String trimEnd(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!AbstractC0765i.contains(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final String trimStart(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (!AbstractC0765i.contains(chars, str.charAt(i8))) {
                    charSequenceSubSequence = str.subSequence(i8, str.length());
                    break;
                }
                i8++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence trim(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            boolean zIsWhitespace = C5898d.isWhitespace(charSequence.charAt(!z8 ? i8 : length));
            if (z8) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i8++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!C5898d.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!C5898d.isWhitespace(charSequence.charAt(i8))) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }
}
