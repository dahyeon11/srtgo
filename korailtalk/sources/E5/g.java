package E5;

import n4.AbstractC5959j;

/* loaded from: classes.dex */
enum g {
    MY_PAGE(AbstractC5959j.common_my_page, true),
    TICKET_RESERVATION(AbstractC5959j.drawer_menu_ticket_reservation, true),
    TICKET_REFUND(AbstractC5959j.drawer_menu_ticket_refund, true),
    USE_GUIDE(AbstractC5959j.drawer_menu_guidance_board, true),
    CUSTOMER_SERVICE(AbstractC5959j.drawer_menu_customer_service, false),
    RAILPOLICE(AbstractC5959j.drawer_menu_category_railpolice, false),
    KTX_EXTRA(AbstractC5959j.drawer_menu_ktx_extra, false),
    SETTINGS(AbstractC5959j.drawer_menu_setting, false);


    /* renamed from: a, reason: collision with root package name */
    private final int f1044a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1045b;

    g(int i8, boolean z8) {
        this.f1044a = i8;
        this.f1045b = z8;
    }

    public int getNameResId() {
        return this.f1044a;
    }

    public boolean isDefaultExpanded() {
        return this.f1045b;
    }
}
