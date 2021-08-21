package space.eliseev.storage.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Склад
 */
@Entity
@Table(name = "STORAGE")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Storage extends BaseEntity {
    private static final long serialVersionUID = 434841428825992288L;

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

