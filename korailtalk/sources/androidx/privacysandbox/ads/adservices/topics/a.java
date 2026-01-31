package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f10109a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10110b;

    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    public static final class C0158a {

        /* renamed from: a, reason: collision with root package name */
        private String f10111a = "";

        /* renamed from: b, reason: collision with root package name */
        private boolean f10112b = true;

        public final a build() {
            if (this.f10111a.length() > 0) {
                return new a(this.f10111a, this.f10112b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final C0158a setAdsSdkName(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            this.f10111a = adsSdkName;
            return this;
        }

        public final C0158a setShouldRecordObservation(boolean z8) {
            this.f10112b = z8;
            return this;
        }
    }

    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f10109a, aVar.f10109a) && this.f10110b == aVar.f10110b;
    }

    public final String getAdsSdkName() {
        return this.f10109a;
    }

    public int hashCode() {
        return (this.f10109a.hashCode() * 31) + Boolean.hashCode(this.f10110b);
    }

    public final boolean shouldRecordObservation() {
        return this.f10110b;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f10109a + ", shouldRecordObservation=" + this.f10110b;
    }

    public a(String adsSdkName, boolean z8) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f10109a = adsSdkName;
        this.f10110b = z8;
    }

    public /* synthetic */ a(String str, boolean z8, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z8);
    }
}
