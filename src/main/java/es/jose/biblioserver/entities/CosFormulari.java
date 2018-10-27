package es.jose.biblioserver.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "FORMULARI")
    private Long formulari;
    @Column(name = "PATTERN")
    private String pattern;

    @JsonManagedReference
    @OneToMany(mappedBy = "formulari", fetch = FetchType.EAGER, cascade = { CascadeType.ALL}, orphanRemoval = true)
    private Set<DocumentFormulari> documentFormulari;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "formulari", fetch = FetchType.EAGER, cascade = { CascadeType.ALL}, orphanRemoval = true)
    private Set<DadesFormulari> dadesFormulari;

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

    public Set<DadesFormulari> getDadesFormulari() {
        return dadesFormulari;
    }

    public void setDadesFormulari(Set<DadesFormulari> dadesFormulari) {
        this.dadesFormulari = dadesFormulari;
    }

    public Set<DocumentFormulari> getDocumentFormulari() {
        return documentFormulari;
    }

    public void setDocumentFormulari(Set<DocumentFormulari> documentFormulari) {
        this.documentFormulari = documentFormulari;
    }

}
