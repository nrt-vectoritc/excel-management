/**
* FileUtils.java 31-may-2016
*
* Copyright 2016 INDITEX.
* Departamento de Sistemas
*/


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
* The Class FileUtils.
*/
public class FileUtils {

    /** The log. */
    private static Logger log = LoggerFactory.getLogger(FileUtils.class);

    /**
        * Save temp multipart with name.
        *
        * @param mpf mpf
        * @param filename filename
        * @return the file
        */
    @Deprecated // Pendiente de realizar pruebas con este nuevo método
    public static File saveTempMultipartWithName(MultipartFile mpf, String filename){
        File result = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            is = mpf.getInputStream();
            result = File.createTempFile(filename, Constants.EXTENSION_TEMP);
            fos = new FileOutputStream(result);
            IOUtils.copyLarge(is, fos);
        } catch (Throwable t) {
            log.error("Se ha producido un error al subir el fichero " + filename, t);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(fos);
        }
        return result;
    }


    /**
        * Crea el temp file.
        *
        * @param filename filename
        * @param extension extension
        * @return the file
        */
    public static File createTempFile(String filename, String extension){
        File result = null;
        try {
            result = File.createTempFile(filename, extension);
        } catch (Throwable t) {
            log.error("Se ha producido un error al crear el fichero temporal, fichero " + filename, t);
        }
        return result;
    }

    /**
        * Obtiene temp file.
        * Lectura de los ficheros que crea meta4.
        *
        * @param filename filename
        * @return temp file
        */
    public static File getTempFile(String filename){
        File result = new File(System.getProperty("java.io.tmpdir"), filename);
        return result;
    }

    /**
        * Delete quietly.
        *
        * @param file file
        */
    public static void deleteQuietly(File file){
        try{
            if(file != null){
                file.delete();
            }
        } catch (Throwable t) {
            log.error("ERROR", t);
        }
    }

    /**
        * To byte array.
        *
        * @param file file
        * @return the byte[]
        */
    public static byte[] toByteArray(File file){
        byte[] result = null;
        FileInputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(file);
            baos = new ByteArrayOutputStream();
            IOUtils.copyLarge(is, baos);
            result = baos.toByteArray();
        } catch (Throwable t) {
            log.error("ERROR", t);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(baos);
        }
        return result;
    }

    /**
        * Delete quietly.
        *
        * @param ficheros ficheros
        */
    public static void deleteQuietly(Map<String,File> ficheros){
        try {
            if(ficheros != null && !ficheros.isEmpty()){
                // Eliminamos los ficheros temporales
                for (String id : ficheros.keySet()) {
                    File fichero = ficheros.get(id);
                    FileUtils.deleteQuietly(fichero);
                }
            }
        } catch (Throwable t) {
            log.error("ERROR", t);
        }
    }

    /**
        * Close quietly.
        *
        * @param wb wb
        */
    public static void closeQuietly(SXSSFWorkbook wb){
        try {
            if(wb != null){
                wb.dispose();
            }
        } catch (Throwable t) {
            log.error("ERROR", t);
        }
    }
    
    /**
        * Close quietly.
        *
        * @param pkg pkg
        */
    public static void closeQuietly(OPCPackage pkg){
        try {
            if(pkg != null){
                pkg.close();
            }
        } catch (Throwable t) {
            log.error("ERROR", t);
        }
    }


}