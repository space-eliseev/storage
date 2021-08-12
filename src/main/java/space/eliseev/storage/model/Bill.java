package space.eliseev.storage.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Товарная накладная
 */
@Entity
@Table(name = "BILL")
@Builder
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bill extends BaseEntity {
    private static final long serialVersionUID = -6936520927801780938L;
}
