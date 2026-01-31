package i2;

import android.os.Bundle;
import g2.C5539a;

/* renamed from: i2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5690w implements C5539a.d.InterfaceC0302a, C5539a.d {
    public static final C5690w zaa = builder().build();

    /* renamed from: a, reason: collision with root package name */
    private final String f31871a;

    /* renamed from: i2.w$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f31872a;

        /* synthetic */ a(AbstractC5692y abstractC5692y) {
        }

        public C5690w build() {
            return new C5690w(this.f31872a, null);
        }

        public a setApi(String str) {
            this.f31872a = str;
            return this;
        }
    }

    /* synthetic */ C5690w(String str, AbstractC5693z abstractC5693z) {
        this.f31871a = str;
    }

    public static a builder() {
        return new a(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5690w) {
            return AbstractC5681n.equal(this.f31871a, ((C5690w) obj).f31871a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.f31871a);
    }

    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.f31871a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
