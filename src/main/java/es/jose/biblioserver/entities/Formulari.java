package es.jose.biblioserver.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joseb85
 */
@Entity
@Table(name = "formulari")
@XmlRootElement
public class Formulari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long id;
    @Column(name = "GENERIC")
    private Boolean generic;
    
    @JsonManagedReference
    @OneToOne(mappedBy = "formulari", fetch= FetchType.EAGER, cascade = {CascadeType.ALL})
    private CosFormulari cosFormulari;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getGeneric() {
        return generic;
    }

    public void setGeneric(Boolean generic) {
        this.generic = generic;
    }

    public CosFormulari getCosFormulari() {
        return cosFormulari;
    }

    public void setCosFormulari(CosFormulari cosFormulari) {
        this.cosFormulari = cosFormulari;
    }

}
