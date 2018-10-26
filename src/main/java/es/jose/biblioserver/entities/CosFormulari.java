package es.jose.biblioserver.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Entity
@Table(name = "cosformulari")
@XmlRootElement
public class CosFormulari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false) 
    @Column(name = "FORMULARI")
    private Long formulari;
    @Column(name = "PATTERN")
    private String pattern;

    public Long getFormulari() {
        return formulari;
    }

    public void setFormulari(Long formulari) {
        this.formulari = formulari;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    
}