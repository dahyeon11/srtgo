package z4;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;

/* loaded from: classes.dex */
public class P {
    public static void hideIME(Context context, View view) {
        if (C6630d.isNotNull(context) && C6630d.isNotNull(view)) {
            hideIME(context, view.getWindowToken());
        }
    }

    public static boolean isLowResolution(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi < 320;
    }

    public static void recycleAllView(View view) {
        if (!C6630d.isNotNull(view)) {
            return;
        }
        if (view instanceof ImageView) {
            recycleView((ImageView) view);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i8 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i8 >= viewGroup.getChildCount()) {
                return;
            }
            recycleAllView(viewGroup.getChildAt(i8));
            i8++;
        }
    }

    public static void recycleView(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (!C6630d.isNotNull(bitmap) || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    }

    public static void setClipBoardLink(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
        Toast.makeText(context, "클립보드에 복사되었습니다.", 0).show();
    }

    public static void showIME(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    public static void hideIME(Context context, IBinder iBinder) {
        if (C6630d.isNotNull(context) && C6630d.isNotNull(iBinder)) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
