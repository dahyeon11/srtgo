package retrofit.http;

import io.grpc.internal.U;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@RestMethod(hasBody = true, value = U.HTTP_METHOD)
/* loaded from: classes3.dex */
public @interface POST {
    String value();
}
