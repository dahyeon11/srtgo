package r2;

import android.content.Context;
import android.os.IBinder;
import f2.AbstractC5402l;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f35727a;

    /* renamed from: b, reason: collision with root package name */
    private Object f35728b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f35727a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) throws a {
        if (this.f35728b == null) {
            AbstractC5683p.checkNotNull(context);
            Context remoteContext = AbstractC5402l.getRemoteContext(context);
            if (remoteContext == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f35728b = a((IBinder) remoteContext.getClassLoader().loadClass(this.f35727a).newInstance());
            } catch (ClassNotFoundException e8) {
                throw new a("Could not load creator class.", e8);
            } catch (IllegalAccessException e9) {
                throw new a("Could not access creator.", e9);
            } catch (InstantiationException e10) {
                throw new a("Could not instantiate creator.", e10);
            }
        }
        return this.f35728b;
    }
}
