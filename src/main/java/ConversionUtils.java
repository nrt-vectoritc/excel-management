/**
 * ConversionUtils.java 02-dic-2015
 *
 * Copyright 2015 INDITEX.
 * Departamento de Sistemas
 */


import java.beans.PropertyDescriptor;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.OptimisticLockingFailureException;


/**
 * The Class ConversionUtils.
 */
public class ConversionUtils {
    
    
	private static String VERSION_PROPERTY_NAME = "longModificationDate";
	private static String VERSION_TARGET_PROPERTY_NAME = "modificationDate";

	private ConversionUtils() {
	}

	/**
	 * If source object includes a "version" property and it is not null, checks
	 * if source and target objects have the same value for such a property. If
	 * the value is not the same, "OptimisticLockingFailureException" is thrown.
	 * 
	 * @param source
	 *            A
	 * @param target
	 *            B
	 * @return void
	 */
	public static <A, B> void checkVersion(A source, B target) throws Throwable {
		Object sourceVersion = extractProperty(source, VERSION_PROPERTY_NAME);
		Object targetVersion = extractProperty(target,
				VERSION_TARGET_PROPERTY_NAME);
		if (sourceVersion != null) {
			if (!sourceVersion.equals(targetVersion)) {
				System.out.println("Version mismatch");
				throw new OptimisticLockingFailureException("Version mismatch");
			}
		}
	}

	/**
	 * Extract property.
	 *
	 * @param source source
	 * @param propertyName property name
	 * @return the object
	 */
	private static Object extractProperty(final Object source,
			String propertyName) throws Throwable {
		PropertyDescriptor descriptor = BeanUtils.getPropertyDescriptor(
				source.getClass(), propertyName);
		if (descriptor == null) {
			return null;
		}
		try {
			return descriptor.getReadMethod().invoke(source);
		} catch (RuntimeException e) {
			System.out.println("Error no controlado.");
			throw new RuntimeException(String.format(
					"Property %s cannot be read on %s", propertyName, source
							.getClass().getName()), e);
		} catch (Exception e) {
			System.out.println("Error no controlado.");
			throw new RuntimeException(String.format(
					"Property %s cannot be read on %s", propertyName, source
							.getClass().getName()), e);
		}
	}
	
	/**
	 * Obtiene date.
	 *
	 * @return date
	 */
	public static Date getDate() {
	    Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
	}
	
	/**
	 * Format date.
	 *
	 * @param date date
	 * @return the date
	 */
	public static Date formatDate(String date) {
	    return ConversionUtils.formatDateWithPattern(date, Constants.FORMATO_FECHA_DDMMYYYY);
	}
	
	/**
	 * Format date with pattern.
	 *
	 * @param date date
	 * @param pattern pattern
	 * @return the date
	 */
	public static Date formatDateWithPattern(String date, String pattern) {
        Date result = null;
        try {
            if(StringUtils.isNotBlank(date)){
                SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                result = sdf.parse(date);
            }
        } catch (Throwable t) {
            System.out.println("ERROR");
        }
        return result;
    }

	/**
	 * Obtiene value.
	 *
	 * @param value value
	 * @return value
	 */
	public static String getValue(String value) {
        return getValue(value, null);
    }
	
	/**
	 * Obtiene value.
	 *
	 * @param value value
	 * @param defaultValue default value
	 * @return value
	 */
	public static String getValue(String value, String defaultValue) {
	    return StringUtils.isBlank(value) ? defaultValue : value;
	}
	
	/**
	 * Obtiene value.
	 *
	 * @param value value
	 * @param defaultValue default value
	 * @return value
	 */
	public static Boolean getValue(Boolean value, Boolean defaultValue) {
        return value == null ? defaultValue : value;
    }
	
	/**
	 * Replace all.
	 *
	 * @param value value
	 * @param regex regex
	 * @param replacement replacement
	 * @return the string
	 */
	public static String replaceAll(String value, String regex, String replacement) {
        return StringUtils.isBlank(value) ? value : value.replaceAll(regex, replacement);
    }
	
	
	
	/**
	 * Obtiene id idioma from iso.
	 *
	 * @param value value
	 * @return id idioma from iso
	 */
	public static String getIdIdiomaFromIso(String value){
	    String result = Constants.TRADUCCIONES_IDIOMA_SIMP;
	    if(Constants.TRADUCCIONES_IDIOMA_ESP_ISO.equals(value)){
	        result = Constants.TRADUCCIONES_IDIOMA_ESP;
	    }
	    return result;
	}
	
