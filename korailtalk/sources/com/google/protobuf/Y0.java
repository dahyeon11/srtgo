package com.google.protobuf;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f26370a;

    /* renamed from: b, reason: collision with root package name */
    private final Field f26371b;

    /* renamed from: c, reason: collision with root package name */
    private final Field f26372c;

    public Y0(int i8, Field field, Field field2) {
        this.f26370a = i8;
        this.f26371b = field;
        this.f26372c = field2;
    }

    public Field getCaseField() {
        return this.f26371b;
    }

    public int getId() {
        return this.f26370a;
    }

    public Field getValueField() {
        return this.f26372c;
    }
}
