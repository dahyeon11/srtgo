package r1;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6170b {
    public static <TInput, TResult, TException extends Throwable> TResult retry(int i8, TInput tinput, InterfaceC6169a interfaceC6169a, InterfaceC6171c interfaceC6171c) {
        TResult tresult;
        if (i8 < 1) {
            return (TResult) interfaceC6169a.apply(tinput);
        }
        do {
            tresult = (TResult) interfaceC6169a.apply(tinput);
            tinput = (TInput) interfaceC6171c.shouldRetry(tinput, tresult);
            if (tinput == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return tresult;
    }
}
