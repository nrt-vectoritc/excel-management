/**
 * Constants.java 21-sep-2015
 *
 * Copyright 2015 INDITEX.
 * Departamento de Sistemas
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

/**
 * The Class Constants.
 */
public class Constants {
    
    /* COMUN */
    public final static String LOG_SEPARADOR = ":";
    public final static String WEB_SEPARADOR = "/";
    public final static String LISTA_SEPARADOR_DEFAULT = ",";
    public final static String LISTA_SEPARADOR_DEFAULT_WITH_SPACE = ", ";
    public final static String LISTA_SEPARADOR_ERROR_LOG = " || ";
    public final static String LISTA_SEPARADOR_SEMICOLON = ";";
    public final static String I18N_SEPARADOR = "#I18N#";
    public final static String CDATA_INICIO_SEPARADOR = "<![CDATA[";
    public final static String CDATA_FIN_SEPARADOR = "]]>";
    public final static String NOMBRE_APLICACION_INTRANET = "AppSeleweb2";
    public final static String NOMBRE_APLICACION_EXTRANET = "NRT Externo";
    
    /* FECHAS */
    public final static String FORMATO_FECHA_YYYYMMDD = "yyyy-MM-dd";
    public final static String FORMATO_FECHA_DDMMYYYY = "dd/MM/yyyy";
    public final static String FORMATO_FECHA_HORAS_YYYYMMDD = "yyyy-MM-dd HH:mm";
    public final static String FORMATO_FECHA_HORAS_DDMMYYYY_HORAS = "dd/MM/yyyy HH:mm";
    public final static String FECHA_MAXIMA_M4 = "01/01/4000";
    // Fechas especiales meta4
    public final static LocalDate MAX_DATE = new LocalDate(4000, 1, 1);
    public final static LocalDate MIN_DATE = new LocalDate(1800, 1, 1);
    
    /* ROL */
    public final static String ROL_USER_APP = "HSW_USER_HS";
    public final static String ROL_USER_TC_APP = "HSW_USER_TC";
    public final static String ROL_ADMIN_APP = "HSW_USER_HS_SEG";
    public final static String ROL_ADMIN_HS_APP = "HSW_USER_HS_ADM";
    public final static String ROL_ADMIN_TC_APP = "HSW_USER_TC_ADM";
    public final static String ROL_LOGIN_POSICION = "PA_MAESTRO";
    public final static String ROL_LOGIN_UNIDADES_ORGANIZATIVAS = "PA_MAESTRO";
    public final static List<String> ROLES_APP = Arrays.asList(ROL_USER_APP, ROL_USER_TC_APP);
    public final static List<String> PERFILES_APP = Arrays.asList(ROL_USER_APP, ROL_USER_TC_APP, ROL_ADMIN_APP, ROL_ADMIN_HS_APP, ROL_ADMIN_TC_APP);
    public final static List<String> PERFILES_USER_APP = Arrays.asList(ROL_USER_APP, ROL_USER_TC_APP);
    public final static String ROL_USUARIOS_NRT = "usuarios_NRT"; 
    
    /* WEB SERVICES */
    public final static long WS_TIMEOUT = 600000;
    public final static Integer TIMEOUT_SERVICIO_INTEGRACION_COMUN = 200000;
    public final static Integer TIMEOUT_SERVICIO_INTEGRACION_TOKEN = 60000;
    public final static String WS_CONTENT_TYPE = "text/xml;charset=UTF-8";
    
    /* FUENTES DE RECLUTAMIENTO */
    public final static String REFERENCIADO_FUENTE_REFERENCIADOR = "002";
    public final static String REFERENCIADO_FUENTE_TIENDA = "005";
    public final static String REFERENCIADO_FUENTE_ALTA_MANUAL = "006";
    public final static String REFERENCIADO_FUENTE_JOINFASHION = "009";
    public final static String REFERENCIADO_FUENTE_INTALENT = "011";
    public final static String REFERENCIADO_FUENTE_MULTIPOSTING = "012";
    
