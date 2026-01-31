package c8;

import C7.C;
import C7.I;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import retrofit2.f;

/* loaded from: classes3.dex */
final class b implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final C f11578c = C.get("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f11579d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Gson f11580a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f11581b;

    b(Gson gson, TypeAdapter typeAdapter) {
        this.f11580a = gson;
        this.f11581b = typeAdapter;
    }

    @Override // retrofit2.f
    public I convert(Object obj) throws IOException {
        P7.c cVar = new P7.c();
        D3.c cVarNewJsonWriter = this.f11580a.newJsonWriter(new OutputStreamWriter(cVar.outputStream(), f11579d));
        this.f11581b.write(cVarNewJsonWriter, obj);
        cVarNewJsonWriter.close();
        return I.create(f11578c, cVar.readByteString());
    }
}
