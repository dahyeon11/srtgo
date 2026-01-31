package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1106d;
import i2.AbstractC5683p;
import java.util.concurrent.Executor;
import p2.ExecutorC6051a;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106d {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12014a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12015b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f12016c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f12017a;

        /* renamed from: b, reason: collision with root package name */
        private final String f12018b;

        a(Object obj, String str) {
            this.f12017a = obj;
            this.f12018b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12017a == aVar.f12017a && this.f12018b.equals(aVar.f12018b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12017a) * 31) + this.f12018b.hashCode();
        }

        public String toIdString() {
            String str = this.f12018b;
            int iIdentityHashCode = System.identityHashCode(this.f12017a);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(iIdentityHashCode);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    public interface b {
        void a(Object obj);

        void b();
    }

    C1106d(Looper looper, Object obj, String str) {
        this.f12014a = new ExecutorC6051a(looper);
        this.f12015b = AbstractC5683p.checkNotNull(obj, "Listener must not be null");
        this.f12016c = new a(obj, AbstractC5683p.checkNotEmpty(str));
    }

    final void a(b bVar) {
        Object obj = this.f12015b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e8) {
            bVar.b();
            throw e8;
        }
    }

    public void clear() {
        this.f12015b = null;
        this.f12016c = null;
    }

    public a getListenerKey() {
        return this.f12016c;
    }

    public boolean hasListener() {
        return this.f12015b != null;
    }

    public void notifyListener(final b bVar) {
        AbstractC5683p.checkNotNull(bVar, "Notifier must not be null");
        this.f12014a.execute(new Runnable(bVar) { // from class: com.google.android.gms.common.api.internal.Y
            public final /* synthetic */ C1106d.b zab;

            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.a(null);
            }
        });
    }

    C1106d(Executor executor, Object obj, String str) {
        this.f12014a = (Executor) AbstractC5683p.checkNotNull(executor, "Executor must not be null");
        this.f12015b = AbstractC5683p.checkNotNull(obj, "Listener must not be null");
        this.f12016c = new a(obj, AbstractC5683p.checkNotEmpty(str));
    }
}
