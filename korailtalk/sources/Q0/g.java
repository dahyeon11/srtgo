package Q0;

import androidx.lifecycle.LiveData;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public abstract class g {

    class a implements androidx.lifecycle.u {

        /* renamed from: a, reason: collision with root package name */
        Object f3916a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0.a f3917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6046a f3919d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.r f3920e;

        /* renamed from: Q0.g$a$a, reason: collision with other inner class name */
        class RunnableC0067a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f3921a;

            RunnableC0067a(Object obj) {
                this.f3921a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f3918c) {
                    try {
                        Object objApply = a.this.f3919d.apply(this.f3921a);
                        a aVar = a.this;
                        Object obj = aVar.f3916a;
                        if (obj == null && objApply != null) {
                            aVar.f3916a = objApply;
                            aVar.f3920e.postValue(objApply);
                        } else if (obj != null && !obj.equals(objApply)) {
                            a aVar2 = a.this;
                            aVar2.f3916a = objApply;
                            aVar2.f3920e.postValue(objApply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        a(R0.a aVar, Object obj, InterfaceC6046a interfaceC6046a, androidx.lifecycle.r rVar) {
            this.f3917b = aVar;
            this.f3918c = obj;
            this.f3919d = interfaceC6046a;
            this.f3920e = rVar;
        }

        @Override // androidx.lifecycle.u
        public void onChanged(In in) {
            this.f3917b.executeOnBackgroundThread(new RunnableC0067a(in));
        }
    }

    public static <In, Out> LiveData dedupedMappedLiveDataFor(LiveData liveData, InterfaceC6046a interfaceC6046a, R0.a aVar) {
        Object obj = new Object();
        androidx.lifecycle.r rVar = new androidx.lifecycle.r();
        rVar.addSource(liveData, new a(aVar, obj, interfaceC6046a, rVar));
        return rVar;
    }
}
