package com.korail.talk.network.dao.reservationCancel;

import com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AutoRsvCancelCheckDao extends RsvCancelCheckDao {

    public class AutoRsvCancelCheckRequest extends RsvCancelCheckDao.RsvCancelCheckRequest {
        private RsvInquiryResponse.TrainInfos trainInfo;

        public AutoRsvCancelCheckRequest() {
            super();
        }

        public RsvInquiryResponse.TrainInfos getTrainInfo() {
            return this.trainInfo;
        }

        public void setTrainInfo(RsvInquiryResponse.TrainInfos trainInfos) {
            this.trainInfo = trainInfos;
        }
    }

    @Override // com.korail.talk.network.dao.reservationCancel.RsvCancelCheckDao, com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_auto_rsv_cancel_check;
    }
}