    /* FUENTES TC */
    public final static String FUENTE_TC_TIPO_MANUAL = "01";
    public final static String FUENTE_TC_TIPO_AUTOMATICA_SIN_ANUNCIO = "02";
    public final static String FUENTE_TC_TIPO_AUTOMATICA_CON_ANUNCIO = "03";
    
    /* CESIÓN DE DATOS INTALENT */
    public final static String INTALENT_CEDE = "0";
    public final static String INTALENT_NO_CEDE = "1";
    public final static String INTALENT_NO_INFO = "2";
  
    /* ESTADO CARPETA CANDIDATO */
    public final static String ESTADOCARPETACANDIDATO_NUEVO = "01";
    public final static String ESTADOCARPETACANDIDATO_PRESELECCIONADO = "02";
    public final static String ESTADOCARPETACANDIDATO_FINALISTA = "03";
    public final static String ESTADOCARPETACANDIDATO_DESCARTADO = "04";
    
    /* CARPETA TC */
    public final static String CARPETA_TC_GENERAL = "1";
    public final static String CARPETA_TC_RECONTRATABLE = "2";
    
    /* ESTADO CANDIDATO-VACANTE */
    public final static String ESTADOCANDIDATOVACANTE_NUEVO = "01";
    public final static String ESTADOCANDIDATOVACANTE_PRESELECCIONADO = "02";
    public final static String ESTADOCANDIDATOVACANTE_FINALISTA = "03";
    public final static String ESTADOCANDIDATOVACANTE_DESCARTADO = "04";
    public final static String ESTADOCANDIDATOVACANTE_CONTRATADO = "31";
    public final static String ESTADOCANDIDATOVACANTE_OFERTADO = "32";
    public final static String ESTADOCANDIDATOVACANTE_RECHAZADO = "33";
    
    /* TIPO DE CITA */
    public final static String TIPOCITA_ENTREVISTA = "04";
    public final static String TIPOCITA_DINAMICA = "01";
    public final static String TIPOCITA_VIDEOCONFERENCIA = "03";
    public final static String TIPOCITA_LLAMADA = "02";
    public final static String TIPOCITA_SEGUIMIENTO = "05";
    
    /* ESTADOS VACANTE */
    public final static String VACANTE_ABIERTA = "01";
    public final static String VACANTE_CANCELADA = "02";
    public final static String VACANTE_CERRADA = "03";
    
    /* ESTADOS OFERTA CANDIDATO */
    public final static String OFERTA_NO_OFERTADO = ""; // Blanco
    public final static String OFERTA_PENDIENTE = "01"; // Blanco
    public final static String OFERTA_ACEPTADA = "02";  // Verde
    public final static String OFERTA_RECHAZADA = "03";  // Rojo
    public final static String OFERTA_CANCELADA = "04";  // Rojo
    
    /* VISIBILIDADES VACANTE */
    public final static String VACANTE_VISIBILIDAD_PUBLICA = "01";
    public final static String VACANTE_VISIBILIDAD_NO_PUBLICA = "02";
    public final static String VACANTE_VISIBILIDAD_CONFIDENCIAL = "03";
    
    /* FUENTES DE DATOS */
    public final static String FUENTE_ALL = "ALL";
    public final static String FUENTE_INT = "INT";
    public final static String FUENTE_IC = "JF";
    public final static String FUENTE_NRT = "HS";
    public final static String FUENTE_WEB = "WE";
    public final static String FUENTE_SEPARADOR = ":";
    
    /* INTEGRACION */
    public final static String DEFAULT_POSICION = "0.0";
    public final static String DEFAULT_NUMBER = "0";
    public final static String DEFAULT_ISO = "ISO";
    public final static String DEFAULT_CONTINENTE_EUROPA = "2";
    public final static String DEFAULT_BLOQUEO = "B";
    public final static String SIN_DESCRIPCION = "-";
    public final static String EXPERIENCIA_PAIS_DESCONOCIDO = "000";
    
