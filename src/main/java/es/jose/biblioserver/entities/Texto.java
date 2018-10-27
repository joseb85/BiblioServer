package es.jose.biblioserver.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author joseb85
 */
@Entity
@Table(name = "texto")
@XmlRootElement
public class Texto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "textCa")
    private String textCa;
    @Column(name = "textEs")
    private String textEs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextCa() {
        return textCa;
    }

    public void setTextCa(String textCa) {
        this.textCa = textCa;
    }

    public String getTextEs() {
        return textEs;
    }

    public void setTextEs(String textEs) {
        this.textEs = textEs;
    }

}
