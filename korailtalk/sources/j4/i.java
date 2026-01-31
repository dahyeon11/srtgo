package j4;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: k, reason: collision with root package name */
    private static final String f33445k = "i";

    /* renamed from: a, reason: collision with root package name */
    private k4.h f33446a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f33447b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f33448c;

    /* renamed from: d, reason: collision with root package name */
    private f f33449d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f33450e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f33451f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33452g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Object f33453h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Handler.Callback f33454i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final k4.r f33455j = new b();

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == K3.k.zxing_decode) {
                i.this.g((t) message.obj);
                return true;
            }
            if (i8 != K3.k.zxing_preview_failed) {
                return true;
            }
            i.this.h();
            return true;
        }
    }

    class b implements k4.r {
        b() {
        }

        @Override // k4.r
        public void onPreview(t tVar) {
            synchronized (i.this.f33453h) {
                try {
                    if (i.this.f33452g) {
                        i.this.f33448c.obtainMessage(K3.k.zxing_decode, tVar).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // k4.r
        public void onPreviewError(Exception exc) {
            synchronized (i.this.f33453h) {
                try {
                    if (i.this.f33452g) {
                        i.this.f33448c.obtainMessage(K3.k.zxing_preview_failed).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public i(k4.h hVar, f fVar, Handler handler) {
        u.validateMainThread();
        this.f33446a = hVar;
        this.f33449d = fVar;
        this.f33450e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(t tVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        tVar.setCropRect(this.f33451f);
        F3.j jVarF = f(tVar);
        F3.q qVarDecode = jVarF != null ? this.f33449d.decode(jVarF) : null;
        if (qVarDecode != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Found barcode in ");
            sb.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            sb.append(" ms");
            if (this.f33450e != null) {
                Message messageObtain = Message.obtain(this.f33450e, K3.k.zxing_decode_succeeded, new C5827b(qVarDecode, tVar));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.f33450e;
            if (handler != null) {
                Message.obtain(handler, K3.k.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f33450e != null) {
            Message.obtain(this.f33450e, K3.k.zxing_possible_result_points, C5827b.transformResultPoints(this.f33449d.getPossibleResultPoints(), tVar)).sendToTarget();
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f33446a.requestPreview(this.f33455j);
    }

    protected F3.j f(t tVar) {
        if (this.f33451f == null) {
            return null;
        }
        return tVar.createSource();
    }

    public Rect getCropRect() {
        return this.f33451f;
    }

    public f getDecoder() {
        return this.f33449d;
    }

    public void setCropRect(Rect rect) {
        this.f33451f = rect;
    }

    public void setDecoder(f fVar) {
        this.f33449d = fVar;
    }

    public void start() {
        u.validateMainThread();
        HandlerThread handlerThread = new HandlerThread(f33445k);
        this.f33447b = handlerThread;
        handlerThread.start();
        this.f33448c = new Handler(this.f33447b.getLooper(), this.f33454i);
        this.f33452g = true;
        h();
    }

    public void stop() {
        u.validateMainThread();
        synchronized (this.f33453h) {
            this.f33452g = false;
            this.f33448c.removeCallbacksAndMessages(null);
            this.f33447b.quit();
        }
    }
}
