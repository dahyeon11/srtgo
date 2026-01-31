package androidx.core.content;

import Z.h;
import android.content.LocusId;
import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f8922a;

    /* renamed from: b, reason: collision with root package name */
    private final LocusId f8923b;

    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }

        static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public b(String str) {
        this.f8922a = (String) h.checkStringNotEmpty(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8923b = a.a(str);
        } else {
            this.f8923b = null;
        }
    }

    private String a() {
        return this.f8922a.length() + "_chars";
    }

    public static b toLocusIdCompat(LocusId locusId) {
        h.checkNotNull(locusId, "locusId cannot be null");
        return new b((String) h.checkStringNotEmpty(a.b(locusId), "id cannot be empty"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f8922a;
        return str == null ? bVar.f8922a == null : str.equals(bVar.f8922a);
    }

    public String getId() {
        return this.f8922a;
    }

    public int hashCode() {
        String str = this.f8922a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public LocusId toLocusId() {
        return this.f8923b;
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
