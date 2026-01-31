package C7;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface B {

    public interface a {
        InterfaceC0472f call();

        int connectTimeoutMillis();

        InterfaceC0478l connection();

        J proceed(H h8);

        int readTimeoutMillis();

        H request();

        a withConnectTimeout(int i8, TimeUnit timeUnit);

        a withReadTimeout(int i8, TimeUnit timeUnit);

        a withWriteTimeout(int i8, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    J intercept(a aVar);
}
