package com.sandwiches.programming.sandwichesMaker.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SMakerErrorCode {
    SIZE_MISS("존재하지 않는 사이즈입니다. 15cm 혹은 50cm를 선택하세요"),
    NUM_OVER("주문할 수 있는 수량을 초과하였습니다."),
    DUPLICATED_ORDER_NUMBER("중복된 주문번호입니다."),

    // 알 수 없는 에러
    INTERNAL_SERVER_ERROR("서버에 오류가 발생하였습니다."),
    INVALID_REQUEST("잘못된 요청입니다.");

    private final String message;
}
