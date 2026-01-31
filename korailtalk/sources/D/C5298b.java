package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.InterfaceC5297a;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5298b implements Parcelable {
    public static final Parcelable.Creator<C5298b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f29928a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f29929b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC5297a f29930c;

    /* renamed from: d.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public C5298b createFromParcel(Parcel parcel) {
            return new C5298b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C5298b[] newArray(int i8) {
            return new C5298b[i8];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    class BinderC0269b extends InterfaceC5297a.AbstractBinderC0267a {
        BinderC0269b() {
        }

        @Override // d.InterfaceC5297a.AbstractBinderC0267a, d.InterfaceC5297a
        public void send(int i8, Bundle bundle) {
            C5298b c5298b = C5298b.this;
            Handler handler = c5298b.f29929b;
            if (handler != null) {
                handler.post(c5298b.new c(i8, bundle));
            } else {
                c5298b.b(i8, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f29932a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f29933b;

        c(int i8, Bundle bundle) {
            this.f29932a = i8;
            this.f29933b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5298b.this.b(this.f29932a, this.f29933b);
        }
    }

    public C5298b(Handler handler) {
        this.f29928a = true;
        this.f29929b = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void send(int i8, Bundle bundle) {
        if (this.f29928a) {
            Handler handler = this.f29929b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
                return;
            } else {
                b(i8, bundle);
                return;
            }
        }
        InterfaceC5297a interfaceC5297a = this.f29930c;
        if (interfaceC5297a != null) {
            try {
                interfaceC5297a.send(i8, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        synchronized (this) {
            try {
                if (this.f29930c == null) {
                    this.f29930c = new BinderC0269b();
                }
                parcel.writeStrongBinder(this.f29930c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C5298b(Parcel parcel) {
        this.f29928a = false;
        this.f29929b = null;
        this.f29930c = InterfaceC5297a.AbstractBinderC0267a.asInterface(parcel.readStrongBinder());
    }

    protected void b(int i8, Bundle bundle) {
    }
}
