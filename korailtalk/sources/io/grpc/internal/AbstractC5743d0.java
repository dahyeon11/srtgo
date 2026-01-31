package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5743d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f32699a = Logger.getLogger(AbstractC5743d0.class.getName());

    /* renamed from: io.grpc.internal.d0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32700a;

        static {
            int[] iArr = new int[D3.b.values().length];
            f32700a = iArr;
            try {
                iArr[D3.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32700a[D3.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32700a[D3.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32700a[D3.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32700a[D3.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32700a[D3.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static List a(D3.a aVar) throws IOException {
        aVar.beginArray();
        ArrayList arrayList = new ArrayList();
        while (aVar.hasNext()) {
            arrayList.add(d(aVar));
        }
        e3.w.checkState(aVar.peek() == D3.b.END_ARRAY, "Bad token: " + aVar.getPath());
        aVar.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void b(D3.a aVar) throws IOException {
        aVar.nextNull();
        return null;
    }

    private static Map c(D3.a aVar) throws IOException {
        aVar.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.hasNext()) {
            linkedHashMap.put(aVar.nextName(), d(aVar));
        }
        e3.w.checkState(aVar.peek() == D3.b.END_OBJECT, "Bad token: " + aVar.getPath());
        aVar.endObject();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object d(D3.a aVar) {
        e3.w.checkState(aVar.hasNext(), "unexpected end of JSON");
        switch (a.f32700a[aVar.peek().ordinal()]) {
            case 1:
                return a(aVar);
            case 2:
                return c(aVar);
            case 3:
                return aVar.nextString();
            case 4:
                return Double.valueOf(aVar.nextDouble());
            case 5:
                return Boolean.valueOf(aVar.nextBoolean());
            case 6:
                return b(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.getPath());
        }
    }

    public static Object parse(String str) {
        D3.a aVar = new D3.a(new StringReader(str));
        try {
            return d(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e8) {
                f32699a.log(Level.WARNING, "Failed to close", (Throwable) e8);
            }
        }
    }
}
