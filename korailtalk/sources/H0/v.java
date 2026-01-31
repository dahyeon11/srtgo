package H0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private UUID f1598a;

    /* renamed from: b, reason: collision with root package name */
    private a f1599b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.b f1600c;

    /* renamed from: d, reason: collision with root package name */
    private Set f1601d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.work.b f1602e;

    /* renamed from: f, reason: collision with root package name */
    private int f1603f;

    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public v(UUID uuid, a aVar, androidx.work.b bVar, List<String> list, androidx.work.b bVar2, int i8) {
        this.f1598a = uuid;
        this.f1599b = aVar;
        this.f1600c = bVar;
        this.f1601d = new HashSet(list);
        this.f1602e = bVar2;
        this.f1603f = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f1603f == vVar.f1603f && this.f1598a.equals(vVar.f1598a) && this.f1599b == vVar.f1599b && this.f1600c.equals(vVar.f1600c) && this.f1601d.equals(vVar.f1601d)) {
            return this.f1602e.equals(vVar.f1602e);
        }
        return false;
    }

    public UUID getId() {
        return this.f1598a;
    }

    public androidx.work.b getOutputData() {
        return this.f1600c;
    }

    public androidx.work.b getProgress() {
        return this.f1602e;
    }

    public int getRunAttemptCount() {
        return this.f1603f;
    }

    public a getState() {
        return this.f1599b;
    }

    public Set<String> getTags() {
        return this.f1601d;
    }

    public int hashCode() {
        return (((((((((this.f1598a.hashCode() * 31) + this.f1599b.hashCode()) * 31) + this.f1600c.hashCode()) * 31) + this.f1601d.hashCode()) * 31) + this.f1602e.hashCode()) * 31) + this.f1603f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f1598a + "', mState=" + this.f1599b + ", mOutputData=" + this.f1600c + ", mTags=" + this.f1601d + ", mProgress=" + this.f1602e + '}';
    }
}
