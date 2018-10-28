package es.jose.biblioserver.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joseb85
 */
@Entity
@Table(name = "cosformulari")
@XmlRootElement
public class CosFormulari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PATTERN")
    private String pattern;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "FORMULARI")
    private Formulari formulari;

    //Ver dadesFormulari para explicación de la configuración de la lista
    @JsonManagedReference
    @OneToMany(mappedBy = "formulari", fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Set<DocumentFormulari> documentFormulari;

    // Con JsonManagedReference ordenamos que se incluya esta lista cuando se convierta a JSON para devolver el objeto. Por contra el CosFormulari de DadesFormulari no podremos incluirlo
    // Con mappedBy se referencia al CosFormulari de la clase DadesFormulari. El valor debe ser el nombre de la propiedad Java
    // Cascada ALL hace que se realicen todas las operaciones (crear/modificar/eliminar) en cada uno de los ítems (si no hay cascada en los objetos hijos no se realizarán estas operaciones en ellos)
    // Con orphanRemoval se eliminan todos aquellos ítems ausentes al guardar la lista
    // Con fetch EAGER se carga la lista a la vez que es solicitado el objeto en BD
    // Utilizar Set. Con List saltan excepciones
    @JsonManagedReference
    @OneToMany(mappedBy = "formulari", fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Set<DadesFormulari> dadesFormulari;

    public Formulari getFormulari() {
        return formulari;
    }

    public void setFormulari(Formulari formulari) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
