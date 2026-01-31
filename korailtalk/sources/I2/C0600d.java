package I2;

/* renamed from: I2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0600d extends IllegalStateException {
    private C0600d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException of(AbstractC0608l abstractC0608l) {
        if (!abstractC0608l.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = abstractC0608l.getException();
        return new C0600d("Complete with: ".concat(exception != null ? "failure" : abstractC0608l.isSuccessful() ? "result ".concat(String.valueOf(abstractC0608l.getResult())) : abstractC0608l.isCanceled() ? "cancellation" : "unknown issue"), exception);
    }
}
