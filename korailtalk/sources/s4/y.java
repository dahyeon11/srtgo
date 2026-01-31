package s4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.view.CTextView;
import java.util.LinkedHashMap;
import java.util.Set;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.N;

/* loaded from: classes.dex */
public class y extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private ViewGroup f36294q;

    /* renamed from: r, reason: collision with root package name */
    CTextView f36295r;

    /* renamed from: s, reason: collision with root package name */
    String f36296s;

    public y(Context context) {
        super(context);
        this.f36296s = null;
    }

    private void s(GridLayout gridLayout, String str, int i8, int i9) {
        t(gridLayout, str, i8, i9, false);
    }

    private void t(GridLayout gridLayout, String str, int i8, int i9, boolean z8) {
        if (z8 && str != null && str.indexOf(g5.e.STATE_NAME_STANDING) != -1) {
            str = str.replace(g5.e.STATE_NAME_STANDING, "자유석");
        }
        TextView textView = (TextView) View.inflate(getContext(), AbstractC5957h.train_fare_dialog_item, null);
        textView.setText(str);
        gridLayout.addView(textView);
        if (i8 == 0) {
            textView.setGravity(17);
            textView.setPadding(0, 0, N.dpToPx(8.0f), 0);
        } else if (i8 == 1) {
            textView.setGravity(17);
        } else if (i8 == 2) {
            textView.setGravity(21);
            textView.setPadding(0, 0, N.dpToPx(13.5f), 0);
        }
        GridLayout.o oVar = (GridLayout.o) textView.getLayoutParams();
        oVar.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
        oVar.rowSpec = GridLayout.spec(Integer.MIN_VALUE, i9);
        ((ViewGroup.MarginLayoutParams) oVar).width = 0;
        oVar.setGravity(112);
        textView.setLayoutParams(oVar);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_train_fare);
    }

    public y initFareList(boolean z8, LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMap) {
        Set<String> set;
        try {
            Set<String> setKeySet = linkedHashMap.keySet();
            int i8 = 0;
            int i9 = 0;
            for (String str : setKeySet) {
                if (i9 > 0) {
                    View view = new View(getContext());
                    view.setBackgroundColor(436207616);
                    this.f36294q.addView(view);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = N.dpToPx(1.0f);
                    layoutParams.setMargins(i8, N.dpToPx(5.0f), i8, N.dpToPx(5.0f));
                    view.setLayoutParams(layoutParams);
                }
                GridLayout gridLayout = new GridLayout(getContext());
                gridLayout.setColumnCount(3);
                gridLayout.setRowCount(setKeySet.size());
                this.f36294q.addView(gridLayout, new LinearLayout.LayoutParams(-1, -2));
                s(gridLayout, str, i8, 3);
                LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap.get(str);
                for (String str2 : linkedHashMap2.keySet()) {
                    if (str2.equals(Price2FareDao.Price2Fare.rcvdPrcString)) {
                        set = setKeySet;
                        t(gridLayout, g5.e.STATE_NAME_DISCOUNT_SUITE, 1, 1, z8);
                        s(gridLayout, linkedHashMap2.get(str2), 2, 1);
                    } else {
                        set = setKeySet;
                        if (str2.equals(Price2FareDao.Price2Fare.rcvdFareString)) {
                            t(gridLayout, "요금", 1, 1, z8);
                            s(gridLayout, linkedHashMap2.get(str2), 2, 1);
                        } else if (str2.equals(Price2FareDao.Price2Fare.sumAmtString)) {
                            t(gridLayout, "합계", 1, 1, z8);
                            s(gridLayout, linkedHashMap2.get(str2), 2, 1);
                        }
                    }
                    setKeySet = set;
                }
                i9++;
                i8 = 0;
            }
            View view2 = new View(getContext());
            view2.setBackgroundColor(436207616);
            this.f36294q.addView(view2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = N.dpToPx(1.0f);
            layoutParams2.setMargins(0, N.dpToPx(5.0f), 0, N.dpToPx(5.0f));
            view2.setLayoutParams(layoutParams2);
            this.f36294q.addView(View.inflate(getContext(), AbstractC5957h.item_train_fare_info_detail, null));
        } catch (Exception e8) {
            z4.t.e(e8.getMessage());
        }
        return this;
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36294q = (ViewGroup) a(AbstractC5955f.dialog_fare_container);
        CTextView cTextView = (CTextView) a(AbstractC5955f.tv_dialog_title_sub_text);
        this.f36295r = cTextView;
        cTextView.setText("");
    }
}
