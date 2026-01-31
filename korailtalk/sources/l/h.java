package l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1001x0;
import androidx.core.view.C1005z0;
import androidx.core.view.InterfaceC1003y0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f33895c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1003y0 f33896d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33897e;

    /* renamed from: b, reason: collision with root package name */
    private long f33894b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C1005z0 f33898f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f33893a = new ArrayList();

    class a extends C1005z0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33899a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f33900b = 0;

        a() {
        }

        void a() {
            this.f33900b = 0;
            this.f33899a = false;
            h.this.a();
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            int i8 = this.f33900b + 1;
            this.f33900b = i8;
            if (i8 == h.this.f33893a.size()) {
                InterfaceC1003y0 interfaceC1003y0 = h.this.f33896d;
                if (interfaceC1003y0 != null) {
                    interfaceC1003y0.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationStart(View view) {
            if (this.f33899a) {
                return;
            }
            this.f33899a = true;
            InterfaceC1003y0 interfaceC1003y0 = h.this.f33896d;
            if (interfaceC1003y0 != null) {
                interfaceC1003y0.onAnimationStart(null);
            }
        }
    }

    void a() {
        this.f33897e = false;
    }

    public void cancel() {
        if (this.f33897e) {
            Iterator it = this.f33893a.iterator();
            while (it.hasNext()) {
                ((C1001x0) it.next()).cancel();
            }
            this.f33897e = false;
        }
    }

    public h play(C1001x0 c1001x0) {
        if (!this.f33897e) {
            this.f33893a.add(c1001x0);
        }
        return this;
    }

    public h playSequentially(C1001x0 c1001x0, C1001x0 c1001x02) {
        this.f33893a.add(c1001x0);
        c1001x02.setStartDelay(c1001x0.getDuration());
        this.f33893a.add(c1001x02);
        return this;
    }

    public h setDuration(long j8) {
        if (!this.f33897e) {
            this.f33894b = j8;
        }
        return this;
    }

    public h setInterpolator(Interpolator interpolator) {
        if (!this.f33897e) {
            this.f33895c = interpolator;
        }
        return this;
    }

    public h setListener(InterfaceC1003y0 interfaceC1003y0) {
        if (!this.f33897e) {
            this.f33896d = interfaceC1003y0;
        }
        return this;
    }

    public void start() {
        if (this.f33897e) {
            return;
        }
        Iterator it = this.f33893a.iterator();
        while (it.hasNext()) {
            C1001x0 c1001x0 = (C1001x0) it.next();
            long j8 = this.f33894b;
            if (j8 >= 0) {
                c1001x0.setDuration(j8);
            }
            Interpolator interpolator = this.f33895c;
            if (interpolator != null) {
                c1001x0.setInterpolator(interpolator);
            }
            if (this.f33896d != null) {
                c1001x0.setListener(this.f33898f);
            }
            c1001x0.start();
        }
        this.f33897e = true;
    }
}
