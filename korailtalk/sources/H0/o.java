package H0;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
public interface o {
    public static final b.C0034b IN_PROGRESS;
    public static final b.c SUCCESS;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f1596a;

            public a(Throwable th) {
                this.f1596a = th;
            }

            public Throwable getThrowable() {
                return this.f1596a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f1596a.getMessage());
            }
        }

        /* renamed from: H0.o$b$b, reason: collision with other inner class name */
        public static final class C0034b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0034b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        SUCCESS = new b.c();
        IN_PROGRESS = new b.C0034b();
    }

    C getResult();

    LiveData getState();
}