    /* TIPOS FICHEROS */
    public final static String TIPO_DOCUMENTO_CV = "CURRICULUM_SELEWEB";
    public final static String TIPO_DOCUMENTO_PORTFOLIO = "PORTFOLIO_SELEWEB";
    
    /* RESPONDER */
    public final static String RESPONDER_PROCESO_70 = "70";
    public final static String RESPONDER_PROCESO_72 = "72";
    public final static String RESPONDER_PROCESO_100 = "100";
    public final static String RESPONDER_PROCESO_70_M4OBJECT = "HSW_DATOS_CAND_PROC";
    public final static String RESPONDER_PROCESO_72_M4OBJECT = "HSW_GEST_OFERTAS_VAC";
    public final static String RESPONDER_PROCESO_100_M4OBJECT = "HSW_DATOS_EMP_PROC";
    public final static String RESPONDER_ASUNTO_SMS = "Inditex Careers";
    public final static String RESPONDER_ORIGEN = "noreply@inditexcareers.com";
    public final static String RESPONDER_TIPO_EMAIL = "0";
    public final static String RESPONDER_TIPO_SMS = "1";
    public final static String RESPONDER_FORMATO = "1";
    public final static String RESPONDER_DESTINO = "1";
    public final static String RESPONDER_PLANIFICADO_NO = "0";
    public final static String RESPONDER_PLANIFICADO_SI = "1";
    // "X" Hace referencia a donde tiene que coger el dato para el candidato.
    // Busca la informacion en la propia tabla HSW_CAND_PERSONA, donde tiene el email y el teléfono.
    public final static String RESPONDER_DESTINO_TIPO = "X";
    
    /* BOOLEAN */
    public final static String TRUE_STRING = "true";
    public final static String FALSE_STRING = "false";
    public final static String TRUE_UNO_STRING = "1";
    public final static String FALSE_CERO_STRING = "0";
    public final static int TRUE_UNO_INT = 1;
    public final static int FALSE_CERO_INT = 0;
    public final static String SI = "S";
    public final static String NO = "N";
    
    /* BUSQUEDAS */
    public final static String ORDER_DESC = "desc";
    public final static String ORDER_ASC = "asc";
    
    /* MAILING */
    public final static String MAILING_APP = "AppCentralCorreoTGT";
    public final static long MAILING_FECHA = 0;
    public final static Integer MAILING_HORAS_AVISO = 1;
    public final static Integer MAILING_HORAS_REENVIO = 1;
    public final static String MAILING_SEPARADOR_TIENDA = ";";
    public final static String MAILING_ENVIADO =  "Enviado";
    public final static String MAILING_NO_ENVIADO =  "No enviado";
    
    //TODO SELEWEBII-1815
    /* RESPUESTA PLANIFICADA */
    public final static String RESULTADO_ENVIO_CEDE = "Enviado";
    public final static String RESULTADO_ENVIO_NO_CEDE = "No enviado";
    public final static String RESULTADO_ENVIO_PLANIFICADA = "Planificada";
    
    /* RESPUESTA PLANIFICADA */
    public final static String RESULTADO_ENVIO_CEDE_00 = "0";
    public final static String RESULTADO_ENVIO_NO_CEDE_01 = "1";
    public final static String RESULTADO_ENVIO_PLANIFICADA_02 = "2";
			  
    /* ESTADO OPERACION DESTINO */
    public final static String DESTINO_OPERACION_OK = "01";
    public final static String DESTINO_OPERACION_PENDIENTE_PUBLICAR = "02";
    public final static String DESTINO_OPERACION_PENDIENTE_DESPUBLICAR = "03";
    public final static String DESTINO_OPERACION_KO = "04";
    
