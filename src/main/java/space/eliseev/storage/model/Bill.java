package space.eliseev.storage.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Товарная накладная
 */
@Entity
@Table(name = "BILL")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bill extends BaseEntity {
    private static final long serialVersionUID = -6936520927801780938L;

    /**
     * Единица товара
     */
    @OneToOne
    @JoinColumn(name = "ITEM_FK")
    private Item item;

    /**
     * Количество товара
     */
    @Column(name = "SIZE")
    private Long size;

    /**
     * Дата поступления
     */
    @Column(name = "DATE_OF_RECEIPT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfReceipt;
}
