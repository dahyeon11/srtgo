package X7;

import Q7.C0708l;
import Q7.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class e implements ListIterator, Cloneable {

    /* renamed from: j, reason: collision with root package name */
    private static final e f5502j;

    /* renamed from: k, reason: collision with root package name */
    private static final e f5503k;

    /* renamed from: a, reason: collision with root package name */
    private char[] f5504a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f5505b;

    /* renamed from: c, reason: collision with root package name */
    private int f5506c;

    /* renamed from: d, reason: collision with root package name */
    private d f5507d;

    /* renamed from: e, reason: collision with root package name */
    private d f5508e;

    /* renamed from: f, reason: collision with root package name */
    private d f5509f;

    /* renamed from: g, reason: collision with root package name */
    private d f5510g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5511h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5512i;

    static {
        e eVar = new e();
        f5502j = eVar;
        eVar.setDelimiterMatcher(d.commaMatcher());
        eVar.setQuoteMatcher(d.doubleQuoteMatcher());
        eVar.setIgnoredMatcher(d.noneMatcher());
        eVar.setTrimmerMatcher(d.trimMatcher());
        eVar.setEmptyTokenAsNull(false);
        eVar.setIgnoreEmptyTokens(false);
        e eVar2 = new e();
        f5503k = eVar2;
        eVar2.setDelimiterMatcher(d.tabMatcher());
        eVar2.setQuoteMatcher(d.doubleQuoteMatcher());
        eVar2.setIgnoredMatcher(d.noneMatcher());
        eVar2.setTrimmerMatcher(d.trimMatcher());
        eVar2.setEmptyTokenAsNull(false);
        eVar2.setIgnoreEmptyTokens(false);
    }

    public e() {
        this.f5507d = d.splitMatcher();
        this.f5508e = d.noneMatcher();
        this.f5509f = d.noneMatcher();
        this.f5510g = d.noneMatcher();
        this.f5512i = true;
        this.f5504a = null;
    }

    private void a(List list, String str) {
        if (X.isEmpty(str)) {
            if (isIgnoreEmptyTokens()) {
                return;
            }
            if (isEmptyTokenAsNull()) {
                str = null;
            }
        }
        list.add(str);
    }

    private void b() {
        if (this.f5505b == null) {
            char[] cArr = this.f5504a;
            if (cArr == null) {
                this.f5505b = (String[]) i(null, 0, 0).toArray(C0708l.EMPTY_STRING_ARRAY);
            } else {
                this.f5505b = (String[]) i(cArr, 0, cArr.length).toArray(C0708l.EMPTY_STRING_ARRAY);
            }
        }
    }

    private static e d() {
        return (e) f5502j.clone();
    }

    private static e e() {
        return (e) f5503k.clone();
    }

    private boolean f(char[] cArr, int i8, int i9, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i8 + i12;
            if (i13 >= i9 || cArr[i13] != cArr[i10 + i12]) {
                return false;
            }
        }
        return true;
    }

    private int g(char[] cArr, int i8, int i9, c cVar, List list) {
        while (i8 < i9) {
            int iMax = Math.max(getIgnoredMatcher().isMatch(cArr, i8, i8, i9), getTrimmerMatcher().isMatch(cArr, i8, i8, i9));
            if (iMax == 0 || getDelimiterMatcher().isMatch(cArr, i8, i8, i9) > 0 || getQuoteMatcher().isMatch(cArr, i8, i8, i9) > 0) {
                break;
            }
            i8 += iMax;
        }
        if (i8 >= i9) {
            a(list, "");
            return -1;
        }
        int iIsMatch = getDelimiterMatcher().isMatch(cArr, i8, i8, i9);
        if (iIsMatch > 0) {
            a(list, "");
            return i8 + iIsMatch;
        }
        int iIsMatch2 = getQuoteMatcher().isMatch(cArr, i8, i8, i9);
        return iIsMatch2 > 0 ? h(cArr, i8 + iIsMatch2, i9, cVar, list, i8, iIsMatch2) : h(cArr, i8, i9, cVar, list, 0, 0);
    }

    public static e getCSVInstance() {
        return d();
    }

    public static e getTSVInstance() {
        return e();
    }

    private int h(char[] cArr, int i8, int i9, c cVar, List list, int i10, int i11) {
        int i12;
        cVar.clear();
        boolean z8 = i11 > 0;
        int i13 = i8;
        int size = 0;
        while (i13 < i9) {
            if (z8) {
                int i14 = size;
                i12 = i13;
                if (f(cArr, i13, i9, i10, i11)) {
                    int i15 = i12 + i11;
                    if (f(cArr, i15, i9, i10, i11)) {
                        cVar.append(cArr, i12, i11);
                        i13 = i12 + (i11 * 2);
                        size = cVar.size();
                    } else {
                        size = i14;
                        i13 = i15;
                        z8 = false;
                    }
                } else {
                    i13 = i12 + 1;
                    cVar.append(cArr[i12]);
                    size = cVar.size();
                }
            } else {
                int i16 = size;
                i12 = i13;
                int iIsMatch = getDelimiterMatcher().isMatch(cArr, i12, i8, i9);
                if (iIsMatch > 0) {
                    a(list, cVar.substring(0, i16));
                    return i12 + iIsMatch;
                }
                if (i11 <= 0 || !f(cArr, i12, i9, i10, i11)) {
                    int iIsMatch2 = getIgnoredMatcher().isMatch(cArr, i12, i8, i9);
                    if (iIsMatch2 <= 0) {
                        iIsMatch2 = getTrimmerMatcher().isMatch(cArr, i12, i8, i9);
                        if (iIsMatch2 > 0) {
                            cVar.append(cArr, i12, iIsMatch2);
                        } else {
                            i13 = i12 + 1;
                            cVar.append(cArr[i12]);
                            size = cVar.size();
                        }
                    }
                    i13 = i12 + iIsMatch2;
                    size = i16;
                } else {
                    i13 = i12 + i11;
                    size = i16;
                    z8 = true;
                }
            }
        }
        a(list, cVar.substring(0, size));
        return -1;
    }

    Object c() {
        e eVar = (e) super.clone();
        char[] cArr = eVar.f5504a;
        if (cArr != null) {
            eVar.f5504a = (char[]) cArr.clone();
        }
        eVar.reset();
        return eVar;
    }

    public Object clone() {
        try {
            return c();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getContent() {
        char[] cArr = this.f5504a;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public d getDelimiterMatcher() {
        return this.f5507d;
    }

    public d getIgnoredMatcher() {
        return this.f5509f;
    }

    public d getQuoteMatcher() {
        return this.f5508e;
    }

    public String[] getTokenArray() {
        b();
        return (String[]) this.f5505b.clone();
    }

    public List<String> getTokenList() {
        b();
        ArrayList arrayList = new ArrayList(this.f5505b.length);
        arrayList.addAll(Arrays.asList(this.f5505b));
        return arrayList;
    }

    public d getTrimmerMatcher() {
        return this.f5510g;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        b();
        return this.f5506c < this.f5505b.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        b();
        return this.f5506c > 0;
    }

    protected List i(char[] cArr, int i8, int i9) {
        if (C0708l.isEmpty(cArr)) {
            return Collections.emptyList();
        }
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        int iG = i8;
        while (iG >= 0 && iG < i9) {
            iG = g(cArr, iG, i9, cVar, arrayList);
            if (iG >= i9) {
                a(arrayList, "");
            }
        }
        return arrayList;
    }

    public boolean isEmptyTokenAsNull() {
        return this.f5511h;
    }

    public boolean isIgnoreEmptyTokens() {
        return this.f5512i;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f5506c;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.f5505b;
        int i8 = this.f5506c;
        this.f5506c = i8 + 1;
        return strArr[i8];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f5506c - 1;
    }

    public String previousToken() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.f5505b;
        int i8 = this.f5506c - 1;
        this.f5506c = i8;
        return strArr[i8];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public e reset() {
        this.f5506c = 0;
        this.f5505b = null;
        return this;
    }

    public e setDelimiterChar(char c9) {
        return setDelimiterMatcher(d.charMatcher(c9));
    }

    public e setDelimiterMatcher(d dVar) {
        if (dVar == null) {
            this.f5507d = d.noneMatcher();
        } else {
            this.f5507d = dVar;
        }
        return this;
    }

    public e setDelimiterString(String str) {
        return setDelimiterMatcher(d.stringMatcher(str));
    }

    public e setEmptyTokenAsNull(boolean z8) {
        this.f5511h = z8;
        return this;
    }

    public e setIgnoreEmptyTokens(boolean z8) {
        this.f5512i = z8;
        return this;
    }

    public e setIgnoredChar(char c9) {
        return setIgnoredMatcher(d.charMatcher(c9));
    }

    public e setIgnoredMatcher(d dVar) {
        if (dVar != null) {
            this.f5509f = dVar;
        }
        return this;
    }

    public e setQuoteChar(char c9) {
        return setQuoteMatcher(d.charMatcher(c9));
    }

    public e setQuoteMatcher(d dVar) {
        if (dVar != null) {
            this.f5508e = dVar;
        }
        return this;
    }

    public e setTrimmerMatcher(d dVar) {
        if (dVar != null) {
            this.f5510g = dVar;
        }
        return this;
    }

    public int size() {
        b();
        return this.f5505b.length;
    }

    public String toString() {
        if (this.f5505b == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + getTokenList();
    }

    public static e getCSVInstance(char[] cArr) {
        e eVarD = d();
        eVarD.reset(cArr);
        return eVarD;
    }

    public static e getTSVInstance(char[] cArr) {
        e eVarE = e();
        eVarE.reset(cArr);
        return eVarE;
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f5505b;
        int i8 = this.f5506c;
        this.f5506c = i8 + 1;
        return strArr[i8];
    }

    @Override // java.util.ListIterator
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f5505b;
        int i8 = this.f5506c - 1;
        this.f5506c = i8;
        return strArr[i8];
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public e reset(char[] cArr) {
        reset();
        this.f5504a = C0708l.clone(cArr);
        return this;
    }

    public static e getCSVInstance(String str) {
        e eVarD = d();
        eVarD.reset(str);
        return eVarD;
    }

    public static e getTSVInstance(String str) {
        e eVarE = e();
        eVarE.reset(str);
        return eVarE;
    }

    public e reset(String str) {
        reset();
        if (str != null) {
            this.f5504a = str.toCharArray();
        } else {
            this.f5504a = null;
        }
        return this;
    }

    public e(char[] cArr) {
        this.f5507d = d.splitMatcher();
        this.f5508e = d.noneMatcher();
        this.f5509f = d.noneMatcher();
        this.f5510g = d.noneMatcher();
        this.f5512i = true;
        this.f5504a = C0708l.clone(cArr);
    }

    public e(char[] cArr, char c9) {
        this(cArr);
        setDelimiterChar(c9);
    }

    public e(char[] cArr, char c9, char c10) {
        this(cArr, c9);
        setQuoteChar(c10);
    }

    public e(char[] cArr, String str) {
        this(cArr);
        setDelimiterString(str);
    }

    public e(char[] cArr, d dVar) {
        this(cArr);
        setDelimiterMatcher(dVar);
    }

    public e(char[] cArr, d dVar, d dVar2) {
        this(cArr, dVar);
        setQuoteMatcher(dVar2);
    }

    public e(String str) {
        this.f5507d = d.splitMatcher();
        this.f5508e = d.noneMatcher();
        this.f5509f = d.noneMatcher();
        this.f5510g = d.noneMatcher();
        this.f5512i = true;
        if (str != null) {
            this.f5504a = str.toCharArray();
        } else {
            this.f5504a = null;
        }
    }

    public e(String str, char c9) {
        this(str);
        setDelimiterChar(c9);
    }

    public e(String str, char c9, char c10) {
        this(str, c9);
        setQuoteChar(c10);
    }

    public e(String str, String str2) {
        this(str);
        setDelimiterString(str2);
    }

    public e(String str, d dVar) {
        this(str);
        setDelimiterMatcher(dVar);
    }

    public e(String str, d dVar, d dVar2) {
        this(str, dVar);
        setQuoteMatcher(dVar2);
    }
}
