//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.12.02 xe0s 10:24:58 AM AMT 
//


package br.com.cafeperfeito.xsd.config_sis.layoutConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Stat complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="Stat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="tipo" use="required" type="{}Tstr_14" /&gt;
 *       &lt;attribute name="descricao" use="required" type="{}Tstr" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stat")
public class Stat {

    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "tipo", required = true)
    protected String tipo;
    @XmlAttribute(name = "descricao", required = true)
    protected String descricao;

    /**
     * ObtxE9m o valor da propriedade id.
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * ObtxE9m o valor da propriedade tipo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * ObtxE9m o valor da propriedade descricao.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

}
