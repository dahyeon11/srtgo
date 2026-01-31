package l7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface l {

    public static final class a {
        public static b getDestructured(l lVar) {
            return new b(lVar);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final l f34032a;

        public b(l match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f34032a = match;
        }

        public final l getMatch() {
            return this.f34032a;
        }

        public final List<String> toList() {
            return this.f34032a.getGroupValues().subList(1, this.f34032a.getGroupValues().size());
        }
    }

    b getDestructured();

    List<String> getGroupValues();

    j getGroups();

    j7.l getRange();

    String getValue();

    l next();
}
