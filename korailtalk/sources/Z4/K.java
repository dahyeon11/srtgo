package z4;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.korail.talk.application.KTApplication;
import n4.AbstractC5953d;
import n4.AbstractC5959j;

/* loaded from: classes.dex */
public class K {

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Snackbar f37879a;

        a(Snackbar snackbar) {
            this.f37879a = snackbar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f37879a.dismiss();
        }
    }

    public static Snackbar showSnackBar(Context context, View view, String str, int i8) {
        Snackbar snackbarMake = Snackbar.make(view, str, i8);
        View view2 = snackbarMake.getView();
        view2.setBackgroundResource(AbstractC5953d.snackbar_background);
        I4.a.getInstance();
        I4.a.setFont(context, view2);
        TextView textView = (TextView) view2.findViewById(J2.f.snackbar_text);
        textView.setSingleLine(false);
        textView.setTextColor(KTApplication.getInstance().getResources().getColor(AbstractC5953d.snackbar_text));
        textView.setLineSpacing(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()), 1.0f);
        snackbarMake.setAction(context.getString(AbstractC5959j.common_confirm), new a(snackbarMake));
        snackbarMake.show();
        return snackbarMake;
    }
}
