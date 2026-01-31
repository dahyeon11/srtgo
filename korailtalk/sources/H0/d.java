package H0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f1583a = new HashSet();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1584a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1585b;

        a(Uri uri, boolean z8) {
            this.f1584a = uri;
            this.f1585b = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1585b == aVar.f1585b && this.f1584a.equals(aVar.f1584a);
        }

        public Uri getUri() {
            return this.f1584a;
        }

        public int hashCode() {
            return (this.f1584a.hashCode() * 31) + (this.f1585b ? 1 : 0);
        }

        public boolean shouldTriggerForDescendants() {
            return this.f1585b;
        }
    }

    public void add(Uri uri, boolean z8) {
        this.f1583a.add(new a(uri, z8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f1583a.equals(((d) obj).f1583a);
    }

    public Set<a> getTriggers() {
        return this.f1583a;
    }

    public int hashCode() {
        return this.f1583a.hashCode();
    }

    public int size() {
        return this.f1583a.size();
    }
}
