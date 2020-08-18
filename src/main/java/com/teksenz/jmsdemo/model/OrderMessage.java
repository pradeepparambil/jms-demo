package com.teksenz.jmsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMessage implements Serializable {
    static final long serialVersionUID = -2250720526938998352L;
    private UUID id;
    private String product;
}
