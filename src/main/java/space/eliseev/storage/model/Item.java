package space.eliseev.storage.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

/**
 * Единица товара
 */
@Entity
@Table(name = "ITEM")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Item extends BaseEntity {
    private static final long serialVersionUID = -7592814301528030297L;

    /**
     * Наименование товара
     */
    @Column(name = "NAME")
    private String name;

    /**
     * Уникальный идентификатор товара
     */
    @Column(name = "SERIAL_NAME")
    private String serialName;

    /**
     * Тип товара
     */
    @JoinColumn(name = "TYPE_FK")
    @ManyToOne
    private ItemType type;
}
