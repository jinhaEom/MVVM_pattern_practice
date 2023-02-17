## paging 라이브러리
- 하나의 문서를 분리된 페이지로 나누는것
- 웹 or DB에 취급해야하는 데이터가 너무 큰 경우 paging 개념 적용
- (ex. google 검색어 입력시 페이지별로 나눠 데이터 보여주는 경우)


<img src="https://user-images.githubusercontent.com/84216838/219611264-42e8c95f-1673-4a52-a10b-81c1a7003e74.png" width= 700 height =250>

### Jetpack Paging 구성요소
- Repository
    - PagingSource : 데이터 소스와 그 소스에서 데이터를 검색하는 방법 정의
    - RemoteMediator : 로컬 데이터베이스에 네트워크 데이터를 캐시하는 동작을 관리

- ViewModel
    - Pager : Repository에서 정의한 PagingSource 와 PagingConfig를 생성자로 받아 PagingData를 반환하는 API를 제공.
    - PagingData : Pager에 의해 페이징 된 데이터를 담는 컨테이너

- UI
    - PagingDataAdapter : PagingData를 표시할 수 있는 RecyclerView 어댑터

<img src="https://user-images.githubusercontent.com/84216838/219612290-6c4ddf62-8c80-48b5-addd-98f0186d8f1c.png" width= 700 height =300>