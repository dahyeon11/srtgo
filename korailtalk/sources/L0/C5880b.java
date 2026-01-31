package l0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5880b {

    /* renamed from: a, reason: collision with root package name */
    int f33912a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0342b f33913b;

    /* renamed from: c, reason: collision with root package name */
    Context f33914c;

    /* renamed from: d, reason: collision with root package name */
    boolean f33915d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f33916e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f33917f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f33918g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f33919h = false;

    /* renamed from: l0.b$a */
    public interface a {
    }

    /* renamed from: l0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0342b {
        void onLoadComplete(C5880b c5880b, Object obj);
    }

    public C5880b(Context context) {
        this.f33914c = context.getApplicationContext();
    }

    public void abandon() {
        this.f33916e = true;
        a();
    }

    protected boolean b() {
        return false;
    }

    public boolean cancelLoad() {
        return b();
    }

    public void commitContentChanged() {
        this.f33919h = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        Z.b.buildShortClassTag(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverResult(Object obj) {
        InterfaceC0342b interfaceC0342b = this.f33913b;
        if (interfaceC0342b != null) {
            interfaceC0342b.onLoadComplete(this, obj);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f33912a);
        printWriter.print(" mListener=");
        printWriter.println(this.f33913b);
        if (this.f33915d || this.f33918g || this.f33919h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f33915d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f33918g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f33919h);
        }
        if (this.f33916e || this.f33917f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f33916e);
            printWriter.print(" mReset=");
            printWriter.println(this.f33917f);
        }
    }

    public void forceLoad() {
        c();
    }

    public Context getContext() {
        return this.f33914c;
    }

    public int getId() {
        return this.f33912a;
    }

    public boolean isAbandoned() {
        return this.f33916e;
    }

    public boolean isReset() {
        return this.f33917f;
    }

    public boolean isStarted() {
        return this.f33915d;
    }

    public void onContentChanged() {
        if (this.f33915d) {
            forceLoad();
        } else {
            this.f33918g = true;
        }
    }

    public void registerListener(int i8, InterfaceC0342b interfaceC0342b) {
        if (this.f33913b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f33913b = interfaceC0342b;
        this.f33912a = i8;
    }

    public void reset() {
        d();
        this.f33917f = true;
        this.f33915d = false;
        this.f33916e = false;
        this.f33918g = false;
        this.f33919h = false;
    }

    public void rollbackContentChanged() {
        if (this.f33919h) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.f33915d = true;
        this.f33917f = false;
        this.f33916e = false;
        e();
    }

    public void stopLoading() {
        this.f33915d = false;
        f();
    }

    public boolean takeContentChanged() {
        boolean z8 = this.f33918g;
        this.f33918g = false;
        this.f33919h |= z8;
        return z8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Z.b.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.f33912a);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(InterfaceC0342b interfaceC0342b) {
        InterfaceC0342b interfaceC0342b2 = this.f33913b;
        if (interfaceC0342b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0342b2 != interfaceC0342b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f33913b = null;
    }

    public void unregisterOnLoadCanceledListener(a aVar) {
        throw new IllegalStateException("No listener register");
    }

    protected void a() {
    }

    protected void c() {
    }

    protected void d() {
    }

    public void deliverCancellation() {
    }

    protected void e() {
    }

    protected void f() {
    }

    public void registerOnLoadCanceledListener(a aVar) {
    }
}
