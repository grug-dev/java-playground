package org.kkpa.pgutil.models.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Item {

  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
  private int quantity;
  private String imageUrl; // Optional for visual representation
}