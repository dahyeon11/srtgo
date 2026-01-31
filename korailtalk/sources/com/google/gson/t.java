package com.google.gson;

/* loaded from: classes2.dex */
public interface t {
    public static final t BLOCK_INACCESSIBLE_JAVA = new a();
    public static final t BLOCK_ALL_JAVA = new b();
    public static final t BLOCK_ALL_ANDROID = new c();
    public static final t BLOCK_ALL_PLATFORM = new d();

    class a implements t {
        a() {
        }

        @Override // com.google.gson.t
        public e check(Class<?> cls) {
            return com.google.gson.internal.l.isJavaType(cls) ? e.BLOCK_INACCESSIBLE : e.INDECISIVE;
        }
    }

    class b implements t {
        b() {
        }

        @Override // com.google.gson.t
        public e check(Class<?> cls) {
            return com.google.gson.internal.l.isJavaType(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }
    }

    class c implements t {
        c() {
        }

        @Override // com.google.gson.t
        public e check(Class<?> cls) {
            return com.google.gson.internal.l.isAndroidType(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }
    }

    class d implements t {
        d() {
        }

        @Override // com.google.gson.t
        public e check(Class<?> cls) {
            return com.google.gson.internal.l.isAnyPlatformType(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }
    }

    public enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    e check(Class<?> cls);
}
