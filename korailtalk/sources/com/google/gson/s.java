package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class s {
    public static final s DEFAULT;
    public static final s STRING;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ s[] f26086a;

    enum a extends s {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.google.gson.s
        public i serialize(Long l8) {
            return l8 == null ? k.INSTANCE : new o(l8);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        s sVar = new s("STRING", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.s
            public i serialize(Long l8) {
                return l8 == null ? k.INSTANCE : new o(l8.toString());
            }
        };
        STRING = sVar;
        f26086a = new s[]{aVar, sVar};
    }

    private s(String str, int i8) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f26086a.clone();
    }

    public abstract i serialize(Long l8);

    /* synthetic */ s(String str, int i8, a aVar) {
        this(str, i8);
    }
}
