package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.u;
import com.google.gson.v;
import com.google.gson.w;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    private static final w f25947c = a(u.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f25948a;

    /* renamed from: b, reason: collision with root package name */
    private final v f25949b;

    class a implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f25950a;

        a(v vVar) {
            this.f25950a = vVar;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.f25950a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25951a;

        static {
            int[] iArr = new int[D3.b.values().length];
            f25951a = iArr;
            try {
                iArr[D3.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25951a[D3.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25951a[D3.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25951a[D3.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25951a[D3.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25951a[D3.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ ObjectTypeAdapter(Gson gson, v vVar, a aVar) {
        this(gson, vVar);
    }

    private static w a(v vVar) {
        return new a(vVar);
    }

    private Object b(D3.a aVar, D3.b bVar) throws IOException {
        int i8 = b.f25951a[bVar.ordinal()];
        if (i8 == 3) {
            return aVar.nextString();
        }
        if (i8 == 4) {
            return this.f25949b.readNumber(aVar);
        }
        if (i8 == 5) {
            return Boolean.valueOf(aVar.nextBoolean());
        }
        if (i8 == 6) {
            aVar.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object c(D3.a aVar, D3.b bVar) throws IOException {
        int i8 = b.f25951a[bVar.ordinal()];
        if (i8 == 1) {
            aVar.beginArray();
            return new ArrayList();
        }
        if (i8 != 2) {
            return null;
        }
        aVar.beginObject();
        return new g();
    }

    public static w getFactory(v vVar) {
        return vVar == u.DOUBLE ? f25947c : a(vVar);
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(D3.a aVar) throws IOException {
        D3.b bVarPeek = aVar.peek();
        Object objC = c(aVar, bVarPeek);
        if (objC == null) {
            return b(aVar, bVarPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strNextName = objC instanceof Map ? aVar.nextName() : null;
                D3.b bVarPeek2 = aVar.peek();
                Object objC2 = c(aVar, bVarPeek2);
                boolean z8 = objC2 != null;
                if (objC2 == null) {
                    objC2 = b(aVar, bVarPeek2);
                }
                if (objC instanceof List) {
                    ((List) objC).add(objC2);
                } else {
                    ((Map) objC).put(strNextName, objC2);
                }
                if (z8) {
                    arrayDeque.addLast(objC);
                    objC = objC2;
                }
            } else {
                if (objC instanceof List) {
                    aVar.endArray();
                } else {
                    aVar.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objC;
                }
                objC = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.nullValue();
            return;
        }
        TypeAdapter adapter = this.f25948a.getAdapter(obj.getClass());
        if (!(adapter instanceof ObjectTypeAdapter)) {
            adapter.write(cVar, obj);
        } else {
            cVar.beginObject();
            cVar.endObject();
        }
    }

    private ObjectTypeAdapter(Gson gson, v vVar) {
        this.f25948a = gson;
        this.f25949b = vVar;
    }
}
