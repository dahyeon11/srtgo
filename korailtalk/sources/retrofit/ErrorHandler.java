package retrofit;

/* loaded from: classes3.dex */
public interface ErrorHandler {
    public static final ErrorHandler DEFAULT = new ErrorHandler() { // from class: retrofit.ErrorHandler.1
        @Override // retrofit.ErrorHandler
        public Throwable handleError(RetrofitError retrofitError) {
            return retrofitError;
        }
    };

    Throwable handleError(RetrofitError retrofitError);
}
