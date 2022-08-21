# eleventhAve
11번가 2022 인턴 사전과제입니다.


# 1. 상품 등록 및 조회

![상품등록](https://user-images.githubusercontent.com/58110070/185794609-57605a52-800d-4993-9f9f-ea1b12a33d37.gif)


  - 맥북 에어라는 상품을 등록하면 상품 목록에 상품이름, 수량, 셀러 아이디, 셀러명이 등록된 것을 확인 하실 수 있습니다. 

# 2. 상품 주문

![상품주문](https://user-images.githubusercontent.com/58110070/185794646-f849a5e4-b651-453b-82ea-1e44ce96dde3.gif)

  - 재고의 수량에 맞게 주문할 시에 상품 상태가 SALE -> SOLD로 변경이 되며, 수량이 차감 된 것을 확인 하실 수 있습니다. 
  
# 3. 상품 주문 예외처리 (재고 수량 부족)

![상품주문예외처리](https://user-images.githubusercontent.com/58110070/185794655-4ab30671-1013-492d-a34c-bf5d4cb40051.gif

  - 재고의 수량보다 초과하여 주문할 시에 주문이 정상적으로 처리되지 않고, 재고의 수량이 부족하다는 LOG가 출력된 것을 확인하실 수 있습니다.

# 4. 상품 주문 취소

![상품주문취소](https://user-images.githubusercontent.com/58110070/185794661-6871505c-2554-4eaf-8d8a-447e4817bee8.gif)

  - CANCEL 버튼을 클릭할 경우 상품의 주문상태가 기존 ORDER 에서 CANCEL로 변경됐으며, 취소한 수량만큼 재고의 수가 다시 늘어났고, 
  상품의 상태가 기존 SOLD에서 SALE로 변경된 것을 확인 하실 수 있습니다. 
  
# 5. 주문 내역

![상품주문내역](https://user-images.githubusercontent.com/58110070/185794670-7f219ad2-7ffc-4736-9ace-3371942c1a2d.gif)

  - 주문, 취소된 주문 내역들을 확인하실 수 있습니다. 
