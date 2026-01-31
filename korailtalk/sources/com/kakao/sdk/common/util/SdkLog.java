package com.kakao.sdk.common.util;

import Q7.X;
import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import com.kakao.sdk.common.KakaoSdk;
import f7.InterfaceC5519a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import l7.r;

/* loaded from: classes.dex */
public final class SdkLog {
    public static final int MAX_SIZE = 100;
    private final InterfaceC0755i dateFormat$delegate;
    private final boolean enabled;
    private final InterfaceC0755i logs$delegate;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0755i instance$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.common.util.SdkLog$Companion$instance$2
        @Override // f7.InterfaceC5519a
        public final SdkLog invoke() {
            return new SdkLog(false, 1, null);
        }
    });

    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/common/util/SdkLog;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final void d(Object obj) {
            getInstance().log(obj, SdkLogLevel.D);
        }

        public final void e(Object obj) {
            getInstance().log(obj, SdkLogLevel.E);
        }

        public final SdkLog getInstance() {
            return (SdkLog) SdkLog.instance$delegate.getValue();
        }

        public final void i(Object obj) {
            getInstance().log(obj, SdkLogLevel.I);
        }

        public final String log() {
            return Intrinsics.stringPlus(r.trimIndent("\n                ==== sdk version: 2.11.0\n                ==== app version: " + KakaoSdk.INSTANCE.getApplicationContextInfo().getAppVer() + "\n            "), S6.r.joinToString$default(getInstance().getLogs(), X.LF, X.LF, null, 0, null, null, 60, null));
        }

        public final void v(Object obj) {
            getInstance().log(obj, SdkLogLevel.V);
        }

        public final void w(Object obj) {
            getInstance().log(obj, SdkLogLevel.W);
        }

        private Companion() {
        }
    }

    public SdkLog() {
        this(false, 1, null);
    }

    private final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) this.dateFormat$delegate.getValue();
    }

    public static final SdkLog getInstance() {
        return Companion.getInstance();
    }

    public final LinkedList<String> getLogs() {
        return (LinkedList) this.logs$delegate.getValue();
    }

    public static final String log() {
        return Companion.log();
    }

    public SdkLog(boolean z8) {
        this.enabled = z8;
        this.logs$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.common.util.SdkLog$logs$2
            @Override // f7.InterfaceC5519a
            public final LinkedList<String> invoke() {
                return new LinkedList<>();
            }
        });
        this.dateFormat$delegate = AbstractC0756j.lazy(new InterfaceC5519a() { // from class: com.kakao.sdk.common.util.SdkLog$dateFormat$2
            @Override // f7.InterfaceC5519a
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
            }
        });
    }

    public final void log(Object obj, SdkLogLevel sdkLogLevel) {
        String str = sdkLogLevel.getSymbol() + ' ' + obj;
        if (!this.enabled || sdkLogLevel.compareTo(SdkLogLevel.I) < 0) {
            return;
        }
        getLogs().add(((Object) getDateFormat().format(new Date())) + ' ' + str);
        if (getLogs().size() > 100) {
            getLogs().poll();
        }
    }

    public /* synthetic */ SdkLog(boolean z8, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getLoggingEnabled() : z8);
    }
}
