/**
 * MimeUtils.java 02-nov-2016
 *
 * Copyright 2016 INDITEX.
 * Departamento de Sistemas
 */


import java.io.File;
import java.util.Arrays;
import java.util.List;

import net.sf.jmimemagic.Magic;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
/**
 * The Class MimeUtils.
 */
public class MimeUtils {
	
	
	/** The mime pdf. */
	public static String MIME_PDF = "application/pdf";
	
	/** The mime octet stream. */
	public static String MIME_OCTET_STREAM = "application/octet-stream";
	
	/** The mime msword. */
	public static String MIME_MSWORD = "application/msword";
	
	/** The mime office docx. */
	public static String MIME_OFFICE_DOCX = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
	
	/** The mime excel xlxs. */
	public static String MIME_EXCEL_XLXS = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	
	/** The mime zip. */
	public static String MIME_ZIP = "application/zip";
	
	/** The mime jpg. */
	public static String MIME_JPG = "image/jpg";
	
	/** The mime jpeg. */
	public static String MIME_JPEG = "image/jpeg";
	
	/** The mime gif. */
	public static String MIME_GIF = "image/gif";
	
	/** The mime png. */
	public static String MIME_PNG = "image/png";
	
	/** The mime image. */
	public static List<String> MIME_IMAGE = Arrays.asList(MIME_JPG, MIME_JPEG, MIME_PNG, MIME_GIF);
	
	/** The mime document. */
	public static List<String> MIME_DOCUMENT = Arrays.asList(MIME_PDF, MIME_OCTET_STREAM, MIME_MSWORD, MIME_ZIP, MIME_OFFICE_DOCX, MIME_JPG, MIME_JPEG);
	
	/** The mime document importar. */
	public static List<String> MIME_DOCUMENT_IMPORTAR = Arrays.asList(MIME_EXCEL_XLXS);
	
	/**
	 * Chequea si mime type.
	 *
	 * @param file file
	 * @param mimeType mime type
	 * @return true, si mime type
	 */
	public static boolean isMimeType(File file, String... mimeType){
	    boolean result = false;
	    try {
	        if(mimeType != null && mimeType.length > 0){
	            result = MimeUtils.isMimeType(file, Arrays.asList(mimeType));
	        }
        } catch (Throwable t) {
            System.out.println("ERROR");
        }
	    return result;
	}
	
	/**
	 * Chequea si mime type.
	 *
	 * @param file file
	 * @param mimeTypes mime types
	 * @return true, si mime type
	 */
	public static boolean isMimeType(File file, List<String> mimeTypes){
		boolean result = false;
		try {
		    if(CollectionUtils.isNotEmpty(mimeTypes)){
		        String fileMimeType = Magic.getMagicMatch(file, true).getMimeType();
		        if(StringUtils.isNotBlank(fileMimeType)){
		            for(String mimeType : mimeTypes){
	                    if(StringUtils.isNotBlank(mimeType) && mimeType.equalsIgnoreCase(fileMimeType)){
	                        result = true;
	                    }
	                }
		        }
		    }
		} catch (Throwable t) {
			 System.out.println("ERROR");
		}
		return result;
	}

}
