package com.korail.talk.network.request.inquiry;

import java.io.Serializable;

/* loaded from: classes.dex */
public class ProductTrainInquiryRequest extends RsvInquiryRequest implements Serializable, Cloneable {
    private String txtGdNo;

    public String getTxtGdNo() {
        return this.txtGdNo;
    }

    public void setTxtGdNo(String str) {
        this.txtGdNo = str;
    }

    @Override // com.korail.talk.network.request.inquiry.RsvInquiryRequest
    /* renamed from: clone */
    public ProductTrainInquiryRequest mo405clone() {
        return (ProductTrainInquiryRequest) super.mo405clone();
    }
}
