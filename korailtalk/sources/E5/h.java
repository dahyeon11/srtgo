package E5;

import n4.AbstractC5959j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MEMBER_INFORMATION' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class h {
    public static final h ACCUMULATING_KTX_MILEAGE;
    public static final h BASKET_TICKET;
    public static final h COMMUTATION_PASS;
    public static final h COMPENSATION;
    public static final h CONVENIENCE_SETTING;
    public static final h CUSTOMER_CALL;
    public static final h DELAY_ACCOUNT_REFUND;
    public static final h DELAY_CERTIFICATE;
    public static final h FAVORITE_CARDS;
    public static final h FAVORITE_ROUTES;
    public static final h GIFTICKET_HISTORY;
    public static final h HEARING_IMPAIRED;
    public static final h KTX_DELIVERY;
    public static final h KTX_PARKING;
    public static final h LIMOUSINE_BOOKING;
    public static final h LOGIN;
    public static final h LOGOUT;
    public static final h LOST_ARTICLE;
    public static final h MEMBERSHIP_CARD;
    public static final h MEMBER_DROP;
    public static final h MEMBER_INFORMATION;
    public static final h MILEAGE_INQUIRY;
    public static final h MOBILE_FAX;
    public static final h MULTI_LANGUAGE;
    public static final h MY_TICKETS;
    public static final h NOTICE_BOARD;
    public static final h NOTIFICATION_SETTING;
    public static final h OFFLINE_REFUND;
    public static final h OFFLINE_REFUND_CALL;
    public static final h RAILPOLICE;
    public static final h RAILPOLICE_CALL;
    public static final h RAILREPORT;
    public static final h RAIL_DELIVERY;
    public static final h RAIL_POINT;
    public static final h RESERVED_LIST;
    public static final h SIMPLE_CASH_PAYMENT;
    public static final h TICKET_HISTORY;
    public static final h TICKET_REFUND;
    public static final h TICKET_RESERVATION;
    public static final h TOSSPAY_AUTO;
    public static final h TRAVEL_BOOKING;
    public static final h TRIP_QR_AUTH;
    public static final h USE_GUIDE_CARRYING_ITEMS;
    public static final h USE_GUIDE_FAQ;
    public static final h USE_GUIDE_PASSENGER_TRANSPORT_TERMS_AND_CONDITIONS;
    public static final h USE_GUIDE_TICKET_REFUND_PENALTY;
    public static final h USE_GUIDE_TIDS;
    public static final h VERSION_INFO;
    public static final h VETERAN_WELFARE_NO;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f1046c;

    /* renamed from: a, reason: collision with root package name */
    private final int f1047a;

    /* renamed from: b, reason: collision with root package name */
    private final g f1048b;

    static {
        g gVar = g.MY_PAGE;
        MEMBER_INFORMATION = new h("MEMBER_INFORMATION", 0, gVar, AbstractC5959j.drawer_menu_member_information);
        BASKET_TICKET = new h("BASKET_TICKET", 1, gVar, AbstractC5959j.drawer_menu_basket_ticket);
        MY_TICKETS = new h("MY_TICKETS", 2, gVar, AbstractC5959j.drawer_menu_my_tickets);
        TICKET_HISTORY = new h("TICKET_HISTORY", 3, gVar, AbstractC5959j.drawer_menu_ticket_history);
        MILEAGE_INQUIRY = new h("MILEAGE_INQUIRY", 4, gVar, AbstractC5959j.drawer_menu_mileage);
        GIFTICKET_HISTORY = new h("GIFTICKET_HISTORY", 5, gVar, AbstractC5959j.drawer_menu_gifticket_history);
        ACCUMULATING_KTX_MILEAGE = new h("ACCUMULATING_KTX_MILEAGE", 6, gVar, AbstractC5959j.drawer_menu_accumulating_ktx_mileage);
        NOTIFICATION_SETTING = new h("NOTIFICATION_SETTING", 7, gVar, AbstractC5959j.title_notification_setting);
        MEMBERSHIP_CARD = new h("MEMBERSHIP_CARD", 8, gVar, AbstractC5959j.drawer_menu_membership_card);
        COMPENSATION = new h("COMPENSATION", 9, gVar, AbstractC5959j.drawer_menu_compensation);
        DELAY_ACCOUNT_REFUND = new h("DELAY_ACCOUNT_REFUND", 10, gVar, AbstractC5959j.drawer_delay_account_refund);
        TRIP_QR_AUTH = new h("TRIP_QR_AUTH", 11, gVar, AbstractC5959j.drawer_trip_qr_auth);
        DELAY_CERTIFICATE = new h("DELAY_CERTIFICATE", 12, gVar, AbstractC5959j.drawer_menu_delay_certificate);
        RAIL_POINT = new h("RAIL_POINT", 13, gVar, AbstractC5959j.drawer_menu_rail_point);
        MOBILE_FAX = new h("MOBILE_FAX", 14, gVar, AbstractC5959j.drawer_menu_mobile_fax);
        MEMBER_DROP = new h("MEMBER_DROP", 15, gVar, AbstractC5959j.drawer_menu_member_drop);
        g gVar2 = g.TICKET_RESERVATION;
        TICKET_RESERVATION = new h("TICKET_RESERVATION", 16, gVar2, AbstractC5959j.drawer_menu_ticket_reservation);
        COMMUTATION_PASS = new h("COMMUTATION_PASS", 17, gVar2, AbstractC5959j.drawer_menu_cummuting_pass);
        RESERVED_LIST = new h("RESERVED_LIST", 18, gVar2, AbstractC5959j.drawer_menu_reserved_list);
        TRAVEL_BOOKING = new h("TRAVEL_BOOKING", 19, gVar2, AbstractC5959j.drawer_menu_travel_booking);
        LIMOUSINE_BOOKING = new h("LIMOUSINE_BOOKING", 20, gVar2, AbstractC5959j.drawer_menu_limousine_booking);
        g gVar3 = g.TICKET_REFUND;
        TICKET_REFUND = new h("TICKET_REFUND", 21, gVar3, AbstractC5959j.drawer_menu_ticket_refund);
        OFFLINE_REFUND = new h("OFFLINE_REFUND", 22, gVar3, AbstractC5959j.drawer_menu_offline_refund);
        OFFLINE_REFUND_CALL = new h("OFFLINE_REFUND_CALL", 23, gVar3, AbstractC5959j.drawer_menu_offline_refund_call);
        g gVar4 = g.RAILPOLICE;
        RAILPOLICE_CALL = new h("RAILPOLICE_CALL", 24, gVar4, AbstractC5959j.drawer_menu_railpolice_call);
        RAILPOLICE = new h("RAILPOLICE", 25, gVar4, AbstractC5959j.drawer_menu_railpolice);
        RAILREPORT = new h("RAILREPORT", 26, gVar4, AbstractC5959j.drawer_menu_railreport);
        g gVar5 = g.KTX_EXTRA;
        RAIL_DELIVERY = new h("RAIL_DELIVERY", 27, gVar5, AbstractC5959j.drawer_menu_rail_delivery);
        KTX_DELIVERY = new h("KTX_DELIVERY", 28, gVar5, AbstractC5959j.drawer_menu_ktx_delivery);
        KTX_PARKING = new h("KTX_PARKING", 29, gVar5, AbstractC5959j.drawer_menu_ktx_parking);
        g gVar6 = g.USE_GUIDE;
        USE_GUIDE_FAQ = new h("USE_GUIDE_FAQ", 30, gVar6, AbstractC5959j.drawer_menu_faq);
        USE_GUIDE_TICKET_REFUND_PENALTY = new h("USE_GUIDE_TICKET_REFUND_PENALTY", 31, gVar6, AbstractC5959j.drawer_menu_ticket_refund_penalty);
        USE_GUIDE_CARRYING_ITEMS = new h("USE_GUIDE_CARRYING_ITEMS", 32, gVar6, AbstractC5959j.drawer_menu_baggage_policy_on_trains);
        USE_GUIDE_PASSENGER_TRANSPORT_TERMS_AND_CONDITIONS = new h("USE_GUIDE_PASSENGER_TRANSPORT_TERMS_AND_CONDITIONS", 33, gVar6, AbstractC5959j.drawer_private_policy3);
        USE_GUIDE_TIDS = new h("USE_GUIDE_TIDS", 34, gVar6, AbstractC5959j.drawer_menu_tids);
        g gVar7 = g.CUSTOMER_SERVICE;
        NOTICE_BOARD = new h("NOTICE_BOARD", 35, gVar7, AbstractC5959j.drawer_menu_notice_board);
        LOST_ARTICLE = new h("LOST_ARTICLE", 36, gVar7, AbstractC5959j.drawer_menu_lost_article);
        CUSTOMER_CALL = new h("CUSTOMER_CALL", 37, gVar7, AbstractC5959j.drawer_menu_customer_call);
        HEARING_IMPAIRED = new h("HEARING_IMPAIRED", 38, gVar7, AbstractC5959j.drawer_menu_hearing_impaired);
        g gVar8 = g.SETTINGS;
        FAVORITE_ROUTES = new h("FAVORITE_ROUTES", 39, gVar8, AbstractC5959j.title_favorite_sections_setting);
        CONVENIENCE_SETTING = new h("CONVENIENCE_SETTING", 40, gVar8, AbstractC5959j.title_convenience_setting);
        SIMPLE_CASH_PAYMENT = new h("SIMPLE_CASH_PAYMENT", 41, gVar8, AbstractC5959j.title_stbk_simple_cash_payment);
        TOSSPAY_AUTO = new h("TOSSPAY_AUTO", 42, gVar8, AbstractC5959j.title_tosspay_auto_setting);
        FAVORITE_CARDS = new h("FAVORITE_CARDS", 43, gVar8, AbstractC5959j.title_favorite_cards_setting);
        VETERAN_WELFARE_NO = new h("VETERAN_WELFARE_NO", 44, gVar8, AbstractC5959j.title_veterans_no_setting);
        MULTI_LANGUAGE = new h("MULTI_LANGUAGE", 45, gVar8, AbstractC5959j.title_multi_language);
        VERSION_INFO = new h("VERSION_INFO", 46, gVar8, AbstractC5959j.title_version_info);
        LOGIN = new h("LOGIN", 47, gVar8, AbstractC5959j.common_login);
        LOGOUT = new h("LOGOUT", 48, gVar8, AbstractC5959j.common_logout);
        f1046c = a();
    }

    private h(String str, int i8, g gVar, int i9) {
        this.f1048b = gVar;
        this.f1047a = i9;
    }

    private static /* synthetic */ h[] a() {
        return new h[]{MEMBER_INFORMATION, BASKET_TICKET, MY_TICKETS, TICKET_HISTORY, MILEAGE_INQUIRY, GIFTICKET_HISTORY, ACCUMULATING_KTX_MILEAGE, NOTIFICATION_SETTING, MEMBERSHIP_CARD, COMPENSATION, DELAY_ACCOUNT_REFUND, TRIP_QR_AUTH, DELAY_CERTIFICATE, RAIL_POINT, MOBILE_FAX, MEMBER_DROP, TICKET_RESERVATION, COMMUTATION_PASS, RESERVED_LIST, TRAVEL_BOOKING, LIMOUSINE_BOOKING, TICKET_REFUND, OFFLINE_REFUND, OFFLINE_REFUND_CALL, RAILPOLICE_CALL, RAILPOLICE, RAILREPORT, RAIL_DELIVERY, KTX_DELIVERY, KTX_PARKING, USE_GUIDE_FAQ, USE_GUIDE_TICKET_REFUND_PENALTY, USE_GUIDE_CARRYING_ITEMS, USE_GUIDE_PASSENGER_TRANSPORT_TERMS_AND_CONDITIONS, USE_GUIDE_TIDS, NOTICE_BOARD, LOST_ARTICLE, CUSTOMER_CALL, HEARING_IMPAIRED, FAVORITE_ROUTES, CONVENIENCE_SETTING, SIMPLE_CASH_PAYMENT, TOSSPAY_AUTO, FAVORITE_CARDS, VETERAN_WELFARE_NO, MULTI_LANGUAGE, VERSION_INFO, LOGIN, LOGOUT};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f1046c.clone();
    }

    public g getCategory() {
        return this.f1048b;
    }

    public int getNameResId() {
        return this.f1047a;
    }
}
