package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.viewGroup.DateCellView;
import java.util.Calendar;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6634h;

/* renamed from: y6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6545e extends DateCellView {

    /* renamed from: h, reason: collision with root package name */
    private TextView f37629h;

    public C6545e(Context context) {
        super(context);
    }

    private void setTitleTextColor(TextView textView) {
        Calendar thisDate = getThisDate();
        if (textView == null || thisDate == null) {
            return;
        }
        int i8 = AbstractC5953d.linear_weekday_title;
        switch (thisDate.get(7)) {
            case 1:
                textView.setText(AbstractC5959j.booking_sunday);
                i8 = AbstractC5953d.linear_sunday_title;
                break;
            case 2:
                textView.setText(AbstractC5959j.booking_monday);
                break;
            case 3:
                textView.setText(AbstractC5959j.booking_tuesday);
                break;
            case 4:
                textView.setText(AbstractC5959j.booking_wednesday);
                break;
            case 5:
                textView.setText(AbstractC5959j.booking_thursday);
                break;
            case 6:
                textView.setText(AbstractC5959j.booking_friday);
                break;
            case 7:
                textView.setText(AbstractC5959j.booking_saturday);
                i8 = AbstractC5953d.linear_saturday_title;
                break;
        }
        if (isHoliday()) {
            i8 = AbstractC5953d.linear_sunday_title;
        }
        textView.setTextColor(a(i8));
        if (C6634h.isEquals(Calendar.getInstance(), thisDate, "yyyyMMdd")) {
            textView.setText(AbstractC5959j.common_today);
            textView.setTextColor(a(AbstractC5953d.linear_today_title));
        }
    }

    @Override // com.korail.talk.viewGroup.DateCellView
    protected void c() {
        View.inflate(getContext(), AbstractC5957h.calendar_date_cell_with_title, this);
    }

    @Override // com.korail.talk.viewGroup.DateCellView
    protected void d() {
        super.d();
        this.f37629h = (TextView) findViewById(AbstractC5955f.dayOfWeekTitle);
    }

    @Override // com.korail.talk.viewGroup.DateCellView
    protected void e() {
        super.e();
        setTitleTextColor(this.f37629h);
    }

    public C6545e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C6545e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
