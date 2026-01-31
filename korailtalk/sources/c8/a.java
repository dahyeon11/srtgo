package c8;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.f;
import retrofit2.x;

/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a */
    private final Gson f11577a;

    private a(Gson gson) {
        this.f11577a = gson;
    }

    public static a create() {
        return create(new Gson());
    }

    @Override // retrofit2.f.a
    public f requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        return new b(this.f11577a, this.f11577a.getAdapter(C3.a.get(type)));
    }

    @Override // retrofit2.f.a
    public f responseBodyConverter(Type type, Annotation[] annotationArr, x xVar) {
        return new c(this.f11577a, this.f11577a.getAdapter(C3.a.get(type)));
    }

    public static a create(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }
}
