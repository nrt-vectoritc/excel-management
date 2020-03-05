import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Main {

    public final static String EXTENSION_EXCEL_MACRO = ".xlsm";
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		final String pathname = "W:\\temp\\plantilla_carga_masiva_prueba.xlsm";
		
		File file = new File(pathname);

        OPCPackage pkg = null;
        SXSSFWorkbook wb = null;
        XSSFWorkbook wbAux = null;
    	OutputStream fos = null; 
    	File fileOut = null;
    	Sheet sDatosAux = null;
    	Sheet sDatos = null;
    	Sheet sAreasGeo = null;    	
    	
		if(file.exists()) {
    		if (MimeUtils.isMimeType(file, MimeUtils.MIME_DOCUMENT_IMPORTAR)) {

    			System.out.println("INICIO - OPCPackage.open(file)");
    		    pkg = OPCPackage.open(file);
    		    System.out.println("FIN - OPCPackage.open(file)");
    		    System.out.println("INICIO - XSSFWorkbook");
    		    wbAux = new XSSFWorkbook(pkg);
    		    System.out.println("FIN - XSSFWorkbook");
    		    System.out.println("INICIO - SXSSFWorkbook");
                wb = new SXSSFWorkbook(wbAux);
                System.out.println("FIN - SXSSFWorkbook");

                sDatos = wb.getSheet("Datos");
                sDatosAux = wbAux.getSheet("DatosAuxiliares");
                sAreasGeo = wbAux.getSheet("AreaGeografica");
        		// Aplicamos las restricciones
                System.out.println("INICIO - Aplicar restricciones a la plantilla");
        		DataValidationHelper dvh = sDatos.getDataValidationHelper();
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"F","A");	// prefijo
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"H","B");	// areas interes
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"I","C");	// pais interes
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"J","D");    // cadena interes
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"K","E");    // tratamiento
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"M","F");    // nacionalidad 1
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"N","G");    // nacionalidad 2
            	ExcelUtils.comboValidation(sDatos,sAreasGeo,"O","A");    // pais residencia 
            	//ExcelUtils.comboValidation(sDatos,sDatosAux,"P","I");    // region residencia
            	//ExcelUtils.comboValidation(sDatos,sDatosAux,"Q","J");    // provincia residencia
            	//ExcelUtils.comboValidation(sDatos,sDatosAux,"R","K");    // ciudad residencia
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"S","L");    // nivel estudios
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"T","M");    // especialidad
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"X","N");    // idioma
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"Y","O");    // nivel conversacion
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AA","P");   // sector
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AB","Q");   // pais
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AE","R");   // departamento
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AH","S");   // pais tienda
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AI","W");   // subarea tienda
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AJ","AA");  // disponibilidad laboral - tienda    	
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AK","T");   // pais logistica
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AL","X");   // subarea logistica
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AM","AB");  // disponibilidad laboral - logistica    	
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AN","U");   // pais oficina
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AO","Y");   // subarea oficina
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AP","V");   // pais producto
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AQ","Z");   // subarea producto    	
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AR","AC");  // seccion producto    	
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AS","AD");  // especialidad producto
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AU","AE");  // referenciado
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AY","AF");  // origen
        		ExcelUtils.comboValidation(sDatos,sDatosAux,"AZ","AG");  // letra evaluacion
        		ExcelUtils.numericTextLengthValidation(sDatos,"G","8","11"); // telefono
            	
            	//TODO: generar validacion areas
            	
            	System.out.println("FIN - Aplicar restricciones a la plantilla");
            	System.out.println("INICIO - Aplicar propiedades a la plantilla");
            	wb.setActiveSheet(0);
            	wb.setSelectedTab(0);
            	wb.setSheetHidden(1, SXSSFWorkbook.SHEET_STATE_HIDDEN);
            	System.out.println("FIN - Aplicar propiedades a la plantilla");
            	
            	System.out.println("INICIO - Generar fichero de salida");
            	
            	String pathnameOut = "W:\\temp\\plantilla_carga_masiva_prueba_out.xlsm";
            	
    			file = new File(pathnameOut);
    			FileOutputStream fileOuS = null;
    			try {
    				fileOuS = new FileOutputStream(file);
    				if (file.exists()) {// si el archivo existe se elimina
    					file.delete();
    					System.out.println("Archivo eliminado");
    				}
    				wb.write(fileOuS);
    				fileOuS.flush();
    				fileOuS.close();
    				System.out.println("Archivo Creado");
    				
    			} catch (FileNotFoundException e) {
    				e.printStackTrace();
    			}catch (IOException e) {
    				e.printStackTrace();
    			}finally {
    				if (fileOuS != null) {
    					fileOuS.close();
    				}
    			}
    	        
    	        
    	        
	            if(wb != null) {
	            	//TODO
	            	wb.dispose();
	            }
        	} else {
        		System.out.println("ERROR - Formato de fichero incorrecto");
        	}
    	} else {
    		System.out.println("ERROR - No existe la plantilla en el sistema de ficheros");
    	}
	}
	
	

}
