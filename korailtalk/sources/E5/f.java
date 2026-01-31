package E5;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.aidllib.SmartAgentInterface;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.data.StbkData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.login.LogoutDao;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.booking.mainBooking.TidsSelectStationActivity;
import com.korail.talk.ui.limousine.LimousineActivity;
import com.korail.talk.ui.limousine.RenewalLimousineActivity;
import com.korail.talk.ui.menu.BasketTicketActivity;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.ui.menu.TripQrAuthActivity;
import com.korail.talk.ui.menu.delay.DelayAccountRefundActivity;
import com.korail.talk.ui.menu.discountMenu.NewDiscountMenuActivity;
import com.korail.talk.ui.menu.offline.OfflineTicketReturnActivity;
import com.korail.talk.ui.menu.tripbooking.TripBookingListActivity;
import com.korail.talk.ui.mileage.AccumulatingKTXMileageActivity;
import com.korail.talk.ui.mileage.MileageHistoryActivity;
import com.korail.talk.ui.mypage.MemberDropActivity;
import com.korail.talk.ui.mypage.MyPageActivity;
import com.korail.talk.ui.push.PushHistoryActivity;
import com.korail.talk.ui.refund.RefundActivity;
import com.korail.talk.ui.setting.MultiLanguageActivity;
import com.korail.talk.ui.setting.PushSettingActivity;
import com.korail.talk.ui.setting.SettingActivity;
import com.korail.talk.ui.setting.VersionActivity;
import com.korail.talk.ui.setting.VeteransNoSettingActivity;
import com.korail.talk.ui.setting.favoriteCards.FavoriteCardsSettingActivity;
import com.korail.talk.ui.setting.favoriteSections.FavoriteSectionsSettingActivity;
import com.korail.talk.ui.setting.memberCard.MemberCardActivity;
import com.korail.talk.ui.setting.tossAuto.TossAutoSettingActivity;
import com.korail.talk.ui.stbk.StbkRegisterAccountListActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.ticket.history.TicketPurchaseHistoryActivity;
import com.korail.talk.ui.ticket.history.gifticket.GifticketHistoryActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.ui.web.MaumAIV2WebViewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import k0.AbstractC5837a;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p4.C6054a;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.G;
import z4.H;
import z4.N;
import z4.q;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class f extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "DrawerFragment";

    /* renamed from: d0, reason: collision with root package name */
    private View f1028d0;

    /* renamed from: e0, reason: collision with root package name */
    private ImageView f1029e0;

    /* renamed from: f0, reason: collision with root package name */
    private ImageView f1030f0;

    /* renamed from: g0, reason: collision with root package name */
    private ImageView f1031g0;

    /* renamed from: h0, reason: collision with root package name */
    private TextView f1032h0;

    /* renamed from: i0, reason: collision with root package name */
    private TextView f1033i0;

    /* renamed from: j0, reason: collision with root package name */
    private ExpandableListView f1034j0;

    /* renamed from: k0, reason: collision with root package name */
    private j f1035k0;

    /* renamed from: l0, reason: collision with root package name */
    private final ExpandableListView.OnGroupClickListener f1036l0 = new ExpandableListView.OnGroupClickListener() { // from class: E5.a
        @Override // android.widget.ExpandableListView.OnGroupClickListener
        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i8, long j8) {
            return this.f1022a.D0(expandableListView, view, i8, j8);
        }
    };

    /* renamed from: m0, reason: collision with root package name */
    private final ExpandableListView.OnChildClickListener f1037m0 = new ExpandableListView.OnChildClickListener() { // from class: E5.b
        @Override // android.widget.ExpandableListView.OnChildClickListener
        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i8, int i9, long j8) {
            return this.f1023a.E0(expandableListView, view, i8, i9, j8);
        }
    };

    class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intent = new Intent(f.this.getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", r4.g.PRIVACY_URL);
            f.this.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1039a;

        static {
            int[] iArr = new int[h.values().length];
            f1039a = iArr;
            try {
                iArr[h.MEMBER_INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1039a[h.BASKET_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1039a[h.MY_TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1039a[h.TICKET_HISTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1039a[h.MOBILE_FAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1039a[h.MILEAGE_INQUIRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1039a[h.GIFTICKET_HISTORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1039a[h.ACCUMULATING_KTX_MILEAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1039a[h.RAIL_POINT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1039a[h.MEMBERSHIP_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1039a[h.DELAY_ACCOUNT_REFUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1039a[h.TRIP_QR_AUTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1039a[h.COMPENSATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1039a[h.DELAY_CERTIFICATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1039a[h.MEMBER_DROP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1039a[h.TICKET_RESERVATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1039a[h.COMMUTATION_PASS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1039a[h.RESERVED_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f1039a[h.TRAVEL_BOOKING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f1039a[h.LIMOUSINE_BOOKING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f1039a[h.TICKET_REFUND.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f1039a[h.OFFLINE_REFUND.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f1039a[h.OFFLINE_REFUND_CALL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f1039a[h.USE_GUIDE_FAQ.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f1039a[h.USE_GUIDE_TICKET_REFUND_PENALTY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f1039a[h.USE_GUIDE_CARRYING_ITEMS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f1039a[h.USE_GUIDE_PASSENGER_TRANSPORT_TERMS_AND_CONDITIONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f1039a[h.USE_GUIDE_TIDS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f1039a[h.NOTICE_BOARD.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f1039a[h.LOST_ARTICLE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f1039a[h.CUSTOMER_CALL.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f1039a[h.HEARING_IMPAIRED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f1039a[h.RAILPOLICE_CALL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f1039a[h.RAILPOLICE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f1039a[h.RAILREPORT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f1039a[h.RAIL_DELIVERY.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f1039a[h.KTX_DELIVERY.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f1039a[h.KTX_PARKING.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f1039a[h.FAVORITE_ROUTES.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f1039a[h.CONVENIENCE_SETTING.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f1039a[h.SIMPLE_CASH_PAYMENT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f1039a[h.TOSSPAY_AUTO.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f1039a[h.FAVORITE_CARDS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f1039a[h.VETERAN_WELFARE_NO.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f1039a[h.NOTIFICATION_SETTING.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f1039a[h.MULTI_LANGUAGE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f1039a[h.VERSION_INFO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f1039a[h.LOGIN.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f1039a[h.LOGOUT.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    private class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final String f1040a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1041b;

        /* synthetic */ c(f fVar, String str, String str2, a aVar) {
            this(str, str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("WEB_POST_URL", N.isNull(this.f1040a) ? r4.g.NOTICE_URL : r4.g.NOTICE_DETAIL_URL);
            bundle.putString("WEB_POST_PARAMETER", N.isNull(this.f1040a) ? "" : this.f1041b);
            C6641o.navigation(f.this.getApplicationContext(), IntegrationWebViewActivity.class, bundle);
        }

        private c(String str, String str2) {
            this.f1040a = str;
            this.f1041b = str2;
        }
    }

    private void B0() {
        CommonCodeDao.KorailBoss korailBoss = (CommonCodeDao.KorailBoss) q.fromJson(H.getString(getApplicationContext(), "KORAIL_BOSS"), CommonCodeDao.KorailBoss.class);
        View viewInflate = View.inflate(getActivity(), AbstractC5957h.view_drawer_expand_list_footer, null);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5955f.tv_drawer_private_policy);
        if (C6630d.isNotNull(korailBoss) && N.isNotNull(korailBoss.getTerms())) {
            textView.setText(getString(AbstractC5959j.drawer_private_policy1, (C6630d.isNotNull(korailBoss) && N.isNotNull(korailBoss.getName())) ? korailBoss.getName() : getString(AbstractC5959j.common_empty)));
            textView.setContentDescription(getString(AbstractC5959j.drawer_private_policy1, (C6630d.isNotNull(korailBoss) && N.isNotNull(korailBoss.getName())) ? korailBoss.getName() : getString(AbstractC5959j.common_empty)));
        }
        TextView textView2 = (TextView) viewInflate.findViewById(AbstractC5955f.tv_drawer_private_policy2);
        textView2.append(N.applySpannable(getString(AbstractC5959j.drawer_private_policy2), new StyleSpan(1), new a(), new ForegroundColorSpan(Color.parseColor("#000000"))));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.f1034j0.addFooterView(viewInflate);
    }

    private void C0() {
        executeDao(new LogoutDao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D0(ExpandableListView expandableListView, View view, int i8, long j8) {
        g gVar = null;
        Object tag = C6630d.isNull(view) ? null : view.getTag();
        if (C6630d.isNotNull(tag) && (tag instanceof g)) {
            gVar = (g) tag;
        }
        if (!C6630d.isNotNull(gVar)) {
            return false;
        }
        t0(view);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E0(ExpandableListView expandableListView, View view, int i8, int i9, long j8) throws Resources.NotFoundException {
        h hVar = null;
        Object tag = C6630d.isNull(view) ? null : view.getTag();
        if (C6630d.isNotNull(tag) && (tag instanceof h)) {
            hVar = (h) tag;
        }
        if (!C6630d.isNotNull(hVar)) {
            return true;
        }
        t0(view);
        switch (b.f1039a[hVar.ordinal()]) {
            case 1:
                C6641o.navigation(getApplicationContext(), MyPageActivity.class);
                break;
            case 2:
                C6641o.navigation(getApplicationContext(), BasketTicketActivity.class);
                break;
            case 3:
                C6641o.navigation(getApplicationContext(), TicketListActivity.class);
                break;
            case 4:
            case 5:
                C6641o.navigation(getApplicationContext(), TicketPurchaseHistoryActivity.class);
                break;
            case 6:
                I4.h.getInstance();
                if (!I4.h.getInstance().isLogin()) {
                    I0();
                    break;
                } else {
                    C6641o.navigation(getApplicationContext(), MileageHistoryActivity.class);
                    break;
                }
            case 7:
                if (!I4.h.getInstance().isLogin()) {
                    I0();
                    break;
                } else {
                    C6641o.navigation(getApplicationContext(), GifticketHistoryActivity.class);
                    break;
                }
            case 8:
                C6641o.navigation(getApplicationContext(), AccumulatingKTXMileageActivity.class);
                break;
            case 9:
                I4.h hVar2 = I4.h.getInstance();
                if (!hVar2.isLogin()) {
                    I0();
                    break;
                } else {
                    PlayAppData playAppData = new PlayAppData();
                    playAppData.setIntent(G.getIntentScheme(getString(AbstractC5959j.rail_point_default_scheme, hVar2.getEncryptMbCrdNo(), hVar2.getEncryptCustNo()), "com.railpoint"));
                    G.playApp(getActivity(), playAppData);
                    break;
                }
            case 10:
                C6641o.navigation(getApplicationContext(), MemberCardActivity.class);
                break;
            case 11:
                C6641o.navigation(getApplicationContext(), DelayAccountRefundActivity.class);
                break;
            case 12:
                C6641o.navigation(getApplicationContext(), TripQrAuthActivity.class);
                break;
            case 13:
                C6641o.navigation(getApplicationContext(), RefundActivity.class);
                break;
            case 14:
                R0();
                break;
            case 15:
                C6641o.navigation(getApplicationContext(), MemberDropActivity.class);
                break;
            case 16:
                C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
                break;
            case 17:
                Bundle bundle = new Bundle();
                bundle.putString("DISCOUNT_MENU_NO", "1");
                C6641o.navigation(getApplicationContext(), NewDiscountMenuActivity.class, bundle);
                break;
            case 18:
                C6641o.navigation(getApplicationContext(), ReservedTicketActivity.class);
                break;
            case 19:
                C6641o.navigation(getApplicationContext(), TripBookingListActivity.class);
                break;
            case 20:
                if (!I4.h.getInstance().isLogin()) {
                    C6641o.moveToLogin(getActivity());
                    break;
                } else {
                    C6641o.navigation(getActivity(), C6054a.IS_LIMOUSINE_TEST ? RenewalLimousineActivity.class : LimousineActivity.class);
                    break;
                }
            case 21:
                C6641o.navigation(getApplicationContext(), TicketListActivity.class);
                break;
            case 22:
                C6641o.navigation(getApplicationContext(), OfflineTicketReturnActivity.class);
                break;
            case 23:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.DIAL");
                intent.setData(Uri.parse(getString(AbstractC5959j.offline_refund_number)));
                startActivity(intent);
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("WEB_POST_URL", r4.g.GUIDE_URL);
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle2);
                break;
            case 25:
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("WEB_POST_URL", r4.g.COMMISSION_URL);
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle3);
                break;
            case 26:
                Bundle bundle4 = new Bundle();
                bundle4.putSerializable("WEB_POST_URL", r4.g.BELONGINGS_URL);
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle4);
                break;
            case 27:
                CommonCodeDao.KorailBoss korailBoss = (CommonCodeDao.KorailBoss) q.fromJson(H.getString(getApplicationContext(), "KORAIL_BOSS"), CommonCodeDao.KorailBoss.class);
                if (C6630d.isNotNull(korailBoss) && N.isNotNull(korailBoss.getTerms())) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putSerializable("WEB_POST_URL", z.getWebHost() + korailBoss.getTerms());
                    C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle5);
                    break;
                }
                break;
            case 28:
                C6641o.navigation(getApplicationContext(), TidsSelectStationActivity.class);
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                Bundle bundle6 = new Bundle();
                bundle6.putSerializable("WEB_POST_URL", r4.g.NOTICE_URL);
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle6);
                break;
            case 30:
                onBackFragment();
                T0();
                break;
            case 31:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.DIAL");
                intent2.setData(Uri.parse(getString(AbstractC5959j.navigation_call_center_number)));
                startActivity(intent2);
                break;
            case 32:
                if (!"Y".equals(((CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class)).getCsChatBot())) {
                    C6630d.moveToOutSideBrowser(getApplicationContext(), getString(AbstractC5959j.hearing_impaired_url, I4.h.getInstance().getEncryptHMbCrdNo()));
                    break;
                } else {
                    Intent intent3 = new Intent(getApplicationContext(), (Class<?>) MaumAIV2WebViewActivity.class);
                    intent3.putExtra("kind", 0);
                    startActivity(intent3);
                    break;
                }
            case 33:
                Intent intent4 = new Intent();
                intent4.setAction("android.intent.action.DIAL");
                intent4.setData(Uri.parse(getString(AbstractC5959j.railpolice_call_number)));
                startActivity(intent4);
                break;
            case 34:
                G.playApp(getActivity(), G.getIntentDefault(getActivity(), "com.RLP.railpolice"));
                break;
            case 35:
                CommonCodeDao.Report report = (CommonCodeDao.Report) q.fromJson(H.getString(getApplicationContext(), "REPORT_DATA"), CommonCodeDao.Report.class);
                Bundle bundle7 = new Bundle();
                bundle7.putString("WEB_POST_URL", report.getUrl());
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle7);
                break;
            case 36:
                String string = getString(AbstractC5959j.drawer_menu_rail_delivery_url);
                CommonCodeDao.Data data = (CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class);
                if (data != null && !TextUtils.isEmpty(data.getLotteglogisURL().trim())) {
                    string = data.getLotteglogisURL();
                }
                C6630d.moveToOutSideBrowser(getApplicationContext(), string);
                break;
            case 37:
                CommonCodeDao.Data data2 = (CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class);
                Bundle bundle8 = new Bundle();
                bundle8.putString("WEB_POST_URL", data2.getKnDelivery());
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle8);
                break;
            case 38:
                CommonCodeDao.Data data3 = (CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class);
                Bundle bundle9 = new Bundle();
                bundle9.putString("WEB_POST_URL", data3.getKnParkingLot());
                C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle9);
                break;
            case 39:
                C6641o.navigation(getApplicationContext(), FavoriteSectionsSettingActivity.class);
                break;
            case 40:
                if (!I4.h.getInstance().isLogin()) {
                    I0();
                    break;
                } else {
                    Bundle bundle10 = new Bundle();
                    bundle10.putSerializable("WEB_POST_URL", r4.g.CONVENIENCE_SETTING_URL);
                    C6641o.navigation(getApplicationContext(), IntegrationWebViewActivity.class, bundle10);
                    break;
                }
            case 41:
                StbkData stbkData = new StbkData();
                stbkData.setType(0);
                Bundle bundle11 = new Bundle();
                bundle11.putSerializable("STBK_DATA", stbkData);
                C6641o.navigation(getApplicationContext(), StbkRegisterAccountListActivity.class, bundle11);
                break;
            case 42:
                C6641o.navigation(getApplicationContext(), TossAutoSettingActivity.class);
                break;
            case 43:
                C6641o.navigation(getApplicationContext(), FavoriteCardsSettingActivity.class);
                break;
            case 44:
                C6641o.navigation(getApplicationContext(), VeteransNoSettingActivity.class);
                break;
            case 45:
                C6641o.navigation(getApplicationContext(), PushSettingActivity.class);
                break;
            case 46:
                C6641o.navigation(getApplicationContext(), MultiLanguageActivity.class);
                break;
            case 47:
                C6641o.navigation(getApplicationContext(), VersionActivity.class);
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                I0();
                break;
            case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                S0();
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(View view) {
        onBackFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(CommonCodeDao.MenuBiz menuBiz, View view) {
        C6630d.moveToOutSideBrowser(getApplicationContext(), menuBiz.getLinkUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            C0();
        }
    }

    private void I0() {
        C6641o.moveToLogin(getActivity(), false, false, true);
    }

    private void J0() {
        this.f1029e0.setOnClickListener(this);
        this.f1030f0.setOnClickListener(this);
        this.f1032h0.setOnClickListener(this);
        this.f1033i0.setOnClickListener(this);
        p0(AbstractC5955f.iv_drawer_login).setOnClickListener(this);
        p0(AbstractC5955f.iv_drawer_push).setOnClickListener(this);
        p0(AbstractC5955f.iv_drawer_setting).setOnClickListener(this);
        this.f1034j0.setOnGroupClickListener(this.f1036l0);
        this.f1034j0.setOnChildClickListener(this.f1037m0);
        p0(AbstractC5955f.iv_drawer_close).setOnClickListener(new View.OnClickListener() { // from class: E5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1024a.F0(view);
            }
        });
    }

    private void K0(boolean z8) {
        I4.h.getInstance().setNotificationExist(z8);
        p0(AbstractC5955f.iv_drawer_exist_push).setVisibility(z8 ? 0 : 8);
    }

    private void L0() {
        I4.h hVar = I4.h.getInstance();
        this.f1032h0.setText(hVar.getMemberName());
        this.f1032h0.setTextColor(-16303262);
        this.f1033i0.setVisibility(0);
        this.f1028d0.setVisibility(0);
        boolean z8 = N.isNotNull(hVar.getCustClCd()) && hVar.getCustClCd().equals("A");
        this.f1029e0.setVisibility(z8 ? 0 : 8);
        this.f1030f0.setVisibility(z8 ? 0 : 4);
        this.f1031g0.setImageResource(AbstractC5954e.ico_logout);
        this.f1031g0.setContentDescription(getString(AbstractC5959j.common_logout));
        P0();
    }

    private void M0() {
        if (C6630d.isNotNull(getView())) {
            this.f1032h0.setText(getString(AbstractC5959j.msg_need_login));
            this.f1032h0.setTextColor(getResources().getColor(AbstractC5953d.brownish_grey));
            this.f1029e0.setVisibility(8);
            this.f1030f0.setVisibility(4);
            this.f1028d0.setVisibility(4);
            this.f1033i0.setVisibility(8);
            this.f1031g0.setImageResource(AbstractC5954e.ico_login);
            this.f1031g0.setContentDescription(getString(AbstractC5959j.common_login));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N0() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = n4.AbstractC5955f.v_drawer_notice
            android.view.View r0 = r6.p0(r0)
            int r1 = n4.AbstractC5955f.tv_drawer_notice_message
            android.view.View r1 = r6.p0(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 1
            r1.setSelected(r2)
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.Context r4 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.lang.String r5 = "NOTICE_DATA"
            java.lang.String r4 = z4.H.getString(r4, r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.lang.String r4 = "NOTICE_MESSAGE"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.lang.String r5 = "NOTICE_POST_DATA"
            java.lang.String r3 = r3.optString(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            boolean r5 = z4.N.isNull(r4)
            if (r5 == 0) goto L3b
            int r5 = n4.AbstractC5959j.main_notice_msg
            java.lang.String r5 = r6.getString(r5)
            goto L3c
        L3b:
            r5 = r4
        L3c:
            r1.setText(r5)
            E5.f$c r1 = new E5.f$c
            r1.<init>(r6, r4, r3, r2)
        L44:
            r0.setOnClickListener(r1)
            goto L6f
        L48:
            r3 = move-exception
            goto L70
        L4a:
            r3 = move-exception
            goto L51
        L4c:
            r3 = move-exception
            r4 = r2
            goto L70
        L4f:
            r3 = move-exception
            r4 = r2
        L51:
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L48
            z4.t.e(r3)     // Catch: java.lang.Throwable -> L48
            boolean r3 = z4.N.isNull(r4)
            if (r3 == 0) goto L65
            int r3 = n4.AbstractC5959j.main_notice_msg
            java.lang.String r3 = r6.getString(r3)
            goto L66
        L65:
            r3 = r4
        L66:
            r1.setText(r3)
            E5.f$c r1 = new E5.f$c
            r1.<init>(r6, r4, r2, r2)
            goto L44
        L6f:
            return
        L70:
            boolean r5 = z4.N.isNull(r4)
            if (r5 == 0) goto L7d
            int r5 = n4.AbstractC5959j.main_notice_msg
            java.lang.String r5 = r6.getString(r5)
            goto L7e
        L7d:
            r5 = r4
        L7e:
            r1.setText(r5)
            E5.f$c r1 = new E5.f$c
            r1.<init>(r6, r4, r2, r2)
            r0.setOnClickListener(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.f.N0():void");
    }

    private void O0() {
        View viewP0 = p0(AbstractC5955f.v_drawer_notice2);
        TextView textView = (TextView) p0(AbstractC5955f.tv_drawer_notice2_message);
        textView.setSelected(true);
        final CommonCodeDao.MenuBiz menuBiz = (CommonCodeDao.MenuBiz) q.fromJson(H.getString(getApplicationContext(), "MENU_BIZ"), CommonCodeDao.MenuBiz.class);
        if (C6630d.isNotNull(menuBiz) && "Y".equals(menuBiz.getIsApply())) {
            viewP0.setVisibility(0);
            textView.setText(menuBiz.getTitle());
            viewP0.setOnClickListener(new View.OnClickListener() { // from class: E5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f1025a.G0(menuBiz, view);
                }
            });
        }
    }

    private void P0() {
        SmartAgentInterface smartAgentInterface = I4.g.getInstance().getSmartAgentInterface();
        try {
            boolean z8 = false;
            if (!C6630d.isNotNull(smartAgentInterface) || !C6630d.isNotNull(smartAgentInterface.getAllMsg())) {
                K0(false);
                return;
            }
            Iterator it = ((ArrayList) smartAgentInterface.getAllMsg()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((MSGVo) it.next()).getReadYN().equals("N")) {
                    z8 = true;
                    break;
                }
            }
            K0(z8);
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    private void Q0() throws Throwable {
        N0();
        O0();
        this.f1029e0 = (ImageView) p0(AbstractC5955f.iv_drawer_vvip);
        this.f1030f0 = (ImageView) p0(AbstractC5955f.iv_drawer_crown);
        this.f1032h0 = (TextView) p0(AbstractC5955f.tv_drawer_name);
        this.f1031g0 = (ImageView) p0(AbstractC5955f.iv_drawer_login);
        this.f1028d0 = p0(AbstractC5955f.v_drawer_name_under_line);
        this.f1033i0 = (TextView) p0(AbstractC5955f.tv_drawer_welcome_message);
        this.f1034j0 = (ExpandableListView) p0(AbstractC5955f.elv_drawer);
        B0();
        j jVar = new j(getActivity());
        this.f1035k0 = jVar;
        this.f1034j0.setAdapter(jVar);
    }

    private void R0() {
        C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.drawer_menu_delay_certificate)).setContent(getString(AbstractC5959j.dialog_delay_certificate_content)).showDialog();
    }

    private void S0() throws Resources.NotFoundException {
        Resources resources;
        int i8;
        if (H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN")) {
            resources = getResources();
            i8 = AbstractC5959j.logout_confirm_message_remove_auto;
        } else {
            resources = getResources();
            i8 = AbstractC5959j.logout_confirm_message;
        }
        C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(resources.getString(i8)).setButtonListener(new DialogInterface.OnClickListener() { // from class: E5.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f1027a.H0(dialogInterface, i9);
            }
        }).showDialog();
    }

    private void T0() {
        C6637k.getDialog(1, getActivity(), 1001, 0, getString(AbstractC5959j.drawer_menu_lost_article)).setContent(getString(AbstractC5959j.dialog_lost_article_message)).showDialog();
    }

    public static f newInstance() {
        return new f();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws Throwable {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            Q0();
            J0();
            M0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        t0(view);
        int id = view.getId();
        t.d("id : " + id);
        if (AbstractC5955f.iv_drawer_vvip == id || AbstractC5955f.iv_drawer_crown == id || AbstractC5955f.tv_drawer_name == id || AbstractC5955f.tv_drawer_welcome_message == id || AbstractC5955f.iv_drawer_login == id) {
            if (I4.h.getInstance().isLogin()) {
                S0();
                return;
            } else {
                I0();
                return;
            }
        }
        if (AbstractC5955f.iv_drawer_push == id) {
            C6641o.navigation(getApplicationContext(), PushHistoryActivity.class);
        } else if (AbstractC5955f.iv_drawer_setting == id) {
            C6641o.navigation(getApplicationContext(), SettingActivity.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_drawer, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_logout == iBaseDao.getId()) {
            M0();
        }
    }

    public void updateView() {
        boolean zIsLogin;
        if (C6630d.isNotNull(getActivity())) {
            if (z.isNetworkOn(getActivity())) {
                zIsLogin = I4.h.getInstance().isLogin();
                if (zIsLogin) {
                    L0();
                } else {
                    M0();
                }
            } else {
                M0();
                zIsLogin = false;
            }
            if (C6630d.isNotNull(this.f1035k0)) {
                this.f1035k0.setLogin(zIsLogin);
                this.f1035k0.notifyDataSetChanged();
            }
        }
    }
}
