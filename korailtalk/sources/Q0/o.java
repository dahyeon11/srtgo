package Q0;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private I0.i f3935a;

    /* renamed from: b, reason: collision with root package name */
    private String f3936b;

    /* renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f3937c;

    public o(I0.i iVar, String str, WorkerParameters.a aVar) {
        this.f3935a = iVar;
        this.f3936b = str;
        this.f3937c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3935a.getProcessor().startWork(this.f3936b, this.f3937c);
    }
}
