package R5;

import Q7.X;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import n4.AbstractC5952c;
import n4.AbstractC5953d;
import n4.AbstractC5959j;
import r4.g;
import z4.I;
import z4.N;

/* loaded from: classes.dex */
public class a extends RecyclerView.E {

    /* renamed from: t, reason: collision with root package name */
    private final Context f4447t;

    /* renamed from: u, reason: collision with root package name */
    protected final P5.d f4448u;

    /* renamed from: R5.a$a, reason: collision with other inner class name */
    class C0071a extends ClickableSpan {
        C0071a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a.this.J(g.N_CARD_PURCHARE_INFO_URL);
        }
    }

    class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a.this.J(g.N_CARD_CAUTION_URL);
        }
    }

    class c extends ClickableSpan {
        c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a.this.J(g.N_CARD_INFO_URL);
        }
    }

    class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4452a;

        d(String str) {
            this.f4452a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (a.this.H(AbstractC5959j.transfer_station_change).contains(this.f4452a)) {
                a.this.L(-1);
                return;
            }
            if (a.this.H(AbstractC5959j.common_commission_confirm).contains(this.f4452a)) {
                a.this.J(g.COMMISSION_URL);
                return;
            }
            if (a.this.H(AbstractC5959j.common_belongings_confirm).contains(this.f4452a)) {
                a.this.J(g.BELONGINGS_URL);
                return;
            }
            if (a.this.H(AbstractC5959j.common_wheelchair_confirm).contains(this.f4452a)) {
                a.this.J(g.WHEELCHAIR_TOOLS_URL);
            } else if (a.this.H(AbstractC5959j.commutation_reservation_message).contains(this.f4452a)) {
                a.this.J(g.CMTR_INFO_URL);
            } else if (a.this.H(AbstractC5959j.ncard_reservation_message1_itx_youth).contains(this.f4452a)) {
                a.this.J(g.N_CARD_INFO_URL);
            }
        }
    }

    public a(P5.d dVar, View view) {
        super(view);
        this.f4448u = dVar;
        this.f4447t = view.getContext();
    }

    protected Context G() {
        return this.f4447t;
    }

    protected String H(int i8) {
        return I.getString(G(), i8);
    }

    protected String I(int i8, Object... objArr) {
        return I.getString(G(), i8, objArr);
    }

    protected void J(String str) {
        this.f4448u.moveToWebView(str);
    }

    protected void K(List list, TextView textView) {
        String[] stringArray = I.getStringArray(G(), AbstractC5952c.span_message);
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = (String) list.get(i8);
            SpannableStringBuilder spannableStringBuilderApplySpannable = N.applySpannable(str, new BulletSpan(20));
            int length = stringArray.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                String str2 = stringArray[i9];
                if (str.contains(str2)) {
                    int iIndexOf = str.indexOf(str2);
                    int length2 = str2.length() + iIndexOf;
                    if (H(AbstractC5959j.reserved_duplicate).contains(str2) || H(AbstractC5959j.rsv_confirm_message_stress).contains(str2) || H(AbstractC5959j.rsv_confirm_message_stress1).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red)), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.ncard_reservation_message2_itx_youth).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new StyleSpan(1), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.ncard_reservation_message3_itx_youth).contains(str2) || H(AbstractC5959j.ncard_reservation_message4_itx_youth).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new StyleSpan(1), iIndexOf, length2, 33);
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red)), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.rsv_confirm_message_sold_out).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red)), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.ncard_reservation_message1).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new C0071a(), iIndexOf, length2, 33);
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red_2)), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.ncard_reservation_message2).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new b(), iIndexOf, length2, 33);
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red_2)), iIndexOf, length2, 33);
                    } else if (H(AbstractC5959j.ncard_reservation_message3).contains(str2)) {
                        spannableStringBuilderApplySpannable.setSpan(new c(), iIndexOf, length2, 33);
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red_2)), iIndexOf, length2, 33);
                    } else {
                        spannableStringBuilderApplySpannable.setSpan(new d(str2), iIndexOf, length2, 33);
                        spannableStringBuilderApplySpannable.setSpan(new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.red_2)), iIndexOf, length2, 33);
                    }
                } else {
                    i9++;
                }
            }
            if (i8 == 0) {
                textView.setText(spannableStringBuilderApplySpannable);
            } else {
                textView.append(spannableStringBuilderApplySpannable);
            }
            if (i8 < list.size() - 1) {
                textView.append(X.LF);
            }
        }
    }

    protected void L(int i8) {
        this.f4448u.setFinish(i8);
    }

    public void setEventListener(Q5.b bVar, int i8) {
    }

    public void setText(Q5.b bVar, int i8) {
    }

    public void setView(Q5.b bVar, int i8) {
    }
}