    /* EXPORT */ 
    public final static String TYPE_PDF = "typePdf";
    public final static String TYPE_EXCEL = "typeExcel";
    public final static String TYPE_EXCEL_NEW = "typeExcelNew";
    public final static String EXTENSION_TEMP = ".tmp";
    public final static String EXTENSION_PDF = ".pdf";
    public final static String EXTENSION_ZIP = ".zip";
    public final static String EXTENSION_EXCEL = ".xls";
    public final static String EXTENSION_EXCEL_MACRO = ".xlsm";
    public final static String EXTENSION_EXCEL_NEW = ".xlsx";
    public final static String EXTENSION_JASPER = ".jasper";
    public final static String DOC_CANDIDATOS = "candidatos";
    public final static String DOC_VACANTES = "vacantes";
    public final static String DOC_ANUNCIOS ="anuncios";
    public final static String DOC_VACANTE_CANDIDATOS = "vacante_candidatos";
    public final static String DOC_CANDIDATO_FICHA = "ficha_candidato";
    public final static String DOC_PERMISOS_USUARIOS_ADMIN_TC = "permisos_usuarios_admin_tc";
    public final static String DOC_PERMISOS_USUARIOS_ADMIN_SEG = "permisos_usuarios_admin_seg";
    public final static String DOC_PERMISOS_USUARIOS_ADMIN_HS = "permisos_usuarios_admin_hs";
    public final static String DOC_PERMISOS_USUARIOS_TC = "permisos_usuarios_tc";
    public final static String DOC_PERMISOS_USUARIOS_HS = "permisos_usuarios_hs";
    public final static String DOC_ERROR_IMPORTACION_CANDIDATOS = "errores_importacion_candidatos";
    public final static String DIRECTORY_TEMP = "/tmp";
    
    /* SESSION */
    public final static String SESSION_M4 = "sessionM4";
    public final static String SESSION_M4_USER = "_USER";
    public final static String SESSION_M4_PASSWD = "_PASSWD";
    public final static String SESSION_M4_LANG = "_LANG";
    public final static String SESSION_M4_INTEGRACION_USER = "_USERM4";
    public final static String SESSION_M4_INTEGRACION_PASSWD = "_PASSWDM4";
    public final static String SESSION_M4_INTEGRACION_LANG = "_LANGM4";
    public final static String SESSION_COMBOS = "SESSION_COMBOS";
    public final static String SESSION_USUARIO = "SESSION_USUARIO";
    public final static String SESSION_ETIQUETAS = "SESSION_ETIQUETAS_";
    public final static String SESSION_ID_CANDIDATO_FICHA = "ID_CANDIDATO_FICHA";
    public final static String SESSION_FILTROS_LISTADO_CANDIDATOS = "FILTROS_LISTADO_CANDIDATOS";
    public final static String SESSION_FILTROS_LISTADO_VACANTES = "FILTROS_LISTADO_VACANTES";
    public final static String SESSION_FILTROS_LISTADO_ANUNCIOS = "FILTROS_LISTADO_ANUNCIOS";
    public final static String SESSION_FILTROS_LISTADO_CANDIDATOS_VACANTES = "FILTROS_LISTADO_CANDIDATOS_VACANTES";
    public final static String SESSION_FILTROS_LISTADO_USUARIOS_PERMISOS = "FILTROS_LISTADO_USUARIOS_PERMISOS";
    
    /* TRADUCCIONES */
    public final static String TRADUCCIONES_IDIOMA_SIMP = "2";
    public final static String TRADUCCIONES_IDIOMA_ESP = "3";
    public final static String TRADUCCIONES_IDIOMA_SIMP_ISO = "en_US";
    public final static String TRADUCCIONES_IDIOMA_ESP_ISO = "es_ES";
    public final static String TRADUCCIONES_IDIOMA_SIMP_STD = "SIMP";
    public final static String TRADUCCIONES_IDIOMA_ESP_STD = "ESP";
    public final static String TRADUCCIONES_IDIOMA_SIMP_APP_LOCALE = "en";
    public final static String TRADUCCIONES_IDIOMA_ESP_APP_LOCALE = "es";
    public final static int TRADUCCIONES_IDIOMA_SIMP_APP = 2;
    public final static int TRADUCCIONES_IDIOMA_ESP_APP = 3;
    
