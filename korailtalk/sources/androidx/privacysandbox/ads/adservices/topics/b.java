package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f10113a;

    public b(List<c> topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.f10113a = topics;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10113a.size() != bVar.f10113a.size()) {
            return false;
        }
        return Intrinsics.areEqual(new HashSet(this.f10113a), new HashSet(bVar.f10113a));
    }

    public final List<c> getTopics() {
        return this.f10113a;
    }

    public int hashCode() {
        return Objects.hash(this.f10113a);
    }

    public String toString() {
        return "Topics=" + this.f10113a;
    }
}
