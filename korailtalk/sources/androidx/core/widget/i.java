package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0951e;
import androidx.core.view.X;

/* loaded from: classes.dex */
public final class i implements X {
    private static CharSequence a(Context context, ClipData.Item item, int i8) {
        if ((i8 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    private static void b(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.X
    public C0951e onReceiveContent(View view, C0951e c0951e) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(c0951e);
        }
        if (c0951e.getSource() == 2) {
            return c0951e;
        }
        ClipData clip = c0951e.getClip();
        int flags = c0951e.getFlags();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i8 = 0; i8 < clip.getItemCount(); i8++) {
            CharSequence charSequenceA = a(context, clip.getItemAt(i8), flags);
            if (charSequenceA != null) {
                if (z8) {
                    editable.insert(Selection.getSelectionEnd(editable), Q7.X.LF);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceA);
                } else {
                    b(editable, charSequenceA);
                    z8 = true;
                }
            }
        }
        return null;
    }
}
