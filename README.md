# 일정 관리 앱
## 기능목록
### 일정 생성 및 조회 

- **일정 생성(일정 작성하기)**
    - 일정 생성 시, 포함 데이터
        - `할일`, `작성자명`, `비밀번호`, `작성/수정일` 저장
    - 각 일정의 고유 식별자(ID)를 자동으로 생성하여 관리 
    - 최초 입력 시, 수정일은 작성일과 동일`
- **선택 일정 조회(선택한 일정 정보 불러오기)**
    - 선택한 일정 단건의 정보를 조회
    - 일정의 고유 식별자(ID)를 사용하여 조회

### 일정 수정 및 삭제

- **선택한 일정 수정**
- **선택한 일정 삭제**
    - 선택한 일정 삭제
      
## API 명세서

### 일정 등록
- POST : "/api/schedule"
- **RequestBody**
  
    {
    "scheduleId": "123",
    "createDate": "2024-10-03 14:00:00",
    "updateDate": "2024-10-03 14:00:00",
    "content": "신규등록",
    "createBy": "lizzy"
  }

- **ResponseBody**
  
    {
  "scheduleId": 1,
  "createDate": "2024-10-03 14:00:00",
  "updateDate": "2024-10-03 14:00:00",
  "content": "신규등록",
  "createBy": "lizzy"
  }

### 일정 단건 조회
- GET :"/api/schedule/{schedule-id}"
- **ResponseBody**
  
{
  "scheduleId": 1,
  "createDate": "2024-10-03 14:00:00",
  "updateDate": "2024-10-03 14:00:00",
  "content": "신규등록",
  "createBy": "liyyz"
  }

### 일정 수정 조회
- PATCH : "/api/schedule/{schedule-id}"
- **RequestBody**

{
  "scheduleId": "1",
  "createDate": "2024-10-03 14:00:00",
  "updateDate": "2024-10-03 14:00:00",
  "content": "업데이트",
  "createBy": "liyyz"
  }
- **ResponseBody**

{
"scheduleId": 1,
"createDate": "2024-10-03 14:00:00",
"updateDate": "2024-10-03 14:00:00",
"content": "업데이트",
"createBy": "liyyz"
}
### 일정 삭제
- DELETE : "/api/schedule/{schedule-id}"

## ERD
![erd](/img/erd.png)