    /* TRADUCCIONES FEEDBACK MULTIPOSTING */
    public final static String TRADUCCIONES_INTEGRACION_FEEDBACK_EMAIL_ASUNTO = "feedback.asunto.operacion";
    public final static String TRADUCCIONES_INTEGRACION_FEEDBACK_EMAIL_CUERPO = "feedback.cuerpo.operacion";
    public final static String TRADUCCIONES_INTEGRACION_FEEDBACK_EMAIL_VARIABLE_FUENTE = "feedback.variable.fuente";
    
    /* ESTADO OFERTA EN MULTIPOSTING Y LAS CAUSAS DE LOS MISMOS */
    public static final String ESTADO_MULTIPOSTING_PUBLICADO = "publicado";
    public static final String ESTADO_MULTIPOSTING_PENDIENTE = "pendiente";
    public static final String ESTADO_MULTIPOSTING_ERROR = "error";

    /* MULTIPOSTING */
    // TOKEN CADUCADO
    public static final String CAUSA_ESTADO_MULTIPOSTING_ERROR_REPUBLICAR = "vacantes.anuncio.error.republicar";
    // NO ENVIADO A MULTIPOSTING O SIN INFORMACIÓN
    public static final String CAUSA_ESTADO_MULTIPOSTING_NO_ENVIADO = "anuncio.multiposting.webs.tooltip.errorNoPubWeb";
    // API CAIDO
    public static final String TRADUCCIONES_ERROR_CONEXION_MULTIPOSTING = "anuncio.multiposting.api.off";
    
    /* COMBO */
    public static final String COMBO_SELECCIONADO = "selected";
    
    /* URL UTILS */
    public static final String HTTPS_REGEXP = "[h|H][t|T][t|T][p|P][s|S]";
    public static final String HTTPS = "https";
    public static final String HTTP = "http";
    
    /* IMAGE */
    public static final String IMAGE_SRC_PATTERN = "(?i)SRC";
    public static final String IMAGE_SRC = "SRC";
    public static final String IMAGE_SRC_TEMP = "SRCTEMP";
    public static final String IMAGE_BASE64_SRC_TEMP = "SRC=\"data:image;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\" SRCTEMP";
    public static final String IMAGE_BASE64_DEFAULT = "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAIAAACQd1PeAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAAMSURBVBhXY/j//z8ABf4C/qc1gYQAAAAASUVORK5CYII=";
    public static final String IMAGE_BASE64_SMALL = "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==";
    
    /* TIPO DE FILTRO DE USUARIO*/
    public static final String FILTRO_USURAIO_ID_TIPO_FUNC_LISTADO_CANDIDATOS = "01";
    public static final String FILTRO_USURAIO_ID_TIPO_FUNC_LISTADO_VACANTES = "02";
    public static final String FILTRO_USURAIO_ID_TIPO_FUNC_LISTADO_ANUNCIOS = "03";

    public static final String TIPO_KQ_USUARIO = "usuario";
    public static final String TIPO_KQ_GENERICA = "generica";
    public static final String TIPO_KQ_ANUNCIO = "anuncio";
    
    /* ETIQUETAS I18N */
    public static final String ETIQUETAS_I18N_COMUN = "comun";
    public static final String ETIQUETAS_I18N_VACANTES = "vacantes";
    public static final String ETIQUETAS_I18N_CANDIDTOS = "candidatos";
    public static final String ETIQUETAS_I18N_CITAS = "citas";
    public static final String ETIQUETAS_I18N_INTEGRACION = "integracion";
    
    /* ETIQUETA I18N */
    public static final String ETIQUETAS_I18N_COMUN_PC_TODOS = "pc_todos";
    public static final String ETIQUETAS_I18N_COMUN_NOINFO = "noinfo";
    
