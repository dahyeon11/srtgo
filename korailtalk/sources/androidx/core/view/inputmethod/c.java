package androidx.core.view.inputmethod;

import Z.h;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class c {
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9231a = new String[0];

    private static class a {
        static CharSequence a(EditorInfo editorInfo, int i8) {
            return editorInfo.getInitialSelectedText(i8);
        }

        static CharSequence b(EditorInfo editorInfo, int i8, int i9) {
            return editorInfo.getInitialTextAfterCursor(i8, i9);
        }

        static CharSequence c(EditorInfo editorInfo, int i8, int i9) {
            return editorInfo.getInitialTextBeforeCursor(i8, i9);
        }

        static void d(EditorInfo editorInfo, CharSequence charSequence, int i8) {
            editorInfo.setInitialSurroundingSubText(charSequence, i8);
        }
    }

    @Deprecated
    public c() {
    }

    static int a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean zContainsKey = bundle.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        boolean zContainsKey2 = editorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    private static boolean b(CharSequence charSequence, int i8, int i9) {
        if (i9 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i8));
        }
        if (i9 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i8));
    }

    private static boolean c(int i8) {
        int i9 = i8 & 4095;
        return i9 == 129 || i9 == 225 || i9 == 18;
    }

    private static void d(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i8);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i9);
    }

    private static void e(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        int i10 = i9 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int iMin = Math.min(charSequence.length() - i9, i12 - Math.min(i8, (int) (i12 * 0.8d)));
        int iMin2 = Math.min(i8, i12 - iMin);
        int i13 = i8 - iMin2;
        if (b(charSequence, i13, 0)) {
            i13++;
            iMin2--;
        }
        if (b(charSequence, (i9 + iMin) - 1, 1)) {
            iMin--;
        }
        d(editorInfo, i11 != i10 ? TextUtils.concat(charSequence.subSequence(i13, i13 + iMin2), charSequence.subSequence(i9, iMin + i9)) : charSequence.subSequence(i13, iMin2 + i11 + iMin + i13), iMin2, i11 + iMin2);
    }

    public static String[] getContentMimeTypes(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f9231a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f9231a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f9231a;
    }

    public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i8) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i8);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i9 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int i10 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int i11 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i10 - i9 != i11 || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        return (i8 & 1) != 0 ? charSequence.subSequence(i9, i10) : TextUtils.substring(charSequence, i9, i10);
    }

    public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i8, int i9) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i8, i9);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i10 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int iMin = Math.min(i8, charSequence.length() - i10);
        return (i9 & 1) != 0 ? charSequence.subSequence(i10, iMin + i10) : TextUtils.substring(charSequence, i10, iMin + i10);
    }

    public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i8, int i9) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i8, i9);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i10 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int iMin = Math.min(i8, i10);
        return (i9 & 1) != 0 ? charSequence.subSequence(i10 - iMin, i10) : TextUtils.substring(charSequence, i10 - iMin, i10);
    }

    public static boolean isStylusHandwritingEnabled(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED");
    }

    public static void setContentMimeTypes(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i8) {
        h.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i8);
            return;
        }
        int i9 = editorInfo.initialSelStart;
        int i10 = editorInfo.initialSelEnd;
        int i11 = i9 > i10 ? i10 - i8 : i9 - i8;
        int i12 = i9 > i10 ? i9 - i8 : i10 - i8;
        int length = charSequence.length();
        if (i8 < 0 || i11 < 0 || i12 > length) {
            d(editorInfo, null, 0, 0);
            return;
        }
        if (c(editorInfo.inputType)) {
            d(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            d(editorInfo, charSequence, i11, i12);
        } else {
            e(editorInfo, charSequence, i11, i12);
        }
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean z8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z8);
    }
}
