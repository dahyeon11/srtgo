package V4;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;

/* loaded from: classes.dex */
public class a extends C6550j implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private View f5208f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f5209g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f5210h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f5211i;

    /* renamed from: j, reason: collision with root package name */
    private String f5212j;

    public a(Context context) {
        super(context);
        g();
    }

    private void i() {
        this.f5208f.setOnClickListener(this);
        this.f5211i.setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.benefit_station_option, this);
        View viewFindViewById = findViewById(AbstractC5955f.headerView);
        this.f5208f = viewFindViewById;
        this.f5209g = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerTitleTxt);
        this.f5210h = (TextView) this.f5208f.findViewById(AbstractC5955f.headerVal0Txt);
        this.f5211i = (TextView) findViewById(AbstractC5955f.tv_pass_event_msg);
    }

    private void setText() {
        this.f5209g.setText(AbstractC5959j.title_station);
        this.f5210h.setText(getContext().getString(AbstractC5959j.booking_no_select));
    }

    protected void g() {
        j();
        setText();
        i();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.headerView == id) {
            onHeaderClick();
        } else if (AbstractC5955f.tv_pass_event_msg == id) {
            C6630d.moveToOutSideBrowser(getContext(), this.f5212j);
        }
    }

    public void setEventMsg(String str) {
        this.f5211i.setVisibility(0);
        this.f5211i.setText(str);
    }

    public void setEventUrl(String str) {
        this.f5212j = str;
    }

    public void setHeaderVal0Txt(String str) {
        this.f5210h.setText(str);
    }
}
