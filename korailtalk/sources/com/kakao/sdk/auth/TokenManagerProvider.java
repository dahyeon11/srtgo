package com.kakao.sdk.auth;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class TokenManagerProvider {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.auth.TokenManagerProvider$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final TokenManagerProvider invoke() {
            return new TokenManagerProvider(null, 1, null);
        }
    });
    private TokenManageable manager;

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManagerProvider;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TokenManagerProvider getInstance() {
            return (TokenManagerProvider) TokenManagerProvider.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public TokenManagerProvider() {
        this(null, 1, null);
    }

    public static final TokenManagerProvider getInstance() {
        return Companion.getInstance();
    }

    public final TokenManageable getManager() {
        return this.manager;
    }

    public final void setManager(TokenManageable tokenManageable) {
        Intrinsics.checkNotNullParameter(tokenManageable, "<set-?>");
        this.manager = tokenManageable;
    }

    public TokenManagerProvider(TokenManageable manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.manager = manager;
    }

    public /* synthetic */ TokenManagerProvider(TokenManageable tokenManageable, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? TokenManager.Companion.getInstance() : tokenManageable);
    }
}
