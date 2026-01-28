# SRTgo (Node.js)

한국 고속철도 (SRT/KTX) 예매 도우미 CLI 앱의 Node.js 버전입니다.

## 설치

```bash
cd nodejs
npm install
```

## 실행

```bash
npm start
# 또는
node src/srtgo.js
```

### 디버그 모드

```bash
node src/srtgo.js --debug
```

## 전역 설치

```bash
npm install -g .
srtgo
```

## 기능

- **SRT/KTX 예매**: 자동 예매 대기 및 예약
- **예매 확인/결제/취소**: 예약 내역 관리
- **로그인 설정**: SRT/KTX 계정 설정
- **텔레그램 설정**: 예매 성공 알림
- **카드 설정**: 자동 결제
- **역 설정**: 자주 사용하는 역 설정
- **예매 옵션 설정**: 어린이/경로우대/장애인 승객 옵션

## 요구 사항

- Node.js >= 18.0.0

## 설정 저장 위치

모든 설정은 로컬에 안전하게 저장됩니다 (외부 서버로 전송되지 않음):
- Linux: `~/.config/srtgo/config.json`
- macOS: `~/Library/Preferences/srtgo/config.json`
- Windows: `%APPDATA%\srtgo\config.json`

## 라이선스

MIT License

## 면책 조항

이 프로그램은 개인적인 용도로만 사용해야 하며, 상업적/영리 목적으로 사용해서는 안 됩니다.