    /* ENVIO FICHEROS ADJUNTOS  */
    public static final int MAX_NUM_ATTACHMENTS      = 10; 
    public static final int MAX_SIZE_FILESET_SEND_MB = 20;
    public static final int MAX_SIZE_FILE_SEND_MB    = 2;
    //Mediante Web Service (WS)
    public static final int WS_MAX_NUM_ATTACHMENTS      = 10; 
    public static final int WS_MAX_SIZE_FILESET_SEND_MB = 20;
    public static final int WS_MAX_SIZE_FILE_SEND_MB    = 2;
    
    /* AUTOCITAS */
    public final static String TIPOENVIO_EMAIL = "01";
    public final static String TIPOENVIO_SMS = "02";
    
    /* ERRORES LOGADO */
    public final static String ERROR_DATOS_USUARIO = "STATE_ERR_DATOS_USUARIO";
    public final static String ERROR_ROL_USUARIO = "STATE_ERR_ROL_USUARIO";
    public final static String ERROR_PERFIL_USUARIO = "STATE_ERR_PERFIL_USUARIO";
    public final static String ERROR_ACCESO_USUARIO = "STATE_ERR_ACCESO_USUARIO";
    public final static String ERROR_PERFIL_ROL_USUARIO = "STATE_ERR_PERFIL_ROL_USUARIO";
    public final static String ERROR_COMBOS_USUARIO = "STATE_ERR_COMBOS_USUARIO";
    public final static String ERROR_VALIDAR_ROLES_USUARIO = "STATE_ERR_VALIDAR_ROLES_USUARIO";
	public static final String ERROR_VALIDAR_SEGURIDAD_USUARIO = "STATE_ERR_VALIDAR_SEGURIDAD_USUARIO";
	public final static String ERROR_VALIDAR_SEGURIDAD_USUARIO_TC = "STATE_ERR_VALIDAR_SEGURIDAD_USUARIO_TC";
    
    /* CANDIDATOS FIT */
    public final static String FIT = "1";
    public final static String NO_FIT = "2";
    
    /* EVALUACION */
    public final static String EVALUACION_RESULTADO_NF = "NF";
    public final static String EVALUACION_RESULTADO_Z = "Z";
    public final static String EVALUACION_RESULTADO_NS = "NS";
    
    /* CANDIDATOS ESTADOS */
    public final static String NUEVO="01";
    public final static String PRESELECCIONADO="02";
    public final static String DESCARTADO_SIN_ENTREVISTA="03";
    public final static String DESCARTADO_EN_PRESELECCIÓN="04";
    public final static String DESCARTADO_CON_ENTREVISTA="05";
    public final static String EN_PROCESO="06";
    public final static String FINALISTA="07";
    public final static String CONTRATADO="08";
    public final static String DESCARTADO_NO_RECUPERABLE="09";
    public final static String DESCARTADO_RECUPERABLE="10";
    
    /* EVALUACIONES CANDIDATOS */
    public final static String DENTRO_VACANTE="DENTRO_VACANTE";
    public final static String FUERA_VACANTE="FUERA_VACANTE";
    public final static String ULTIMA_EVAL="ULTIMA_EVAL";

    /*TIPOS DE CANDIDATOS*/
    public final static String CANDIDATO_EMPLEADO ="01";
    public final static String CANDIDATO_INTALENT ="02";
    public final static String CANDIDATO_EXEMPLEADO = "03";
    public final static String CANDIDATO_EXTERNO= "04";
    
    /*MOTIVO RECHAZO CANDIDATO VACANTE*/
    public final static String MOTIVO_SALARIO =  "01";
    public final static String MOTIVO_BENEFITS =  "02";
    public final static String MOTIVO_HORAS_OFERTADAS =  "03";
    public final static String MOTIVO_HORARIO_DISPONIBILIDAD =  "04";
    public final static String MOTIVO_TEMPORALIDAD_CONTRATO =  "05";
    public final static String MOTIVO_UBICACION =  "06";
    public final static String MOTIVO_ENCONTRO_OTRO_TRABAJO =  "07";
    public final static String MOTIVO_NO_INTERESADO_MARCA =  "08";
    public final static String MOTIVO_NO_INTERESADO_POSICION =  "09";
    public final static String MOTIVO_OTROS =  "10";
        
