package v;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6422a {

    /* renamed from: a, reason: collision with root package name */
    private final c f37179a;

    /* renamed from: v.a$b */
    private static final class b extends C0426a {
        b(Object obj) {
            super(obj);
        }

        @Override // v.C6422a.C0426a, v.C6422a.c
        public boolean isMultiResolution() {
            return ((InputConfiguration) getInputConfiguration()).isMultiResolution();
        }

        b(int i8, int i9, int i10) {
            super(i8, i9, i10);
        }
    }

    /* renamed from: v.a$c */
    private interface c {
        int getFormat();

        int getHeight();

        Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public C6422a(int i8, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f37179a = new b(i8, i9, i10);
        } else {
            this.f37179a = new C0426a(i8, i9, i10);
        }
    }

    public static C6422a wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C6422a(new b(obj)) : new C6422a(new C0426a(obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6422a) {
            return this.f37179a.equals(((C6422a) obj).f37179a);
        }
        return false;
    }

    public int getFormat() {
        return this.f37179a.getFormat();
    }

    public int getHeight() {
        return this.f37179a.getHeight();
    }

    public int getWidth() {
        return this.f37179a.getWidth();
    }

    public int hashCode() {
        return this.f37179a.hashCode();
    }

    public boolean isMultiResolution() {
        return this.f37179a.isMultiResolution();
    }

    public String toString() {
        return this.f37179a.toString();
    }

    public Object unwrap() {
        return this.f37179a.getInputConfiguration();
    }

    /* renamed from: v.a$a, reason: collision with other inner class name */
    private static class C0426a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f37180a;

        C0426a(Object obj) {
            this.f37180a = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f37180a, ((c) obj).getInputConfiguration());
            }
            return false;
        }

        @Override // v.C6422a.c
        public int getFormat() {
            return this.f37180a.getFormat();
        }

        @Override // v.C6422a.c
        public int getHeight() {
            return this.f37180a.getHeight();
        }

        @Override // v.C6422a.c
        public Object getInputConfiguration() {
            return this.f37180a;
        }

        @Override // v.C6422a.c
        public int getWidth() {
            return this.f37180a.getWidth();
        }

        public int hashCode() {
            return this.f37180a.hashCode();
        }

        @Override // v.C6422a.c
        public boolean isMultiResolution() {
            return false;
        }

        public String toString() {
            return this.f37180a.toString();
        }

        C0426a(int i8, int i9, int i10) {
            this(new InputConfiguration(i8, i9, i10));
        }
    }

    private C6422a(c cVar) {
        this.f37179a = cVar;
    }
}
