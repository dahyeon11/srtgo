package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class u implements v {
    public static final u BIG_DECIMAL;
    public static final u DOUBLE;
    public static final u LAZILY_PARSED_NUMBER;
    public static final u LONG_OR_DOUBLE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ u[] f26088a;

    enum a extends u {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.google.gson.u, com.google.gson.v
        public Double readNumber(D3.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        u uVar = new u("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.u.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u, com.google.gson.v
            public Number readNumber(D3.a aVar2) {
                return new com.google.gson.internal.f(aVar2.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = uVar;
        u uVar2 = new u("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.u.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u, com.google.gson.v
            public Number readNumber(D3.a aVar2) throws IOException, NumberFormatException {
                String strNextString = aVar2.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strNextString));
                    } catch (NumberFormatException e8) {
                        throw new m("Cannot parse " + strNextString + "; at path " + aVar2.getPreviousPath(), e8);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strNextString);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar2.isLenient()) {
                            throw new D3.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.getPreviousPath());
                        }
                    }
                    return dValueOf;
                }
            }
        };
        LONG_OR_DOUBLE = uVar2;
        u uVar3 = new u("BIG_DECIMAL", 3) { // from class: com.google.gson.u.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u, com.google.gson.v
            public BigDecimal readNumber(D3.a aVar2) throws IOException {
                String strNextString = aVar2.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e8) {
                    throw new m("Cannot parse " + strNextString + "; at path " + aVar2.getPreviousPath(), e8);
                }
            }
        };
        BIG_DECIMAL = uVar3;
        f26088a = new u[]{aVar, uVar, uVar2, uVar3};
    }

    private u(String str, int i8) {
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f26088a.clone();
    }

    @Override // com.google.gson.v
    public abstract /* synthetic */ Number readNumber(D3.a aVar);

    /* synthetic */ u(String str, int i8, a aVar) {
        this(str, i8);
    }
}
