package l7;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes3.dex */
public abstract class o {
    public static final l a(Matcher matcher, int i8, CharSequence charSequence) {
        if (matcher.find(i8)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final l b(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final j7.l c(MatchResult matchResult) {
        return j7.s.until(matchResult.start(), matchResult.end());
    }

    public static final j7.l d(MatchResult matchResult, int i8) {
        return j7.s.until(matchResult.start(i8), matchResult.end(i8));
    }

    public static final int e(Iterable iterable) {
        Iterator it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((h) it.next()).getValue();
        }
        return value;
    }
}
