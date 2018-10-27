package es.jose.biblioserver.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Entity
@Table(name = "documentformulari")
@XmlRootElement
public class DocumentFormulari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ordre")
    private Integer ordre;
    
    @JsonBackReference
    @JoinColumn(name = "FORMULARI", referencedColumnName = "FORMULARI")
    @ManyToOne(fetch = FetchType.EAGER)
    private CosFormulari formulari;
    
    @JoinColumn(name = "TITOL", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Texto titol;
    
    @JoinColumn(name = "DOCUMENT", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Document document;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    } 

    public Texto getTitol() {
        return titol;
    }

    public void setTitol(Texto titol) {
        this.titol = titol;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public CosFormulari getFormulari() {
        return formulari;
    }

    public void setFormulari(CosFormulari formulari) {
        this.formulari = formulari;
    }
    
}
