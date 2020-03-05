import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataValidationConstraint.OperatorType;
import org.apache.poi.ss.usermodel.DataValidationConstraint.ValidationType;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;

public class ExcelUtils {

	private final String S_DATOS_AREA_GEO_AREA_COLUMN = "A";
	private final String S_DATOS_AREA_COLUMN = "O";
	private final String S_DATOS_REGION_COLUMN = "P";
	private final String S_DATOS_PROVINCE_COLUMN = "Q";
	private final String S_DATOS_CITY_COLUMN = "R";
	
	public void generateRegionAreaValidation(Sheet sDatos, Sheet sAreasGeo) {
		

		//Obtener la celda seleccionada del excel (o marcar la columna a la cual se va a ap`licar la funcion indirect)
		
		//En funcion del valor, obtener las columnas de region
		
		
	}
	
	
	public void generateProvinceAreaValidation(Sheet sDatos, Sheet sAreasGeo) {
		

		//Obtener la celda seleccionada del excel (o marcar la columna a la cual se va a aplicar la funcion indirect)
		
		//En funcion del valor, obtener la columnas de  provincia
		
		
	}
	
	public void generateCityAreaValidation(Sheet sDatos, Sheet sAreasGeo) {
		

		//Obtener la celda seleccionada del excel (o marcar la columna a la cual se va a ap`licar la funcion indirect)
		
		//En funcion del valor, obtener la columnas de  ciudad
		
		
	}
	
	
	
	/**
     * Anade el validation.
     *
     * @param sDatos s datos
     * @param dvh dvh
     * @param inputColumn input column
     * @param restrictionColumn restriction column
     */
	public static void comboValidation(Sheet sDatos, Sheet sDatosAux, String inputColumn, String restrictionColumn){
    	DataValidationHelper dvh = sDatos.getDataValidationHelper();
        int lastRow = sDatosAux.getLastRowNum();
        int col = CellRangeAddress.valueOf(new StringBuilder(restrictionColumn).append(":").append(restrictionColumn).toString()).getFirstColumn();
        
        int restrictionFrom = 3;
        int restrictionTo = lastRow;
        
        for (int i = restrictionFrom-1;i<lastRow;i++){
            Row row = sDatosAux.getRow(i);
            if (row==null){
                restrictionTo = i;
                break;
            }
            Cell cell = row.getCell(col);
            if (cell==null){
                restrictionTo = i;              
                break;
            }
            String value = cell.getStringCellValue();
            if (StringUtils.isBlank(value)){
                restrictionTo = i;
                break;
            }
            
        }
        String restriction = new StringBuilder("'DatosAuxiliares'!$")
                		.append(restrictionColumn).append("$").append(restrictionFrom)
                		.append(":$")
                		.append(restrictionColumn).append("$").append(restrictionTo)
                		.toString();
 
        CellRangeAddressList inputRange = columnInputRange(inputColumn);
        DataValidationConstraint constraint = dvh.createFormulaListConstraint(restriction);
        DataValidation dataValidation = dvh.createValidation(constraint, inputRange );
        dataValidation.setShowErrorBox(true);
        sDatos.addValidationData(dataValidation);
        
        
    }
    
    public static void numericTextLengthValidation(Sheet sDatos, String inputColumn, String minLength, String maxLength) {
    	DataValidationHelper dvh = sDatos.getDataValidationHelper();
        CellRangeAddressList inputRange = columnInputRange(inputColumn);
        DataValidationConstraint constraint = dvh.createNumericConstraint(ValidationType.TEXT_LENGTH, OperatorType.BETWEEN, minLength, maxLength);
    	DataValidation dataValidation = dvh.createValidation( constraint, inputRange);
        dataValidation.setShowErrorBox(true);
        sDatos.addValidationData(dataValidation);
	}
    
    public static CellRangeAddressList columnInputRange(String inputColumn){
        int inputFrom = 3;
        int inputTo = 202;
        String input = new StringBuilder(inputColumn).append(inputFrom).append(":").append(inputColumn).append(inputTo).toString();
        CellRangeAddressList range = new CellRangeAddressList();
        range.addCellRangeAddress(CellRangeAddress.valueOf(input));
        return range;
    }
	
}
