package l7;

import S6.I;
import S6.J;
import S6.K;
import S6.M;
import S6.Q;
import S6.d0;
import S6.i0;
import f7.InterfaceC5519a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class D extends C {

    public static final class a implements Iterable, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f34001a;

        public a(CharSequence charSequence) {
            this.f34001a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return B.iterator(this.f34001a);
        }
    }

    public static final class b implements k7.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f34002a;

        public b(CharSequence charSequence) {
            this.f34002a = charSequence;
        }

        @Override // k7.m
        public Iterator<Character> iterator() {
            return B.iterator(this.f34002a);
        }
    }

    static final class c extends Lambda implements f7.l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @Override // f7.l
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    public static final class d implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f34003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.l f34004b;

        public d(CharSequence charSequence, f7.l lVar) {
            this.f34003a = charSequence;
            this.f34004b = lVar;
        }

        @Override // S6.I
        public /* bridge */ /* synthetic */ Object keyOf(Object obj) {
            return keyOf(((Character) obj).charValue());
        }

        @Override // S6.I
        public Iterator<Character> sourceIterator() {
            return B.iterator(this.f34003a);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [K, java.lang.Object] */
        public K keyOf(char c9) {
            return this.f34004b.invoke(Character.valueOf(c9));
        }
    }

    static final class e extends Lambda implements f7.l {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // f7.l
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    static final class f extends Lambda implements f7.l {
        public static final f INSTANCE = new f();

        f() {
            super(1);
        }

        @Override // f7.l
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    static final class g extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34005a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f34006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f7.l f34007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i8, CharSequence charSequence, f7.l lVar) {
            super(1);
            this.f34005a = i8;
            this.f34006b = charSequence;
            this.f34007c = lVar;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
        public final R invoke(int i8) {
            int length = this.f34005a + i8;
            if (length < 0 || length > this.f34006b.length()) {
                length = this.f34006b.length();
            }
            return this.f34007c.invoke(this.f34006b.subSequence(i8, length));
        }
    }

    static final class h extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f34008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence) {
            super(0);
            this.f34008a = charSequence;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Character> invoke() {
            return B.iterator(this.f34008a);
        }
    }

    public static final boolean all(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? S6.r.emptyList() : new a(charSequence);
    }

    public static final k7.m asSequence(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? k7.p.emptySequence() : new b(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(CharSequence charSequence, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(charSequence.length()), 16));
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            R6.p pVar = (R6.p) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(charSequence.length()), 16));
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            R6.p pVar = (R6.p) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(j7.s.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M destination, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final List<String> chunked(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i8, i8, true);
    }

    public static final k7.m chunkedSequence(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i8, c.INSTANCE);
    }

    public static final int count(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final CharSequence drop(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            return charSequence.subSequence(j7.s.coerceAtMost(i8, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            return take(charSequence, j7.s.coerceAtLeast(charSequence.length() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = r.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex)))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, f7.l predicate) {
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

    public static final CharSequence filter(CharSequence charSequence, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, f7.p predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
            i8++;
            i9 = i10;
        }
        return sb;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C destination, f7.p predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final CharSequence filterNot(CharSequence charSequence, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C destination, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C destination, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static final char first(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return destination;
    }

    public static final <R> R fold(CharSequence charSequence, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
        }
        return r8;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Character.valueOf(charSequence.charAt(i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = r.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = r.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r8);
        }
        return r8;
    }

    public static final void forEach(CharSequence charSequence, f7.l action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            action.invoke(Character.valueOf(charSequence.charAt(i8)));
        }
    }

    public static final void forEachIndexed(CharSequence charSequence, f7.p action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            i8++;
            i9++;
        }
    }

    public static final Character getOrNull(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0 || i8 > r.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i8));
    }

    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    public static final <K> I groupingBy(CharSequence charSequence, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new d(charSequence, keySelector);
    }

    public static final int indexOfFirst(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(r.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final <R> List<R> map(CharSequence charSequence, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            int i10 = i9 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            int i10 = i9 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Object objInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Object objInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Character maxByOrNull(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) < 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final <R extends Comparable<? super R>> char maxByOrThrow(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) < 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return cCharAt;
    }

    public static final Character maxOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char maxOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final Character maxWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char maxWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final <R extends Comparable<? super R>> Character minByOrNull(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) > 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final <R extends Comparable<? super R>> char minByOrThrow(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) > 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return cCharAt;
    }

    public static final Character minOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char minOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final Character minWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char minWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final boolean none(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final <S extends CharSequence> S onEach(S s8, f7.l action) {
        Intrinsics.checkNotNullParameter(s8, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i8 = 0; i8 < s8.length(); i8++) {
            action.invoke(Character.valueOf(s8.charAt(i8)));
        }
        return s8;
    }

    public static final <S extends CharSequence> S onEachIndexed(S s8, f7.p action) {
        Intrinsics.checkNotNullParameter(s8, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i8 = 0;
        int i9 = 0;
        while (i8 < s8.length()) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(s8.charAt(i8)));
            i8++;
            i9++;
        }
        return s8;
    }

    public static final R6.p partition(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new R6.p(sb, sb2);
    }

    public static char random(CharSequence charSequence, h7.f random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character randomOrNull(CharSequence charSequence, h7.f random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    public static final char reduce(CharSequence charSequence, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt())))).charValue();
        }
        return cCharAt;
    }

    public static final char reduceIndexed(CharSequence charSequence, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = ((Character) operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt)))).charValue();
        }
        return cCharAt;
    }

    public static final Character reduceIndexedOrNull(CharSequence charSequence, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = ((Character) operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt)))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final Character reduceOrNull(CharSequence charSequence, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        M it = new j7.l(1, r.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt())))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(CharSequence charSequence, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(cCharAt))).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(CharSequence charSequence, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharAt = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i8)), Character.valueOf(cCharAt))).charValue();
        }
        return cCharAt;
    }

    public static final Character reduceRightIndexedOrNull(CharSequence charSequence, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharAt = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i8)), Character.valueOf(cCharAt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final Character reduceRightOrNull(CharSequence charSequence, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(cCharAt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(sbReverse, "reverse(...)");
        return sbReverse;
    }

    public static final <R> List<R> runningFold(CharSequence charSequence, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <R> List<R> runningFoldIndexed(CharSequence charSequence, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final List<Character> runningReduce(CharSequence charSequence, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i8 = 1;
        while (i8 < length) {
            Character ch = (Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i8)));
            char cCharValue = ch.charValue();
            arrayList.add(ch);
            i8++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    public static final List<Character> runningReduceIndexed(CharSequence charSequence, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i8 = 1;
        while (i8 < length) {
            Character ch = (Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i8)));
            char cCharValue = ch.charValue();
            arrayList.add(ch);
            i8++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    public static final <R> List<R> scan(CharSequence charSequence, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final char single(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final CharSequence slice(CharSequence charSequence, j7.l indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : B.subSequence(charSequence, indices);
    }

    public static final int sumBy(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            iIntValue += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            dDoubleValue += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final CharSequence take(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            return charSequence.subSequence(0, j7.s.coerceAtMost(i8, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - j7.s.coerceAtMost(i8, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = r.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex)))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence takeWhile(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return charSequence.subSequence(0, i8);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            destination.add(Character.valueOf(charSequence.charAt(i8)));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(Q.mapCapacity(j7.s.coerceAtMost(charSequence.length(), 128))));
    }

    public static final List<Character> toList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? toMutableList(charSequence) : S6.r.listOf(Character.valueOf(charSequence.charAt(0))) : S6.r.emptyList();
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(Q.mapCapacity(j7.s.coerceAtMost(charSequence.length(), 128)))) : d0.setOf(Character.valueOf(charSequence.charAt(0))) : d0.emptySet();
    }

    public static final List<String> windowed(CharSequence charSequence, int i8, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i8, i9, z8, e.INSTANCE);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(charSequence, i8, i9, z8);
    }

    public static final k7.m windowedSequence(CharSequence charSequence, int i8, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i8, i9, z8, f.INSTANCE);
    }

    public static /* synthetic */ k7.m windowedSequence$default(CharSequence charSequence, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowedSequence(charSequence, i8, i9, z8);
    }

    public static final Iterable<J> withIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new K(new h(charSequence));
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence other, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(other.charAt(i8))));
        }
        return arrayList;
    }

    public static final <R> List<R> zipWithNext(CharSequence charSequence, f7.p transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i8 = 0;
        while (i8 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i8));
            i8++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    public static final boolean any(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> List<R> chunked(CharSequence charSequence, int i8, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i8, i8, true, transform);
    }

    public static final <R> k7.m chunkedSequence(CharSequence charSequence, int i8, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i8, i8, true, transform);
    }

    public static final Character firstOrNull(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    public static final Character lastOrNull(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final boolean none(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Character singleOrNull(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z8 = false;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                if (z8) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z8 = true;
            }
        }
        if (z8) {
            return chValueOf;
        }
        return null;
    }

    public static final <R> List<R> windowed(CharSequence charSequence, int i8, int i9, boolean z8, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        i0.checkWindowSizeStep(i8, i9);
        int length = charSequence.length();
        int i10 = 0;
        ArrayList arrayList = new ArrayList((length / i9) + (length % i9 == 0 ? 0 : 1));
        while (i10 >= 0 && i10 < length) {
            int i11 = i10 + i8;
            if (i11 < 0 || i11 > length) {
                if (!z8) {
                    break;
                }
                i11 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i10, i11)));
            i10 += i9;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i8, int i9, boolean z8, f7.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(charSequence, i8, i9, z8, lVar);
    }

    public static final <R> k7.m windowedSequence(CharSequence charSequence, int i8, int i9, boolean z8, f7.l transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        i0.checkWindowSizeStep(i8, i9);
        return k7.p.map(S6.r.asSequence(j7.s.step(z8 ? B.getIndices(charSequence) : j7.s.until(0, (charSequence.length() - i8) + 1), i9)), new g(i8, charSequence, transform));
    }

    public static /* synthetic */ k7.m windowedSequence$default(CharSequence charSequence, int i8, int i9, boolean z8, f7.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowedSequence(charSequence, i8, i9, z8, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static String drop(String str, int i8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(j7.s.coerceAtMost(i8, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String dropLast(String str, int i8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            return take(str, j7.s.coerceAtLeast(str.length() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String filterNot(String str, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String slice(String str, j7.l indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : B.substring(str, indices);
    }

    public static final String take(String str, int i8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(0, j7.s.coerceAtMost(i8, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String filterIndexed(String str, f7.p predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
            i8++;
            i9 = i10;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final char first(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final String takeLast(String str, int i8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - j7.s.coerceAtMost(i8, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final List<R6.p> zip(CharSequence charSequence, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(other.charAt(i8))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(charSequence.length()), 16));
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final String dropLastWhile(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = r.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final String dropWhile(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                String strSubstring = str.substring(i8);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final String filter(String str, f7.l predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final char single(CharSequence charSequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z8 = false;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                if (!z8) {
                    chValueOf = Character.valueOf(cCharAt);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    public static final String takeLastWhile(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = r.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final String takeWhile(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                String strSubstring = str.substring(0, i8);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final List<R6.p> zipWithNext(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i8 = 0;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            i8++;
            arrayList.add(R6.v.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final R6.p partition(String str, f7.l predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new R6.p(string, string2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }
}
