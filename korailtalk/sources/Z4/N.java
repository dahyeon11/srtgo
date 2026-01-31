package z4;

import Q7.X;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.widget.TextView;
import com.korail.talk.application.KTApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import n4.AbstractC5953d;

/* loaded from: classes.dex */
public class N {
    public static final int MONTH_DIGITS = 2;

    public static int SpToPx(float f8) {
        return (int) TypedValue.applyDimension(2, f8, KTApplication.getInstance().getResources().getDisplayMetrics());
    }

    public static String addZero(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append("0");
        }
        return new DecimalFormat(sb.toString()).format(i9);
    }

    public static SpannableStringBuilder applySpannable(String str, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (Object obj : objArr) {
            if ((obj instanceof CharacterStyle) || (obj instanceof ParagraphStyle)) {
                spannableStringBuilder.setSpan(obj, 0, str.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static String convertStreamToString(InputStream inputStream) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append('\n');
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                        } catch (IOException e8) {
                            t.e(e8.getMessage());
                        }
                        throw th;
                    }
                } catch (IOException e9) {
                    t.e(e9.getMessage());
                    inputStream.close();
                }
            } catch (IOException e10) {
                t.e(e10.getMessage());
            }
        }
        inputStream.close();
        return sb.toString();
    }

    public static int dpToPx(float f8) {
        return (int) (f8 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }

    public static String getDecimalFormatString(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i8;
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            t.e(e8.getMessage());
            i8 = 0;
        }
        return getDecimalFormatString(i8);
    }

    public static int getInteger(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (isNull(str)) {
                return 0;
            }
            return Integer.parseInt(str);
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return 0;
        }
    }

    public static String getIntegerString(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return !isNull(str) ? String.valueOf(Integer.parseInt(str)) : "";
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return "";
        }
    }

    public static String getText(TextView textView) {
        return getText(textView.getText().toString());
    }

    public static int intValue(String str, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str == null) {
            return i8;
        }
        try {
            return str.trim().length() > 0 ? Integer.parseInt(str) : i8;
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return i8;
        }
    }

    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

    public static boolean isNull(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean notNullEqual(String str, String str2) {
        return (str == null || str.length() == 0 || !str.equals(str2)) ? false : true;
    }

    public static int pxToDp(int i8) {
        return (int) (i8 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static void setBulletSpan(String[] strArr, TextView textView) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            SpannableStringBuilder spannableStringBuilderApplySpannable = applySpannable(strArr[i8], new BulletSpan(14));
            if (i8 == 0) {
                textView.setText(spannableStringBuilderApplySpannable);
            } else {
                textView.append(spannableStringBuilderApplySpannable);
            }
            if (strArr.length - 1 > i8) {
                textView.append(X.LF);
            }
        }
    }

    public static void setBulletSpanRed(String[] strArr, TextView textView, String str, Context context) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            SpannableStringBuilder spannableStringBuilderApplySpannable = applySpannable(strArr[i8], new BulletSpan(14));
            if (strArr[i8].contains(str)) {
                int iIndexOf = str.indexOf(str);
                spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(context, AbstractC5953d.red)), iIndexOf, str.length() + iIndexOf, 33);
            }
            if (i8 == 0) {
                textView.setText(spannableStringBuilderApplySpannable);
            } else {
                textView.append(spannableStringBuilderApplySpannable);
            }
            if (strArr.length - 1 > i8) {
                textView.append(X.LF);
            }
        }
    }

    public static void setSpanRedFontText(String str, TextView textView, int i8, int i9, int i10, Context context) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(I.getColor(context, AbstractC5953d.red)), i9, i10, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(dpToPx(i8)), i9, i10, 33);
        textView.setText(spannableStringBuilder);
    }

    public static void setSpanRedUnderline(String str, TextView textView, int i8, int i9, Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        t.d("start : " + i8);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(I.getColor(context, AbstractC5953d.red)), i8, i9, 33);
        spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, 33);
        textView.setText(spannableStringBuilder);
    }

    public static String getText(String str) {
        return str.trim();
    }

    public static String getDecimalFormatString(int i8) {
        return new DecimalFormat("#,###,###,###,###").format(i8);
    }

    public static String[] getStringArray(String... strArr) {
        return strArr;
    }
}
