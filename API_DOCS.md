# SRTgo API Documentation

SRTgo는 SRT(Super Rapid Train)와 KTX(Korea Train eXpress) 기차표 자동 예매를 위한 Python 라이브러리입니다.

## 목차

- [설치](#설치)
- [SRT API](#srt-api)
  - [SRT 클래스](#srt-클래스)
  - [열차 검색](#열차-검색)
  - [예약 및 결제](#예약-및-결제)
  - [예약 관리](#예약-관리)
- [KTX API](#ktx-api)
  - [Korail 클래스](#korail-클래스)
  - [열차 검색](#ktx-열차-검색)
  - [예약 및 결제](#ktx-예약-및-결제)
- [공통 클래스](#공통-클래스)
- [예외 처리](#예외-처리)
- [사용 예제](#사용-예제)

---

## 설치

```bash
pip install srtgo -U
```

---

## SRT API

### SRT 클래스

SRT 열차 예약 시스템의 메인 클래스입니다.

#### 초기화

```python
from srtgo.srt import SRT

srt = SRT(srt_id, srt_pw, auto_login=True, verbose=False)
```

**매개변수:**
- `srt_id` (str): SRT 계정 ID (회원번호, 이메일, 또는 전화번호)
- `srt_pw` (str): SRT 계정 비밀번호
- `auto_login` (bool, optional): 초기화 시 자동 로그인 여부. 기본값: `True`
- `verbose` (bool, optional): 디버그 로그 출력 여부. 기본값: `False`

**예제:**
```python
# 회원번호로 로그인
srt = SRT("1234567890", "your_password")

# 이메일로 로그인
srt = SRT("example@gmail.com", "your_password")

# 전화번호로 로그인
srt = SRT("010-1234-5678", "your_password")
```

#### 메서드

##### login()

SRT 서버에 로그인합니다. 일반적으로 초기화 시 자동으로 호출됩니다.

```python
srt.login(srt_id=None, srt_pw=None)
```

**매개변수:**
- `srt_id` (str, optional): 인스턴스 srt_id 재정의
- `srt_pw` (str, optional): 인스턴스 srt_pw 재정의

**반환값:**
- `bool`: 로그인 성공 여부

**예외:**
- `SRTLoginError`: 로그인 실패 시

---

##### logout()

SRT 서버에서 로그아웃합니다.

```python
srt.logout()
```

**반환값:**
- `bool`: 로그아웃 성공 여부

**예외:**
- `SRTResponseError`: 서버 응답 오류 시

---

### 열차 검색

##### search_train()

이용 가능한 열차를 검색합니다.

```python
srt.search_train(
    dep,
    arr,
    date=None,
    time=None,
    time_limit=None,
    passengers=None,
    available_only=True
)
```

**매개변수:**
- `dep` (str): 출발역 이름 (예: "수서", "동대구")
- `arr` (str): 도착역 이름
- `date` (str, optional): YYYYMMDD 형식의 날짜. 기본값: 오늘
- `time` (str, optional): HHMMSS 형식의 시간. 기본값: 000000
- `time_limit` (str, optional): 이 시간 이전의 열차만 반환
- `passengers` (list[Passenger], optional): 승객 리스트. 기본값: 성인 1명
- `available_only` (bool, optional): 좌석이 있는 열차만 반환. 기본값: `True`

**반환값:**
- `list[SRTTrain]`: 매칭되는 SRTTrain 객체 리스트

**예외:**
- `ValueError`: 잘못된 역 이름
- `SRTResponseError`: 서버 응답 오류

**예제:**
```python
from srtgo.srt import SRT, Adult, Child

srt = SRT("id", "pw")

# 기본 검색 (성인 1명)
trains = srt.search_train("수서", "부산", "20250125", "100000")

# 여러 승객
trains = srt.search_train(
    "수서",
    "부산",
    "20250125",
    "100000",
    passengers=[Adult(2), Child(1)]
)

# 매진된 열차도 포함
trains = srt.search_train("수서", "부산", available_only=False)
```

---

### 예약 및 결제

##### reserve()

열차를 예약합니다. 좌석이 없는 경우 자동으로 예약대기를 신청합니다.

```python
srt.reserve(
    train,
    passengers=None,
    option=SeatType.GENERAL_FIRST,
    window_seat=None
)
```

**매개변수:**
- `train` (SRTTrain): 예약할 열차
- `passengers` (list[Passenger], optional): 승객 리스트. 기본값: 성인 1명
- `option` (SeatType, optional): 좌석 타입 선호도
  - `SeatType.GENERAL_FIRST`: 일반실 우선 (기본값)
  - `SeatType.GENERAL_ONLY`: 일반실만
  - `SeatType.SPECIAL_FIRST`: 특실 우선
  - `SeatType.SPECIAL_ONLY`: 특실만
- `window_seat` (bool, optional): 창가 좌석 선호 여부

**반환값:**
- `SRTReservation`: 예약 정보 객체

**예외:**
- `SRTNotLoggedInError`: 로그인되지 않음
- `TypeError`: train이 SRTTrain 인스턴스가 아님
- `ValueError`: SRT 열차가 아님
- `SRTError`: 예약 후 티켓을 찾을 수 없음

**예제:**
```python
from srtgo.srt import SRT, SeatType, Adult, Child

srt = SRT("id", "pw")
trains = srt.search_train("수서", "부산", "20250125", "100000")

# 기본 예약
reservation = srt.reserve(trains[0])

# 특실 우선 예약
reservation = srt.reserve(trains[0], option=SeatType.SPECIAL_FIRST)

# 여러 승객
reservation = srt.reserve(
    trains[0],
    passengers=[Adult(2), Child(1)]
)
```

---

##### reserve_standby()

예약대기를 신청합니다.

```python
srt.reserve_standby(
    train,
    passengers=None,
    option=SeatType.GENERAL_FIRST,
    mblPhone=None
)
```

**매개변수:**
- `train` (SRTTrain): 예약대기할 열차
- `passengers` (list[Passenger], optional): 승객 리스트
- `option` (SeatType, optional): 좌석 타입 선호도
- `mblPhone` (str, optional): 알림 받을 전화번호

**반환값:**
- `SRTReservation`: 예약대기 정보 객체

**예제:**
```python
trains = srt.search_train("수서", "부산", "20250125", "100000")
reservation = srt.reserve_standby(trains[0], mblPhone="010-1234-5678")
```

---

##### reserve_standby_option_settings()

예약대기 옵션을 설정합니다.

```python
srt.reserve_standby_option_settings(
    reservation,
    isAgreeSMS,
    isAgreeClassChange,
    telNo=None
)
```

**매개변수:**
- `reservation` (SRTReservation | int): 예약 객체 또는 예약 번호
- `isAgreeSMS` (bool): SMS 알림 수신 동의
- `isAgreeClassChange` (bool): 좌석 등급 변경 동의
- `telNo` (str, optional): 알림 받을 전화번호

**반환값:**
- `bool`: 업데이트 성공 여부

**예제:**
```python
reservation = srt.reserve_standby(trains[0])
srt.reserve_standby_option_settings(
    reservation,
    isAgreeSMS=True,
    isAgreeClassChange=True,
    telNo="010-1234-5678"
)
```

---

##### pay_with_card()

신용카드로 예약을 결제합니다.

```python
srt.pay_with_card(
    reservation,
    number,
    password,
    validation_number,
    expire_date,
    installment=0,
    card_type="J"
)
```

**매개변수:**
- `reservation` (SRTReservation): 결제할 예약
- `number` (str): 카드 번호 (하이픈 없이)
- `password` (str): 카드 비밀번호 앞 2자리
- `validation_number` (str): 생년월일 (개인카드) 또는 사업자번호 (법인카드)
- `expire_date` (str): 카드 유효기간 (YYMM)
- `installment` (int, optional): 할부 개월 수 (0,2-12,24). 기본값: 0 (일시불)
- `card_type` (str, optional): 카드 구분 ("J"=개인, "S"=법인). 기본값: "J"

**반환값:**
- `bool`: 결제 성공 여부

**예외:**
- `SRTNotLoggedInError`: 로그인되지 않음
- `SRTResponseError`: 결제 실패

**예제:**
```python
reservation = srt.reserve(trains[0])
srt.pay_with_card(
    reservation,
    number="1234567890123456",
    password="12",
    validation_number="981204",  # 생년월일
    expire_date="2512"  # 2025년 12월
)
```

---

### 예약 관리

##### get_reservations()

모든 예약 내역을 조회합니다.

```python
srt.get_reservations(paid_only=False)
```

**매개변수:**
- `paid_only` (bool, optional): 결제된 예약만 반환. 기본값: `False`

**반환값:**
- `list[SRTReservation]`: SRTReservation 객체 리스트

**예외:**
- `SRTNotLoggedInError`: 로그인되지 않음
- `SRTResponseError`: 서버 응답 오류

**예제:**
```python
# 모든 예약 조회
reservations = srt.get_reservations()

# 결제된 예약만 조회
paid_reservations = srt.get_reservations(paid_only=True)

for rsv in reservations:
    print(rsv)
```

---

##### ticket_info()

티켓의 상세 정보를 조회합니다.

```python
srt.ticket_info(reservation)
```

**매개변수:**
- `reservation` (SRTReservation | int): 예약 객체 또는 예약 번호

**반환값:**
- `list[SRTTicket]`: SRTTicket 객체 리스트

**예외:**
- `SRTNotLoggedInError`: 로그인되지 않음
- `SRTResponseError`: 서버 응답 오류

**예제:**
```python
tickets = srt.ticket_info(reservation)
for ticket in tickets:
    print(ticket)
```

---

##### cancel()

예약을 취소합니다.

```python
srt.cancel(reservation)
```

**매개변수:**
- `reservation` (SRTReservation | int): 예약 객체 또는 예약 번호

**반환값:**
- `bool`: 취소 성공 여부

**예외:**
- `SRTNotLoggedInError`: 로그인되지 않음
- `SRTResponseError`: 서버 응답 오류

**예제:**
```python
# 예약 객체로 취소
reservation = srt.reserve(trains[0])
srt.cancel(reservation)

# 예약 번호로 취소
reservations = srt.get_reservations()
srt.cancel(reservations[0])
```

---

##### refund()

결제된 티켓을 환불합니다.

```python
srt.refund(reservation)
```

**매개변수:**
- `reservation` (SRTReservation | int): 예약 객체 또는 예약 번호

**반환값:**
- `bool`: 환불 성공 여부

**예외:**
- `SRTResponseError`: 서버 응답 오류

**예제:**
```python
srt.refund(reservation)
```

---

### SRT 데이터 클래스

#### SRTTrain

열차 정보를 나타내는 클래스입니다.

**주요 속성:**
- `train_code` (str): 열차 코드
- `train_name` (str): 열차 이름 (예: "SRT")
- `train_number` (str): 열차 번호
- `dep_date` (str): 출발 날짜 (YYYYMMDD)
- `dep_time` (str): 출발 시간 (HHMMSS)
- `dep_station_code` (str): 출발역 코드
- `dep_station_name` (str): 출발역 이름
- `arr_date` (str): 도착 날짜 (YYYYMMDD)
- `arr_time` (str): 도착 시간 (HHMMSS)
- `arr_station_code` (str): 도착역 코드
- `arr_station_name` (str): 도착역 이름
- `general_seat_state` (str): 일반실 예약 가능 상태
- `special_seat_state` (str): 특실 예약 가능 상태
- `reserve_wait_possible_code` (int): 예약대기 가능 코드

**메서드:**
- `general_seat_available()`: 일반실 좌석 이용 가능 여부
- `special_seat_available()`: 특실 좌석 이용 가능 여부
- `reserve_standby_available()`: 예약대기 가능 여부
- `seat_available()`: 좌석 이용 가능 여부 (일반실 또는 특실)

---

#### SRTReservation

예약 정보를 나타내는 클래스입니다.

**주요 속성:**
- `reservation_number` (str): 예약 번호
- `total_cost` (int): 총 비용
- `seat_count` (int): 좌석 수
- `train_code` (str): 열차 코드
- `train_name` (str): 열차 이름
- `train_number` (str): 열차 번호
- `dep_date` (str): 출발 날짜
- `dep_time` (str): 출발 시간
- `dep_station_code` (str): 출발역 코드
- `dep_station_name` (str): 출발역 이름
- `arr_time` (str): 도착 시간
- `arr_station_code` (str): 도착역 코드
- `arr_station_name` (str): 도착역 이름
- `payment_date` (str): 결제 기한 날짜
- `payment_time` (str): 결제 기한 시간
- `paid` (bool): 결제 완료 여부
- `is_waiting` (bool): 예약대기 여부
- `tickets` (list[SRTTicket]): 티켓 리스트

---

#### SRTTicket

티켓 정보를 나타내는 클래스입니다.

**주요 속성:**
- `car` (str): 차량 번호
- `seat` (str): 좌석 번호
- `seat_type_code` (str): 좌석 타입 코드
- `seat_type` (str): 좌석 타입 ("일반실" 또는 "특실")
- `passenger_type_code` (str): 승객 타입 코드
- `passenger_type` (str): 승객 타입
- `price` (int): 가격
- `original_price` (int): 원가
- `discount` (int): 할인액
- `is_waiting` (bool): 예약대기 여부

---

## KTX API

### Korail 클래스

KTX 열차 예약 시스템의 메인 클래스입니다.

#### 초기화

```python
from srtgo.ktx import Korail

korail = Korail(korail_id, korail_pw, auto_login=True, verbose=False)
```

**매개변수:**
- `korail_id` (str): 코레일 계정 ID (회원번호, 이메일, 또는 전화번호)
- `korail_pw` (str): 코레일 계정 비밀번호
- `auto_login` (bool, optional): 초기화 시 자동 로그인 여부. 기본값: `True`
- `verbose` (bool, optional): 디버그 로그 출력 여부. 기본값: `False`

**예제:**
```python
# 회원번호로 로그인
korail = Korail("1234567890", "your_password")

# 이메일로 로그인
korail = Korail("example@gmail.com", "your_password")

# 전화번호로 로그인
korail = Korail("010-1234-5678", "your_password")
```

---

### KTX 열차 검색

##### search_train()

이용 가능한 KTX 열차를 검색합니다.

```python
korail.search_train(
    dep,
    arr,
    date=None,
    time=None,
    train_type=TrainType.ALL,
    passengers=None,
    include_no_seats=False,
    include_waiting_list=False
)
```

**매개변수:**
- `dep` (str): 출발역 이름
- `arr` (str): 도착역 이름
- `date` (str, optional): YYYYMMDD 형식의 날짜. 기본값: 오늘
- `time` (str, optional): HHMMSS 형식의 시간. 기본값: 현재 시간
- `train_type` (str, optional): 열차 타입. 기본값: `TrainType.ALL`
  - `TrainType.KTX`: KTX
  - `TrainType.SAEMAEUL`: 새마을호
  - `TrainType.MUGUNGHWA`: 무궁화호
  - `TrainType.ALL`: 전체
- `passengers` (list[Passenger], optional): 승객 리스트. 기본값: 성인 1명
- `include_no_seats` (bool, optional): 매진된 열차 포함 여부. 기본값: `False`
- `include_waiting_list` (bool, optional): 예약대기 가능한 열차 포함 여부. 기본값: `False`

**반환값:**
- `list[Train]`: 매칭되는 Train 객체 리스트

**예외:**
- `NoResultsError`: 결과 없음
- `KorailError`: 서버 응답 오류

**예제:**
```python
from srtgo.ktx import Korail, TrainType, AdultPassenger, ChildPassenger

korail = Korail("id", "pw")

# 기본 검색
trains = korail.search_train("서울", "부산", "20250125", "100000")

# 여러 승객
trains = korail.search_train(
    "서울",
    "부산",
    "20250125",
    "100000",
    passengers=[AdultPassenger(2), ChildPassenger(1)]
)

# KTX만 검색
trains = korail.search_train(
    "서울",
    "부산",
    train_type=TrainType.KTX
)
```

---

### KTX 예약 및 결제

##### reserve()

KTX 열차를 예약합니다.

```python
korail.reserve(
    train,
    passengers=None,
    option=ReserveOption.GENERAL_FIRST
)
```

**매개변수:**
- `train` (Train): 예약할 열차
- `passengers` (list[Passenger], optional): 승객 리스트. 기본값: 성인 1명
- `option` (str, optional): 좌석 타입 선호도
  - `ReserveOption.GENERAL_FIRST`: 일반실 우선 (기본값)
  - `ReserveOption.GENERAL_ONLY`: 일반실만
  - `ReserveOption.SPECIAL_FIRST`: 특실 우선
  - `ReserveOption.SPECIAL_ONLY`: 특실만

**반환값:**
- `Reservation`: 예약 정보 객체

**예외:**
- `SoldOutError`: 매진
- `KorailError`: 예약 실패

**예제:**
```python
from srtgo.ktx import Korail, ReserveOption, AdultPassenger

korail = Korail("id", "pw")
trains = korail.search_train("서울", "부산", "20250125", "100000")

# 기본 예약
reservation = korail.reserve(trains[0])

# 특실 우선 예약
reservation = korail.reserve(trains[0], option=ReserveOption.SPECIAL_FIRST)
```

---

##### pay_with_card()

신용카드로 예약을 결제합니다.

```python
korail.pay_with_card(
    rsv,
    card_number,
    card_password,
    birthday,
    card_expire,
    installment=0,
    card_type="J"
)
```

**매개변수:**
- `rsv` (Reservation): 결제할 예약
- `card_number` (str): 카드 번호
- `card_password` (str): 카드 비밀번호 앞 2자리
- `birthday` (str): 생년월일 (YYMMDD) 또는 사업자번호
- `card_expire` (str): 카드 유효기간 (YYMM)
- `installment` (int, optional): 할부 개월 수. 기본값: 0
- `card_type` (str, optional): 카드 구분 ("J"=개인, "S"=법인). 기본값: "J"

**반환값:**
- `bool`: 결제 성공 여부

**예제:**
```python
reservation = korail.reserve(trains[0])
korail.pay_with_card(
    reservation,
    card_number="1234567890123456",
    card_password="12",
    birthday="981204",
    card_expire="2512"
)
```

---

##### tickets()

구매한 티켓 목록을 조회합니다.

```python
korail.tickets()
```

**반환값:**
- `list[Ticket]`: Ticket 객체 리스트

**예제:**
```python
tickets = korail.tickets()
for ticket in tickets:
    print(ticket)
```

---

##### reservations()

예약 목록을 조회합니다.

```python
korail.reservations(rsv_id=None)
```

**매개변수:**
- `rsv_id` (str, optional): 특정 예약 ID. 지정하면 해당 예약만 반환

**반환값:**
- `list[Reservation]` 또는 `Reservation`: 예약 객체 리스트 (또는 단일 객체)

**예제:**
```python
# 모든 예약 조회
reservations = korail.reservations()

# 특정 예약 조회
reservation = korail.reservations(rsv_id="12345678")
```

---

##### cancel()

예약을 취소합니다.

```python
korail.cancel(rsv)
```

**매개변수:**
- `rsv` (Reservation): 취소할 예약 객체

**반환값:**
- `bool`: 취소 성공 여부

**예외:**
- `TypeError`: rsv가 Reservation 인스턴스가 아님

**예제:**
```python
reservations = korail.reservations()
korail.cancel(reservations[0])
```

---

##### refund()

티켓을 환불합니다.

```python
korail.refund(ticket)
```

**매개변수:**
- `ticket` (Ticket): 환불할 티켓 객체

**반환값:**
- `bool`: 환불 성공 여부

**예제:**
```python
tickets = korail.tickets()
korail.refund(tickets[0])
```

---

## 공통 클래스

### 승객 클래스 (SRT)

#### Adult

성인/청소년 승객

```python
from srtgo.srt import Adult

passenger = Adult(count=1)
```

**매개변수:**
- `count` (int, optional): 승객 수. 기본값: 1

---

#### Child

어린이 승객

```python
from srtgo.srt import Child

passenger = Child(count=1)
```

---

#### Senior

경로 승객

```python
from srtgo.srt import Senior

passenger = Senior(count=1)
```

---

#### Disability1To3

장애인 1~3급 승객

```python
from srtgo.srt import Disability1To3

passenger = Disability1To3(count=1)
```

---

#### Disability4To6

장애인 4~6급 승객

```python
from srtgo.srt import Disability4To6

passenger = Disability4To6(count=1)
```

---

### 승객 클래스 (KTX)

#### AdultPassenger

성인 승객

```python
from srtgo.ktx import AdultPassenger

passenger = AdultPassenger(count=1, discount_type="000")
```

**매개변수:**
- `count` (int, optional): 승객 수. 기본값: 1
- `discount_type` (str, optional): 할인 유형 코드. 기본값: "000"

---

#### ChildPassenger

어린이 승객

```python
from srtgo.ktx import ChildPassenger

passenger = ChildPassenger(count=1)
```

---

#### SeniorPassenger

경로 승객

```python
from srtgo.ktx import SeniorPassenger

passenger = SeniorPassenger(count=1)
```

---

#### Disability1To3Passenger

장애인 1~3급 승객

```python
from srtgo.ktx import Disability1To3Passenger

passenger = Disability1To3Passenger(count=1)
```

---

#### Disability4To6Passenger

장애인 4~6급 승객

```python
from srtgo.ktx import Disability4To6Passenger

passenger = Disability4To6Passenger(count=1)
```

---

### 상수

#### 역 코드 (STATION_CODE)

SRT/KTX 역 이름과 코드 매핑

```python
from srtgo.srt import STATION_CODE

code = STATION_CODE["수서"]  # "0551"
code = STATION_CODE["부산"]  # "0020"
```

**지원 역:**
- 수서, 동탄, 평택지제
- 대전, 오송, 천안아산
- 동대구, 서대구, 경주, 포항
- 부산, 울산(통도사), 마산, 창원, 창원중앙, 진영, 진주
- 광주송정, 목포, 나주, 익산, 정읍, 전주, 남원, 곡성, 구례구, 순천, 여수EXPO, 여천

---

## 예외 처리

### SRT 예외

#### SRTError

기본 SRT 예외 클래스

```python
from srtgo.srt import SRTError

try:
    # SRT 작업
    pass
except SRTError as e:
    print(f"SRT 오류: {e.msg}")
```

---

#### SRTLoginError

로그인 관련 오류

```python
from srtgo.srt import SRTLoginError

try:
    srt = SRT("invalid_id", "invalid_pw")
except SRTLoginError as e:
    print(f"로그인 실패: {e.msg}")
```

---

#### SRTResponseError

서버 응답 오류

```python
from srtgo.srt import SRTResponseError
```

---

#### SRTNotLoggedInError

로그인되지 않은 상태에서 작업 시도

```python
from srtgo.srt import SRTNotLoggedInError

try:
    srt = SRT("id", "pw", auto_login=False)
    srt.search_train("수서", "부산")
except SRTNotLoggedInError:
    print("먼저 로그인하세요")
```

---

#### SRTNetFunnelError

NetFunnel 대기열 오류

```python
from srtgo.srt import SRTNetFunnelError
```

---

### KTX 예외

#### KorailError

기본 코레일 예외 클래스

```python
from srtgo.ktx import KorailError

try:
    # KTX 작업
    pass
except KorailError as e:
    print(f"코레일 오류: {e.msg} ({e.code})")
```

---

#### NeedToLoginError

로그인 필요

```python
from srtgo.ktx import NeedToLoginError
```

---

#### NoResultsError

검색 결과 없음

```python
from srtgo.ktx import NoResultsError

try:
    trains = korail.search_train("서울", "부산")
except NoResultsError:
    print("검색 결과가 없습니다")
```

---

#### SoldOutError

매진

```python
from srtgo.ktx import SoldOutError

try:
    reservation = korail.reserve(trains[0])
except SoldOutError:
    print("매진되었습니다")
```

---

## 사용 예제

### 기본 예약 흐름 (SRT)

```python
from srtgo.srt import SRT, Adult, Child, SeatType

# 1. 로그인
srt = SRT("your_id", "your_password")

# 2. 열차 검색
trains = srt.search_train(
    dep="수서",
    arr="부산",
    date="20250125",
    time="100000",
    passengers=[Adult(2), Child(1)]
)

# 3. 열차 정보 확인
for train in trains:
    print(train)
    print(f"일반실: {train.general_seat_state}")
    print(f"특실: {train.special_seat_state}")

# 4. 예약
reservation = srt.reserve(
    trains[0],
    passengers=[Adult(2), Child(1)],
    option=SeatType.GENERAL_FIRST
)

print(f"예약 번호: {reservation.reservation_number}")
print(f"총 비용: {reservation.total_cost}원")

# 5. 티켓 정보 확인
tickets = srt.ticket_info(reservation)
for ticket in tickets:
    print(ticket)

# 6. 결제 (선택)
success = srt.pay_with_card(
    reservation,
    number="1234567890123456",
    password="12",
    validation_number="981204",
    expire_date="2512"
)

if success:
    print("결제 완료!")

# 7. 예약 조회
reservations = srt.get_reservations()
for rsv in reservations:
    print(rsv)

# 8. 예약 취소 (필요시)
# srt.cancel(reservation)
```

---

### 예약대기 (SRT)

```python
from srtgo.srt import SRT

srt = SRT("your_id", "your_password")

# 매진된 열차 포함 검색
trains = srt.search_train("수서", "부산", "20250125", available_only=False)

# 매진된 열차 선택
for train in trains:
    if not train.seat_available() and train.reserve_standby_available():
        # 예약대기 신청
        reservation = srt.reserve_standby(
            train,
            mblPhone="010-1234-5678"
        )

        # 예약대기 옵션 설정
        srt.reserve_standby_option_settings(
            reservation,
            isAgreeSMS=True,  # SMS 알림
            isAgreeClassChange=True,  # 좌석 등급 변경 동의
            telNo="010-1234-5678"
        )

        print(f"예약대기 완료: {reservation}")
        break
```

---

### 기본 예약 흐름 (KTX)

```python
from srtgo.ktx import Korail, TrainType, ReserveOption, AdultPassenger

# 1. 로그인
korail = Korail("your_id", "your_password")

# 2. 열차 검색
trains = korail.search_train(
    dep="서울",
    arr="부산",
    date="20250125",
    time="100000",
    train_type=TrainType.KTX,
    passengers=[AdultPassenger(2)]
)

# 3. 열차 정보 확인
for train in trains:
    print(train)

# 4. 예약
reservation = korail.reserve(
    trains[0],
    passengers=[AdultPassenger(2)],
    option=ReserveOption.GENERAL_FIRST
)

print(f"예약 ID: {reservation.rsv_id}")
print(f"가격: {reservation.price}원")

# 5. 결제
success = korail.pay_with_card(
    reservation,
    card_number="1234567890123456",
    card_password="12",
    birthday="981204",
    card_expire="2512"
)

if success:
    print("결제 완료!")

# 6. 티켓 조회
tickets = korail.tickets()
for ticket in tickets:
    print(ticket)

# 7. 예약 취소 (필요시)
# korail.cancel(reservation)
```

---

### 여러 승객 타입 처리

```python
from srtgo.srt import SRT, Adult, Child, Senior, Disability1To3

srt = SRT("your_id", "your_password")

# 다양한 승객 타입
passengers = [
    Adult(2),           # 성인 2명
    Child(1),           # 어린이 1명
    Senior(1),          # 경로 1명
    Disability1To3(1)   # 장애인 1~3급 1명
]

trains = srt.search_train(
    "수서",
    "부산",
    "20250125",
    "100000",
    passengers=passengers
)

reservation = srt.reserve(trains[0], passengers=passengers)
```

---

### 예외 처리

```python
from srtgo.srt import (
    SRT,
    SRTLoginError,
    SRTResponseError,
    SRTNotLoggedInError
)

try:
    # 로그인
    srt = SRT("your_id", "your_password")

    # 열차 검색
    trains = srt.search_train("수서", "부산", "20250125")

    if not trains:
        print("이용 가능한 열차가 없습니다")
    else:
        # 예약
        reservation = srt.reserve(trains[0])
        print(f"예약 성공: {reservation}")

except SRTLoginError as e:
    print(f"로그인 실패: {e.msg}")
except SRTNotLoggedInError:
    print("로그인이 필요합니다")
except SRTResponseError as e:
    print(f"서버 오류: {e.msg}")
except Exception as e:
    print(f"알 수 없는 오류: {e}")
```

---

## 주의사항

1. **상업적 사용 금지**: 본 프로그램의 모든 상업적, 영리적 이용을 엄격히 금지합니다.

2. **개인정보 보호**: 아이디, 비밀번호, 카드번호 등은 로컬 컴퓨터에 [keyring 모듈](https://pypi.org/project/keyring/)을 통하여 저장되며, 네트워크 전송 등을 통하여 외부로 공유되지 않습니다.

3. **책임**: 본 프로그램 사용에 따른 민형사상 책임을 포함한 모든 책임은 사용자에게 있으며, 개발자는 어떠한 책임도 부담하지 않습니다.

4. **요청 빈도**: 과도한 요청은 IP 차단을 유발할 수 있으니 적절한 간격을 두고 요청하세요.

5. **NetFunnel**: 혼잡 시간대에는 NetFunnel 대기열을 통과해야 하므로 검색 시간이 길어질 수 있습니다.

---

## 라이선스

본 프로젝트는 다음 프로젝트의 코드를 포함합니다:
- [SRT](https://github.com/ryanking13/SRT) by ryanking13 (MIT License)
- [korail2](https://github.com/carpedm20/korail2) by carpedm20 (BSD License)

---

## 기여

버그 리포트 및 기능 제안은 [GitHub Issues](https://github.com/lapis42/srtgo/issues)에 등록해 주세요.
