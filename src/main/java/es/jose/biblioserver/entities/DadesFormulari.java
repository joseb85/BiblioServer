package es.jose.biblioserver.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author joseb85
 */
@Entity
@Table(name = "dadesformulari")
@XmlRootElement
public class DadesFormulari implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ordre")
    private Integer ordre;
    
    // Con JsonBackReference evitamos que el objeto se incluya en el JSON de la respuesta. Es esencial para evitar bucles infinitos con las referencias (saltaría una excepción)
    @JsonBackReference
    @JoinColumn(name = "FORMULARI", referencedColumnName = "FORMULARI")
    @ManyToOne(fetch = FetchType.EAGER)
    private CosFormulari formulari;
    // En el JoinColumn el "name" es el nombre de la propiedad en la BD (como en el name de @Column) y "referencedColumnName" es el de la columna de BD a la que apunta en la otra tabla
    // En el Cascade se han incluido todos los tipos menos REMOVE y MERGE. De esta manera hará todas las operaciones con Texto menos eliminar cuando se guarde un DadesFormulari en la lista de CosFormulari
    @JoinColumn(name = "TITOL", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    private Texto titol;

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

    public CosFormulari getFormulari() {
        return formulari;
    }

    public void setFormulari(CosFormulari formulari) {
        this.formulari = formulari;
    }
    
}
