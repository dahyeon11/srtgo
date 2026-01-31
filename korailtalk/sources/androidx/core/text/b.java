package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class b {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    static class a {
        static Spanned a(String str, int i8) {
            return Html.fromHtml(str, i8);
        }

        static Spanned b(String str, int i8, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i8, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i8) {
            return Html.toHtml(spanned, i8);
        }
    }

    public static Spanned fromHtml(String str, int i8) {
        return a.a(str, i8);
    }

    public static String toHtml(Spanned spanned, int i8) {
        return a.c(spanned, i8);
    }

    public static Spanned fromHtml(String str, int i8, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.b(str, i8, imageGetter, tagHandler);
    }
}
