package V4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.ui.map.activity.KTXMapActivity;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.g;
import y6.C6550j;
import z4.C6627a;
import z4.N;
import z4.P;

/* loaded from: classes.dex */
public class b extends C6550j implements View.OnClickListener {
    public static final int TYPE_ONE_WAY_DIRECT_STATION_NAME = 0;
    public static final int TYPE_ONE_WAY_MULTI_N_CARD_DIRECTION_STATION_NAME = 6;
    public static final int TYPE_ONE_WAY_TRANSFER_STATION_NAME = 1;
    public static final int TYPE_ROUND_TRIP_DIRECT_STATION_NAME = 2;
    public static final int TYPE_ROUND_TRIP_DIRECT_STATION_NAME_REVERSE_EVENT = 4;
    public static final int TYPE_ROUND_TRIP_TRANSFER_STATION_NAME = 3;
    public static final int TYPE_ROUND_TRIP_TRANSFER_STATION_NAME_REVERSE_EVENT = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f5213f;

    /* renamed from: g, reason: collision with root package name */
    private String f5214g;

    /* renamed from: h, reason: collision with root package name */
    private g f5215h;

    /* renamed from: i, reason: collision with root package name */
    private a f5216i;

    /* renamed from: j, reason: collision with root package name */
    private ViewGroup f5217j;

    /* renamed from: k, reason: collision with root package name */
    private View f5218k;

    /* renamed from: l, reason: collision with root package name */
    private View f5219l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f5220m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f5221n;

    public interface a {
        void onReverseStation();
    }

    public b(Context context) {
        super(context);
        g();
    }

    private void h() {
        this.f5213f = 8;
    }

    private void i() {
        View.inflate(getContext(), AbstractC5957h.route_option, this);
        this.f5217j = (ViewGroup) findViewById(AbstractC5955f.headerView);
        setHeaderView(0);
    }

    protected void g() {
        h();
        i();
    }

    public String getArrivalStationNm() {
        return N.getText(this.f5221n);
    }

    public String getStartStationNm() {
        return N.getText(this.f5220m);
    }

    public boolean isArrivalSelected() {
        return this.f5219l.isSelected();
    }

    public boolean isDepartureSelected() {
        return this.f5218k.isSelected();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        P.hideIME(getContext(), getWindowToken());
        int id = view.getId();
        if (AbstractC5955f.v_departure_station == id) {
            this.f5218k.setSelected(true);
            this.f5220m.setTextColor(a(AbstractC5953d.color_ff073b62));
            this.f5219l.setSelected(false);
            this.f5221n.setTextColor(a(AbstractC5953d.route_station_disable_text));
        } else if (AbstractC5955f.v_arrival_station == id) {
            this.f5218k.setSelected(false);
            this.f5220m.setTextColor(a(AbstractC5953d.route_station_disable_text));
            this.f5219l.setSelected(true);
            this.f5221n.setTextColor(a(AbstractC5953d.color_ff073b62));
        } else if (AbstractC5955f.tv_reverse == id) {
            if (this.f5216i != null) {
                this.f5216i.onReverseStation();
            }
        } else if (AbstractC5955f.btn_map == id) {
            ((Activity) getContext()).startActivityForResult(new Intent(getContext(), (Class<?>) KTXMapActivity.class), 113);
        }
        if ((this.f5215h == null || AbstractC5955f.v_departure_station != id) && AbstractC5955f.v_arrival_station != id) {
            return;
        }
        this.f5215h.onOptionHeaderClick(this, true);
    }

    @Override // y6.C6550j
    public void setHeaderClickListener(g gVar) {
        this.f5215h = gVar;
    }

    public void setHeaderView(int i8) {
        this.f5217j.removeAllViews();
        switch (i8) {
            case 0:
            case 2:
            case 4:
            case 6:
                View.inflate(getContext(), AbstractC5957h.direct_station_name, this.f5217j);
                ((ImageView) findViewById(AbstractC5955f.iv_route)).setImageResource(i8 == 0 ? AbstractC5954e.arw_one_way : AbstractC5954e.arw_round_trip);
                break;
            case 1:
            case 3:
            case 5:
                View.inflate(getContext(), AbstractC5957h.transfer_station_name, this.f5217j);
                ImageView imageView = (ImageView) findViewById(AbstractC5955f.iv_route1);
                ImageView imageView2 = (ImageView) findViewById(AbstractC5955f.iv_route2);
                imageView.setImageResource(1 == i8 ? AbstractC5954e.arw_one_way : AbstractC5954e.arw_round_trip);
                imageView2.setImageResource(1 == i8 ? AbstractC5954e.arw_one_way : AbstractC5954e.arw_round_trip);
                break;
        }
        TextView textView = (TextView) findViewById(AbstractC5955f.tv_reverse);
        this.f5218k = findViewById(AbstractC5955f.v_departure_station);
        this.f5219l = findViewById(AbstractC5955f.v_arrival_station);
        this.f5220m = (TextView) findViewById(AbstractC5955f.tv_departure_station);
        this.f5221n = (TextView) findViewById(AbstractC5955f.tv_arrival_station);
        Button button = (Button) findViewById(AbstractC5955f.btn_map);
        textView.setOnClickListener(this);
        this.f5218k.setOnClickListener(this);
        this.f5219l.setOnClickListener(this);
        button.setOnClickListener(this);
        C6627a.setRoleDescription(this.f5220m, "버튼");
        C6627a.setRoleDescription(this.f5221n, "버튼");
        button.setVisibility(P.isLowResolution(getContext()) ? 8 : this.f5213f);
        if (4 == i8 || 5 == i8) {
            this.f5218k.setEnabled(false);
            this.f5219l.setEnabled(false);
        } else if (6 == i8) {
            textView.setBackgroundResource(AbstractC5954e.ico_line_round);
            textView.setText(this.f5214g);
        }
    }

    public void setOnReverseStationsListener(a aVar) {
        this.f5216i = aVar;
    }

    public void setStationInfo(String str, String str2, int i8) {
        setStationInfo(str, str2, i8, 8);
    }

    public void setStationNm(String str, String str2) {
        this.f5220m.setText(str);
        this.f5221n.setText(str2);
    }

    public void unSelectStation() {
        this.f5218k.setSelected(false);
        this.f5220m.setTextColor(a(AbstractC5953d.color_ff073b62));
        this.f5219l.setSelected(false);
        this.f5221n.setTextColor(a(AbstractC5953d.color_ff073b62));
    }

    public void setStationInfo(String str, String str2, int i8, int i9) {
        this.f5213f = i9;
        setHeaderView(i8);
        setStationNm(str, str2);
    }

    public b(Context context, String str) {
        this(context);
        this.f5214g = str;
    }
}
