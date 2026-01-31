package retrofit2;

import C7.K;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import retrofit2.f;

/* loaded from: classes3.dex */
final class m extends f.a {

    /* renamed from: a, reason: collision with root package name */
    static final f.a f36006a = new m();

    static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final f f36007a;

        a(f fVar) {
            this.f36007a = fVar;
        }

        @Override // retrofit2.f
        public Optional<Object> convert(K k8) {
            return Optional.ofNullable(this.f36007a.convert(k8));
        }
    }

    m() {
    }

    @Override // retrofit2.f.a
    public f responseBodyConverter(Type type, Annotation[] annotationArr, x xVar) {
        if (f.a.getRawType(type) != Optional.class) {
            return null;
        }
        return new a(xVar.responseBodyConverter(f.a.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
