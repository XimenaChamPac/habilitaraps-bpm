
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface SolicitudHAPSDAO
    extends BusinessObjectDAO
{


    public SolicitudHAPS findByPersistenceId(Long persistenceId);

    public List<SolicitudHAPS> findBySolicitanteHapsId(Long solicitanteHapsId, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByFechaSoliHaps(LocalDate fechaSoliHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByDniHaps(String dniHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByNombresHaps(String nombresHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByApellidosHaps(String apellidosHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByEmpresaHaps(String empresaHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByCategoriaHaps(String categoriaHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByFirmaGmHaps(Boolean firmaGmHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByFirmaGtucvHaps(Boolean firmaGtucvHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByImpresion(Boolean impresion, int startIndex, int maxResults);

    public List<SolicitudHAPS> findByEstadoSoliHaps(Boolean estadoSoliHaps, int startIndex, int maxResults);

    public List<SolicitudHAPS> find(int startIndex, int maxResults);

    public Long countForFindBySolicitanteHapsId(Long solicitanteHapsId);

    public Long countForFindByFechaSoliHaps(LocalDate fechaSoliHaps);

    public Long countForFindByDniHaps(String dniHaps);

    public Long countForFindByNombresHaps(String nombresHaps);

    public Long countForFindByApellidosHaps(String apellidosHaps);

    public Long countForFindByEmpresaHaps(String empresaHaps);

    public Long countForFindByCategoriaHaps(String categoriaHaps);

    public Long countForFindByFirmaGmHaps(Boolean firmaGmHaps);

    public Long countForFindByFirmaGtucvHaps(Boolean firmaGtucvHaps);

    public Long countForFindByImpresion(Boolean impresion);

    public Long countForFindByEstadoSoliHaps(Boolean estadoSoliHaps);

    public Long countForFind();

    public SolicitudHAPS newInstance(Long solicitanteHapsId, LocalDate fechaSoliHaps, String dniHaps, String nombresHaps, String apellidosHaps, String empresaHaps, String categoriaHaps);

}
