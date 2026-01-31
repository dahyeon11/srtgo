package I2;

import android.app.Activity;
import java.util.concurrent.Executor;

/* renamed from: I2.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0608l {
    public AbstractC0608l addOnCanceledListener(Activity activity, InterfaceC0601e interfaceC0601e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public AbstractC0608l addOnCompleteListener(Activity activity, InterfaceC0602f interfaceC0602f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract AbstractC0608l addOnFailureListener(InterfaceC0603g interfaceC0603g);

    public abstract AbstractC0608l addOnFailureListener(Activity activity, InterfaceC0603g interfaceC0603g);

    public abstract AbstractC0608l addOnFailureListener(Executor executor, InterfaceC0603g interfaceC0603g);

    public abstract AbstractC0608l addOnSuccessListener(InterfaceC0604h interfaceC0604h);

    public abstract AbstractC0608l addOnSuccessListener(Activity activity, InterfaceC0604h interfaceC0604h);

    public abstract AbstractC0608l addOnSuccessListener(Executor executor, InterfaceC0604h interfaceC0604h);

    public <TContinuationResult> AbstractC0608l continueWith(InterfaceC0599c interfaceC0599c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC0608l continueWithTask(InterfaceC0599c interfaceC0599c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract <X extends Throwable> Object getResult(Class<X> cls);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> AbstractC0608l onSuccessTask(InterfaceC0607k interfaceC0607k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public AbstractC0608l addOnCanceledListener(InterfaceC0601e interfaceC0601e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public AbstractC0608l addOnCompleteListener(InterfaceC0602f interfaceC0602f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> AbstractC0608l continueWith(Executor executor, InterfaceC0599c interfaceC0599c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC0608l continueWithTask(Executor executor, InterfaceC0599c interfaceC0599c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC0608l onSuccessTask(Executor executor, InterfaceC0607k interfaceC0607k) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public AbstractC0608l addOnCanceledListener(Executor executor, InterfaceC0601e interfaceC0601e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC0608l addOnCompleteListener(Executor executor, InterfaceC0602f interfaceC0602f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
