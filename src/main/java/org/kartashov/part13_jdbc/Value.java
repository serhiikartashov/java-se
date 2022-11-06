package org.kartashov.part13_jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Value {
    private int valueId;
    private String valueName;
    private String cityName;
}
