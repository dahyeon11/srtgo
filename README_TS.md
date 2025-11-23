# SRTgo TypeScript

SRT(Super Rapid Train)와 KTX(Korea Train eXpress) 기차표 자동 예매를 위한 **Node.js/TypeScript 라이브러리**입니다.

> 이 프로젝트는 원래 Python 프로젝트 [srtgo](https://github.com/lapis42/srtgo)의 TypeScript 포트 버전입니다.

## ⚠️ 주의사항

- **상업적 사용 금지**: 본 프로그램의 모든 상업적, 영리적 이용을 엄격히 금지합니다.
- **책임**: 본 프로그램 사용에 따른 민형사상 책임을 포함한 모든 책임은 사용자에게 있으며, 개발자는 어떠한 책임도 부담하지 않습니다.
- **개인정보 보호**: 사용자의 아이디, 비밀번호, 카드번호 등은 로컬에서만 사용되며 외부로 전송되지 않습니다.

## 설치

```bash
npm install srtgo-ts
# or
yarn add srtgo-ts
```

## 주요 기능

- ✅ SRT 및 KTX 기차표 자동 예매
- ✅ 열차 검색 및 좌석 확인
- ✅ 예약 및 결제
- ✅ 예약대기 신청
- ✅ 어린이/경로 예매 지원
- ✅ TypeScript 타입 지원

## 빠른 시작

### SRT 기본 예약

```typescript
import { SRT, Adult, Child, SeatType } from 'srtgo-ts';

async function main() {
  // 1. 로그인
  const srt = new SRT('your_id', 'your_password');
  await srt.login();

  // 2. 열차 검색
  const trains = await srt.searchTrain(
    '수서',      // 출발역
    '부산',      // 도착역
    '20250201', // 날짜 (YYYYMMDD)
    '100000',   // 시간 (HHMMSS)
    undefined,  // 시간 제한
    [Adult(2), Child(1)] // 승객
  );

  // 3. 열차 정보 출력
  trains.forEach(train => {
    console.log(train.toString());
  });

  // 4. 예약
  const reservation = await srt.reserve(
    trains[0],
    [Adult(2), Child(1)],
    SeatType.GENERAL_FIRST
  );

  console.log(`예약 번호: ${reservation.reservationNumber}`);
  console.log(`총 비용: ${reservation.totalCost}원`);

  // 5. 로그아웃
  await srt.logout();
}

main().catch(console.error);
```

### 예약대기 (매진 시)

```typescript
import { SRT, Adult, SeatType } from 'srtgo-ts';

async function main() {
  const srt = new SRT('your_id', 'your_password');
  await srt.login();

  // 매진된 열차 포함 검색
  const trains = await srt.searchTrain(
    '수서',
    '부산',
    '20250201',
    '100000',
    undefined,
    [Adult(1)],
    false // availableOnly = false
  );

  // 매진되었지만 예약대기 가능한 열차 찾기
  const soldOutTrain = trains.find(
    train => !train.seatAvailable() && train.reserveStandbyAvailable()
  );

  if (soldOutTrain) {
    // 예약대기 신청
    const reservation = await srt.reserveStandby(
      soldOutTrain,
      [Adult(1)],
      SeatType.GENERAL_FIRST,
      '010-1234-5678' // 알림 받을 전화번호
    );

    // 예약대기 옵션 설정
    await srt.reserveStandbyOptionSettings(
      reservation,
      true,  // SMS 알림 동의
      true,  // 좌석 등급 변경 동의
      '010-1234-5678'
    );

    console.log('예약대기 완료:', reservation.toString());
  }

  await srt.logout();
}

main().catch(console.error);
```

### 신용카드 결제

```typescript
import { SRT, Adult } from 'srtgo-ts';

async function main() {
  const srt = new SRT('your_id', 'your_password');
  await srt.login();

  const trains = await srt.searchTrain('수서', '부산', '20250201');
  const reservation = await srt.reserve(trains[0], [Adult(1)]);

  // 카드 결제
  const paymentSuccess = await srt.payWithCard(
    reservation,
    '1234567890123456',  // 카드 번호 (하이픈 없이)
    '12',                // 카드 비밀번호 앞 2자리
    '981204',            // 생년월일 (YYMMDD) 또는 사업자번호
    '2512',              // 유효기간 (YYMM)
    0,                   // 할부 개월 (0 = 일시불)
    'J'                  // 카드 구분 (J=개인, S=법인)
  );

  if (paymentSuccess) {
    console.log('결제 완료!');
  }

  await srt.logout();
}

main().catch(console.error);
```

## API 문서

### SRT 클래스

#### 생성자

```typescript
new SRT(srtId: string, srtPw: string, autoLogin?: boolean, verbose?: boolean)
```

- `srtId`: SRT 계정 ID (회원번호, 이메일, 또는 전화번호)
- `srtPw`: SRT 계정 비밀번호
- `autoLogin`: 자동 로그인 여부 (기본값: `true`)
- `verbose`: 디버그 로그 출력 여부 (기본값: `false`)

#### 주요 메서드

##### login()

```typescript
async login(srtId?: string, srtPw?: string): Promise<boolean>
```

SRT 서버에 로그인합니다.

##### searchTrain()

```typescript
async searchTrain(
  dep: string,
  arr: string,
  date?: string,
  time?: string,
  timeLimit?: string,
  passengers?: Passenger[],
  availableOnly?: boolean
): Promise<SRTTrain[]>
```

열차를 검색합니다.

- `dep`: 출발역 이름
- `arr`: 도착역 이름
- `date`: 날짜 (YYYYMMDD)
- `time`: 시간 (HHMMSS)
- `passengers`: 승객 리스트
- `availableOnly`: 좌석 있는 열차만 반환 (기본값: `true`)

##### reserve()

```typescript
async reserve(
  train: SRTTrain,
  passengers?: Passenger[],
  option?: SeatType,
  windowSeat?: boolean
): Promise<SRTReservation>
```

열차를 예약합니다.

##### reserveStandby()

```typescript
async reserveStandby(
  train: SRTTrain,
  passengers?: Passenger[],
  option?: SeatType,
  mblPhone?: string
): Promise<SRTReservation>
```

예약대기를 신청합니다.

##### getReservations()

```typescript
async getReservations(paidOnly?: boolean): Promise<SRTReservation[]>
```

예약 목록을 조회합니다.

##### cancel()

```typescript
async cancel(reservation: SRTReservation | string): Promise<boolean>
```

예약을 취소합니다.

##### payWithCard()

```typescript
async payWithCard(
  reservation: SRTReservation,
  number: string,
  password: string,
  validationNumber: string,
  expireDate: string,
  installment?: number,
  cardType?: string
): Promise<boolean>
```

신용카드로 결제합니다.

### 승객 클래스

```typescript
import { Adult, Child, Senior, Disability1To3, Disability4To6 } from 'srtgo-ts';

// 사용 예
const passengers = [
  Adult(2),           // 성인 2명
  Child(1),           // 어린이 1명
  Senior(1),          // 경로 1명
  Disability1To3(1)   // 장애인 1~3급 1명
];
```

### 좌석 타입

```typescript
enum SeatType {
  GENERAL_FIRST = 1,  // 일반실 우선
  GENERAL_ONLY = 2,   // 일반실만
  SPECIAL_FIRST = 3,  // 특실 우선
  SPECIAL_ONLY = 4    // 특실만
}
```

### 역 코드

```typescript
import { STATION_CODE, STATION_NAME } from 'srtgo-ts';

// 역 이름 -> 코드
console.log(STATION_CODE['수서']); // '0551'

// 코드 -> 역 이름
console.log(STATION_NAME['0551']); // '수서'
```

**지원 역 목록:**
수서, 동탄, 평택지제, 대전, 오송, 천안아산, 동대구, 서대구, 경주, 포항, 부산, 울산(통도사), 마산, 창원, 창원중앙, 진영, 진주, 광주송정, 목포, 나주, 익산, 정읍, 전주, 남원, 곡성, 구례구, 순천, 여수EXPO, 여천

## 예외 처리

```typescript
import {
  SRTError,
  SRTLoginError,
  SRTResponseError,
  SRTNotLoggedInError,
  SRTNetFunnelError
} from 'srtgo-ts';

try {
  const srt = new SRT('your_id', 'your_password');
  await srt.login();
  // ...
} catch (error) {
  if (error instanceof SRTLoginError) {
    console.error('로그인 실패:', error.message);
  } else if (error instanceof SRTNotLoggedInError) {
    console.error('로그인이 필요합니다');
  } else if (error instanceof SRTResponseError) {
    console.error('서버 오류:', error.message);
  } else if (error instanceof SRTNetFunnelError) {
    console.error('대기열 오류:', error.message);
  } else {
    console.error('알 수 없는 오류:', error);
  }
}
```

## 빌드

```bash
# TypeScript 컴파일
npm run build

# Watch 모드
npm run build:watch

# Clean
npm run clean
```

## 예제

예제 코드는 `examples/` 디렉토리에서 확인할 수 있습니다:

- `basic-srt.ts` - 기본 SRT 예약
- `standby-reservation.ts` - 예약대기 사용법

```bash
# 예제 실행 (TypeScript로)
npx ts-node examples/basic-srt.ts

# 또는 빌드 후 실행
npm run build
node dist/examples/basic-srt.js
```

## 라이선스

본 프로젝트는 다음 프로젝트의 코드를 포함합니다:
- [SRT](https://github.com/ryanking13/SRT) by ryanking13 (MIT License)
- [korail2](https://github.com/carpedm20/korail2) by carpedm20 (BSD License)

## 기여

버그 리포트 및 기능 제안은 [GitHub Issues](https://github.com/lapis42/srtgo/issues)에 등록해 주세요.

## 관련 프로젝트

- [srtgo (Python)](https://github.com/lapis42/srtgo) - 원본 Python 프로젝트
