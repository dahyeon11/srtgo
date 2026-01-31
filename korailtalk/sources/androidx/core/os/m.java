package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f9034a;

    m(Object obj) {
        this.f9034a = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f9034a.equals(((l) obj).getLocaleList());
    }

    @Override // androidx.core.os.l
    public Locale get(int i8) {
        return this.f9034a.get(i8);
    }

    @Override // androidx.core.os.l
    public Locale getFirstMatch(String[] strArr) {
        return this.f9034a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.l
    public Object getLocaleList() {
        return this.f9034a;
    }

    public int hashCode() {
        return this.f9034a.hashCode();
    }

    @Override // androidx.core.os.l
    public int indexOf(Locale locale) {
        return this.f9034a.indexOf(locale);
    }

    @Override // androidx.core.os.l
    public boolean isEmpty() {
        return this.f9034a.isEmpty();
    }

    @Override // androidx.core.os.l
    public int size() {
        return this.f9034a.size();
    }

    @Override // androidx.core.os.l
    public String toLanguageTags() {
        return this.f9034a.toLanguageTags();
    }

    public String toString() {
        return this.f9034a.toString();
    }
}
