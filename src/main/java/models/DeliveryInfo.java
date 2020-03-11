package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class DeliveryInfo {
    private LocalDate deliveryDate;
    private BigDecimal deliveryFee;
    private boolean inStock;
}
