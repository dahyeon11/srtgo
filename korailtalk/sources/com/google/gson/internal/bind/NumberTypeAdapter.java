package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.u;
import com.google.gson.v;
import com.google.gson.w;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    private static final w f25943b = a(u.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    private final v f25944a;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            if (aVar.getRawType() == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25946a;

        static {
            int[] iArr = new int[D3.b.values().length];
            f25946a = iArr;
            try {
                iArr[D3.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25946a[D3.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25946a[D3.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(v vVar) {
        this.f25944a = vVar;
    }

    private static w a(v vVar) {
        return new NumberTypeAdapter(vVar).new a();
    }

    public static w getFactory(v vVar) {
        return vVar == u.LAZILY_PARSED_NUMBER ? f25943b : a(vVar);
    }

    @Override // com.google.gson.TypeAdapter
    public Number read(D3.a aVar) throws IOException {
        D3.b bVarPeek = aVar.peek();
        int i8 = b.f25946a[bVarPeek.ordinal()];
        if (i8 == 1) {
            aVar.nextNull();
            return null;
        }
        if (i8 == 2 || i8 == 3) {
            return this.f25944a.readNumber(aVar);
        }
        throw new r("Expecting number, got: " + bVarPeek + "; at path " + aVar.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, Number number) throws IOException {
        cVar.value(number);
    }
}
