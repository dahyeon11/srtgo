package com.kakao.sdk.auth.model;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public enum Prompt {
    LOGIN,
    SIGNUP,
    CERT;

    public final String getValue() {
        Annotation annotation = Prompt.class.getField(name()).getAnnotation(InterfaceC6622c.class);
        Intrinsics.checkNotNull(annotation);
        return ((InterfaceC6622c) annotation).value();
    }
}
