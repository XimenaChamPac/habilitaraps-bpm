
package com.company.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "SolicitudHAPS")
@Table(name = "SOLICITUDHAPS")
@NamedQueries({
    @NamedQuery(name = "SolicitudHAPS.findByPersistenceId", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "SolicitudHAPS.findBySolicitanteHapsId", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.solicitanteHapsId= :solicitanteHapsId\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByFechaSoliHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.fechaSoliHaps= :fechaSoliHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByDniHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.dniHaps= :dniHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByNombresHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.nombresHaps= :nombresHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByApellidosHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.apellidosHaps= :apellidosHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByEmpresaHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.empresaHaps= :empresaHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByCategoriaHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.categoriaHaps= :categoriaHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByFirmaGmHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.firmaGmHaps= :firmaGmHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByFirmaGtucvHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.firmaGtucvHaps= :firmaGtucvHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByImpresion", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.impresion= :impresion\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.findByEstadoSoliHaps", query = "SELECT s\nFROM SolicitudHAPS s\nWHERE s.estadoSoliHaps= :estadoSoliHaps\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.find", query = "SELECT s\nFROM SolicitudHAPS s\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudHAPS.countForFindBySolicitanteHapsId", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.solicitanteHapsId= :solicitanteHapsId\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByFechaSoliHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.fechaSoliHaps= :fechaSoliHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByDniHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.dniHaps= :dniHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByNombresHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.nombresHaps= :nombresHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByApellidosHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.apellidosHaps= :apellidosHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByEmpresaHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.empresaHaps= :empresaHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByCategoriaHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.categoriaHaps= :categoriaHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByFirmaGmHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.firmaGmHaps= :firmaGmHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByFirmaGtucvHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.firmaGtucvHaps= :firmaGtucvHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByImpresion", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.impresion= :impresion\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFindByEstadoSoliHaps", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\nWHERE s.estadoSoliHaps= :estadoSoliHaps\n"),
    @NamedQuery(name = "SolicitudHAPS.countForFind", query = "SELECT COUNT(s)\nFROM SolicitudHAPS s\n")
})
public class SolicitudHAPS implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "SOLICITANTEHAPSID", nullable = false)
    private Long solicitanteHapsId;
    @Column(name = "FECHASOLIHAPS", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate fechaSoliHaps;
    @Column(name = "DNIHAPS", nullable = false, length = 255)
    private String dniHaps;
    @Column(name = "NOMBRESHAPS", nullable = false, length = 255)
    private String nombresHaps;
    @Column(name = "APELLIDOSHAPS", nullable = false, length = 255)
    private String apellidosHaps;
    @Column(name = "EMPRESAHAPS", nullable = false, length = 255)
    private String empresaHaps;
    @Column(name = "CATEGORIAHAPS", nullable = false, length = 255)
    private String categoriaHaps;
    @Column(name = "FIRMAGMHAPS", nullable = true)
    private Boolean firmaGmHaps;
    @Column(name = "FIRMAGTUCVHAPS", nullable = true)
    private Boolean firmaGtucvHaps;
    @Column(name = "IMPRESION", nullable = true)
    private Boolean impresion;
    @Column(name = "ESTADOSOLIHAPS", nullable = true)
    private Boolean estadoSoliHaps;

    public SolicitudHAPS() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setSolicitanteHapsId(Long solicitanteHapsId) {
        this.solicitanteHapsId = solicitanteHapsId;
    }

    public Long getSolicitanteHapsId() {
        return solicitanteHapsId;
    }

    public void setFechaSoliHaps(LocalDate fechaSoliHaps) {
        this.fechaSoliHaps = fechaSoliHaps;
    }

    public LocalDate getFechaSoliHaps() {
        return fechaSoliHaps;
    }

    public void setDniHaps(String dniHaps) {
        this.dniHaps = dniHaps;
    }

    public String getDniHaps() {
        return dniHaps;
    }

    public void setNombresHaps(String nombresHaps) {
        this.nombresHaps = nombresHaps;
    }

    public String getNombresHaps() {
        return nombresHaps;
    }

    public void setApellidosHaps(String apellidosHaps) {
        this.apellidosHaps = apellidosHaps;
    }

    public String getApellidosHaps() {
        return apellidosHaps;
    }

    public void setEmpresaHaps(String empresaHaps) {
        this.empresaHaps = empresaHaps;
    }

    public String getEmpresaHaps() {
        return empresaHaps;
    }

    public void setCategoriaHaps(String categoriaHaps) {
        this.categoriaHaps = categoriaHaps;
    }

    public String getCategoriaHaps() {
        return categoriaHaps;
    }

    public void setFirmaGmHaps(Boolean firmaGmHaps) {
        this.firmaGmHaps = firmaGmHaps;
    }

    public Boolean isFirmaGmHaps() {
        return firmaGmHaps;
    }

    public void setFirmaGtucvHaps(Boolean firmaGtucvHaps) {
        this.firmaGtucvHaps = firmaGtucvHaps;
    }

    public Boolean isFirmaGtucvHaps() {
        return firmaGtucvHaps;
    }

    public void setImpresion(Boolean impresion) {
        this.impresion = impresion;
    }

    public Boolean isImpresion() {
        return impresion;
    }

    public void setEstadoSoliHaps(Boolean estadoSoliHaps) {
        this.estadoSoliHaps = estadoSoliHaps;
    }

    public Boolean isEstadoSoliHaps() {
        return estadoSoliHaps;
    }

}