    /*TIPO DESCARTE*/
    public final static String TIPODESCARTE_DESCARTE =  "D";
    public final static String TIPODESCARTE_RECHAZADA =  "R";
    
    /*ESTADO CANDADO*/
    public final static String CANDADO_DESBLOQUEADO =  "B";
    public final static String CANDADO_SELECCIONADO =  "A";
    public final static String CANDADO_OFERTADO =  "R";
    public final static int CANDADO_DIAS_BLOQUEO =  30;
    
    /*ENCODING*/
    public final static String ENCODING_NRT =  "UTF-8";
    public final static String ENCODING_META4 =  "ISO-8859-1";
    
    /*PATTERN*/
    public final static String PATTERN_EMAIL_BASE = "['_A-Za-z0-9-&]+(\\.['_A-Za-z0-9-&]+)*[.]{0,1}@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))";
    
    /*PATTERN META4*/
    public final static String PATTERN_FILE_STRICT = "[^A-Za-z0-9-_]";
    public final static String PATTERN_FILE_META4 = "[\"<&]";
    public final static String PATTERN_FILE_SPACES = "\\s+";
    public final static String FILENAME_DEFAULT = "file";
    public final static String FILENAME_SEPARATOR_DEFAULT = "-";
    public final static String FILENAME_SEPARATOR_EXTENSION = ".";
    public final static String ENHE = "ñ";
    public final static String ENE = "n";
    
    /*TIPO CARGA ANUNCIOS*/
    public final static String TIPO_CARGA_ANUNCIO_VACANTE =  "1";
    public final static String TIPO_CARGA_ANUNCIO_GENERICO =  "2";
    
    /*REPORTING SERVICE*/
   	public final static int REPORTING_SERVICE_TIMEOUT = 600000;
    
    /*VACANTES*/
    public final static String VACANTES_ESTABLECER_SUBESTADO = "ESTABLECER_SUBESTADO";
    public final static String VACANTES_ESTABLECER_SUBESTADO_FORZADO= "ESTABLECER_SUBESTADO_FORZADO";
    
    /* CITAS */
    public static enum CITA {
        DINAMICA("01", "#EBF7F1", "#EBF7F1","dinamica", "alta.tipo.dinamica"), 
        LLAMADA("02", "#FADAD7", "#FADAD7","llamada","alta.tipo.llamada"), 
        VIDEO("03", "#DFDFDF", "#DFDFDF","videoconferencia", "alta.tipo.video"), 
        ENTREVISTA("04","#FCFBDF","#FCFBDF", "entrevista", "alta.tipo.entrevista"), 
        SEGUIMIENTO("05", "#EFF1F5","#EFF1F5", "seguimiento","alta.tipo.seguimiento"), 
        AUTO_CITA("90", "#FFFFFF", "#FCF1F1","autocita", "alta.tipo.autocita");

        private final String codigo;
        private final String color;
        private final String color2;
        private final String className;
        private final String etiquetaName;

        private CITA(final String codigo, final String color, final String color2,final String className, final String etiquetaName) {
            this.codigo = codigo;
            this.color = color;
            this.color2 = color2;
            this.className = className;
            this.etiquetaName = etiquetaName;
        }

        /**
         * @return the tipo
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * @return the color
         */
        public String getColor() {
            return color;
        }

        /**
         * @return the color2
         */
        public String getColor2() {
            return color2;
        }

        /**
         * @return the className
         */
        public String getClassName() {
            return className;
        }

        /**
         * @return the etiquetaName
         */
        public String getEtiquetaName() {
            return etiquetaName;
        }

