package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f10114a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10115b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10116c;

    public c(long j8, long j9, int i8) {
        this.f10114a = j8;
        this.f10115b = j9;
        this.f10116c = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10114a == cVar.f10114a && this.f10115b == cVar.f10115b && this.f10116c == cVar.f10116c;
    }

    public final long getModelVersion() {
        return this.f10115b;
    }

    public final long getTaxonomyVersion() {
        return this.f10114a;
    }

    public final int getTopicId() {
        return this.f10116c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f10114a) * 31) + Long.hashCode(this.f10115b)) * 31) + Integer.hashCode(this.f10116c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f10114a + ", ModelVersion=" + this.f10115b + ", TopicCode=" + this.f10116c + " }");
    }
}
