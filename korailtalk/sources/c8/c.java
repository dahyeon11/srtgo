package c8;

import C7.K;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;
import java.io.IOException;
import retrofit2.f;

/* loaded from: classes3.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f11582a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f11583b;

    c(Gson gson, TypeAdapter typeAdapter) {
        this.f11582a = gson;
        this.f11583b = typeAdapter;
    }

    @Override // retrofit2.f
    public Object convert(K k8) throws IOException {
        D3.a aVarNewJsonReader = this.f11582a.newJsonReader(k8.charStream());
        try {
            Object obj = this.f11583b.read(aVarNewJsonReader);
            if (aVarNewJsonReader.peek() == D3.b.END_DOCUMENT) {
                return obj;
            }
            throw new j("JSON document was not fully consumed.");
        } finally {
            k8.close();
        }
    }
}
