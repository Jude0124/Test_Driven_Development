# 🏆 TDD 스터디 목적

- 리팩토링을 진행하면서 객체 지향적으로 코딩을 하면서 궁극적으로 좋은 코드, 확장 가능하기 쉬운 아키텍처를 설계하는 능력을 키우기 위함입니다.
- 테스트 모듈을 능숙하게 다루게 되면서 테스트 코드를 작성하는 시간이 줄고 전체적인 생산성을 증가 시킵니다.
- 테스트 코드를 작성하지 않는 환경이라도 향후 서비스가 커지고 안정적인 서비스를 유지하기 위해서는 테스트 코드를 작성 해야 합니다.
- 테스트 하기 쉬운 코드를 고민하게 되면서 중복 코드 및 기능의 모듈화를 좀 더 신경 쓰게 되고 점점 코드의 품질이 올라갑니다.

## 📋 TDD 스터디 진행 방식(1.0)

- 매주 책의 범위를 정하고 해당 목차에 맞는 요구 사항을 의논하고 해당 요구 사항에 맞는 기능을 구현합니다.
- 스터디원들은 해당 요구사항을 인지하고 TDD로 진행을 합니다.
- 기능을 구현 하였다면 pull Request를 올리고 다른 스터디원에게 리뷰를 받습니다.
- 서로 언어가 다를 수 있으니 해당 변수나 메서드들이 무슨 기능을 하는지 자세히 주석을 작성합니다.
- 스터디원은 최소 주 n회 이상 리뷰를 하도록 합니다. (상황에 따라 달라질 수 있습니다.)
- 주 1회 서로 온라인 세션을 통해서 서로 부족했던 부분이나 좋았던 부분을 공유합니다
- 스터디원은 서로 닉네임을 호칭으로 부르며 소통합니다.
- 매주 팀은 로테이션을 돌리며 바뀔 수 있습니다.

## 📢 코드 리뷰 규칙

- **LGTM** (Looks Good To Me, 나에게는 좋아 보인다)
- **NIT**: (Nitpick, 필수적으로 수정할 필요는 없다.)
- 상대를 존중 하면서 ‘제 생각은 이런데 어떻게 생각하시나요?’ 같은 제안하는 말로 해주세요~
- **불필요한 마찰**을 만들 필요는 없습니다.(애매한 성능 증가, 변경하기 애매한 변수명, if문 vs switch 문 등)
- 너무나 긴 로직, 하나의 메서드나 함수의 너무 많은 코드를 넣어 놓지 않도록 합니다.
- 세세한 주석을 작성하여 다른 스터디원이 봐도 알 수 있도록 합니다.
- 의미 없는 변수 명이나 함수 이름은 쓰지 않도록 합니다. (아무리 세세하게 주석을 작성해도 네이밍이 제대로 되어있지 않으면 의미가 없습니다.)
- 나의 **주관적인 생각**은 잠시 접어두고 어떤 의견이든 포용하는 자세로 리뷰를 나눌 수 있도록 합니다

## 📄 pull request template

```
## 요구사항
요구 사항 간단 요약

### [사용 언어]동작 과정
- 동작 과정 1
- 동작 과정 2
- 동작 과정 3

### 궁금한 점 (생략 가능)

### 느낀 점 (생략 가능)
```