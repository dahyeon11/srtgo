package com.kakao.sdk.common.json;

import D3.b;
import D3.c;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class KakaoEnumTypeAdapter<T> extends TypeAdapter {
    private final Class<T> enumClass;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.NUMBER.ordinal()] = 1;
            iArr[b.STRING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KakaoEnumTypeAdapter(Class<T> enumClass) {
        Intrinsics.checkNotNullParameter(enumClass, "enumClass");
        this.enumClass = enumClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T read(D3.a r12) throws java.lang.NoSuchFieldException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            D3.b r1 = r12.peek()
        L9:
            D3.b r2 = D3.b.NULL
            if (r1 != r2) goto L11
            r12.nextNull()
            return r0
        L11:
            if (r12 != 0) goto L15
            r1 = r0
            goto L19
        L15:
            D3.b r1 = r12.peek()
        L19:
            if (r1 != 0) goto L1d
            r1 = -1
            goto L25
        L1d:
            int[] r2 = com.kakao.sdk.common.json.KakaoEnumTypeAdapter.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
        L25:
            r2 = 1
            if (r1 == r2) goto L3c
            r2 = 2
            if (r1 == r2) goto L31
            R6.p r12 = new R6.p
            r12.<init>(r0, r0)
            goto L4a
        L31:
            R6.p r1 = new R6.p
            java.lang.String r12 = r12.nextString()
            r1.<init>(r0, r12)
        L3a:
            r12 = r1
            goto L4a
        L3c:
            R6.p r1 = new R6.p
            long r2 = r12.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r1.<init>(r12, r0)
            goto L3a
        L4a:
            java.lang.Class<T> r1 = r11.enumClass
            java.lang.Object[] r1 = r1.getEnumConstants()
            if (r1 != 0) goto L54
            goto Ld6
        L54:
            int r2 = r1.length
            r3 = 0
        L56:
            if (r3 >= r2) goto Ld6
            r0 = r1[r3]
            if (r0 == 0) goto Lc8
            r4 = r0
            java.lang.Enum r4 = (java.lang.Enum) r4     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.String r4 = r4.name()     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.Class<T> r5 = r11.enumClass     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.reflect.Field r5 = r5.getField(r4)     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.Object r6 = r12.getFirst()     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.Class<z3.c> r7 = z3.InterfaceC6622c.class
            if (r6 == 0) goto L95
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r7)     // Catch: java.lang.NoSuchFieldException -> L93
            z3.c r4 = (z3.InterfaceC6622c) r4     // Catch: java.lang.NoSuchFieldException -> L93
            if (r4 == 0) goto Lbd
            java.lang.Object r6 = r12.getFirst()     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.String r4 = r4.value()     // Catch: java.lang.NoSuchFieldException -> L93
            long r7 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NoSuchFieldException -> L93
            if (r6 != 0) goto L8a
            goto Lbd
        L8a:
            long r9 = r6.longValue()     // Catch: java.lang.NoSuchFieldException -> L93
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto Lbd
            return r0
        L93:
            r12 = move-exception
            goto Ld0
        L95:
            java.lang.Object r6 = r12.getSecond()     // Catch: java.lang.NoSuchFieldException -> L93
            if (r6 == 0) goto Lbd
            java.lang.Object r6 = r12.getSecond()     // Catch: java.lang.NoSuchFieldException -> L93
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)     // Catch: java.lang.NoSuchFieldException -> L93
            if (r4 == 0) goto La6
            return r0
        La6:
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r7)     // Catch: java.lang.NoSuchFieldException -> L93
            z3.c r4 = (z3.InterfaceC6622c) r4     // Catch: java.lang.NoSuchFieldException -> L93
            if (r4 == 0) goto Lbd
            java.lang.Object r6 = r12.getSecond()     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.String r4 = r4.value()     // Catch: java.lang.NoSuchFieldException -> L93
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)     // Catch: java.lang.NoSuchFieldException -> L93
            if (r4 == 0) goto Lbd
            return r0
        Lbd:
            java.lang.Class<com.kakao.sdk.common.json.UnknownValue> r4 = com.kakao.sdk.common.json.UnknownValue.class
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r4)     // Catch: java.lang.NoSuchFieldException -> L93
            com.kakao.sdk.common.json.UnknownValue r4 = (com.kakao.sdk.common.json.UnknownValue) r4     // Catch: java.lang.NoSuchFieldException -> L93
            int r3 = r3 + 1
            goto L56
        Lc8:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch: java.lang.NoSuchFieldException -> L93
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Enum<*>"
            r12.<init>(r0)     // Catch: java.lang.NoSuchFieldException -> L93
            throw r12     // Catch: java.lang.NoSuchFieldException -> L93
        Ld0:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r12)
            throw r0
        Ld6:
            if (r0 == 0) goto Ld9
            return r0
        Ld9:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "No matching enum field"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.common.json.KakaoEnumTypeAdapter.read(D3.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, T t8) throws IOException {
        if (t8 == null) {
            if (cVar == null) {
                return;
            }
            cVar.nullValue();
            return;
        }
        boolean zIsAnnotationPresent = this.enumClass.isAnnotationPresent(IntEnum.class);
        Object[] enumConstants = this.enumClass.getEnumConstants();
        if (enumConstants != null) {
            for (Object obj : enumConstants) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Enum<*>");
                }
                try {
                    InterfaceC6622c interfaceC6622c = (InterfaceC6622c) this.enumClass.getField(((Enum) obj).name()).getAnnotation(InterfaceC6622c.class);
                    if (interfaceC6622c != null && Intrinsics.areEqual(obj, t8)) {
                        if (zIsAnnotationPresent) {
                            if (cVar == null) {
                                return;
                            }
                            cVar.value(Integer.valueOf(Integer.parseInt(interfaceC6622c.value())));
                            return;
                        } else {
                            if (cVar == null) {
                                return;
                            }
                            cVar.value(interfaceC6622c.value());
                            return;
                        }
                    }
                } catch (NoSuchFieldException e8) {
                    throw new IOException(e8);
                }
            }
        }
        if (cVar == null) {
            return;
        }
        cVar.value(t8.toString());
    }
}
