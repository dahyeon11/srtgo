package t0;

import android.net.Uri;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6336d {
    public static final a Companion = new a(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;

    /* renamed from: a, reason: collision with root package name */
    private final int f36878a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36879b;

    /* renamed from: c, reason: collision with root package name */
    private final Instant f36880c;

    /* renamed from: d, reason: collision with root package name */
    private final Instant f36881d;

    /* renamed from: e, reason: collision with root package name */
    private final List f36882e;

    /* renamed from: f, reason: collision with root package name */
    private final List f36883f;

    /* renamed from: t0.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6336d(int i8, int i9, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(domainUris, "domainUris");
        Intrinsics.checkNotNullParameter(originUris, "originUris");
        this.f36878a = i8;
        this.f36879b = i9;
        this.f36880c = start;
        this.f36881d = end;
        this.f36882e = domainUris;
        this.f36883f = originUris;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6336d)) {
            return false;
        }
        C6336d c6336d = (C6336d) obj;
        return this.f36878a == c6336d.f36878a && Intrinsics.areEqual(new HashSet(this.f36882e), new HashSet(c6336d.f36882e)) && Intrinsics.areEqual(new HashSet(this.f36883f), new HashSet(c6336d.f36883f)) && Intrinsics.areEqual(this.f36880c, c6336d.f36880c) && Intrinsics.areEqual(this.f36881d, c6336d.f36881d) && this.f36879b == c6336d.f36879b;
    }

    public final int getDeletionMode() {
        return this.f36878a;
    }

    public final List<Uri> getDomainUris() {
        return this.f36882e;
    }

    public final Instant getEnd() {
        return this.f36881d;
    }

    public final int getMatchBehavior() {
        return this.f36879b;
    }

    public final List<Uri> getOriginUris() {
        return this.f36883f;
    }

    public final Instant getStart() {
        return this.f36880c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f36878a) * 31) + this.f36882e.hashCode()) * 31) + this.f36883f.hashCode()) * 31) + this.f36880c.hashCode()) * 31) + this.f36881d.hashCode()) * 31) + Integer.hashCode(this.f36879b);
    }

    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.f36878a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.f36879b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.f36880c + ", End=" + this.f36881d + ", DomainUris=" + this.f36882e + ", OriginUris=" + this.f36883f + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6336d(int i8, int i9, Instant MIN, Instant MAX, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            MIN = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i10 & 8) != 0) {
            MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        }
        this(i8, i9, instant, MAX, (i10 & 16) != 0 ? S6.r.emptyList() : list, (i10 & 32) != 0 ? S6.r.emptyList() : list2);
    }
}
