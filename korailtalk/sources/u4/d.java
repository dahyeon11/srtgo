package u4;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.korail.talk.data.vo.AvailableDates;
import java.util.Calendar;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.InterfaceC6431a;
import y6.ViewOnClickListenerC6544d;
import z4.C6630d;

/* loaded from: classes.dex */
public class d extends Dialog implements InterfaceC6431a, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Calendar f37125a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6431a f37126b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f37127c;

    /* renamed from: d, reason: collision with root package name */
    private Button f37128d;

    public d(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 2;
        layoutParams.dimAmount = 0.5f;
        getWindow().setAttributes(layoutParams);
        a();
    }

    private void a() {
        setContentView(AbstractC5957h.dialog_calendar);
        c();
        b();
    }

    private void b() {
        findViewById(AbstractC5955f.custom_alert_dialog_btn_no).setOnClickListener(this);
        this.f37128d.setOnClickListener(this);
    }

    private void c() {
        Button button = (Button) findViewById(AbstractC5955f.custom_alert_dialog_btn_ok);
        this.f37128d = button;
        button.setEnabled(false);
        this.f37127c = (RelativeLayout) findViewById(AbstractC5955f.custom_alert_dialog_content);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.custom_alert_dialog_btn_ok == view.getId() && C6630d.isNotNull(this.f37126b)) {
            this.f37126b.onSelectDate(this.f37125a);
        }
        dismiss();
    }

    @Override // v4.InterfaceC6431a
    public void onSelectDate(Calendar calendar) {
        this.f37125a = calendar;
        this.f37128d.setEnabled(C6630d.isNotNull(calendar));
    }

    public void setCalendarListener(InterfaceC6431a interfaceC6431a) {
        this.f37126b = interfaceC6431a;
    }

    public void setCalendarView(AvailableDates availableDates, Calendar calendar, String str) {
        this.f37125a = calendar;
        this.f37127c.removeAllViews();
        ViewOnClickListenerC6544d viewOnClickListenerC6544d = new ViewOnClickListenerC6544d(getContext());
        viewOnClickListenerC6544d.setAvailableDates(availableDates, calendar, str, this);
        this.f37127c.addView(viewOnClickListenerC6544d);
    }
}
