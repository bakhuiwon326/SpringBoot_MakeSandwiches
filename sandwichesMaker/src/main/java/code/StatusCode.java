package code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum StatusCode {
    MAKING("샌드위치 만드는 중"),
    SUPPLIED("고객에게 전달 완료");

    private final String description;
}
