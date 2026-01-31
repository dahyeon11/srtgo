package w4;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6467a extends PasswordTransformationMethod {

    /* renamed from: w4.a$a, reason: collision with other inner class name */
    private class C0431a implements CharSequence {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f37414a;

        public C0431a(CharSequence charSequence) {
            this.f37414a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i8) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f37414a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i8, int i9) {
            return this.f37414a.subSequence(i8, i9);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new C0431a(charSequence);
    }
}
