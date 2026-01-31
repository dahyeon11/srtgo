package z4;

import android.location.Location;
import android.os.Bundle;
import com.korail.talk.data.DistanceStationData;
import com.korail.talk.data.ReceiveSRTData;
import com.korail.talk.database.model.FavoriteStation;
import com.korail.talk.database.model.StationData;
import com.korail.talk.database.model.ZRecentStation;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.ui.booking.option.station.StationSearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import q4.C6111b;

/* loaded from: classes.dex */
public class M {

    public static class a implements Comparator {
        @Override // java.util.Comparator
        public int compare(DistanceStationData distanceStationData, DistanceStationData distanceStationData2) {
            double distance = distanceStationData.getDistance();
            double distance2 = distanceStationData2.getDistance();
            if (distance < distance2) {
                return -1;
            }
            return distance > distance2 ? 1 : 0;
        }
    }

    private static List a() {
        return C6111b.getInstance().getAllStationList();
    }

    public static List<DistanceStationData> getAllNearStationList() {
        return getAllNearStationList(null);
    }

    public static String[] getExternalAppStationNm(Bundle bundle) {
        String[] strArr = new String[2];
        if (C6630d.isNotNull(bundle)) {
            if (bundle.containsKey("data_from_SRT")) {
                ReceiveSRTData receiveSRTData = (ReceiveSRTData) bundle.getSerializable("data_from_SRT");
                String departureStation = receiveSRTData.getDepartureStation();
                String arrivalStation = receiveSRTData.getArrivalStation();
                t.d("departStationNm : " + departureStation);
                t.d("arrivalStationNm : " + arrivalStation);
                if (N.isNotNull(departureStation) && N.isNotNull(arrivalStation)) {
                    strArr[0] = departureStation;
                    strArr[1] = arrivalStation;
                }
            } else if (bundle.containsKey("txgGoStart") && bundle.containsKey("txtGoEnd")) {
                String string = bundle.getString("txgGoStart");
                String string2 = bundle.getString("txtGoEnd");
                if (N.isNotNull(string) && N.isNotNull(string2)) {
                    strArr[0] = string;
                    strArr[1] = string2;
                }
            }
        }
        return strArr;
    }

    public static List<DistanceStationData> getNearStationList(Location location) {
        ArrayList arrayList = new ArrayList();
        List<DistanceStationData> allNearStationList = getAllNearStationList(location);
        Collections.sort(allNearStationList, new a());
        Iterator<DistanceStationData> it = allNearStationList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            if (arrayList.size() == 2) {
                break;
            }
        }
        return arrayList;
    }

    public static int getSectionCount(V4.b[] bVarArr) {
        if (bVarArr[0].getStartStationNm().equals("역명") || bVarArr[0].getArrivalStationNm().equals("역명")) {
            return 0;
        }
        int i8 = 1;
        if (!bVarArr[1].getStartStationNm().equals("역명") && !bVarArr[1].getArrivalStationNm().equals("역명")) {
            i8 = 2;
            if (!bVarArr[2].getStartStationNm().equals("역명") && !bVarArr[2].getArrivalStationNm().equals("역명")) {
                return 3;
            }
            if (!bVarArr[2].getStartStationNm().equals("역명") || !bVarArr[2].getArrivalStationNm().equals("역명")) {
                return 0;
            }
        } else if (!bVarArr[1].getStartStationNm().equals("역명") || !bVarArr[1].getArrivalStationNm().equals("역명")) {
            return 0;
        }
        return i8;
    }

    public static String[] getStationNm() {
        String[] strArr = new String[2];
        List<ZRecentStation> recentStationList = C6111b.getInstance().getRecentStationList();
        List<FavoriteStation> favoriteStationList = C6111b.getInstance().getFavoriteStationList();
        I4.h hVar = I4.h.getInstance();
        if (hVar.isSejongMember().booleanValue()) {
            strArr[0] = "서울";
            strArr[1] = "오송";
        } else if (hVar.isNaJuMember()) {
            strArr[0] = "용산";
            strArr[1] = "나주";
        } else if (hVar.isSinGyeongJu()) {
            strArr[0] = "서울";
            strArr[1] = "신경주";
        } else if (C6630d.isNotNull(recentStationList) && !recentStationList.isEmpty()) {
            ZRecentStation zRecentStation = recentStationList.get(0);
            strArr[0] = zRecentStation.getStartStation();
            strArr[1] = zRecentStation.getArrivalStation();
        } else if (C6630d.isNotNull(favoriteStationList) && !favoriteStationList.isEmpty()) {
            FavoriteStation favoriteStation = favoriteStationList.get(0);
            strArr[0] = favoriteStation.getStartStation();
            strArr[1] = favoriteStation.getArrivalStation();
        }
        if (N.isNull(strArr[0]) || N.isNull(strArr[1])) {
            strArr[0] = "서울";
            strArr[1] = "부산";
        }
        return strArr;
    }

    public static List<DistanceStationData> getWctInfoList(List<EnableDateDao.WctInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (EnableDateDao.WctInfo wctInfo : list) {
            DistanceStationData distanceStationData = new DistanceStationData();
            distanceStationData.setStationName(wctInfo.getKor_cd_val());
            distanceStationData.setType(StationSearch.g.TWO_COLUMN_STATION);
            arrayList.add(distanceStationData);
        }
        return arrayList;
    }

    public static boolean isLimousineTerminal(String str) {
        return !N.isNull(str) && (str.equals("인천공항T1") || str.equals("인천공항T2") || str.equals("송도교"));
    }

    public static boolean isSectionStationSame(V4.b[] bVarArr) {
        int i8 = 0;
        boolean z8 = false;
        while (i8 < bVarArr.length) {
            V4.b bVar = bVarArr[i8];
            i8++;
            int i9 = i8;
            while (true) {
                if (i9 >= bVarArr.length) {
                    break;
                }
                V4.b bVar2 = bVarArr[i9];
                if (!bVar2.getStartStationNm().equals("역명") && bVar.getStartStationNm().equals(bVar2.getStartStationNm()) && bVar.getArrivalStationNm().equals(bVar2.getArrivalStationNm())) {
                    z8 = true;
                    break;
                }
                i9++;
            }
            if (z8) {
                break;
            }
        }
        return z8;
    }

    public static boolean isShuttleBus(String str) {
        return !N.isNull(str) && (str.equals("광명") || str.equals("광명+리무진"));
    }

    public static boolean isStationSame(V4.b bVar) {
        return false;
    }

    public static List<DistanceStationData> getAllNearStationList(Location location) {
        List listA = a();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < listA.size(); i8++) {
            DistanceStationData distanceStationData = new DistanceStationData();
            distanceStationData.setIndex(i8);
            distanceStationData.setStationName(((StationData) listA.get(i8)).getStnNm());
            distanceStationData.setLatitude(((StationData) listA.get(i8)).getLatitude());
            distanceStationData.setLongitude(((StationData) listA.get(i8)).getLongitude());
            distanceStationData.setType(StationSearch.g.TWO_COLUMN_STATION);
            if (C6630d.isNotNull(location)) {
                Location location2 = new Location("");
                location2.setLatitude(Double.parseDouble(((StationData) listA.get(i8)).getLatitude()));
                location2.setLongitude(Double.parseDouble(((StationData) listA.get(i8)).getLongitude()));
                distanceStationData.setDistance(location.distanceTo(location2));
            }
            arrayList.add(distanceStationData);
        }
        return arrayList;
    }

    public static boolean isStationSame(V4.b[] bVarArr) {
        return false;
    }
}
