package F4;

import a6.AsyncTaskC0838b;
import a6.InterfaceC0837a;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.ui.ticket.history.TicketNCardHistoryActivity;
import com.korail.talk.ui.ticket.service.AdditionalServiceActivity;
import com.korail.talk.ui.web.ExtraProductWebViewActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.CTextView;
import java.util.ArrayList;
import java.util.Set;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import p4.C6054a;
import s4.C6219c;
import v4.c;
import z4.C6627a;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class Q {
    public static /* synthetic */ void A0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToDeliveredHistory(bundle.getBoolean("IS_ONE_TICKET"), bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void B0(InterfaceC0837a interfaceC0837a, Bundle bundle, int i8, boolean z8, int i9, View view) {
        int i10 = bundle.getInt("INDEX");
        if (z8) {
            i9 = 0;
        }
        interfaceC0837a.onClickCallCrew(i10, i8, i9);
    }

    public static /* synthetic */ void C0(InterfaceC0837a interfaceC0837a, Bundle bundle, int i8, boolean z8, int i9, View view) {
        int i10 = bundle.getInt("INDEX");
        if (z8) {
            i9 = 0;
        }
        interfaceC0837a.onClickUpdatePlatform(i10, i8, i9);
    }

    public static /* synthetic */ void D0(InterfaceC0837a interfaceC0837a, Bundle bundle, int i8, int i9, View view) {
        interfaceC0837a.moveToSelfCheckinStatus(bundle.getInt("INDEX"), i8, i9);
    }

    public static /* synthetic */ void E0(InterfaceC0837a interfaceC0837a, Bundle bundle, int i8, View view) {
        interfaceC0837a.moveToTrainServiceInfo(bundle.getInt("INDEX"), i8);
    }

    public static /* synthetic */ void G0(InterfaceC0837a interfaceC0837a, Bundle bundle, int i8, View view) {
        interfaceC0837a.moveToTrainServiceInfo(bundle.getInt("INDEX"), i8);
    }

    public static /* synthetic */ void H0(View view, View view2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float width = view.getWidth();
        float f8 = fFloatValue * width;
        view.setTranslationX(f8);
        view2.setTranslationX(f8 - width);
    }

    private static void I0(Context context, View view) {
        TextView textView = (TextView) view.findViewById(AbstractC5955f.noticeTxt);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) O(context, AbstractC5959j.ticket_impossible_move_two_train_warning_1));
        spannableStringBuilder.append((CharSequence) z4.N.applySpannable(O(context, AbstractC5959j.ticket_impossible_move_two_train_warning_2), new ForegroundColorSpan(Color.parseColor("#e23939"))));
        spannableStringBuilder.append((CharSequence) O(context, AbstractC5959j.ticket_impossible_move_two_train_warning_3));
        textView.setText(spannableStringBuilder);
    }

    private static void J0(ViewGroup viewGroup) {
        K0(viewGroup.findViewById(AbstractC5955f.mergeTicketContent0), viewGroup.findViewById(AbstractC5955f.mergeTicketContent1));
    }

    private static void K0(final View view, final View view2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(H0.y.MIN_BACKOFF_MILLIS);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: F4.O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Q.H0(view, view2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    private static String O(Context context, int i8) {
        return z4.I.getString(context, i8);
    }

    private static String P(Context context, int i8, Object... objArr) {
        return z4.I.getString(context, i8, objArr);
    }

    private static boolean Q(Bundle bundle) {
        return z4.N.notNullEqual(bundle.getString("IS_DELAY_ACCEPT"), "Y");
    }

    private static boolean R(Bundle bundle) {
        return bundle.containsKey("DISCOUNT_KIND_CODE") && bundle.containsKey("DISCOUNT_KIND_NAME") && A4.a.isApplyDiscount(bundle.getString("DISCOUNT_KIND_CODE"));
    }

    private static boolean S(String str, String str2, int i8) {
        String strSubstring = str.substring(0, 3);
        if ("16".equals(str2)) {
            if (i8 <= 6) {
                return false;
            }
        } else if ("19".equals(str2)) {
            if (i8 <= 8) {
                return false;
            }
        } else if ("KTX".equals(strSubstring)) {
            if (i8 <= 10) {
                return false;
            }
        } else if ((!"누리로".equals(strSubstring) && !"ITX".equals(strSubstring)) || i8 <= 4) {
            return false;
        }
        return true;
    }

    private static boolean T(int i8) {
        return i8 % 2 == 0;
    }

    public static /* synthetic */ void U(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToDeliveredHistory(bundle.getBoolean("IS_ONE_TICKET"), bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void V(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketReturn(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void W(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToDelayedCertificate(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void X(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToCompanionMileageDetail(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void Y(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketReturn(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void Z(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketSend(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void a0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketReturn(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void b0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketChange(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void c0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketSeatChange(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void d0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToDeviceReset(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void e0(Bundle bundle, Context context, DialogInterface dialogInterface, int i8, boolean z8) {
        if (102 == i8) {
            if (!z8) {
                Activity activity = (Activity) context;
                z4.G.playApp(activity, z4.G.getIntentDefault(activity, "com.RLP.railpolice"));
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("JRNY_LIST_DATA");
            ArrayList parcelableArrayList2 = ((Bundle) parcelableArrayList.get(0)).getParcelableArrayList("SEAT_LIST_DATA");
            String string = ((Bundle) parcelableArrayList.get(0)).getString("TRAIN_NUMBER");
            String string2 = ((Bundle) parcelableArrayList2.get(0)).getString("SRCAR_NO");
            String string3 = ((Bundle) parcelableArrayList2.get(0)).getString("SEAT_NUMBER");
            String strReplace = (bundle.getString("DEPARTURE_DATE") + bundle.getString("DEPARTURE_TIME")).replace(":", "");
            String strReplace2 = (bundle.getString("ARRIVAL_DATE") + bundle.getString("ARRIVAL_TIME")).replace(":", "");
            z4.t.d("h_trn_no : " + string);
            z4.t.d("h_scar_no : " + string2);
            z4.t.d("h_seat_no : " + string3);
            z4.t.d("h_dpt_dt : " + strReplace);
            z4.t.d("h_gff_dt : " + strReplace2);
            z4.t.d("scheme : " + P(context, AbstractC5959j.railpolice_scheme, string, string2, string3, strReplace, strReplace2));
            z4.G.playApp((Activity) context, z4.G.getIntentScheme(P(context, AbstractC5959j.railpolice_scheme, string, string2, string3, strReplace, strReplace2), "com.RLP.railpolice"));
        }
    }

    public static /* synthetic */ void f0(final Context context, final Bundle bundle, View view) {
        C6637k.getCDialog(context, 1051, 0, O(context, AbstractC5959j.dialog_title)).setContent(O(context, AbstractC5959j.dialog_railpolice_content)).setCheckBoxMessage(O(context, AbstractC5959j.dialog_railpolice_checkbox_confirm)).setButtonNames(z4.N.getStringArray(O(context, AbstractC5959j.common_cancel), O(context, AbstractC5959j.common_confirm))).setButtonListener(new C6219c.InterfaceC0421c() { // from class: F4.I
            @Override // s4.C6219c.InterfaceC0421c
            public final void onClick(DialogInterface dialogInterface, int i8, boolean z8) {
                Q.e0(bundle, context, dialogInterface, i8, z8);
            }
        }).showDialog();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void g0(java.lang.String r1, java.lang.String r2, android.content.Context r3, a6.InterfaceC0837a r4, android.os.Bundle r5, android.view.View r6) {
        /*
            java.lang.String r6 = "N"
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L30
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L1b
            int r2 = n4.AbstractC5959j.wheelchair_do_not_station_request_title
            java.lang.String r2 = O(r3, r2)
            int r6 = n4.AbstractC5959j.wheelchair_do_not_station_request_message
            java.lang.String r6 = O(r3, r6)
            goto L32
        L1b:
            java.lang.String r6 = "X"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L30
            int r2 = n4.AbstractC5959j.wheelchair_today_do_not_request_title
            java.lang.String r2 = O(r3, r2)
            int r6 = n4.AbstractC5959j.wheelchair_today_do_not_request_message
            java.lang.String r6 = O(r3, r6)
            goto L32
        L30:
            r2 = 0
            r6 = r2
        L32:
            boolean r0 = z4.N.isNotNull(r6)
            if (r0 == 0) goto L4b
            r1 = 1001(0x3e9, float:1.403E-42)
            r4 = 0
            s4.c r1 = z4.C6637k.getCDialog(r3, r1, r4, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            s4.c r1 = r1.setContent(r2)
            r1.showDialog()
            goto L56
        L4b:
            java.lang.String r2 = "WHCH_SRV_REQ_DATA"
            java.io.Serializable r2 = r5.getSerializable(r2)
            com.korail.talk.data.WheelchairData r2 = (com.korail.talk.data.WheelchairData) r2
            r4.moveToWheelchair(r1, r2)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.Q.g0(java.lang.String, java.lang.String, android.content.Context, a6.a, android.os.Bundle, android.view.View):void");
    }

    public static /* synthetic */ void h0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToGuardianReliefSMS(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void j0(Context context, Bundle bundle, String str, View view) {
        Intent intent = new Intent(context, (Class<?>) ExtraProductWebViewActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("WEB_POST_URL", r4.g.PRODUCT_URL);
        intent.putExtra("WEB_POST_PARAMETER", r4.g.PRODUCT_POST_DATA + bundle.get("TICKET_PNR") + str + "&tkRetNo=" + bundle.getString("RETURN_NO"));
        StringBuilder sb = new StringBuilder();
        sb.append("반환번호 : ");
        sb.append(bundle.getString("RETURN_NO"));
        z4.t.d(sb.toString());
        context.startActivity(intent);
    }

    public static /* synthetic */ void l0(Context context, Bundle bundle, View view) {
        if (I4.h.getInstance().isNonMember()) {
            C6637k.getCDialog(context, 1001, 0, O(context, AbstractC5959j.dialog_title)).setContent(O(context, AbstractC5959j.maas_service_add_non_member)).showDialog();
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AdditionalServiceActivity.class);
        intent.addFlags(268435456);
        Set<String> setKeySet = bundle.keySet();
        StringBuilder sb = new StringBuilder();
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj != null) {
                String string = obj.toString();
                if (!TextUtils.isEmpty(string)) {
                    sb.append(str);
                    sb.append("_-_");
                    intent.putExtra(str, string);
                    z4.t.d("reavelv key = " + str + " values = " + string);
                }
            } else {
                z4.t.d("reavelv key = " + str + " values = " + ((Object) null));
            }
        }
        intent.putExtra("keylist", sb.toString());
        context.startActivity(intent);
    }

    public static /* synthetic */ void m0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToTicketReturn(bundle.getInt("INDEX"));
    }

    public static /* synthetic */ void n0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToReceipt(bundle.getInt("INDEX"), 0);
    }

    public static /* synthetic */ void o0(Context context, Bundle bundle, View view) {
        Intent intent = new Intent(context, (Class<?>) TicketNCardHistoryActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("N_CARD_DISCOUNT_CRD_CODE", bundle.getString("N_CARD_DISCOUNT_CRD_CODE"));
        context.startActivity(intent);
    }

    public static void setBadgeImg(Bundle bundle, ImageView imageView) {
        int i8;
        if (bundle.getBoolean("IS_EMERGENCY")) {
            imageView.setImageResource(AbstractC5954e.ic_emergency);
            imageView.setVisibility(0);
            return;
        }
        switch (bundle.getInt("TICKET_TYPE", -1)) {
            case 20:
                i8 = AbstractC5954e.ic_gift;
                break;
            case 21:
                i8 = AbstractC5954e.ic_refund;
                if ("Y".equals(bundle.getString("TRAIN_RUNNING_STPV_FLG"))) {
                    i8 = AbstractC5954e.ico_finish_stpv;
                    break;
                }
                break;
            case 22:
                i8 = AbstractC5954e.ic_receive_gift;
                break;
            default:
                i8 = -1;
                break;
        }
        if (!bundle.getBoolean("IS_PURCHASE_HISTORY") && i8 == AbstractC5954e.ic_gift) {
            i8 = -1;
        }
        if (i8 != -1) {
            imageView.setImageResource(i8);
        }
        imageView.setVisibility(i8 == -1 ? 8 : 0);
    }

    public static void setBottomView(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, boolean z8, View view, View view2, View view3) {
        if (bundle.getBoolean("IS_EMERGENCY")) {
            view3.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        if (!bundle.getBoolean("IS_PURCHASE_HISTORY", false)) {
            view3.setVisibility(8);
            view.setVisibility(0);
            if (bundle.getBoolean("IS_DELIVERY_ALL")) {
                view.setVisibility(8);
                return;
            }
            if ("22".equals(bundle.getString("TICKET_KIND_CODE"))) {
                View viewFindViewById = view.findViewById(AbstractC5955f.returnBtn);
                viewFindViewById.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_full);
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: F4.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.Y(interfaceC0837a, bundle, view4);
                    }
                });
                viewFindViewById.setEnabled("Y".equals(bundle.getString("RET_PSB_FLG")));
                view.findViewById(AbstractC5955f.deliveryBtn).setVisibility(8);
                view.findViewById(AbstractC5955f.returnBtn).setVisibility(0);
                view.findViewById(AbstractC5955f.changeBtn).setVisibility(8);
                view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(8);
                view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(8);
                return;
            }
            View viewFindViewById2 = view.findViewById(AbstractC5955f.deliveryBtn);
            viewFindViewById2.setEnabled((!"Y".equals(bundle.getString("PBP_ACEP_PSBFLG")) || z8 || bundle.getInt("TICKET_TYPE", -1) == 22 || I4.h.getInstance().isNonMember() || "N".equals(bundle.getString("TRAIN_RUNNING_FLG"))) ? false : true);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: F4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    Q.Z(interfaceC0837a, bundle, view4);
                }
            });
            View viewFindViewById3 = view.findViewById(AbstractC5955f.returnBtn);
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: F4.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    Q.a0(interfaceC0837a, bundle, view4);
                }
            });
            viewFindViewById3.setEnabled("Y".equals(bundle.getString("RET_PSB_FLG")));
            String string = bundle.getString("TRIP_CHG_FLG", "N");
            View viewFindViewById4 = view.findViewById(AbstractC5955f.changeBtn);
            ((CButton) viewFindViewById4).setText(AbstractC5959j.common_tc);
            if (string.equals("Y")) {
                viewFindViewById4.setEnabled(true);
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: F4.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.b0(interfaceC0837a, bundle, view4);
                    }
                });
            } else if (string.equals("S")) {
                viewFindViewById4.setEnabled(true);
                ((CButton) viewFindViewById4).setText(AbstractC5959j.common_seat_change);
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: F4.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.c0(interfaceC0837a, bundle, view4);
                    }
                });
            } else if (string.equals("C")) {
                viewFindViewById4.setEnabled(false);
            } else {
                viewFindViewById4.setEnabled(false);
            }
            view.findViewById(AbstractC5955f.deliveryBtn).setVisibility(0);
            view.findViewById(AbstractC5955f.returnBtn).setVisibility(0);
            view.findViewById(AbstractC5955f.changeBtn).setVisibility(0);
            view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(0);
            view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(0);
            return;
        }
        view3.setVisibility(8);
        ArrayList parcelableArrayList = ((Bundle) bundle.getParcelableArrayList("JRNY_LIST_DATA").get(0)).getParcelableArrayList("SEAT_LIST_DATA");
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i8);
            int i9 = bundle2.getInt("SEAT_TYPE");
            boolean z12 = bundle2.getBoolean("IS_DELIVERED", false);
            boolean z13 = 20 == i9;
            if (!z10) {
                z10 = z12;
            }
            if (!z11) {
                z11 = z13;
            }
            if (!z9) {
                z9 = (21 == i9 || 20 == i9) ? false : true;
            }
        }
        z4.t.e("지연할인증 발급 대상 : " + z9 + " 열차 지연 : " + "Y".equals(bundle.getString("IS_DELAY_TRAIN")));
        if (z9 && "N".equals(bundle.getString("IS_DELAY_TRAIN"))) {
            z9 = false;
        }
        z4.t.e("isDelivered : " + z10 + ", isCanReturn : " + z11 + ", isDelayed : " + z9 + " , companion_flag : " + bundle.getString("COMPANION_MILEAGE_FLG"));
        if (z10 || z9) {
            if (z10) {
                Button button = (Button) view.findViewById(AbstractC5955f.deliveryBtn);
                button.setText(AbstractC5959j.common_delivered);
                button.setOnClickListener(new View.OnClickListener() { // from class: F4.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.U(interfaceC0837a, bundle, view4);
                    }
                });
                button.setEnabled(z10);
                Button button2 = (Button) view.findViewById(AbstractC5955f.changeBtn);
                button2.setText(AbstractC5959j.common_ticket_return);
                button2.setOnClickListener(new View.OnClickListener() { // from class: F4.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.V(interfaceC0837a, bundle, view4);
                    }
                });
                button2.setEnabled(z11);
                view.findViewById(AbstractC5955f.deliveryBtn).setVisibility(0);
                view.findViewById(AbstractC5955f.changeBtn).setVisibility(0);
                view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(0);
            } else {
                view.findViewById(AbstractC5955f.deliveryBtn).setVisibility(8);
                view.findViewById(AbstractC5955f.changeBtn).setVisibility(8);
                view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(8);
            }
            if (z9) {
                Button button3 = (Button) view.findViewById(AbstractC5955f.returnBtn);
                button3.setText(O(context, AbstractC5959j.delay_cerfiticate_print));
                button3.setOnClickListener(new View.OnClickListener() { // from class: F4.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Q.W(interfaceC0837a, bundle, view4);
                    }
                });
                if (z10) {
                    button3.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_middle);
                    view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(0);
                } else {
                    button3.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_full);
                    view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(8);
                }
                view.findViewById(AbstractC5955f.returnBtn).setVisibility(0);
            } else {
                view.findViewById(AbstractC5955f.returnBtn).setVisibility(8);
                view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(8);
            }
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (!z4.N.isNotNull(bundle.getString("COMPANION_MILEAGE_FLG"))) {
            view2.setVisibility(8);
            return;
        }
        view2.setVisibility(0);
        Button button4 = (Button) view2.findViewById(AbstractC5955f.btn_bottomView2);
        button4.setText(O(context, AbstractC5959j.title_accumulating_ktx_mileage_detail));
        button4.setOnClickListener(new View.OnClickListener() { // from class: F4.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                Q.X(interfaceC0837a, bundle, view4);
            }
        });
    }

    public static void setCurrentDate(Bundle bundle, TextClock textClock) {
        if (bundle.getBoolean("IS_EMERGENCY", false) || bundle.getBoolean("IS_PURCHASE_HISTORY", false) || bundle.getBoolean("IS_DELIVERY_ALL")) {
            textClock.setVisibility(8);
        } else {
            textClock.setVisibility(0);
            textClock.setBackgroundColor(Color.parseColor(bundle.getString("CURRENT_TIME_BACKGROUND")));
        }
    }

    public static void setDim(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, RelativeLayout relativeLayout) {
        if (bundle.getBoolean("IS_PURCHASE_HISTORY", false)) {
            z4.t.d("IS_PURCHASE_HISTORY");
            return;
        }
        if (!C6054a.IS_TICKET_DIM || ((!bundle.containsKey("DVC_INFO_SMNS_FLG") || !bundle.getString("DVC_INFO_SMNS_FLG", "Y").equals("N")) && ((!bundle.containsKey("CMTR_VLID_FLG") || !bundle.getString("CMTR_VLID_FLG", "Y").equals("N")) && (!bundle.containsKey("TRAIN_RUNNING_FLG") || !bundle.getString("TRAIN_RUNNING_FLG", "Y").equals("N"))))) {
            relativeLayout.setVisibility(8);
            return;
        }
        relativeLayout.setVisibility(0);
        CTextView cTextView = (CTextView) relativeLayout.findViewById(AbstractC5955f.tv_dim);
        CButton cButton = (CButton) relativeLayout.findViewById(AbstractC5955f.btn_dim);
        cButton.setOnClickListener(new View.OnClickListener() { // from class: F4.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.d0(interfaceC0837a, bundle, view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (bundle.getString("DVC_INFO_SMNS_FLG", "Y").equals("N")) {
            cTextView.setText(z4.N.applySpannable(O(context, AbstractC5959j.ticket_another_issue), new AbsoluteSizeSpan(z4.N.dpToPx(16.0f))));
            cTextView.setTextColor(-65794);
            int i8 = bundle.getInt("TICKET_KIND", 0);
            if (bundle.getBoolean("IS_EMERGENCY")) {
                relativeLayout.setVisibility(8);
                layoutParams.addRule(8, AbstractC5955f.unavailableTxt);
            } else if (i8 == 3 || i8 == 4 || i8 == 5 || i8 == 8) {
                layoutParams.addRule(8, AbstractC5955f.v_bottom);
            } else if ((!C6054a.IS_LIMOUSINE_TEST && i8 == 7) || i8 == -7) {
                layoutParams.addRule(8, AbstractC5955f.btn_return);
            } else if ("90".equals(bundle.getString("TICKET_KIND_CODE")) || "93".equals(bundle.getString("TICKET_KIND_CODE")) || "92".equals(bundle.getString("TICKET_KIND_CODE"))) {
                cTextView.setText(z4.N.applySpannable(O(context, AbstractC5959j.ticket_home_issue), new AbsoluteSizeSpan(z4.N.dpToPx(16.0f))));
                cTextView.setTextColor(-65794);
                cButton.setVisibility(8);
                layoutParams.addRule(8, AbstractC5955f.bottomBtnView);
            } else {
                layoutParams.addRule(8, AbstractC5955f.bottomBtnView);
                z4.t.d("일반뷰");
            }
        } else if (bundle.containsKey("TRAIN_RUNNING_FLG") && bundle.getString("TRAIN_RUNNING_FLG", "Y").equals("N")) {
            cTextView.setText(z4.N.applySpannable(O(context, AbstractC5959j.ticket_train_running), new AbsoluteSizeSpan(z4.N.dpToPx(25.0f))));
            cTextView.setTextColor(-52172);
            cButton.setVisibility(8);
            layoutParams.addRule(8, AbstractC5955f.f34260v);
        } else if (bundle.getString("CMTR_VLID_FLG", "Y").equals("N")) {
            cTextView.setText(z4.N.applySpannable(O(context, AbstractC5959j.ticket_arrival_issue), new AbsoluteSizeSpan(z4.N.dpToPx(16.0f))));
            cTextView.setTextColor(-65794);
            cButton.setVisibility(8);
            layoutParams.addRule(8, AbstractC5955f.f34260v);
        }
        relativeLayout.setLayoutParams(layoutParams);
    }

    public static void setEasyFunction(final Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, ViewGroup viewGroup, final View view, final View view2) {
        if (bundle.getBoolean("IS_PURCHASE_HISTORY") || bundle.getBoolean("IS_EMERGENCY") || bundle.getBoolean("IS_DELIVERY_ALL")) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) z4.q.fromJson(z4.H.getString(context, "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
        ImageView imageView = (ImageView) viewGroup.findViewById(AbstractC5955f.iv_easy_function_railpolice);
        imageView.setContentDescription(O(context, AbstractC5959j.drawer_menu_category_railpolice));
        if ("N".equals(viewVisibility.getCrmNty())) {
            imageView.setEnabled(false);
            imageView.setImageResource(AbstractC5954e.ic_siren_d);
        } else {
            imageView.setEnabled(true);
            imageView.setImageResource(AbstractC5954e.ic_siren_n);
        }
        C6627a.addClickEvent(imageView, O(context, AbstractC5959j.open_new_window));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Q.f0(context, bundle, view3);
            }
        });
        ImageView imageView2 = (ImageView) viewGroup.findViewById(AbstractC5955f.iv_easy_function_help);
        imageView2.setContentDescription(O(context, AbstractC5959j.title_wheelchair_request));
        String wheelchair = viewVisibility.getWheelchair();
        String string = bundle.getString("IS_WHCH_TICKET", "N");
        final String string2 = bundle.getString("WHCH_SRV_REQ_PSB_FLG", "N");
        final String string3 = bundle.getString("WHCH_SRV_RCP_FLG", "N");
        if ("N".equals(wheelchair) || "N".equals(string) || I4.h.getInstance().isNonMember()) {
            imageView2.setEnabled(false);
            imageView2.setImageResource(AbstractC5954e.ic_help_d);
        } else {
            imageView2.setEnabled(true);
            if ("Y".equals(string3)) {
                imageView2.setImageResource(AbstractC5954e.ic_help_c);
            } else {
                imageView2.setImageResource(AbstractC5954e.ic_help_n);
            }
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: F4.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Q.g0(string3, string2, context, interfaceC0837a, bundle, view3);
                }
            });
        }
        ImageView imageView3 = (ImageView) viewGroup.findViewById(AbstractC5955f.iv_easy_function_sms);
        imageView3.setContentDescription(O(context, AbstractC5959j.guardian_relief_sms_title));
        String string4 = bundle.getString("GUARDIAN_RELIEF_SMS");
        if ("H".equals(string4)) {
            imageView3.setVisibility(4);
        } else {
            imageView3.setVisibility(0);
            imageView3.setEnabled("Y".equals(string4));
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: F4.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Q.h0(interfaceC0837a, bundle, view3);
            }
        });
        ImageView imageView4 = (ImageView) viewGroup.findViewById(AbstractC5955f.iv_easy_function_share);
        imageView4.setContentDescription(O(context, AbstractC5959j.dialog_share_schedule));
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: F4.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                interfaceC0837a.ticketShareInfo(view, view2, bundle);
            }
        });
    }

    public static void setExtraInfo(final Context context, final Bundle bundle, View view) {
        if (!bundle.getBoolean("IS_EMERGENCY")) {
            bundle.getBoolean("IS_PURCHASE_HISTORY");
        }
        view.setVisibility(8);
        final String str = "&routeFlag=M";
        view.setOnClickListener(new View.OnClickListener() { // from class: F4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Q.j0(context, bundle, str, view2);
            }
        });
    }

    public static void setExtraProduct(final Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, View view) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("PRODUCT_LIST_DATA");
        boolean z8 = false;
        view.findViewById(AbstractC5955f.v_buy_extra_product).setVisibility(0);
        view.setVisibility(0);
        int size = C6630d.isNotNull(parcelableArrayList) ? parcelableArrayList.size() : 0;
        Button button = (Button) view.findViewById(AbstractC5955f.extra_product_btn_order_add);
        Button button2 = (Button) view.findViewById(AbstractC5955f.extra_product_btn_order_detail);
        z4.t.d("totalCount : " + size);
        if (size > 0) {
            button.setText(O(context, AbstractC5959j.common_add));
            button2.setVisibility(0);
            button2.setText(O(context, AbstractC5959j.extra_product_order_detail) + "(" + size + ")");
        } else {
            button.setText(O(context, AbstractC5959j.maas_service_add));
            button2.setVisibility(8);
        }
        if (!bundle.getBoolean("IS_EMERGENCY", false) && !bundle.getBoolean("IS_PURCHASE_HISTORY")) {
            z8 = true;
        }
        button.setEnabled(z8);
        button2.setEnabled(!bundle.getBoolean("IS_EMERGENCY"));
        button.setOnClickListener(new View.OnClickListener() { // from class: F4.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Q.l0(context, bundle, view2);
            }
        });
        button2.setOnClickListener(new v4.c(new c.a() { // from class: F4.d
            @Override // v4.c.a
            public final void onCustomClick(View view2, int i8) {
                interfaceC0837a.moveToProductList(i8);
            }
        }, bundle.getInt("INDEX")));
    }

    public static void setLimousineBottom(final InterfaceC0837a interfaceC0837a, final Bundle bundle, View view, View view2) {
        if (bundle.getBoolean("IS_EMERGENCY", false)) {
            view2.setVisibility(0);
            view.setVisibility(8);
        } else if (bundle.getBoolean("IS_PURCHASE_HISTORY", false)) {
            view2.setVisibility(8);
            view.setVisibility(8);
        } else {
            view2.setVisibility(8);
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: F4.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Q.m0(interfaceC0837a, bundle, view3);
                }
            });
        }
    }

    public static void setLimousineQRCode(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, ImageView imageView) {
        new AsyncTaskC0838b(context, ((Bundle) ((Bundle) bundle.getParcelableArrayList("JRNY_LIST_DATA").get(0)).getParcelableArrayList("SEAT_LIST_DATA").get(0)).getString(j4.r.QR_CODE), imageView).execute(new Void[0]);
        if (bundle.getBoolean("IS_EMERGENCY") || bundle.getBoolean("IS_DELIVERY_ALL")) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.n0(interfaceC0837a, bundle, view);
            }
        });
    }

    public static void setMergeTrain(Context context, Bundle bundle, View view, ViewGroup viewGroup) throws NumberFormatException {
        String str;
        String str2;
        Bundle bundle2;
        String str3;
        String str4;
        String str5;
        if (bundle.getBoolean("IS_PURCHASE_HISTORY", false)) {
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("JRNY_LIST_DATA");
        Bundle bundle3 = (Bundle) parcelableArrayList.get(0);
        Bundle bundle4 = (Bundle) bundle3.getParcelableArrayList("SEAT_LIST_DATA").get(0);
        String string = bundle.getString("MERGE_CODE");
        String string2 = bundle.getString("MERGE_NUMBER");
        String strSubstring = bundle3.getString("TRAIN_NAME").substring(0, 3);
        String string3 = bundle3.getString("TRAIN_CLSF_CODE");
        String string4 = bundle3.getString("TRAIN_IS_ITX_SIXED");
        z4.t.d("h_dvd_anx_dv_cd(복합) : " + string + ", h_ddck_scar_no(중련) : " + string2 + ", trainName : " + bundle3.getString("TRAIN_NAME") + ", trainClsfCode : " + bundle3.getString("TRAIN_CLSF_CODE"));
        if ("1".equals(string) || "2".equals(string) || ("".equals(string) && z4.N.getInteger(string2) > 0)) {
            int i8 = Integer.parseInt(bundle4.getString("SRCAR_NO"));
            int i9 = Integer.parseInt(bundle3.getString("TRAIN_NUMBER"));
            str = "";
            view.findViewById(AbstractC5955f.noticeLayout).setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(AbstractC5955f.mergeTrainView);
            I0(context, view);
            J0(viewGroup);
            "KTX".equals(strSubstring);
            str2 = "TRAIN_NUMBER";
            boolean zS = S(bundle3.getString("TRAIN_NAME").substring(0, 6), string3, i8);
            bundle2 = bundle3;
            str3 = "TRAIN_NAME";
            str4 = "SRCAR_NO";
            str5 = "SEAT_LIST_DATA";
            if (T(i9)) {
                if (zS) {
                    if ("07".equals(string3) || "10".equals(string3)) {
                        imageView.setImageResource(AbstractC5954e.merge_train_traveling_11_18);
                    } else if ("16".equals(string3)) {
                        imageView.setImageResource(AbstractC5954e.merge_train_traveling_7_12);
                    } else if ("19".equals(string3)) {
                        imageView.setImageResource(AbstractC5954e.merge_train_emu320_traveling_9_16);
                    } else if ("04".equals(string3) || "18".equals(string3)) {
                        if (string4 == null || !string4.equals("Y")) {
                            imageView.setImageResource(AbstractC5954e.merge_train_traveling_5_8);
                        } else {
                            imageView.setImageResource(AbstractC5954e.merge_train_traveling_itx_7_12);
                        }
                    }
                } else if ("07".equals(string3) || "10".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_traveling_1_8);
                } else if ("16".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_traveling_1_6);
                } else if ("19".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_emu320_traveling_1_8);
                } else if ("04".equals(string3) || "18".equals(string3)) {
                    if (string4 == null || !string4.equals("Y")) {
                        imageView.setImageResource(AbstractC5954e.merge_train_traveling_1_4);
                    } else {
                        imageView.setImageResource(AbstractC5954e.merge_train_traveling_itx_1_6);
                    }
                }
            } else if (zS) {
                if ("07".equals(string3) || "10".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_backing_11_18);
                } else if ("16".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_backing_7_12);
                } else if ("19".equals(string3)) {
                    imageView.setImageResource(AbstractC5954e.merge_train_emu320_backing_9_16);
                } else if ("04".equals(string3) || "18".equals(string3)) {
                    if (string4 == null || !string4.equals("Y")) {
                        imageView.setImageResource(AbstractC5954e.merge_train_backing_5_8);
                    } else {
                        imageView.setImageResource(AbstractC5954e.merge_train_backing_itx_7_12);
                    }
                }
            } else if ("07".equals(string3) || "10".equals(string3)) {
                imageView.setImageResource(AbstractC5954e.merge_train_backing_1_8);
            } else if ("16".equals(string3)) {
                imageView.setImageResource(AbstractC5954e.merge_train_backing_1_6);
            } else if ("19".equals(string3)) {
                imageView.setImageResource(AbstractC5954e.merge_train_emu320_backing_1_8);
            } else if ("04".equals(string3) || "18".equals(string3)) {
                if (string4 == null || !string4.equals("Y")) {
                    imageView.setImageResource(AbstractC5954e.merge_train_backing_1_4);
                } else {
                    imageView.setImageResource(AbstractC5954e.merge_train_backing_itx_1_6);
                }
            }
        } else {
            view.findViewById(AbstractC5955f.noticeLayout).setVisibility(8);
            str = "";
            bundle2 = bundle3;
            str5 = "SEAT_LIST_DATA";
            str3 = "TRAIN_NAME";
            str4 = "SRCAR_NO";
            str2 = "TRAIN_NUMBER";
        }
        String string5 = bundle.getString("TRANSFER_ARRIVAL_STATION_NAME");
        z4.t.d("transferArrivalStationName : " + string5);
        if (string5 != null && !string5.isEmpty()) {
            view.findViewById(AbstractC5955f.merge_ticket_layout).setVisibility(0);
            view.findViewById(AbstractC5955f.v_transfer).setVisibility(0);
            view.findViewById(AbstractC5955f.iv_station_divider2).setVisibility(0);
            view.findViewById(AbstractC5955f.transferTxt1).setVisibility(8);
            ((CTextView) view.findViewById(AbstractC5955f.transferTxt0)).setText(string5);
            String string6 = bundle4.getString("SEAT_NUMBER");
            ArrayList parcelableArrayList2 = parcelableArrayList.size() >= 2 ? ((Bundle) parcelableArrayList.get(1)).getParcelableArrayList(str5) : null;
            String string7 = parcelableArrayList2 != null ? ((Bundle) parcelableArrayList2.get(0)).getString("SEAT_NUMBER") : str;
            if (!string6.equals(g5.e.STATE_NAME_STANDING) && !string7.equals(g5.e.STATE_NAME_STANDING)) {
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_first_text)).setText("좌석");
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_second_text)).setText("좌석");
            } else if (!string6.equals(g5.e.STATE_NAME_STANDING) && string7.equals(g5.e.STATE_NAME_STANDING)) {
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_first_text)).setText("좌석");
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_second_text)).setText(g5.e.STATE_NAME_STANDING);
            } else if (string6.equals(g5.e.STATE_NAME_STANDING) && !string7.equals(g5.e.STATE_NAME_STANDING)) {
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_first_text)).setText(g5.e.STATE_NAME_STANDING);
                ((TextView) view.findViewById(AbstractC5955f.merge_ticket_second_text)).setText("좌석");
            }
            String string8 = bundle.getString("TRANSFER_DEPARTURE_TIME");
            bundle.getString("DEPARTURE_TIME");
            bundle.getString("ARRIVAL_TIME");
            view.findViewById(AbstractC5955f.transferTimeLayout).setVisibility(0);
            view.findViewById(AbstractC5955f.dotLine0).setVisibility(4);
            TextView textView = (TextView) view.findViewById(AbstractC5955f.transferTimeTxt0);
            textView.setVisibility(0);
            textView.setText(string8);
        }
        View viewFindViewById = view.findViewById(AbstractC5955f.merge_train_destination_layout);
        CTextView cTextView = (CTextView) view.findViewById(AbstractC5955f.merge_front_train_text);
        CTextView cTextView2 = (CTextView) view.findViewById(AbstractC5955f.merge_second_train_text);
        String string9 = bundle.getString("ARRIVAL_MYTRAIN_INTERVAL_STATION");
        String string10 = bundle.getString("ARRIVAL_SUBTRAIN_INTERVAL_STATION");
        if (string9 != null && string10 != null && !string9.isEmpty() && !string10.isEmpty()) {
            viewFindViewById.setVisibility(0);
            int i10 = Integer.parseInt(bundle4.getString(str4));
            Bundle bundle5 = bundle2;
            boolean zS2 = S(bundle5.getString(str3).substring(0, 6), string3, i10);
            if (!T(Integer.parseInt(bundle5.getString(str2)))) {
                zS2 = !zS2;
            }
            if (zS2) {
                cTextView.setText("(" + string9 + ")");
                cTextView2.setText("(" + string10 + ")");
            } else {
                cTextView.setText("(" + string10 + ")");
                cTextView2.setText("(" + string9 + ")");
            }
        } else if (C6054a.IS_DEBUG_LOG) {
            viewFindViewById.setVisibility(0);
            cTextView.setText("선행 열차");
            cTextView2.setText("후행 열차");
        }
        z4.t.d("firStation : " + string9 + ", subStation : " + string10);
    }

    public static void setSample(View view) {
        view.setVisibility(r4.g.SERVER_TYPE == K4.a.REAL ? 8 : 0);
    }

    public static void setSpecialBottomView(final Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, View view, View view2) {
        boolean zEquals = "81".equals(bundle.getString("TICKET_KIND_CODE"));
        boolean z8 = 10 == bundle.getInt("TICKET_KIND");
        Button button = (Button) view.findViewById(AbstractC5955f.btn_bottom_special_1);
        Button button2 = (Button) view.findViewById(AbstractC5955f.btn_bottom_special_2);
        Button button3 = (Button) view.findViewById(AbstractC5955f.btn_bottom_special_3);
        if (bundle.getBoolean("IS_EMERGENCY")) {
            view2.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        if (bundle.getBoolean("IS_PURCHASE_HISTORY")) {
            view2.setVisibility(8);
            if (!zEquals) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            button.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_full);
            button.setText(O(context, AbstractC5959j.title_n_card_history));
            button.setOnClickListener(new View.OnClickListener() { // from class: F4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Q.o0(context, bundle, view3);
                }
            });
            button2.setVisibility(8);
            view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(8);
            view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(8);
            button3.setVisibility(8);
            return;
        }
        view2.setVisibility(8);
        view.setVisibility(0);
        if (zEquals) {
            boolean z9 = bundle.getBoolean("N_CARD_PERIOD_EXTENSION_FLG");
            boolean z10 = bundle.getBoolean("N_CARD_SECOND_USER_FLG");
            button.setEnabled(z9);
            button.setText(O(context, AbstractC5959j.common_period_extension));
            button.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_left);
            button.setOnClickListener(new v4.c(new c.a() { // from class: F4.f
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.nCardExtension(i8);
                }
            }, bundle.getInt("INDEX")));
            button.setVisibility(0);
            view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(0);
            button2.setEnabled(!z10 && "Y".equals(bundle.getString("RET_PSB_FLG")));
            button2.setText(O(context, AbstractC5959j.common_ticket_return));
            button2.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_middle);
            button2.setOnClickListener(new v4.c(new c.a() { // from class: F4.g
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.moveToTicketReturn(i8);
                }
            }, bundle.getInt("INDEX")));
            button2.setVisibility(0);
            view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(0);
            button3.setText(AbstractC5959j.title_normal_booking);
            button3.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_right);
            button3.setOnClickListener(new v4.c(new c.a() { // from class: F4.h
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.moveToSeatAssignBooking(i8, "0");
                }
            }, bundle.getInt("INDEX")));
            button3.setVisibility(0);
            return;
        }
        if (z8) {
            boolean z11 = bundle.getBoolean("SEAT_APP_PSB_FLG");
            boolean z12 = bundle.getBoolean("STND_APP_PSB_FLG");
            button.setText(O(context, AbstractC5959j.common_ticket_return));
            button.setBackgroundResource((z11 || z12) ? AbstractC5954e.selector_btn_ticket_list_item_bottom_left : AbstractC5954e.selector_btn_ticket_list_item_bottom_full);
            button.setOnClickListener(new v4.c(new c.a() { // from class: F4.i
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.moveToTicketReturn(i8);
                }
            }, bundle.getInt("INDEX")));
            button.setVisibility(0);
            button.setEnabled("Y".equals(bundle.getString("RET_PSB_FLG")));
            view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(z11 ? 0 : 8);
            if (z11) {
                button2.setText(AbstractC5959j.common_seat_assign);
                button2.setBackgroundResource(z12 ? AbstractC5954e.selector_btn_ticket_list_item_bottom_middle : AbstractC5954e.selector_btn_ticket_list_item_bottom_right);
                button2.setOnClickListener(new v4.c(new c.a() { // from class: F4.j
                    @Override // v4.c.a
                    public final void onCustomClick(View view3, int i8) {
                        interfaceC0837a.moveToSeatAssignBooking(i8, "0");
                    }
                }, bundle.getInt("INDEX")));
                button2.setVisibility(0);
            } else {
                button2.setVisibility(8);
            }
            view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(z12 ? 0 : 8);
            if (!z12) {
                button3.setVisibility(8);
                return;
            }
            button3.setText(AbstractC5959j.common_stnd_free);
            button3.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_right);
            button3.setOnClickListener(new v4.c(new c.a() { // from class: F4.k
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.moveToSeatAssignBooking(i8, "1");
                }
            }, bundle.getInt("INDEX")));
            button3.setVisibility(0);
            return;
        }
        boolean z13 = bundle.getBoolean("SEAT_APP_PSB_FLG");
        boolean z14 = bundle.getBoolean("STND_APP_PSB_FLG");
        button.setText(O(context, AbstractC5959j.common_ticket_return));
        button.setBackgroundResource((z13 || z14) ? AbstractC5954e.selector_btn_ticket_list_item_bottom_left : AbstractC5954e.selector_btn_ticket_list_item_bottom_full);
        button.setOnClickListener(new v4.c(new c.a() { // from class: F4.l
            @Override // v4.c.a
            public final void onCustomClick(View view3, int i8) {
                interfaceC0837a.moveToTicketReturn(i8);
            }
        }, bundle.getInt("INDEX")));
        button.setVisibility(0);
        button.setEnabled("Y".equals(bundle.getString("RET_PSB_FLG")));
        view.findViewById(AbstractC5955f.bottomBtnDivider0).setVisibility(z13 ? 0 : 8);
        if (z13) {
            button2.setText(AbstractC5959j.common_seat_assign);
            button2.setBackgroundResource(z14 ? AbstractC5954e.selector_btn_ticket_list_item_bottom_middle : AbstractC5954e.selector_btn_ticket_list_item_bottom_right);
            button2.setOnClickListener(new v4.c(new c.a() { // from class: F4.m
                @Override // v4.c.a
                public final void onCustomClick(View view3, int i8) {
                    interfaceC0837a.moveToSeatAssignBooking(i8, "0");
                }
            }, bundle.getInt("INDEX")));
            button2.setVisibility(0);
        } else {
            button2.setVisibility(8);
        }
        view.findViewById(AbstractC5955f.bottomBtnDivider1).setVisibility(z14 ? 0 : 8);
        if (!z14) {
            button3.setVisibility(8);
            return;
        }
        button3.setText(AbstractC5959j.common_stnd_free);
        button3.setBackgroundResource(AbstractC5954e.selector_btn_ticket_list_item_bottom_right);
        button3.setOnClickListener(new v4.c(new c.a() { // from class: F4.o
            @Override // v4.c.a
            public final void onCustomClick(View view3, int i8) {
                interfaceC0837a.moveToSeatAssignBooking(i8, "1");
            }
        }, bundle.getInt("INDEX")));
        button3.setVisibility(0);
    }

    public static void setSpecialQRCode(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle, ImageView imageView) {
        AsyncTaskC0838b asyncTaskC0838b = new AsyncTaskC0838b(context, bundle.getString(j4.r.QR_CODE), imageView);
        if (10 == bundle.getInt("TICKET_KIND")) {
            asyncTaskC0838b.setColors(-6797783, -1971213);
        }
        asyncTaskC0838b.execute(new Void[0]);
        if (bundle.getBoolean("IS_EMERGENCY") || bundle.getBoolean("N_CARD_SECOND_USER_FLG")) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.y0(interfaceC0837a, bundle, view);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0789  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setTrainInfo(android.content.Context r24, final a6.InterfaceC0837a r25, final android.os.Bundle r26, android.os.Bundle r27, final int r28, final int r29, android.view.View r30) {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.Q.setTrainInfo(android.content.Context, a6.a, android.os.Bundle, android.os.Bundle, int, int, android.view.View):void");
    }

    public static void setTrainServiceInfo(final InterfaceC0837a interfaceC0837a, final Bundle bundle, final int i8, View view, View view2) {
        Bundle bundle2 = (Bundle) bundle.getParcelableArrayList("JRNY_LIST_DATA").get(i8);
        final String string = bundle2.getString("TRAIN_FACILITY");
        final String string2 = bundle2.getString("TRAIN_FACILITY_VR");
        if (bundle.getBoolean("IS_EMERGENCY") || bundle.getBoolean("IS_PURCHASE_HISTORY")) {
            view.setVisibility(4);
            view2.setVisibility(4);
        } else if (C6630d.isNull(string)) {
            view.setVisibility(4);
            view2.setVisibility(0);
            view2.setOnClickListener(new View.OnClickListener() { // from class: F4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Q.E0(interfaceC0837a, bundle, i8, view3);
                }
            });
        } else {
            view.setVisibility(0);
            view2.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: F4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    interfaceC0837a.moveToTrainFacility(string, string2);
                }
            });
            view2.setOnClickListener(new View.OnClickListener() { // from class: F4.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Q.G0(interfaceC0837a, bundle, i8, view3);
                }
            });
        }
    }

    public static /* synthetic */ void y0(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToReceipt(bundle.getInt("INDEX"), 0);
    }

    public static /* synthetic */ void z0(Bundle bundle, InterfaceC0837a interfaceC0837a, int i8, View view) {
        boolean z8 = bundle.getBoolean("IS_ONE_TICKET");
        int i9 = bundle.getInt("INDEX");
        if (z8) {
            i8 = 0;
        }
        interfaceC0837a.moveToReceipt(i9, i8);
    }
}
