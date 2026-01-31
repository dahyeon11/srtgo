package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.viewGroup.DateCellView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.InterfaceC6431a;
import z4.C6634h;

/* renamed from: y6.i */
/* loaded from: classes.dex */
public class C6549i extends C6543c {

    /* renamed from: j */
    private static final int[] f37641j = {AbstractC5955f.dateCell_0, AbstractC5955f.dateCell_1, AbstractC5955f.dateCell_2, AbstractC5955f.dateCell_3, AbstractC5955f.dateCell_4, AbstractC5955f.dateCell_5, AbstractC5955f.dateCell_6};

    /* renamed from: a */
    private Calendar f37642a;

    /* renamed from: b */
    private List f37643b;

    /* renamed from: c */
    private Calendar f37644c;

    /* renamed from: d */
    private View f37645d;

    /* renamed from: e */
    private LinearLayout f37646e;

    /* renamed from: f */
    private AvailableDates f37647f;

    /* renamed from: g */
    private InterfaceC6431a f37648g;

    /* renamed from: h */
    private String f37649h;

    /* renamed from: i */
    private final View.OnClickListener f37650i;

    /* renamed from: y6.i$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Calendar date = ((DateCellView) view).getDate();
            if (C6634h.isEquals(date, C6549i.this.f37644c, "yyyyMMdd")) {
                return;
            }
            Calendar calendar = (Calendar) date.clone();
            C6549i.this.f(view, calendar);
            if (C6549i.this.f37648g != null) {
                C6549i.this.f37648g.onSelectDate(calendar);
            }
        }
    }

    public C6549i(Context context) {
        super(context);
        this.f37650i = new a();
        g();
    }

    public void f(View view, Calendar calendar) {
        View view2 = this.f37645d;
        if (view2 != null) {
            view2.setSelected(false);
        }
        if (view != null) {
            view.setSelected(calendar != null);
        }
        this.f37644c = calendar;
        this.f37645d = view;
    }

    private void g() {
        removeAllViews();
        View viewInflate = View.inflate(getContext(), AbstractC5957h.calendar_frame, null);
        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate.findViewById(AbstractC5955f.weeksContainerScroll);
        this.f37646e = (LinearLayout) viewInflate.findViewById(AbstractC5955f.weeksContainer);
        nestedScrollView.setLayoutParams(nestedScrollView.getLayoutParams());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        addView(viewInflate, layoutParams);
    }

    private List h() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = (Calendar) this.f37642a.clone();
        calendar.set(5, 1);
        while (C6634h.isEquals(calendar, this.f37642a, "yyyyMM")) {
            arrayList.add((Calendar) calendar.clone());
            calendar.add(5, 1);
        }
        Calendar calendar2 = (Calendar) ((Calendar) arrayList.get(0)).clone();
        while (calendar2.get(7) != 1) {
            calendar2.add(5, -1);
            arrayList.add(0, (Calendar) calendar2.clone());
        }
        Calendar calendar3 = (Calendar) ((Calendar) arrayList.get(arrayList.size() - 1)).clone();
        while (calendar3.get(7) != 7) {
            calendar3.add(5, 1);
            arrayList.add((Calendar) calendar3.clone());
        }
        return arrayList;
    }

    private View i(List list) {
        int[] iArr;
        if (list == null || list.size() != 7 || (iArr = f37641j) == null || iArr.length != 7) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(), AbstractC5957h.calendar_week, null);
        for (int i8 = 0; i8 < 7; i8++) {
            Calendar calendar = (Calendar) list.get(i8);
            DateCellView dateCellView = (DateCellView) linearLayout.findViewById(f37641j[i8]);
            boolean zIsEquals = C6634h.isEquals(this.f37642a, calendar, "yyyyMM");
            boolean z8 = this.f37647f.isAvailableDate(calendar) && zIsEquals;
            dateCellView.setDate(calendar);
            dateCellView.setEnabled(z8);
            dateCellView.setOnClickListener(z8 ? this.f37650i : null);
            dateCellView.setSelectedDateText(this.f37649h);
            if (C6634h.isEquals(this.f37644c, calendar, "yyyyMMdd")) {
                f(dateCellView, this.f37644c);
            }
            dateCellView.setVisibility(zIsEquals ? 0 : 4);
        }
        return linearLayout;
    }

    private void j() {
        this.f37646e.removeAllViews();
        int i8 = 0;
        for (int i9 = 7; i9 <= this.f37643b.size(); i9 += 7) {
            View viewI = i(this.f37643b.subList(i8, i9));
            if (viewI != null) {
                this.f37646e.addView(viewI);
            }
            i8 += 7;
        }
    }

    public void setMonth(InterfaceC6431a interfaceC6431a, Calendar calendar, AvailableDates availableDates, Calendar calendar2, String str) {
        if (calendar == null || availableDates == null || availableDates.isEmpty()) {
            return;
        }
        this.f37648g = interfaceC6431a;
        Calendar calendar3 = (Calendar) calendar.clone();
        this.f37642a = calendar3;
        calendar3.set(5, 1);
        this.f37642a.set(11, 0);
        this.f37642a.set(12, 0);
        this.f37642a.set(13, 0);
        this.f37647f = availableDates;
        this.f37649h = str;
        if (calendar2 == null || !C6634h.isEquals(this.f37642a, calendar2, "yyyyMM")) {
            this.f37644c = null;
        } else {
            this.f37644c = (Calendar) calendar2.clone();
        }
        this.f37643b = h();
        j();
    }

    public C6549i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37650i = new a();
        g();
    }

    public C6549i(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f37650i = new a();
        g();
    }
}
