package com.google.firebase.installations;

import com.google.firebase.installations.a;

/* loaded from: classes2.dex */
public abstract class m {

    public static abstract class a {
        public abstract m build();

        public abstract a setToken(String str);

        public abstract a setTokenCreationTimestamp(long j8);

        public abstract a setTokenExpirationTimestamp(long j8);
    }

    public static a builder() {
        return new a.b();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract a toBuilder();
}
