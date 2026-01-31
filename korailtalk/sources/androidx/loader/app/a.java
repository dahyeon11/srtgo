package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l0.C5880b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a */
    public interface InterfaceC0156a {
        C5880b onCreateLoader(int i8, Bundle bundle);

        void onLoadFinished(C5880b c5880b, Object obj);

        void onLoaderReset(C5880b c5880b);
    }

    public static void enableDebugLogging(boolean z8) {
        b.f10071c = z8;
    }

    public static <T extends InterfaceC1025n & N> a getInstance(T t8) {
        return new b(t8, t8.getViewModelStore());
    }

    public abstract void destroyLoader(int i8);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> C5880b getLoader(int i8);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> C5880b initLoader(int i8, Bundle bundle, InterfaceC0156a interfaceC0156a);

    public abstract void markForRedelivery();

    public abstract <D> C5880b restartLoader(int i8, Bundle bundle, InterfaceC0156a interfaceC0156a);
}
