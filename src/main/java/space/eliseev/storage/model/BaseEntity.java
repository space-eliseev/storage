package space.eliseev.storage.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 5056718007612331015L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
