package androidx.core.os;

import java.util.Locale;

/* loaded from: classes.dex */
interface l {
    Locale get(int i8);

    Locale getFirstMatch(String[] strArr);

    Object getLocaleList();

    int indexOf(Locale locale);

    boolean isEmpty();

    int size();

    String toLanguageTags();
}
