package r4;

import o6.InterfaceC6043b;

/* loaded from: classes.dex */
public enum p implements InterfaceC6043b {
    NORMAL_FREE("자유석", "003", false, false),
    STANDING_SEAT(g5.e.STATE_NAME_STANDING, "033", false, false),
    COMMUTATION_SEAT_ASSIGN("정기권 좌석선택", "051", false, false),
    EVACUATION_HELPER("대피도우미", "052", false, false),
    DEFAULT("일반석", "015", true, true),
    WITH_CHILD("유아동반", "019", true, true),
    WHEELCHAIR("수동휠체어석", "021", true, true),
    AUTO_WHEELCHAIR("전동휠체어석", "028", true, true),
    SECOND_FLOOR("2층석", "018", true, false),
    BICYCLE("자전거", "032", true, true),
    OLDER("노인석", "020", false, false),
    DISABLED("장애인석", "029", false, false),
    NOTEBOOK("노트북", "031", false, false);


    /* renamed from: a, reason: collision with root package name */
    private String f35758a;

    /* renamed from: b, reason: collision with root package name */
    private String f35759b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35760c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35761d;

    p(String str, String str2, boolean z8, boolean z9) {
        this.f35758a = str;
        this.f35759b = str2;
        this.f35760c = z8;
        this.f35761d = z9;
    }

    @Override // o6.InterfaceC6043b
    public String getCode() {
        return this.f35759b;
    }

    @Override // o6.InterfaceC6043b
    public String getName() {
        return this.f35758a;
    }

    @Override // o6.InterfaceC6043b
    public boolean isProductVisible() {
        return this.f35761d;
    }

    @Override // o6.InterfaceC6043b
    public boolean isVisible() {
        return this.f35760c;
    }
}
