package r4;

import com.korail.talk.network.dao.pay.StbkAcntDao;
import o6.InterfaceC6042a;

/* loaded from: classes.dex */
public enum h implements InterfaceC6042a {
    INS_0("일시불", "0"),
    INS_2("2개월", "2"),
    INS_3("3개월", "3"),
    INS_4("4개월", StbkAcntDao.ACCOUNT_REGISTER),
    INS_5("5개월", StbkAcntDao.CHANGE_PASSWORD),
    INS_6("6개월", "6"),
    INS_12("12개월", "12"),
    INS_24("24개월", "24");


    /* renamed from: a, reason: collision with root package name */
    private String f35740a;

    /* renamed from: b, reason: collision with root package name */
    private String f35741b;

    h(String str, String str2) {
        this.f35740a = str;
        this.f35741b = str2;
    }

    @Override // o6.InterfaceC6042a
    public String getCode() {
        return this.f35741b;
    }

    @Override // o6.InterfaceC6042a
    public String getName() {
        return this.f35740a;
    }
}
