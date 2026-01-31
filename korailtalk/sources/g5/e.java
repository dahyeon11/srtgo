package g5;

import Q7.X;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.R;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.view.base.BaseActivity;
import com.korail.talk.viewGroup.ReserveButton;
import java.util.ArrayList;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import v4.h;
import y1.x;
import z4.C6630d;
import z4.I;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public abstract class e extends RecyclerView.h implements h.a {
    public static final String ITEM_TYPE = "ITEM_TYPE";
    public static final String KEY_CNEC_TRFC_ND_HM = "KEY_CNEC_TRFC_ND_HM";
    public static final String KEY_CNEC_TRFC_PSB_FLG = "KEY_CNEC_TRFC_PSB_FLG";
    public static final String KEY_CNEC_TRFC_RCVD_PRC = "KEY_CNEC_TRFC_RCVD_PRC";
    public static final String KEY_H_SMNS_TRN_FLG = "KEY_H_SMNS_TRN_FLG";
    public static final String KEY_NEXT_DAY = "KEY_NEXT_DAY";
    public static final String KEY_POPUP_MESSAGE = "KEY_POPUP_MESSAGE";
    public static final String KEY_PSRM_CL_NM = "KEY_PSRM_CL_NM";
    public static final String KEY_RSV_TYPE_FLAG = "KEY_RSV_TYPE_FLAG";
    public static final String KEY_RUN_TIME = "KEY_RUN_TIME";
    public static final String KEY_SEAT_BUTTON_BACKGROUND_ID = "buttonBackgroundId";
    public static final String KEY_SEAT_CHECKABLE = "checkable";
    public static final String KEY_SEAT_DELAY = "delay";
    public static final String KEY_SEAT_ELEVATOR_FAILURE_CONTROL = "seatElevatorFailureControl";
    public static final String KEY_SEAT_EXPECT_DELAY = "expect_delay";
    public static final String KEY_SEAT_FIRST_ICON = "stateIcon";
    public static final String KEY_SEAT_FIRST_TEXT = "state";
    public static final String KEY_SEAT_FIRST_TEXT_COLOR = "stateColor";
    public static final String KEY_SEAT_REMAIN_STATUS = "remainSeat";
    public static final String KEY_SEAT_SECOND_ICON = "stateHintIcon";
    public static final String KEY_SEAT_SECOND_TEXT = "stateHint";
    public static final String KEY_SEAT_SECOND_TEXT_COLOR = "stateHintColor";
    public static final String KEY_SEAT_STANDARD = "standard";
    public static final String KEY_SEAT_STANDING_FREE_INFO = "standing_free";
    public static final String KEY_SEAT_SUITE = "suite";
    public static final String KEY_SEAT_WAITING = "wait";
    public static final String KEY_SELECTED_LINE = "checked";
    public static final String KEY_SELECTED_SEAT_TYPE = "selectedCartType";
    public static final String KEY_STATION_POPUP_MESSAGE = "KEY_STATION_POPUP_MESSAGE";
    public static final String KEY_TOTAL_PASSENGER_COUNT = "KEY_TOTAL_PASSENGER_COUNT";
    public static final String KEY_TRAIN_ARRIVAL = "arrival";
    public static final String KEY_TRAIN_ARRIVAL_CD = "arrivalCD";
    public static final String KEY_TRAIN_ARRIVAL_TIME = "arrivalTime";
    public static final String KEY_TRAIN_DEPARTURE = "departure";
    public static final String KEY_TRAIN_DEPARTURE_CD = "depatureCd";
    public static final String KEY_TRAIN_DEPARTURE_TIME = "departureTime";
    public static final String KEY_TRAIN_GP_CODE = "trainGpCode";
    public static final String KEY_TRAIN_HAS_SNACKCART = "hasSnackCart";
    public static final String KEY_TRAIN_IS_ARRIVAL = "isArrival";
    public static final String KEY_TRAIN_IS_DEPARTURE = "isDeparture";
    public static final String KEY_TRAIN_NAME = "trainName";
    public static final String KEY_TRAIN_ORG_DEPARTURE = "KEY_TRAIN_ORG_DEPARTURE";
    public static final String KEY_TRAIN_STOP_POPUP_STATION = "stopPupupStation";
    public static final String KEY_TRAIN_STOP_STATION = "stopStation";
    public static final String KEY_USE_TIM_CARE_ATCL_CONT = "KEY_USE_TIM_CARE_ATCL_CONT";
    public static final String MOM_GDNO_TYPE = "Y20150924002";
    public static final int NONE = -1;
    public static final int SEAT_TYPE_NOT_SELECTED = -1;
    public static final int SEAT_TYPE_STANDARD = 0;
    public static final int SEAT_TYPE_SUITE = 1;
    public static final String STATE_NAME_DISCOUNT = "할인";
    public static final String STATE_NAME_DISCOUNT_MOM = "요금할인";
    public static final String STATE_NAME_DISCOUNT_SUITE = "운임";
    public static final String STATE_NAME_INSUFFICIENT_DISCOUNT = "할인부족";
    public static final String STATE_NAME_INSUFFICIENT_SEATS = "좌석부족";
    public static final String STATE_NAME_LINK = "예약링크";
    public static final String STATE_NAME_NONE = "-";
    public static final String STATE_NAME_RESERVABLE = "예매";
    public static final String STATE_NAME_RESERVABLE_OLD = "예약가능";
    public static final String STATE_NAME_RESERVING = "예약중";
    public static final String STATE_NAME_SALE_AT_STATION = "역발매중";
    public static final String STATE_NAME_SAVING = "적립";
    public static final String STATE_NAME_SEAT_LEVEL1 = "좌석많음";
    public static final String STATE_NAME_SEAT_LEVEL2 = "좌석보통";
    public static final String STATE_NAME_SEAT_LEVEL3 = "매진임박";
    public static final String STATE_NAME_SOLD_OUT = "매진";
    public static final String STATE_NAME_SOLD_OUT_OF_DISCOUNT = "할인매진";
    public static final String STATE_NAME_STANDING = "입석";
    public static final String STATE_NAME_STANDING_SEAT = "입석+좌석";
    public static final String STATE_NAME_WAITING = "예약대기";
    public static final int TEXT_COLOR_DISABLE = -5062440;
    public static final int TEXT_COLOR_GREY = -6710887;
    public static final int TEXT_COLOR_LINK = -9758928;
    public static final int TEXT_COLOR_NORMAL = -16750925;
    public static final int TEXT_COLOR_ORANGE = -3845118;
    public static final int TEXT_COLOR_RED = -1029854;
    public static final int TEXT_COLOR_TORQUOISE = -16141376;
    public static final int TYPE_NEXT_DAY_QUERY_BUTTON = 1;

    /* renamed from: d, reason: collision with root package name */
    protected final int f31365d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f31366e = -1;

    /* renamed from: f, reason: collision with root package name */
    protected c f31367f;

    /* renamed from: g, reason: collision with root package name */
    private final BaseActivity f31368g;

    /* renamed from: h, reason: collision with root package name */
    protected final ArrayList f31369h;
    public static final int RES_ID_BACKGROUND_NORMAL = AbstractC5954e.bg_reserve_button_normal;
    public static final int RES_ID_BACKGROUND_RED = AbstractC5954e.bg_reserve_button_redbox;
    public static final int RES_ID_BACKGROUND_GREY = AbstractC5954e.bg_reserve_button_graybox;
    public static final int RES_ID_BACKGROUND_TRANSPARENT = AbstractC5954e.bg_reserve_button_transparent;
    public static final int RES_ID_BACKGROUND_LINK = AbstractC5954e.bg_reserve_button_link;
    public static final int RES_ID_BACKGROUND_TORQUOISE = AbstractC5954e.bg_reserve_button_torquoise;

    protected class a extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        private Button f31370t;

        protected a(View view) {
            super(view);
            this.f31370t = (Button) view.findViewById(AbstractC5955f.nextDayQueryBtn);
        }
    }

    protected class b extends RecyclerView.E {
        protected b(View view) {
            super(view);
        }
    }

    e(BaseActivity baseActivity, ArrayList arrayList, c cVar) {
        this.f31368g = baseActivity;
        this.f31369h = arrayList;
        this.f31367f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        this.f31367f.showNextDay();
    }

    private void i(ReserveButton reserveButton, Bundle bundle, int i8, int i9, int i10) {
        reserveButton.setButtonBackground(bundle.getInt(KEY_SEAT_BUTTON_BACKGROUND_ID, RES_ID_BACKGROUND_NORMAL));
        reserveButton.setFirstText(bundle.getString("state"), bundle.getInt(KEY_SEAT_FIRST_TEXT_COLOR, TEXT_COLOR_NORMAL), bundle.getInt(KEY_SEAT_FIRST_ICON, 0));
        reserveButton.setSecondText(bundle.getString(KEY_SEAT_SECOND_TEXT), bundle.getInt(KEY_SEAT_SECOND_TEXT_COLOR, TEXT_COLOR_NORMAL), bundle.getInt(KEY_SEAT_SECOND_ICON, 0));
        if (bundle.getBoolean(KEY_SEAT_CHECKABLE, true)) {
            reserveButton.setOnClickListener(new h(this, i8, i9, i10));
        } else {
            reserveButton.setOnClickListener(null);
        }
        boolean elevatorControlTextView = reserveButton.setElevatorControlTextView(bundle.getString(KEY_SEAT_ELEVATOR_FAILURE_CONTROL, ""));
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getString(KEY_PSRM_CL_NM));
        sb.append(", ");
        if (elevatorControlTextView) {
            String string = bundle.getString(KEY_SEAT_ELEVATOR_FAILURE_CONTROL, "");
            sb.append(", ");
            if (string.contains("E/V")) {
                string = string.replaceAll("E/V", "역 승강기");
            }
            sb.append(string);
        } else {
            sb.append(reserveButton.getReserveContentDescription());
        }
        t.d(bundle.getString(KEY_PSRM_CL_NM));
        t.d(sb.toString());
        reserveButton.setContentDescription(sb.toString());
    }

    private void j(ReserveButton reserveButton, Bundle bundle, int i8, int i9, int i10) {
        String string = bundle.getString("state");
        try {
            if (string.indexOf(X.LF) != -1) {
                String[] strArrSplit = string.split(X.LF);
                if (strArrSplit.length > 1) {
                    string = strArrSplit[1].trim();
                }
            }
        } catch (Exception unused) {
            string = bundle.getString("state");
        }
        reserveButton.setButtonBackground(R.drawable.bg_reserve_button_normal);
        reserveButton.setFirstText(e(AbstractC5959j.title_ticket_confirm), TEXT_COLOR_NORMAL, bundle.getInt(KEY_SEAT_FIRST_ICON, 0));
        reserveButton.setSecondText(string, TEXT_COLOR_NORMAL, bundle.getInt(KEY_SEAT_SECOND_ICON, 0));
        reserveButton.setOnClickListener(null);
        reserveButton.setContentDescription(bundle.getString(KEY_PSRM_CL_NM) + ", " + reserveButton.getReserveContentDescription());
    }

    private void k(ReserveButton reserveButton, Bundle bundle) {
        reserveButton.setFirstText(STATE_NAME_NONE, bundle.getInt(KEY_SEAT_FIRST_TEXT_COLOR, TEXT_COLOR_NORMAL), bundle.getInt(KEY_SEAT_FIRST_ICON, 0));
        reserveButton.setSecondText("", bundle.getInt(KEY_SEAT_SECOND_TEXT_COLOR, TEXT_COLOR_NORMAL), bundle.getInt(KEY_SEAT_SECOND_ICON, 0));
        reserveButton.setOnClickListener(null);
    }

    private void l(TextView textView, Bundle bundle) {
        textView.setVisibility(bundle.containsKey(KEY_SEAT_REMAIN_STATUS) ? 0 : 8);
    }

    protected BaseActivity c() {
        return this.f31368g;
    }

    public void clear() {
        this.f31366e = -1;
    }

    protected Bundle d(int i8) {
        return (Bundle) this.f31369h.get(i8);
    }

    protected String e(int i8) {
        return I.getString(this.f31368g, i8);
    }

    protected String f(int i8, Object... objArr) {
        return I.getString(this.f31368g, i8, objArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        if (C6630d.isNull(this.f31369h)) {
            return 0;
        }
        return this.f31369h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i8) {
        return ((Bundle) this.f31369h.get(i8)).getInt(ITEM_TYPE) == 1 ? 1 : 0;
    }

    protected void h(a aVar, int i8) {
        aVar.f31370t.setText(f(AbstractC5959j.inquiry_next_day, ((Bundle) this.f31369h.get(i8)).getString(KEY_NEXT_DAY)));
        aVar.f31370t.setOnClickListener(new View.OnClickListener() { // from class: g5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31364a.g(view);
            }
        });
    }

    protected abstract void m(int i8, int i9, int i10);

    protected void n(ViewGroup viewGroup, Bundle bundle, int i8, int i9) {
        TextView textView = (TextView) viewGroup.findViewById(AbstractC5955f.trainNameTxt);
        textView.setText(bundle.getString(KEY_TRAIN_NAME));
        TextView textView2 = (TextView) viewGroup.findViewById(AbstractC5955f.departureTimeTxt);
        textView2.setText(bundle.getString(KEY_TRAIN_DEPARTURE_TIME) + X.LF + bundle.getString(KEY_TRAIN_DEPARTURE));
        TextView textView3 = (TextView) viewGroup.findViewById(AbstractC5955f.arrivalTimeTxt);
        textView3.setText(bundle.getString(KEY_TRAIN_ARRIVAL_TIME) + X.LF + bundle.getString(KEY_TRAIN_ARRIVAL));
        int i10 = bundle.getInt(KEY_SELECTED_SEAT_TYPE, -1);
        Bundle bundle2 = bundle.getBundle(KEY_SEAT_STANDARD);
        ReserveButton reserveButton = (ReserveButton) viewGroup.findViewById(AbstractC5955f.standardReserveButton);
        reserveButton.setCheckState(i10 == 0);
        i(reserveButton, bundle2, i8, i9, 0);
        l((TextView) viewGroup.findViewById(AbstractC5955f.tv_standardSeatStatus), bundle2);
        Bundle bundle3 = bundle.getBundle(KEY_SEAT_SUITE);
        ReserveButton reserveButton2 = (ReserveButton) viewGroup.findViewById(AbstractC5955f.suiteReserveButton);
        reserveButton2.setCheckState(i10 == 1);
        i(reserveButton2, bundle3, i8, i9, 1);
        l((TextView) viewGroup.findViewById(AbstractC5955f.tv_suiteSeatStatus), bundle3);
        boolean z8 = bundle.getBoolean(KEY_TRAIN_IS_DEPARTURE) && bundle.getBoolean(KEY_TRAIN_IS_ARRIVAL);
        viewGroup.setBackgroundColor(androidx.core.content.a.getColor(c(), z8 ? AbstractC5953d.trainListItemBG_default : AbstractC5953d.trainListItemBG_suggestion));
        textView.setTextColor(androidx.core.content.a.getColor(c(), z8 ? AbstractC5953d.trainListItemText_default : AbstractC5953d.trainListItemText_suggestion));
        textView2.setTextColor(androidx.core.content.a.getColor(c(), z8 ? AbstractC5953d.trainListItemText_default : AbstractC5953d.trainListItemText_suggestion));
        textView3.setTextColor(androidx.core.content.a.getColor(c(), z8 ? AbstractC5953d.trainListItemText_default : AbstractC5953d.trainListItemText_suggestion));
        TextView textView4 = (TextView) viewGroup.findViewById(AbstractC5955f.trainDelayTxt);
        int integer = N.getInteger(bundle.getString(KEY_SEAT_DELAY));
        int integer2 = N.getInteger(bundle.getString(KEY_SEAT_EXPECT_DELAY));
        t.d("열차 번호 : " + bundle.getString(KEY_TRAIN_NAME) + "지연 예상 : " + integer2 + ", 지연 : " + integer);
        if (integer2 > 0) {
            textView4.setText(f(AbstractC5959j.common_expect_delay_time, Integer.valueOf(integer2)));
            textView4.setBackgroundResource(android.R.color.transparent);
            textView4.setVisibility(0);
        } else if (integer > 0) {
            textView4.setText(f(AbstractC5959j.common_actual_delay_time, Integer.valueOf(integer)));
            textView4.setBackgroundResource(android.R.color.transparent);
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        View viewFindViewById = viewGroup.findViewById(AbstractC5955f.v_limousine);
        TextView textView5 = (TextView) viewFindViewById.findViewById(AbstractC5955f.tv_limousine_time);
        TextView textView6 = (TextView) viewFindViewById.findViewById(AbstractC5955f.tv_limousine_station_nm);
        if (bundle.getBoolean(KEY_RSV_TYPE_FLAG)) {
            String string = bundle.getString(KEY_CNEC_TRFC_PSB_FLG);
            if (HelpSrvCustDao.HelpSrvCustRequest.f27549D.equals(string)) {
                textView6.setText(f(AbstractC5959j.inquiry_limousine_time, N.getIntegerString(bundle.getString(KEY_CNEC_TRFC_ND_HM))));
                textView5.setText("인천공항");
                ConstraintLayout.b bVar = (ConstraintLayout.b) viewFindViewById.getLayoutParams();
                bVar.leftToLeft = textView2.getId();
                bVar.rightToRight = textView2.getId();
                viewFindViewById.setLayoutParams(bVar);
                viewFindViewById.setVisibility(0);
            } else if ("A".equals(string)) {
                textView5.setText(f(AbstractC5959j.inquiry_limousine_time, N.getIntegerString(bundle.getString(KEY_CNEC_TRFC_ND_HM))));
                textView6.setText("인천공항");
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) viewFindViewById.getLayoutParams();
                bVar2.leftToLeft = textView3.getId();
                bVar2.rightToRight = textView3.getId();
                viewFindViewById.setLayoutParams(bVar2);
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        } else {
            viewFindViewById.setVisibility(8);
        }
        String string2 = ((Bundle) this.f31369h.get(i8)).getString(KEY_H_SMNS_TRN_FLG, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(AbstractC5955f.cl);
        if (string2.equals(x.MAX_AD_CONTENT_RATING_G)) {
            constraintLayout.setBackgroundColor(androidx.core.content.a.getColor(c(), AbstractC5953d.color_E5F0F7));
            j(reserveButton, bundle2, i8, i9, 0);
            k(reserveButton2, bundle3);
        } else {
            if (!string2.equals("S")) {
                constraintLayout.setBackgroundColor(androidx.core.content.a.getColor(c(), AbstractC5953d.white));
                return;
            }
            constraintLayout.setBackgroundColor(androidx.core.content.a.getColor(c(), AbstractC5953d.color_E5F0F7));
            j(reserveButton2, bundle3, i8, i9, 1);
            k(reserveButton, bundle2);
        }
    }

    protected abstract void o(int i8);

    @Override // v4.h.a
    public void onCustomClick(View view, int i8, int i9, int i10) {
        int selectSeatType = B4.a.getSelectSeatType((Bundle) this.f31369h.get(i8), i9);
        if (-1 == selectSeatType) {
            int i11 = this.f31366e;
            if (i11 > -1 && i11 != i8) {
                o(i11);
                notifyItemChanged(this.f31366e);
            }
            m(i8, i9, i10);
            this.f31367f.selectItem(i8, i9, i10);
            this.f31366e = i8;
            notifyItemChanged(i8);
            return;
        }
        if ((i10 == 0 && 1 == selectSeatType) || (1 == i10 && selectSeatType == 0)) {
            m(i8, i9, i10);
            this.f31367f.changeItem(i8, i9, i8);
            notifyItemChanged(i8);
        } else if ((i10 == 0 && selectSeatType == 0) || (1 == i10 && 1 == selectSeatType)) {
            setUnSelectView(i8, i9, -1);
            if (this.f31367f.unSelectItem(i8, i9, i8)) {
                this.f31366e = -1;
            }
            notifyItemChanged(i8);
        }
    }

    protected abstract void setUnSelectView(int i8, int i9, int i10);
}
