package vue;

import java.text.DecimalFormat;
import java.util.HashMap;

import javax.swing.table.AbstractTableModel;

import controleur.ConvertCSV;

public class TableauStat4 extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
	//TODO Créer les attributs
	private final String[] entetes = { "D�partement", "NO2", "PM10", "PM25","Ann�e" };	
	private final HashMap<String, Double> tauxvariationNO2;
	private final HashMap<String, Double> tauxvariationPM10;
	private final HashMap<String, Double> tauxvariationPM25;
	private final int annee;
	//TODO Créer le constructeur
	public TableauStat4(HashMap<String, Double> tauxvariationNO2, HashMap<String, Double>tauxvariationPM10, HashMap<String, Double> tauxvariationPM25,int annee) {
		this.tauxvariationNO2 = tauxvariationNO2;
		this.tauxvariationPM10 = tauxvariationPM10;
		this.tauxvariationPM25 = tauxvariationPM25;
		this.annee=annee;
	}
	@Override
	public int getColumnCount() {
		// TODO Compléter getColumnCount
		return entetes.length;
	}
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Compléter getColumnName
		return entetes[columnIndex];
	}

	@Override
	public int getRowCount() {
		// TODO Compléter getRowCount
		return ConvertCSV.listeDepartements.size();
	}
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Compléter getValueAt
		
		
		
		switch (columnIndex) {
		
		case 0:
			
			return ConvertCSV.listeDepartements.get(rowIndex);
		case 1:
			var v1 = tauxvariationNO2.get(ConvertCSV.listeDepartements.get(rowIndex)+ "/" + annee);
			DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
			  var format1 = decimalFormat1.format(v1);
			return format1+" %";

		case 2:
			var v2 = tauxvariationPM10.get(ConvertCSV.listeDepartements.get(rowIndex)+ "/" + annee);
			DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
			  var format2 = decimalFormat2.format(v2);
			return format2+" %";
			

		case 3:			
			var v3 = tauxvariationPM25.get(ConvertCSV.listeDepartements.get(rowIndex)+ "/" + annee);
			DecimalFormat decimalFormat3 = new DecimalFormat("0.00");
			  var format3 = decimalFormat3.format(v3);
			return format3+" %";
					
			
		case 4:
			
			int anneebis = annee+1;
			return annee+"-"+anneebis;

		default:
			throw new IllegalArgumentException();
		}
		
	}
}
