package com.google.protobuf;

import com.google.protobuf.K0;
import com.google.protobuf.P1;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class A0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f26089a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f26090b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f26091c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26092a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26092a = iArr;
            try {
                iArr[P1.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26092a[P1.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26092a[P1.b.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b {
        public final Object defaultKey;
        public final Object defaultValue;
        public final P1.b keyType;
        public final P1.b valueType;

        public b(P1.b bVar, Object obj, P1.b bVar2, Object obj2) {
            this.keyType = bVar;
            this.defaultKey = obj;
            this.valueType = bVar2;
            this.defaultValue = obj2;
        }
    }

    private A0(P1.b bVar, Object obj, P1.b bVar2, Object obj2) {
        this.f26089a = new b(bVar, obj, bVar2, obj2);
        this.f26090b = obj;
        this.f26091c = obj2;
    }

    static int a(b bVar, Object obj, Object obj2) {
        return W.k(bVar.keyType, 1, obj) + W.k(bVar.valueType, 2, obj2);
    }

    static Map.Entry c(r rVar, b bVar, M m8) {
        Object objD = bVar.defaultKey;
        Object objD2 = bVar.defaultValue;
        while (true) {
            int tag = rVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == P1.a(1, bVar.keyType.getWireType())) {
                objD = d(rVar, m8, bVar.keyType, objD);
            } else if (tag == P1.a(2, bVar.valueType.getWireType())) {
                objD2 = d(rVar, m8, bVar.valueType, objD2);
            } else if (!rVar.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objD, objD2);
    }

    static Object d(r rVar, M m8, P1.b bVar, Object obj) {
        int i8 = a.f26092a[bVar.ordinal()];
        if (i8 == 1) {
            K0.a builder = ((K0) obj).toBuilder();
            rVar.readMessage(builder, m8);
            return builder.buildPartial();
        }
        if (i8 == 2) {
            return Integer.valueOf(rVar.readEnum());
        }
        if (i8 != 3) {
            return W.readPrimitiveField(rVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static void e(AbstractC5248t abstractC5248t, b bVar, Object obj, Object obj2) {
        W.v(abstractC5248t, bVar.keyType, 1, obj);
        W.v(abstractC5248t, bVar.valueType, 2, obj2);
    }

    public static <K, V> A0 newDefaultInstance(P1.b bVar, K k8, P1.b bVar2, V v8) {
        return new A0(bVar, k8, bVar2, v8);
    }

    b b() {
        return this.f26089a;
    }

    public int computeMessageSize(int i8, Object obj, Object obj2) {
        return AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(a(this.f26089a, obj, obj2));
    }

    public Object getKey() {
        return this.f26090b;
    }

    public Object getValue() {
        return this.f26091c;
    }

    public Map.Entry<Object, Object> parseEntry(AbstractC5235o abstractC5235o, M m8) {
        return c(abstractC5235o.newCodedInput(), this.f26089a, m8);
    }

    public void parseInto(C0 c02, r rVar, M m8) {
        int iPushLimit = rVar.pushLimit(rVar.readRawVarint32());
        b bVar = this.f26089a;
        Object objD = bVar.defaultKey;
        Object objD2 = bVar.defaultValue;
        while (true) {
            int tag = rVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == P1.a(1, this.f26089a.keyType.getWireType())) {
                objD = d(rVar, m8, this.f26089a.keyType, objD);
            } else if (tag == P1.a(2, this.f26089a.valueType.getWireType())) {
                objD2 = d(rVar, m8, this.f26089a.valueType, objD2);
            } else if (!rVar.skipField(tag)) {
                break;
            }
        }
        rVar.checkLastTagWas(0);
        rVar.popLimit(iPushLimit);
        c02.put(objD, objD2);
    }

    public void serializeTo(AbstractC5248t abstractC5248t, int i8, Object obj, Object obj2) {
        abstractC5248t.writeTag(i8, 2);
        abstractC5248t.writeUInt32NoTag(a(this.f26089a, obj, obj2));
        e(abstractC5248t, this.f26089a, obj, obj2);
    }
}
