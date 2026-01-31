package c7;

import b7.C1085a;
import h7.f;
import i7.C5712a;
import j7.l;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import l7.i;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1100d extends C1085a {

    /* renamed from: c7.d$a */
    private static final class a {
        public static final a INSTANCE = new a();
        public static final Integer sdkVersion;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            sdkVersion = num;
        }

        private a() {
        }
    }

    private final boolean a(int i8) {
        Integer num = a.sdkVersion;
        return num == null || num.intValue() >= i8;
    }

    @Override // a7.C0840a
    public f defaultPlatformRandom() {
        return a(34) ? new C5712a() : super.defaultPlatformRandom();
    }

    @Override // a7.C0840a
    public i getMatchResultNamedGroup(MatchResult matchResult, String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        l lVar = new l(matcher.start(name), matcher.end(name) - 1);
        if (lVar.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(name);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new i(strGroup, lVar);
    }
}