	/**
	 * Obtiene id idioma std from iso.
	 *
	 * @param value value
	 * @return id idioma std from iso
	 */
	public static String getIdIdiomaStdFromIso(String value){
        String result = Constants.TRADUCCIONES_IDIOMA_SIMP_STD;
        if(Constants.TRADUCCIONES_IDIOMA_ESP_ISO.equals(value)){
            result = Constants.TRADUCCIONES_IDIOMA_ESP_STD;
        }
        return result;
    }
	
	/**
	 * Obtiene min date.
	 *
	 * @param date date
	 * @return min date
	 */
	public static Date getMinDate(Date date){
	    Date result = date;
	    if(result != null){
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(result);
	        calendar.set(Calendar.HOUR_OF_DAY, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MILLISECOND, 0);
	        result = calendar.getTime();
	    }
	    return result;
	}
	
	/**
	 * Obtiene max date.
	 *
	 * @param date date
	 * @return max date
	 */
	public static Date getMaxDate(Date date){
	    Date result = date;
        if(result != null){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(result);
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 59);
            calendar.set(Calendar.MILLISECOND, 999);
            result = calendar.getTime();
        }
        return result;
	}
	
	/**
	 * Encode base64.
	 *
	 * @param is is
	 * @return the string
	 */
	public static String encodeBase64(InputStream is){
	    String result = StringUtils.EMPTY;
	    ByteArrayOutputStream baos = null;
        Base64OutputStream b64os = null;
	    try{
	        if(is != null){
    	        baos = new ByteArrayOutputStream();
    	        b64os = new Base64OutputStream(baos, true, Base64.MIME_CHUNK_SIZE, null);
    	        IOUtils.copyLarge(is, b64os);
    	        b64os.flush();
    	        IOUtils.closeQuietly(b64os);
    	        baos.flush();
    	        result = baos.toString();
	        }
	    } catch (Throwable e) {
	        System.out.println("Error no ConversionUtils.encodeBase64(InputStream)");
        } finally {
            IOUtils.closeQuietly(baos);
            IOUtils.closeQuietly(b64os);
        }
	    return result;
	}
    
	/**
	 * Encode base64.
	 *
	 * @param file
	 * @return
	 */
    public static byte[] encodeBase64File(File file) {
        byte[] result = null;
        
        try {
            byte[] bytes = FileUtils.toByteArray(file);
            result = Base64.encodeBase64(bytes, true);
        } catch (Throwable e) {
        	System.out.println("Error no controlado en ConversionUtils.encodeBase64File(File)");
        }
 
        return result;
    }
 
    /**
     * Decode base64.
     *
     * @param bytes
     * @param resultFile
     * @return
     * @throws Exception
     */
    public static File decodeBase64File(byte[] bytes, String resultFile) throws Exception {
        File file = null;
        BufferedOutputStream out = null;
        
        try {
            byte[] decodedBytes = Base64.decodeBase64(bytes);
            file = new File(System.getProperty("java.io.tmpdir"), resultFile);
            out = new BufferedOutputStream(new FileOutputStream(file));
            IOUtils.write(decodedBytes, out);
            out.flush();
        } catch (Throwable e) {
        	System.out.println("Error no controlado en ConversionUtils.decodeBase64File(byte[], String)");
        } finally {
            IOUtils.closeQuietly(out);
        }
        
        return file;
    }
	
	/**
	 * Src temp.
	 *
	 * @param html html
	 * @return the string
	 */
	public static String srcTemp(String html){
	    if(StringUtils.isNotBlank(html)){
	    	html = html.replaceAll(Constants.IMAGE_SRC_PATTERN, Constants.IMAGE_BASE64_SRC_TEMP);
	    }
	    return html;
	}
	
    /**
     * Transforma fecha a un String formato dd/MM/yyyy
     * 
     * 
     * @param fecha
     *            fecha a cambiar de formato
     * @return fecha transformada
     */
    public static String transformarFecha(Date fecha) {
        String resultado = null;
        try{
            if (fecha != null) {
                SimpleDateFormat sdfDestino = new SimpleDateFormat(Constants.FORMATO_FECHA_DDMMYYYY);
                resultado = sdfDestino.format(fecha);
            }
        } catch (Throwable e) {
        	System.out.println("Error formateando valor transformarFecha()");
        }
        return resultado;
    }
}
