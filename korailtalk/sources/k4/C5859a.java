package k4;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5859a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f33567i = "a";

    /* renamed from: j, reason: collision with root package name */
    private static final Collection f33568j;

    /* renamed from: a, reason: collision with root package name */
    private boolean f33569a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33570b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33571c;

    /* renamed from: d, reason: collision with root package name */
    private final Camera f33572d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f33573e;

    /* renamed from: f, reason: collision with root package name */
    private int f33574f = 1;

    /* renamed from: g, reason: collision with root package name */
    private final Handler.Callback f33575g;

    /* renamed from: h, reason: collision with root package name */
    private final Camera.AutoFocusCallback f33576h;

    /* renamed from: k4.a$a, reason: collision with other inner class name */
    class C0339a implements Handler.Callback {
        C0339a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C5859a.this.f33574f) {
                return false;
            }
            C5859a.this.h();
            return true;
        }
    }

    /* renamed from: k4.a$b */
    class b implements Camera.AutoFocusCallback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            C5859a.this.f33570b = false;
            C5859a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z8, Camera camera) {
            C5859a.this.f33573e.post(new Runnable() { // from class: k4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33579a.b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f33568j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C5859a(Camera camera, k kVar) {
        C0339a c0339a = new C0339a();
        this.f33575g = c0339a;
        this.f33576h = new b();
        this.f33573e = new Handler(c0339a);
        this.f33572d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z8 = kVar.isAutoFocusEnabled() && f33568j.contains(focusMode);
        this.f33571c = z8;
        StringBuilder sb = new StringBuilder();
        sb.append("Current focus mode '");
        sb.append(focusMode);
        sb.append("'; use auto focus? ");
        sb.append(z8);
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f33569a && !this.f33573e.hasMessages(this.f33574f)) {
            Handler handler = this.f33573e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f33574f), 2000L);
        }
    }

    private void g() {
        this.f33573e.removeMessages(this.f33574f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.f33571c || this.f33569a || this.f33570b) {
            return;
        }
        try {
            this.f33572d.autoFocus(this.f33576h);
            this.f33570b = true;
        } catch (RuntimeException e8) {
            Log.w(f33567i, "Unexpected exception while focusing", e8);
            f();
        }
    }

    public void start() {
        this.f33569a = false;
        h();
    }

    public void stop() {
        this.f33569a = true;
        this.f33570b = false;
        g();
        if (this.f33571c) {
            try {
                this.f33572d.cancelAutoFocus();
            } catch (RuntimeException e8) {
                Log.w(f33567i, "Unexpected exception while cancelling focusing", e8);
            }
        }
    }
}