        public static String getColor(String idTipoCita, boolean withCandidatos) {
           for (CITA cita : values()){
               if (cita.getCodigo().equals(idTipoCita)){
                   return (withCandidatos)?cita.getColor2():cita.getColor();
               }
           }
           return null;
        }

        public static String getClassName(String idTipoCita, boolean withCandidatos) {
            for (CITA cita : values()){
                if (cita.getCodigo().equals(idTipoCita)){
                    return (withCandidatos)?cita.getClassName()+" withcandidatos":cita.getClassName();
                }
            }
            return null;
        }

        public static String getEtiqueta(String idTipoCita) {
            for (CITA cita : values()){
                if (cita.getCodigo().equals(idTipoCita)){
                    return cita.getEtiquetaName();
                }
            }
            return null;
        }

    }
    
    /* EVALUACIONES */
	public static enum EVALUACION_RESULTADO {
		NS("NS", "comun.evaluacion.resultado.tooltip.NS");

		private final String id;
		private final String tooltip;

		private EVALUACION_RESULTADO(final String id, final String tooltip) {
			this.id = id;
			this.tooltip = tooltip;
		}

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @return the tooltip
		 */
		public String getTooltip() {
			return tooltip;
		}

		public static String getTooltip(String id) {
			String result = null;
			for (EVALUACION_RESULTADO evaluacion : values()) {
				if (evaluacion.getId().equalsIgnoreCase(id)) {
					result = evaluacion.getTooltip();
					break;
				}
			}
			return result;
		}

	}
	
	public final static String ORIGEN_PRESELECCION = "PRESEL";
	public final static String ORIGEN_CLASIFICACION = "CLASIF";
	public final static String ORIGEN_LISTADO_CANDIDATOS = "CANDID";
	
	public final static String ORIGEN_VIEW_PRESELECCION = "preseleccion";
	public final static String ORIGEN_VIEW_CLASIFICACION = "clasificacion";
	
	public final static Map<String, String> origenMap;
	
	static {
		origenMap = new HashMap<String, String>();
		origenMap.put(ORIGEN_VIEW_PRESELECCION, ORIGEN_PRESELECCION);
		origenMap.put(ORIGEN_VIEW_CLASIFICACION, ORIGEN_CLASIFICACION);
	}
	
	public final static String DUPLICADO_PEDIR_CONFIRMACION = "S";
	public final static String DUPLICADO_CONFIRMAR = "C";
	public final static String DUPLICADO_DEFAULT = "N";
	
	/* DISPONIBILIDAD */
	
	public final static String LUNES_MANHANA = "1M";
	public final static String LUNES_TARDE = "1T";
	public final static String LUNES_NOCHE = "1N";
	public final static String MARTES_MANHANA = "2M";
	public final static String MARTES_TARDE = "2T";
	public final static String MARTES_NOCHE = "2N";
	public final static String MIERCOLES_MANHANA = "3M";
	public final static String MIERCOLES_TARDE = "3T";
	public final static String MIERCOLES_NOCHE = "3N";
	public final static String JUEVES_MANHANA = "4M";
	public final static String JUEVES_TARDE = "4T";
	public final static String JUEVES_NOCHE = "4N";
	public final static String VIERNES_MANHANA = "5M";
	public final static String VIERNES_TARDE = "5T";
	public final static String VIERNES_NOCHE = "5N";
	public final static String SABADO_MANHANA = "6M";
	public final static String SABADO_TARDE = "6T";
	public final static String SABADO_NOCHE = "6N";
	public final static String DOMINGO_MANHANA = "7M";
	public final static String DOMINGO_TARDE = "7T";
	public final static String DOMINGO_NOCHE = "7N";
	
	public final static Map<String, Integer> PERMISO_TRABAJO_MAP;
	
	static {
		PERMISO_TRABAJO_MAP = new HashMap<String, Integer>();
		PERMISO_TRABAJO_MAP.put("N", 0);
		PERMISO_TRABAJO_MAP.put("S", 1);
		PERMISO_TRABAJO_MAP.put("NA", 2);
	}
}