package space.eliseev.storage.model;

import lombok.*;

import javax.persistence.*;

/**
 * Тип товара
 */
@Entity
@Table(name = "ITEM_TYPE")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ItemType extends BaseEntity {
    private static final long serialVersionUID = -8215147498218883964L;

    /**
     * Наименование типа товара
     */
    @Column(name = "NAME")
    private String name;
}
