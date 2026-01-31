package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f34552a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34553b;

        public a(float f8, int i8) {
            this.f34552a = f8;
            this.f34553b = i8;
        }

        public float getScale() {
            return this.f34552a;
        }

        public int getZeroPoint() {
            return this.f34553b;
        }
    }

    ByteBuffer asReadOnlyBuffer();

    org.tensorflow.lite.a dataType();

    int index();

    String name();

    int numBytes();

    int numDimensions();

    int numElements();

    a quantizationParams();

    int[] shape();

    int[] shapeSignature();
}
